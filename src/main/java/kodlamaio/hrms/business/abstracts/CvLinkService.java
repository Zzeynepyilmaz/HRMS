package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvLink;

public interface CvLinkService {

	Result add(CvLink cvLink);
	DataResult<List<CvLink>> getAllByCandidateId(int id);
}
