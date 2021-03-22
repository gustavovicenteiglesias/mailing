package muni.com.email.Service;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import muni.com.email.model.Pregunta3;
import muni.com.email.model.Pregunta5;

public interface ServiceAPIPregunta5 extends CrudRepository<Pregunta5, Integer> {
	@Query(value="select * from pregunta5 ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Pregunta5> findUltimo();
}
