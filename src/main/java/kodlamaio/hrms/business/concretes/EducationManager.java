package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EducationDao;
import kodlamaio.hrms.entities.concretes.Education;

@Service
public class EducationManager implements EducationService{

	private EducationDao educationDao;
	
	
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Okul eklendi.");
	}
	@Override
	public Result update(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Okul bilgisi güncellendi");
	}

	@Override
	public Result delete(Education education) {
		this.educationDao.delete(education);
		return new SuccessResult("Okul bigisi silindi");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll());
	}

	@Override
	public DataResult<List<Education>> getAllByCandidateIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<Education>>(this.educationDao.getAllByCandidateIdOrderByEndDateDesc(id));
	}

}
