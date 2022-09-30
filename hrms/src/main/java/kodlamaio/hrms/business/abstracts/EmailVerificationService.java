package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.EmailVerification;

public interface EmailVerificationService {
	List<EmailVerification>	getAll();
}
