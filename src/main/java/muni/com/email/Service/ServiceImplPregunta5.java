package muni.com.email.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import muni.com.email.Dao.DaoPregunta5;

import muni.com.email.model.Pregunta5;

public class ServiceImplPregunta5 implements ServiceAPIPregunta5 {
	@Autowired
	DaoPregunta5 daoPregunta5;

	@Override
	public <S extends Pregunta5> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pregunta5> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Pregunta5> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Pregunta5> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Pregunta5> findAllById(Iterable<Integer> ids) {
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
	public void delete(Pregunta5 entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Pregunta5> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Pregunta5> findUltimo() {
		// TODO Auto-generated method stub
		return daoPregunta5.findUltimo();
	}

	

}
