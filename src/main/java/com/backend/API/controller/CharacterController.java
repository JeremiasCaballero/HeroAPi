package com.backend.API.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.API.entity.CustomCharacter;
import com.backend.API.entity.Personaje;
import com.backend.API.service.ICharacterService;

@RestController
@RequestMapping(value = "/characters")
public class CharacterController {
	
	@Autowired
	private ICharacterService characterService;
	
	
	@GetMapping
	public ResponseEntity<List<CustomCharacter>> characters(){
		return ResponseEntity.status(Response.SC_OK).body(this.characterService.getAll());
	}
	@PostMapping
	public ResponseEntity<Personaje> createPersonaje(@RequestBody Personaje ch) {
		Personaje p = this.characterService.save(ch);
		return new ResponseEntity<Personaje>(p, HttpStatus.OK);
	}
}
