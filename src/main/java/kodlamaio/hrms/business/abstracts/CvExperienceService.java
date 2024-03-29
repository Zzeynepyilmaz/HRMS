package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvExperience;

public interface CvExperienceService {

	Result add(CvExperience cvExperience);
	DataResult<List<CvExperience>> getAllByCandidateId(int id);
	DataResult<List<CvExperience>> getAllByCandidateIdOrderByEndAtDesc(int id);
}
