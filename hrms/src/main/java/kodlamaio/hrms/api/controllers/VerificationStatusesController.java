package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.VerificationStatusService;
import kodlamaio.hrms.entities.concretes.VerificationStatus;

@RestController
@RequestMapping("/api/verificationStatuses")
public class VerificationStatusesController {
	
	private VerificationStatusService verificationStatusService;

	@Autowired
	public VerificationStatusesController(VerificationStatusService verificationStatusService) {
		super();
		this.verificationStatusService = verificationStatusService;
	}
	
	@GetMapping("/getall")
	public List<VerificationStatus> getall(){
		return this.verificationStatusService.getAll();
	}
}
