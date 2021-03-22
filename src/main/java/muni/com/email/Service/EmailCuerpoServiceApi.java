package muni.com.email.Service;

import org.springframework.data.repository.CrudRepository;

import muni.com.email.model.EmailBody;

public interface EmailCuerpoServiceApi extends CrudRepository<EmailBody, Integer> {

}
