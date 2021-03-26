package muni.com.email.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import muni.com.email.Dao.DaoPregunta11;
import muni.com.email.Dao.DaoPregunta6;
import muni.com.email.model.Pregunta11;
import muni.com.email.model.Pregunta6;

public class ServiceImplPregunta11 implements ServiceAPIPregunta11 {
	@Autowired
	DaoPregunta11 daoPregunta11;

	@Override
	public <S extends Pregunta11> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pregunta11> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Pregunta11> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Pregunta11> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Pregunta11> findAllById(Iterable<Integer> ids) {
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
	public void delete(Pregunta11 entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Pregunta11> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Pregunta11> findUltimo() {
		// TODO Auto-generated method stub
		return daoPregunta11.findUltimo();
	}

	
}
