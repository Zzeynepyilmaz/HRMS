package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.CvLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvLanguageDao;
import kodlamaio.hrms.entities.concretes.CvLanguage;

public class CvLanguageManager implements CvLanguageService{

	private CvLanguageDao cvLanguageDao;
	
	public CvLanguageManager(CvLanguageDao cvLanguageDao) {
		super();
		this.cvLanguageDao = cvLanguageDao;
	}

	@Override
	public Result add(CvLanguage cvLanguage) {
		this.cvLanguageDao.save(cvLanguage);
		return new SuccessResult("Dil eklendi");
	}

	@Override
	public DataResult<List<CvLanguage>> getAll() {
		return new SuccessDataResult<List<CvLanguage>>(this.cvLanguageDao.findAll());
	}

	@Override
	public DataResult<List<CvLanguage>> getAllByCandidateId(int id) {
		return new SuccessDataResult<List<CvLanguage>>(this.cvLanguageDao.getByCandidateId(id));
	}

}
