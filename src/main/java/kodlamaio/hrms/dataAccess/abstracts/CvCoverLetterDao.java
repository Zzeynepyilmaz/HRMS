package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CvCoverLetter;

public interface CvCoverLetterDao extends JpaRepository<CvCoverLetter, Integer>{

	List<CvCoverLetter> getByCandidateId(int id);
}
