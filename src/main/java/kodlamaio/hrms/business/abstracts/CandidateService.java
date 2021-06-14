package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.User;

public interface CandidateService {

	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidate);
	DataResult<Candidate> getByIdentityNumber(String identityNumber);
	DataResult<User> getByEmail(String email);
	DataResult<Candidate> getByIdentityNumber(int id); 
}
