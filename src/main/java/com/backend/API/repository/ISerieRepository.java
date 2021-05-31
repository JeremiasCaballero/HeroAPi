package com.backend.API.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.API.entity.Serie;

@Repository
public interface ISerieRepository extends JpaRepository<Serie, Long>{
	
	public Serie findById(long id);
	
	
	public List<Serie> findAll();

}
