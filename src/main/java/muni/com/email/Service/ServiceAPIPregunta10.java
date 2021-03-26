package muni.com.email.Service;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import muni.com.email.model.Pregunta10;


public interface ServiceAPIPregunta10 extends CrudRepository<Pregunta10, Integer> {
	@Query(value="select * from pregunta6 ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Pregunta10> findUltimo();
}
