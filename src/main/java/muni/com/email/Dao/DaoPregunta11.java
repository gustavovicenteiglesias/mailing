package muni.com.email.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import muni.com.email.model.Pregunta11;


public interface DaoPregunta11 extends CrudRepository<Pregunta11, Integer> {
	@Query(value="select * from pregunta6 ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Pregunta11> findUltimo();
}
