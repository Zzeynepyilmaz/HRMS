package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	private UserDao userDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}
	
	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>
		(this.candidateDao.findAll(), "Is arayanlar listelendi");
	}

	@Override
	public Result add(Candidate candidate) {
		
		//if(candidate.getPassword().length() <= 6) {
		//	return new ErrorResult("Sifre 6 karakterden uzun olmalidir.");
		//}
		//else if (getByIdentityNumber(candidate.getId()).getData() != null) {
			//return new ErrorResult("Bu kimlik numarasi kayitli");
			
		//}
		//else if (getByEmail(candidate.getEmail()).getData() != null) {
			//return new ErrorResult("Bu email kayitli");
		//}
		//else {
			//return new SuccessResult("Kullanıcı bilgileri hatalı");
		//}
		this.candidateDao.save(candidate);
		return new SuccessDataResult("eklnedi");
	}

	@Override
	public DataResult<Candidate> getByIdentityNumber(int id) {

        return new SuccessDataResult<Candidate>(this.candidateDao.findById(id).get());
    }

	@Override
	public DataResult<User> getByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email), "Listelendi");
	}

	@Override
	public DataResult<Candidate> getByIdentityNumber(String identityNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
