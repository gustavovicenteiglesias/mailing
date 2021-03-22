package muni.com.email.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import muni.com.email.model.Pregunta4;

public interface DaoPregunta4 extends CrudRepository<Pregunta4, Integer> {
	@Query(value="select * from pregunta4 ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Pregunta4> findUltimo();
}
