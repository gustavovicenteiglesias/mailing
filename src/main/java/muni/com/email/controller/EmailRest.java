package muni.com.email.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import muni.com.email.Service.EmailCuerpoServiceApi;
import muni.com.email.Service.EmailPort;
import muni.com.email.Service.ServiceAPIPregunta1;
import muni.com.email.Service.ServiceAPIPregunta10;
import muni.com.email.Service.ServiceAPIPregunta11;
import muni.com.email.Service.ServiceAPIPregunta2;
import muni.com.email.Service.ServiceAPIPregunta3;
import muni.com.email.Service.ServiceAPIPregunta4;
import muni.com.email.Service.ServiceAPIPregunta5;
import muni.com.email.Service.ServiceAPIPregunta6;
import muni.com.email.Service.ServiceAPIPregunta7;
import muni.com.email.Service.ServiceAPIPregunta8;
import muni.com.email.Service.ServiceAPIPregunta9;
import muni.com.email.model.EmailBody;
import muni.com.email.model.Pregunta1;
import muni.com.email.model.Pregunta10;
import muni.com.email.model.Pregunta11;
import muni.com.email.model.Pregunta2;
import muni.com.email.model.Pregunta3;
import muni.com.email.model.Pregunta4;
import muni.com.email.model.Pregunta5;
import muni.com.email.model.Pregunta6;
import muni.com.email.model.Pregunta7;
import muni.com.email.model.Pregunta8;
import muni.com.email.model.Pregunta9;

@RestController
@RequestMapping(value = "/email")
@CrossOrigin("*")
public class EmailRest {
	
	@Autowired
	private EmailPort emailPort;
	@Autowired
	EmailCuerpoServiceApi emailCuerpoServiceApi;
	
	@Autowired
	ServiceAPIPregunta1 serviceAPIPregunta1;
	@Autowired
	ServiceAPIPregunta2 serviceAPIPregunta2;
	@Autowired
	ServiceAPIPregunta3 serviceAPIPregunta3;
	@Autowired
	ServiceAPIPregunta4 serviceAPIPregunta4;
	@Autowired
	ServiceAPIPregunta5 serviceAPIPregunta5;
	@Autowired
	ServiceAPIPregunta7 serviceAPIPregunta7;
	@Autowired
	ServiceAPIPregunta8 serviceAPIPregunta8;
	@Autowired
	ServiceAPIPregunta9 serviceAPIPregunta9;
	@Autowired
	ServiceAPIPregunta10 serviceAPIPregunta10;
	@Autowired
	ServiceAPIPregunta6 serviceAPIPregunta6;
	@Autowired
	ServiceAPIPregunta11 serviceAPIPregunta11;
	
	
	
	@PostMapping(value = "/send")
	@ResponseBody
	public boolean SendEmail(@RequestBody EmailBody emailBody)  {
		
		emailCuerpoServiceApi.save(emailBody);
		return emailPort.sendEmail(emailBody);
	}
	
	@PostMapping(value = "/send/pregunta1")
	@ResponseBody
	public boolean SendPregunta1(@RequestBody Pregunta1 emailBody)  {
		
		serviceAPIPregunta1.save(emailBody);
		return true;
	}
	
	@PostMapping(value = "/send/pregunta2")
	@ResponseBody
	public boolean SendPregunta2(@RequestBody Pregunta2 emailBody)  {
		
		serviceAPIPregunta2.save(emailBody);
		return true;
	}
	
	@PostMapping(value = "/send/pregunta3")
	@ResponseBody
	public boolean SendPregunta2(@RequestBody Pregunta3 emailBody)  {
		
		serviceAPIPregunta3.save(emailBody);
		return true;
	}
	
	@PostMapping(value = "/send/pregunta4")
	@ResponseBody
	public boolean SendPregunta2(@RequestBody Pregunta4 emailBody)  {
		
		serviceAPIPregunta4.save(emailBody);
		return true;
	}
	
	@PostMapping(value = "/send/pregunta5")
	@ResponseBody
	public boolean SendPregunta2(@RequestBody Pregunta5 emailBody)  {
		
		serviceAPIPregunta5.save(emailBody);
		return true;
	}
	
	@PostMapping(value = "/send/pregunta6")
	@ResponseBody
	public boolean SendPregunta2(@RequestBody Pregunta6 emailBody)  {
		
		serviceAPIPregunta6.save(emailBody);
		return true;
	}
	@PostMapping(value = "/send/pregunta7")
	@ResponseBody
	public boolean SendPregunta2(@RequestBody Pregunta7 emailBody)  {
		
		serviceAPIPregunta7.save(emailBody);
		return true;
	}
	@PostMapping(value = "/send/pregunta8")
	@ResponseBody
	public boolean SendPregunta2(@RequestBody Pregunta8 emailBody)  {
		
		serviceAPIPregunta8.save(emailBody);
		return true;
	}
	@PostMapping(value = "/send/pregunta9")
	@ResponseBody
	public boolean SendPregunta2(@RequestBody Pregunta9 emailBody)  {
		
		serviceAPIPregunta9.save(emailBody);
		return true;
	}
	@PostMapping(value = "/send/pregunta10")
	@ResponseBody
	public boolean SendPregunta2(@RequestBody Pregunta10 emailBody)  {
		
		serviceAPIPregunta10.save(emailBody);
		return true;
	}
	@PostMapping(value = "/send/pregunta11")
	@ResponseBody
	public boolean SendPregunta2(@RequestBody Pregunta11 emailBody)  {
		
		serviceAPIPregunta11.save(emailBody);
		return true;
	}
	
	@GetMapping(value = "/get/ultimo/pregunta1" )
		public Map<String, Object> data1(){
					HashMap<String,Object> response = new HashMap<String,Object>();
					try {   
						Optional<Pregunta1> pregunta = serviceAPIPregunta1.findUltimo();  
						if (pregunta.isPresent()) { 
							response.put("message","Successful load");
							response.put("data",pregunta);
							response.put("success",true);
							return response;
						}
						else {
							response.put("message","Not found data");
							response.put("data",null);
							response.put("success",false);
							return response;
						}
						
					} catch (Exception e){ 
						response.put("message",""+e.getMessage()); 
						response.put("success",false);
						return response;
					}
				} 
	@GetMapping(value = "/get/ultimo/pregunta2" )
	public Map<String, Object> data2(){
				HashMap<String,Object> response = new HashMap<String,Object>();
				try {   
					Optional<Pregunta2> pregunta = serviceAPIPregunta2.findUltimo();  
					if (pregunta.isPresent()) { 
						response.put("message","Successful load");
						response.put("data",pregunta);
						response.put("success",true);
						return response;
					}
					else {
						response.put("message","Not found data");
						response.put("data",null);
						response.put("success",false);
						return response;
					}
					
				} catch (Exception e){ 
					response.put("message",""+e.getMessage()); 
					response.put("success",false);
					return response;
				}
			} 
	@GetMapping(value = "/get/ultimo/pregunta3" )
	public Map<String, Object> data3(){
				HashMap<String,Object> response = new HashMap<String,Object>();
				try {   
					Optional<Pregunta3> pregunta = serviceAPIPregunta3.findUltimo();  
					if (pregunta.isPresent()) { 
						response.put("message","Successful load");
						response.put("data",pregunta);
						response.put("success",true);
						return response;
					}
					else {
						response.put("message","Not found data");
						response.put("data",null);
						response.put("success",false);
						return response;
					}
					
				} catch (Exception e){ 
					response.put("message",""+e.getMessage()); 
					response.put("success",false);
					return response;
				}
			} 
	@GetMapping(value = "/get/ultimo/pregunta4" )
	public Map<String, Object> data4(){
				HashMap<String,Object> response = new HashMap<String,Object>();
				try {   
					Optional<Pregunta4> pregunta = serviceAPIPregunta4.findUltimo();  
					if (pregunta.isPresent()) { 
						response.put("message","Successful load");
						response.put("data",pregunta);
						response.put("success",true);
						return response;
					}
					else {
						response.put("message","Not found data");
						response.put("data",null);
						response.put("success",false);
						return response;
					}
					
				} catch (Exception e){ 
					response.put("message",""+e.getMessage()); 
					response.put("success",false);
					return response;
				}
			} 
	@GetMapping(value = "/get/ultimo/pregunta5" )
	public Map<String, Object> data5(){
				HashMap<String,Object> response = new HashMap<String,Object>();
				try {   
					Optional<Pregunta5> pregunta = serviceAPIPregunta5.findUltimo();  
					if (pregunta.isPresent()) { 
						response.put("message","Successful load");
						response.put("data",pregunta);
						response.put("success",true);
						return response;
					}
					else {
						response.put("message","Not found data");
						response.put("data",null);
						response.put("success",false);
						return response;
					}
					
				} catch (Exception e){ 
					response.put("message",""+e.getMessage()); 
					response.put("success",false);
					return response;
				}
			} 
	
	@GetMapping(value = "/get/ultimo/pregunta6" )
	public Map<String, Object> data6(){
				HashMap<String,Object> response = new HashMap<String,Object>();
				try {   
					Optional<Pregunta6> pregunta = serviceAPIPregunta6.findUltimo();  
					if (pregunta.isPresent()) { 
						response.put("message","Successful load");
						response.put("data",pregunta);
						response.put("success",true);
						return response;
					}
					else {
						response.put("message","Not found data");
						response.put("data",null);
						response.put("success",false);
						return response;
					}
					
				} catch (Exception e){ 
					response.put("message",""+e.getMessage()); 
					response.put("success",false);
					return response;
				}
			} 
	@GetMapping(value = "/get/ultimo/pregunta7" )
	public Map<String, Object> data7(){
				HashMap<String,Object> response = new HashMap<String,Object>();
				try {   
					Optional<Pregunta7> pregunta = serviceAPIPregunta7.findUltimo();  
					if (pregunta.isPresent()) { 
						response.put("message","Successful load");
						response.put("data",pregunta);
						response.put("success",true);
						return response;
					}
					else {
						response.put("message","Not found data");
						response.put("data",null);
						response.put("success",false);
						return response;
					}
					
				} catch (Exception e){ 
					response.put("message",""+e.getMessage()); 
					response.put("success",false);
					return response;
				}
			} 
	@GetMapping(value = "/get/ultimo/pregunta8" )
	public Map<String, Object> data8(){
				HashMap<String,Object> response = new HashMap<String,Object>();
				try {   
					Optional<Pregunta8> pregunta = serviceAPIPregunta8.findUltimo();  
					if (pregunta.isPresent()) { 
						response.put("message","Successful load");
						response.put("data",pregunta);
						response.put("success",true);
						return response;
					}
					else {
						response.put("message","Not found data");
						response.put("data",null);
						response.put("success",false);
						return response;
					}
					
				} catch (Exception e){ 
					response.put("message",""+e.getMessage()); 
					response.put("success",false);
					return response;
				}
			}
	
	@GetMapping(value = "/get/ultimo/pregunta9" )
	public Map<String, Object> data9(){
				HashMap<String,Object> response = new HashMap<String,Object>();
				try {   
					Optional<Pregunta9> pregunta = serviceAPIPregunta9.findUltimo();  
					if (pregunta.isPresent()) { 
						response.put("message","Successful load");
						response.put("data",pregunta);
						response.put("success",true);
						return response;
					}
					else {
						response.put("message","Not found data");
						response.put("data",null);
						response.put("success",false);
						return response;
					}
					
				} catch (Exception e){ 
					response.put("message",""+e.getMessage()); 
					response.put("success",false);
					return response;
				}
			} 
	@GetMapping(value = "/get/ultimo/pregunta10" )
	public Map<String, Object> data10(){
				HashMap<String,Object> response = new HashMap<String,Object>();
				try {   
					Optional<Pregunta10> pregunta = serviceAPIPregunta10.findUltimo();  
					if (pregunta.isPresent()) { 
						response.put("message","Successful load");
						response.put("data",pregunta);
						response.put("success",true);
						return response;
					}
					else {
						response.put("message","Not found data");
						response.put("data",null);
						response.put("success",false);
						return response;
					}
					
				} catch (Exception e){ 
					response.put("message",""+e.getMessage()); 
					response.put("success",false);
					return response;
				}
			} 
	@GetMapping(value = "/get/ultimo/pregunta11" )
	public Map<String, Object> data11(){
				HashMap<String,Object> response = new HashMap<String,Object>();
				try {   
					Optional<Pregunta11> pregunta = serviceAPIPregunta11.findUltimo();  
					if (pregunta.isPresent()) { 
						response.put("message","Successful load");
						response.put("data",pregunta);
						response.put("success",true);
						return response;
					}
					else {
						response.put("message","Not found data");
						response.put("data",null);
						response.put("success",false);
						return response;
					}
					
				} catch (Exception e){ 
					response.put("message",""+e.getMessage()); 
					response.put("success",false);
					return response;
				}
			} 
	
}
