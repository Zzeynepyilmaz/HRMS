package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.CandidateCvDto;

public interface CandidateService {

	DataResult<List<Candidate>> findAllByEmail(String email); // Tüm adaylarin mailleri

	DataResult<List<Candidate>> findAllByIdentityNumber(String identityNumber); // Kimlik numarasina göre tüm is basvurusu yapanlar

	DataResult<List<Candidate>> findAll(); // Tüm isbasvurusu yapanlarin listesi
	
	DataResult<CandidateCvDto> getCandidateCvById(int id);

	Result add(Candidate candidate);

	Result delete(int id);

	Result update(Candidate candidate);
}
