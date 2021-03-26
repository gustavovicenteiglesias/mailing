package muni.com.email.Service;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



import muni.com.email.model.Pregunta7;

public interface ServiceAPIPregunta7 extends CrudRepository<Pregunta7, Integer> {
	@Query(value="select * from pregunta7 ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Pregunta7> findUltimo();
}
