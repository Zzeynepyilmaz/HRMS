package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Strings;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.User;
import kodlamaio.hrms.entities.dtos.CandidateCvDto;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	private UserDao userDao;
	
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, UserDao userDao) {
		super();
		this.candidateDao = candidateDao;
		this.userDao = userDao;
	}


	@Override
	public DataResult<List<Candidate>> findAllByEmail(String email) {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findByEmail(email), "Listelendi");
	}

	@Override
	public DataResult<List<Candidate>> findAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),
				"Is arayanlar listelendi");
	}


	@Override
	public Result add(Candidate candidate) {
		if (Strings.isNullOrEmpty(candidate.getFirstName())) {
			return new ErrorResult("Lütfen isminizi bos gecmeyiniz");
		}

		else if (Strings.isNullOrEmpty(candidate.getLastName())) {
			return new ErrorResult("Lütfen soyisminizi bos gecmeyiniz");
		}

		else if (candidate.getBirthYear() == null) {
			return new ErrorResult("Lütfen dogum yilini bos gecmeyiniz");
		}

		else if (candidate.getEmail() == null) {
			return new ErrorResult("Lütfen email adresinizi bos gecmeyiniz");
		}

		else if (candidate.getPassword().length() <= 6) {
			return new ErrorResult("Lütfen sifrenizi 6 karakterden az girmeyiniz");
		}

		
		else {
			this.candidateDao.save(candidate);
			return new SuccessResult("İş arayan eklendi");
			
		}
	}


	@Override
	public Result delete(int id) {
		this.candidateDao.deleteById(id);
		return new SuccessResult("iş arayan silindi.");
	}


	@Override
	public Result update(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("iş arayan  güncellendi.");
	}


	@Override
	public DataResult<List<Candidate>> findAllByIdentityNumber(String identityNumber) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DataResult<CandidateCvDto> getCandidateCvById(int id) {
		Candidate candidate = this.candidateDao.getById(id);
		CandidateCvDto cv = new CandidateCvDto();
		cv.experiences = candidate.getCvExperience();
		cv.languages = candidate.getCvLanguage();
		cv.educations = candidate.getCvEducation();
		cv.skills = candidate.getCvSkill();
		cv.coverLetters = candidate.getCvCoverLetter();
		return new SuccessDataResult<CandidateCvDto>(cv);
	}
	
	
	
}
