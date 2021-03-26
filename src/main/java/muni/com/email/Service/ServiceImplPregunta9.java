package muni.com.email.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import muni.com.email.Dao.DaoPregunta6;
import muni.com.email.Dao.DaoPregunta7;
import muni.com.email.Dao.DaoPregunta9;
import muni.com.email.model.Pregunta6;
import muni.com.email.model.Pregunta7;
import muni.com.email.model.Pregunta9;

public class ServiceImplPregunta9 implements ServiceAPIPregunta9 {
	@Autowired
	DaoPregunta9 daoPregunta9;

	@Override
	public <S extends Pregunta9> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pregunta9> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Pregunta9> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Pregunta9> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Pregunta9> findAllById(Iterable<Integer> ids) {
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
	public void delete(Pregunta9 entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Pregunta9> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Pregunta9> findUltimo() {
		// TODO Auto-generated method stub
		return daoPregunta9.findUltimo();
	}

	

}
