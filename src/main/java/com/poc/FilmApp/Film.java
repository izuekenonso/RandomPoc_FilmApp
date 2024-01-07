package com.poc.FilmApp;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="film")
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "TITLE", nullable = false)
	private String title;

	@Column(name = "DIRECTOR", nullable = false)
	private String director;

	@Column(name = "RELEASE_YEAR")
	private Integer releaseYear;

	@Column(name = "ORIGIN")
	private String origin;

	@Enumerated(EnumType.STRING)
	@Column(name = "AVAILABILITY")
	private FilmAvailability filmAvailability; // Add this line


	public Film() {
		super();
	}

	public Film(Long id, String title, String director, Integer releaseYear, String origin,
			FilmAvailability filmAvailability) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.releaseYear = releaseYear;
		this.origin = origin;
		this.filmAvailability = filmAvailability;
	}

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setFilmAvailability(FilmAvailability filmAvailability) {
		this.filmAvailability = filmAvailability;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Film film = (Film) o;
		return Objects.equals(id, film.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public FilmAvailability getFilmAvailability() {

		return filmAvailability;
	}
}
