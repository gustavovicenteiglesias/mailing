package muni.com.email.Service;

import muni.com.email.model.EmailBody;

public interface EmailPort {
	public boolean sendEmail(EmailBody emailBody);
}
