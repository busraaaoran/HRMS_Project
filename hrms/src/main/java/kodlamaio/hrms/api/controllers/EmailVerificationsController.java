package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmailVerificationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.EmailVerification;

@RestController
@RequestMapping("/api/emailVerifications")
public class EmailVerificationsController {
	
	private EmailVerificationService emailVerificationService;
	
	@Autowired
	public EmailVerificationsController(EmailVerificationService emailVerificationService) {
		super();
		this.emailVerificationService = emailVerificationService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<EmailVerification>> getall(){
		return this.emailVerificationService.getAll();
		}
	}
