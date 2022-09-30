package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.VerificationStatus;

public interface VerificationStatusService {
	List<VerificationStatus> getAll();
}
