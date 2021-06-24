package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.CvCoverLetter;
import kodlamaio.hrms.entities.concretes.CvEducation;
import kodlamaio.hrms.entities.concretes.CvExperience;
import kodlamaio.hrms.entities.concretes.CvLanguage;
import kodlamaio.hrms.entities.concretes.CvLink;
import kodlamaio.hrms.entities.concretes.CvSkill;

public class CandidateCvDto {

	public Candidate candidate;
	public List<CvEducation> educations;
	public List<CvExperience> experiences;
	public List<CvLanguage> languages;
	public List<CvSkill> skills;
	public List<CvCoverLetter> coverLetters;
	public List<CvLink> links;
}
