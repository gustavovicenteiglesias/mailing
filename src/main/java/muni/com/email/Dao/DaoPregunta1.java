package muni.com.email.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import muni.com.email.model.Pregunta1;

public interface DaoPregunta1 extends CrudRepository<Pregunta1, Integer> {
	@Query(value="select * from pregunta1 ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Pregunta1> findUltimo();
}
