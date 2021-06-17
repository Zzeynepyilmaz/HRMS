package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.CvExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvExperienceDao;
import kodlamaio.hrms.entities.concretes.CvExperience;

public class CvExperienceManager implements CvExperienceService{

	private CvExperienceDao cvExperienceDao;
	
	public CvExperienceManager(CvExperienceDao cvExperienceDao) {
		super();
		this.cvExperienceDao = cvExperienceDao;
	}

	@Override
	public Result add(CvExperience cvExperience) {
		this.cvExperienceDao.save(cvExperience);
		return new SuccessResult("Is tecrubesi eklendi");
	}

	@Override
	public DataResult<List<CvExperience>> getAllByCandidateId(int id) {
		return new SuccessDataResult<List<CvExperience>>(this.cvExperienceDao.getAllByCandidateId(id));
	}

	@Override
	public DataResult<List<CvExperience>> getAllByCandidateIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<CvExperience>>(this.cvExperienceDao.getAllByCandidateIdOrderByEndAtDesc(id));
	}

}
