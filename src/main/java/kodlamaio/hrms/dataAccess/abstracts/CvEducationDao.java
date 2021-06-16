package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CvEducation;


public interface CvEducationDao extends JpaRepository<CvEducation, Integer>{

	CvEducation getById(int id);
	List<CvEducation> getAllByCandidateId(int id);
	List<CvEducation> getAllByCandidateIdOrderByEndDateDesc(int id);
}
