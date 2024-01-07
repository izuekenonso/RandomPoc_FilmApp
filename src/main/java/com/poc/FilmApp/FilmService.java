package com.poc.FilmApp;

public interface FilmService {

	FilmResponseDto updateFilm(Long id, FilmRequestDto filmRequestDto) throws Exception;

	FilmResponseDto saveFilm(FilmRequestDto filmRequestDto) throws Exception;

}
