package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.CvPhotoService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CvPhotoDao;
import kodlamaio.hrms.entities.concretes.CvEducation;
import kodlamaio.hrms.entities.concretes.CvPhoto;

@Service
public class CvPhotoManager implements CvPhotoService{
	
	private CvPhotoDao cvPhotoDao;
	

	public CvPhotoManager(CvPhotoDao cvPhotoDao) {
		super();
		this.cvPhotoDao = cvPhotoDao;
	}

	@Override
	public DataResult<List<CvPhoto>> getAll() {
		return new SuccessDataResult<List<CvPhoto>>(this.cvPhotoDao.findAll());
	}

	@Override
	public Result add(CvPhoto cvPhoto, MultipartFile multipartFile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<CvPhoto> getByCandidateId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
