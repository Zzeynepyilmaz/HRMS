package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvCoverLetterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvCoverLetterDao;
import kodlamaio.hrms.entities.concretes.CvCoverLetter;

@Service
public class CvCoverLetterManager implements CvCoverLetterService{

	private CvCoverLetterDao cvCoverLetterDao;
	
	public CvCoverLetterManager(CvCoverLetterDao cvCoverLetterDao) {
		super();
		this.cvCoverLetterDao = cvCoverLetterDao;
	}

	@Override
	public Result add(CvCoverLetter cvCoverLetter) {
		this.cvCoverLetterDao.save(cvCoverLetter);
		return new SuccessResult("On yazi eklendi");
	}

	@Override
	public DataResult<List<CvCoverLetter>> getAllByCandidateId(int id) {
		return new SuccessDataResult<List<CvCoverLetter>>(this.cvCoverLetterDao.getByCandidateId(id));
	}

}
