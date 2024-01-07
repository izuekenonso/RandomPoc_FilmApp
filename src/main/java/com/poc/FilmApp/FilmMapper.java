package com.poc.FilmApp;

import org.springframework.stereotype.Component;

@Component
public class FilmMapper {

	public static FilmResponseDto toDto(Film film) {
		FilmResponseDto dto = new FilmResponseDto();
		dto.setId(film.getId());
		dto.setTitle(film.getTitle());
		dto.setDirector(film.getDirector());
		dto.setReleaseYear(film.getReleaseYear());
		dto.setFilmAvailability(mapFilmAvailabilityToString(film));
		return dto;
	}

	public static Film toEntity(FilmRequestDto filmRequestDto) {
		Film film = new Film();
		// Set film properties based on FilmRequestDto
		film.setTitle(filmRequestDto.getTitle());
		film.setTitle(filmRequestDto.getTitle());
		film.setDirector(filmRequestDto.getDirector());
		film.setReleaseYear(filmRequestDto.getReleaseYear());

		film.setFilmAvailability(mapStringToFilmAvailability(String.valueOf(filmRequestDto.getFilmAvailability())));

		return film;
	}

	public static void updateFilmFromDto(FilmRequestDto dto, Film film) {
		// Update film entity properties with values from dto
		if (dto.getTitle() != null) {
			film.setTitle(dto.getTitle());
		}
		if (dto.getDirector() != null) {
			film.setDirector(dto.getDirector());
		}
		if (dto.getReleaseYear() != null) {
			film.setReleaseYear(dto.getReleaseYear());
		}
		// Add more checks and updates for other fields as needed
	}

	// Map FilmAvailability enum to String
	private static String mapFilmAvailabilityToString(Film film) {
		return film.getFilmAvailability().name();
	}

	// Map String to FilmAvailability enum
	private static FilmAvailability mapStringToFilmAvailability(String availability) {
		return FilmAvailability.valueOf(availability);
	}

}