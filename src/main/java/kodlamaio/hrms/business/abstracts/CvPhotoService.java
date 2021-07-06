package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvPhoto;

public interface CvPhotoService {
	public DataResult<List<CvPhoto>> getAll();
	public Result add(CvPhoto cvPhoto, MultipartFile multipartFile);
	DataResult<CvPhoto> getByCandidateId(int id);

}
