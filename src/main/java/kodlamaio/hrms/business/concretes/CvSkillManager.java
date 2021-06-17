package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.CvSkillService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvSkillDao;
import kodlamaio.hrms.entities.concretes.CvSkill;

public class CvSkillManager implements CvSkillService{

	private CvSkillDao cvSkillDao;
	
	public CvSkillManager(CvSkillDao cvSkillDao) {
		super();
		this.cvSkillDao = cvSkillDao;
	}

	@Override
	public Result add(CvSkill cvSkill) {
		this.cvSkillDao.save(cvSkill);
		return new SuccessResult("Yetenek eklendi");
	}

	@Override
	public DataResult<List<CvSkill>> getAllByCandidateId(int id) {
		return new SuccessDataResult<List<CvSkill>>(this.cvSkillDao.getAllByCandidateId(id));
	}

}
