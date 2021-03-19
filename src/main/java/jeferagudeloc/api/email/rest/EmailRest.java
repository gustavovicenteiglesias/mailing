package jeferagudeloc.api.email.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/email")
@CrossOrigin("*")
public class EmailRest {
	
	@Autowired
	private EmailPort emailPort;
	@Autowired
	EmailCuerpoServiceApi emailCuerpoServiceApi;
	
	@PostMapping(value = "/send")
	@ResponseBody
	public boolean SendEmail(@RequestBody EmailBody emailBody)  {
		
		emailCuerpoServiceApi.save(emailBody);
		return emailPort.sendEmail(emailBody);
	}
	
}
