package com.backend.API.service;

import org.springframework.stereotype.Service;

import com.backend.API.entity.Serie;

@Service
public interface ISerieService {
	
	
	public Serie save(Serie s);

}
