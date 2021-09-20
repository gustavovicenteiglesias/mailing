package muni.com.email.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import muni.com.email.model.EmailBody;

@Service
public class EmailService implements EmailPort{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

	@Autowired
	private JavaMailSender sender;

	@Override
	public boolean sendEmail(EmailBody emailBody)  {
		LOGGER.info("EmailBody: {}", emailBody.toString());
		return sendEmailTool(emailBody,emailBody.getEmail(), emailBody.getSubject());

	}
	

	private boolean sendEmailTool(EmailBody textMessage, String email,String subject) {
		boolean send = false;
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);		
		try {
			
			helper.setTo(email);
			helper.setText("<h1 style='color: #654321;text-align: center;'>"+textMessage.getContent().getNombre()+
					"</h1><p>"+textMessage.getContent().getTexto()+"</p>"+
					"<a style='color: #000000' href='mailto:'"+textMessage.getContent().getEmail()+">"+textMessage.getContent().getEmail()+"</a>", true);
			helper.setSubject(subject);
			sender.send(message);
			send = true;
			LOGGER.info("Mail enviado!");
		} catch (MessagingException e) {
			LOGGER.error("Hubo un error al enviar el mail: {}", e);
		}
		return send;
	}

	
	
}
