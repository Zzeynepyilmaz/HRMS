package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvSkill;

public interface CvSkillService {

	Result add(CvSkill cvSkill);
	DataResult<List<CvSkill>> getAllByCandidateId(int id);
}
