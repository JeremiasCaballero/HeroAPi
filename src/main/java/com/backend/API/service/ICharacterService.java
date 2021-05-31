package com.backend.API.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.API.entity.CustomCharacter;
import com.backend.API.entity.Personaje;


@Service
public interface ICharacterService {
	
	public List<CustomCharacter> getAll();
	
	public Personaje save(Personaje ch);

	public Personaje deleteCharacter(long id);
	
	public Personaje findById(long id);


}
