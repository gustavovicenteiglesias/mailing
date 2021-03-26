package muni.com.email.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



import muni.com.email.model.Pregunta8;

public interface DaoPregunta8 extends CrudRepository<Pregunta8, Integer> {
	@Query(value="select * from pregunta6 ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Pregunta8> findUltimo();
}
