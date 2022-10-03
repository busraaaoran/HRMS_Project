package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.VerificationStatusService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.VerificationStatusDao;
import kodlamaio.hrms.entities.concretes.VerificationStatus;

@Service
public class VerificationStatusManager implements VerificationStatusService {
	
	private VerificationStatusDao verificationStatusDao;
	
	@Autowired
	public VerificationStatusManager(VerificationStatusDao verificationStatusDao) {
		super();
		this.verificationStatusDao = verificationStatusDao;
	}

	@Override
	public DataResult<List<VerificationStatus>> getAll() {
		return new SuccessDataResult<List<VerificationStatus>>(this.verificationStatusDao.findAll(),"Statuses listed") ;
	}

}
