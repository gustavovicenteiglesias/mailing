package muni.com.email.Service;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import muni.com.email.model.Pregunta3;

public interface ServiceAPIPregunta3 extends CrudRepository<Pregunta3, Integer> {
	@Query(value="select * from pregunta3 ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Pregunta3> findUltimo();
}
