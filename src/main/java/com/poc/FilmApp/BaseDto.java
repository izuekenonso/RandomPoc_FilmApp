package com.poc.FilmApp;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class BaseDto {
	private Long id;

	@NotNull(message = "The title cannot be null")
	@NotEmpty(message = "The title cannot be empty")
	private String title;

	@NotNull(message = "The director cannot be null")
	@NotEmpty(message = "The director cannot be empty")
	private String director;

	@NotNull(message = "The releaseYear cannot be null")
	private Integer releaseYear;

	@NotNull(message = "The filmAvailability cannot be null")
	@NotEmpty(message = "The filmAvailability cannot be empty")
	private String filmAvailability;

	public BaseDto() {
		super();
	}
	
	public BaseDto(Long id,
			@NotNull(message = "The title cannot be null") @NotEmpty(message = "The title cannot be empty") String title,
			@NotNull(message = "The director cannot be null") @NotEmpty(message = "The director cannot be empty") String director,
			@NotNull(message = "The releaseYear cannot be null") Integer releaseYear,
			@NotNull(message = "The filmAvailability cannot be null") @NotEmpty(message = "The filmAvailability cannot be empty") String filmAvailability) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.releaseYear = releaseYear;
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


	public String getFilmAvailability() {
		return filmAvailability;
	}


	public void setFilmAvailability(String filmAvailability) {
		this.filmAvailability = filmAvailability;
	}
	
	
	
	
	
}