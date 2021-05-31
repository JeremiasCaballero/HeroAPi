package com.backend.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.API.entity.Serie;
import com.backend.API.service.ISerieService;

@RestController
@RequestMapping(value = "/movies")
public class SerieController {
	
	@Autowired
	private ISerieService serieService;
	
	@PostMapping
	public ResponseEntity<Serie> serie(Serie s){
		Serie sa = this.serieService.save(s);
		return new ResponseEntity<Serie>(sa, HttpStatus.OK);
	}

}
