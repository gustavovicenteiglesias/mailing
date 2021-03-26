package muni.com.email.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import muni.com.email.Dao.DaoPregunta10;
import muni.com.email.Dao.DaoPregunta6;
import muni.com.email.model.Pregunta10;
import muni.com.email.model.Pregunta6;

public class ServiceImplPregunta10 implements ServiceAPIPregunta10 {
	@Autowired
	DaoPregunta10 daoPregunta10;

	@Override
	public <S extends Pregunta10> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pregunta10> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Pregunta10> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Pregunta10> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Pregunta10> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pregunta10 entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Pregunta10> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Pregunta10> findUltimo() {
		// TODO Auto-generated method stub
		return daoPregunta10.findUltimo();
	}

	
}
