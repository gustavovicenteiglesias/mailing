package muni.com.email.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;



import muni.com.email.Dao.DaoPregunta8;

import muni.com.email.model.Pregunta8;

public class ServiceImplPregunta8 implements ServiceAPIPregunta8 {
	@Autowired
	DaoPregunta8 daoPregunta8;

	@Override
	public <S extends Pregunta8> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pregunta8> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Pregunta8> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Pregunta8> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Pregunta8> findAllById(Iterable<Integer> ids) {
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
	public void delete(Pregunta8 entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Pregunta8> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Pregunta8> findUltimo() {
		// TODO Auto-generated method stub
		return daoPregunta8.findUltimo();
	}

	

}
