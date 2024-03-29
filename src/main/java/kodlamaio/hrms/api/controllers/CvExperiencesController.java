package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvExperience;

@RestController
@RequestMapping("/api/cvexperiences")
@CrossOrigin
public class CvExperiencesController {

	private CvExperienceService cvExperienceService;

	@Autowired
	public CvExperiencesController(CvExperienceService cvExperienceService) {
		super();
		this.cvExperienceService = cvExperienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvExperience cvExperience){
		return this.cvExperienceService.add(cvExperience);
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<CvExperience>> getAllByCandidateId(@RequestParam int id){
		return this.cvExperienceService.getAllByCandidateId(id);
	}
	
	@GetMapping("/getAllByJobseekerIdOrderByEndAtDesc")
	public DataResult<List<CvExperience>> getAllByJobseekerIdOrderByEndAtDesc(@RequestParam("id") int id){
		return this.cvExperienceService.getAllByCandidateIdOrderByEndAtDesc(id);
	}
	
	
}
