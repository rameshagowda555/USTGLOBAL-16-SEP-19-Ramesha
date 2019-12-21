package com.ustglobal.mailsimulation.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.mailsimulation.dto.Mail_info;
import com.ustglobal.mailsimulation.dto.UserResponse;
import com.ustglobal.mailsimulation.dto.User_info;
import com.ustglobal.mailsimulation.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping(path = "/user-login/{email}/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse userLogin(@PathVariable("email") String email, @PathVariable("password") String password) {
		UserResponse response = new UserResponse();
		User_info bean = service.loginUser(email, password);
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User Login Successfully");
			response.setInfo(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User Not Able To Login");
		}
		return response;
	}

	@PostMapping(path = "/registeruser", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse registerUser(@RequestBody User_info user) {
		UserResponse response = new UserResponse();
		if (service.registerUser(user)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("User register Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("registration failed!!!!!");
		}
		return response;
	}

	@GetMapping(path = "get-all/{from_id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse getAll(@PathVariable("from_id") int from_id) {
		UserResponse response = new UserResponse();
		List<Mail_info> bean = service.getAllMail(from_id);
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("All Mails Available here");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Fail to get All mails");	
		}
		return response;
	}

	@PutMapping(path = "/changepassword", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse changepassword(@RequestBody User_info bean) {
		UserResponse response = new UserResponse();
		if (service.changePassword(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Password Changed Succeefully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Password is not Updated");
		}
		return response;
	}
	
	@PutMapping(path = "/sendmail", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse sendMails(@RequestBody Mail_info bean) {
		UserResponse response = new UserResponse();
		if (service.sendMail(bean, bean.getUser(), bean.getUser_info())) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Main sent Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Mail is Failure to sent");
		}
		return response;
	}
	
	@PutMapping(path = "/deletemail", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteMails(@RequestBody Mail_info bean) {
		UserResponse response = new UserResponse();
		if (service.deleteMail(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Main deleted Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Mail is not deleted");
		}
		return response;
	}
	
	@PutMapping(path = "/draftmail", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse draftMails(@RequestBody Mail_info bean) {
		UserResponse response = new UserResponse();
		if (service.draftMail(bean, bean.getUser(), bean.getUser_info())) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Main is drafted Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Not Drafted!!!!");
		}
		return response;
	}
	@GetMapping(path="/getdeletedmails" , produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteStatus(@RequestBody Mail_info mail) {
		UserResponse response = new UserResponse();
		List<Mail_info> info = service.deletedMail(mail);
		if(info!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("list of deleted mails");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("there is no deleted mails");
		}
		return response;
		
	}
	
	@GetMapping(path="/getsentmails" , produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse sentStatus(@RequestBody Mail_info mail) {
		UserResponse response = new UserResponse();
		List<Mail_info> info = service.sent(mail);
		if(info!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("List of sent mails");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("no sent mails found");
		}
		return response;
		
	}

	@GetMapping(path="/getdraftedmails" , produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse draftStatus(@RequestBody Mail_info mail) {
		UserResponse response = new UserResponse();
		List<Mail_info> info =service.draft(mail);
		if(info!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("list of drafted mails");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No drafed mails found");
		}
		return response;
		
	}

}
