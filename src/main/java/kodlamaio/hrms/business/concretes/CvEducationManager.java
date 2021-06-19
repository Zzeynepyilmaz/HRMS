package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvEducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvEducationDao;
import kodlamaio.hrms.entities.concretes.CvEducation;

@Service
public class CvEducationManager implements CvEducationService{

	private CvEducationDao cvEducationDao;
	
	public CvEducationManager(CvEducationDao cvEducationDao) {
		super();
		this.cvEducationDao = cvEducationDao;
	}

	@Override
	public Result add(CvEducation cvEducation) {
		this.cvEducationDao.save(cvEducation);
		return new SuccessResult("Okul eklendi.");
	}

	@Override
	public DataResult<List<CvEducation>> getAllByCandidateId(int id) {
		return new SuccessDataResult<List<CvEducation>>(this.cvEducationDao.getAllByCandidateId(id));
	}

	@Override
	public DataResult<List<CvEducation>> getAllByCandidateIdOrderByGraduationDateDesc(int id) {
		return new SuccessDataResult<List<CvEducation>>(this.cvEducationDao.getAllByCandidateIdOrderBySchoolGradiationDateDesc(id));
	}

	@Override
	public DataResult<List<CvEducation>> getAll() {
		return new SuccessDataResult<List<CvEducation>>(this.cvEducationDao.findAll());
	}

}
