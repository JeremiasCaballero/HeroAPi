package com.backend.API.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.API.entity.Serie;
import com.backend.API.repository.ISerieRepository;


@Service
public class SerieServiceImpl implements ISerieService{
	
	@Autowired
	private ISerieRepository repository;

	@Override
	public Serie save(Serie s) {
		return this.repository.save(s);
	}
	

}
