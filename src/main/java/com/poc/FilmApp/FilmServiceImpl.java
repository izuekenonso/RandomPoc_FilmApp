package com.poc.FilmApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class FilmServiceImpl implements FilmService {
	
	@Autowired 
	private FilmRepository filmRepository;
	
	@Override
	@Transactional
	public FilmResponseDto updateFilm(Long id, FilmRequestDto filmRequestDto) throws Exception {
	
		try {
		
	
		    Film film = getFilm(id); 
		    FilmMapper.updateFilmFromDto(filmRequestDto, film);
		    filmRepository.save(film);
		    
		    return FilmMapper.toDto(film); 
		    
		} catch (Exception e) {
			
		    throw new Exception("Film not found for update: " + e.getMessage());
	
		}
	}

	private Film getFilm(Long id) {
		
		return filmRepository.findById(id).get();
	}
	
	@Override
	@Transactional
	public FilmResponseDto saveFilm(FilmRequestDto filmRequestDto) throws Exception {
	
		try {
		 
		    Film film = FilmMapper.toEntity(filmRequestDto);
		    
		    filmRepository.save(film);
		    
		    return FilmMapper.toDto(film); 
		    
		} catch (Exception e) {
			
		    throw new Exception("Film not found for update: " + e.getMessage());
	
		}
	}
}
