package muni.com.email.Dao;

import org.springframework.data.repository.CrudRepository;

import muni.com.email.model.EmailBody;

public interface EmailCuerpoDao extends CrudRepository<EmailBody, Integer> {

}
