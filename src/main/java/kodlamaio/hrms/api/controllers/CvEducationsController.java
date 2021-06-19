package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvEducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvEducation; 


@RestController
@RequestMapping("/api/cveducations")
public class CvEducationsController {

	private CvEducationService cvEducationService;

	@Autowired
	public CvEducationsController(CvEducationService cvEducationService) {
		super();
		this.cvEducationService = cvEducationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvEducation cvEducation){
		return this.cvEducationService.add(cvEducation);
	}
	

	@GetMapping("/getall")
	public DataResult<List<CvEducation>> getAll(){
		return this.cvEducationService.getAll();
	}
	
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<CvEducation>> getAllByCandidateId(@RequestParam int id){
		return this.cvEducationService.getAllByCandidateId(id);
	}
	
	@GetMapping("/getAllByJCandidateIdOrderByEndAtDesc")
	public DataResult<List<CvEducation>> getAllByCandidateIdOrderByEndAtDesc(@RequestParam int id){
		return this.cvEducationService.getAllByCandidateIdOrderByGraduationDateDesc(id);
	}
}
