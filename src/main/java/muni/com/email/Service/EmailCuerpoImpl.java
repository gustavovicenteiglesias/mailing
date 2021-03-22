package muni.com.email.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import muni.com.email.Dao.EmailCuerpoDao;
import muni.com.email.model.EmailBody;

public class EmailCuerpoImpl implements EmailCuerpoDao {
	@Autowired
	EmailCuerpoDao emailCuerpoDao;
	@Override
	public <S extends EmailBody> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EmailBody> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<EmailBody> findById(Integer id) {
		// TODO Auto-generated method stub
		return emailCuerpoDao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<EmailBody> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<EmailBody> findAllById(Iterable<Integer> ids) {
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
	public void delete(EmailBody entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends EmailBody> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
