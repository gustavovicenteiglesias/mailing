package muni.com.email.Service;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



import muni.com.email.model.Pregunta9;

public interface ServiceAPIPregunta9 extends CrudRepository<Pregunta9, Integer> {
	@Query(value="select * from pregunta9 ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Pregunta9> findUltimo();
}
