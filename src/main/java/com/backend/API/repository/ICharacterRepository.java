package com.backend.API.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.API.entity.Personaje;
import com.backend.API.entity.CustomCharacter;

@Repository
public interface ICharacterRepository extends JpaRepository<Personaje, Long>{
	
	/* crea un nuevo objeto a partir del objeto Personaje pero solo
	 * se queda con los campos deseados.
	 */
	@Query("SELECT NEW com.backend.API.entity.CustomCharacter(c.name, c.image) FROM Personaje c")
	public List<CustomCharacter> getAll();

     
	public void deleteById(long id);
	
	
	
	public Personaje findById(long id);
}
