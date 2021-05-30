package com.backend.API.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.backend.API.entity.Personaje;
import com.backend.API.repository.ICharacterRepository;
import com.backend.API.entity.CustomCharacter;



@Service
public class CharacterServiceImpl implements ICharacterService{
	
	@Autowired
	private	ICharacterRepository repository;

	@Override
	public List<CustomCharacter> getAll() {
		return this.repository.getAll();
	}

	@Override
	public Personaje findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Personaje save(Personaje ch) {
		return this.repository.save(ch);
	}
	
	

}
