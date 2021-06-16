package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CvExperience;

public interface CvExperienceDao extends JpaRepository<CvExperience, Integer> {

	CvExperience getById(int id);
	List<CvExperience> getAllByCandidateIdOrderByEndAtDesc(int id);
	List<CvExperience> getAllByCandidateId(int id);
}
