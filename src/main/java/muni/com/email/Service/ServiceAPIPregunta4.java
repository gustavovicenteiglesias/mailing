package muni.com.email.Service;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import muni.com.email.model.Pregunta4;

public interface ServiceAPIPregunta4 extends CrudRepository<Pregunta4, Integer> {
	@Query(value="select * from pregunta3 ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Pregunta4> findUltimo();
}
