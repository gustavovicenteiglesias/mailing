package muni.com.email.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import muni.com.email.model.Pregunta2;

public interface DaoPregunta2 extends CrudRepository<Pregunta2, Integer> {
	@Query(value="select * from pregunta2 ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Pregunta2> findUltimo();
}
