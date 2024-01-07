package com.poc.FilmApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film")
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@GetMapping("/health")
	public String health() {
		return "Hello there, Film controller up and running!";
	}
	
	
	@PostMapping("/create")
	public FilmResponseDto create(@RequestBody FilmRequestDto filmRequestDto) {
		
		try {
			return filmService.saveFilm(filmRequestDto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	@PutMapping("/update/{id}")
	public FilmResponseDto update(@PathVariable Long id, @RequestBody FilmRequestDto filmRequestDto) {
		
		try {
			return filmService.updateFilm(id, filmRequestDto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
}
