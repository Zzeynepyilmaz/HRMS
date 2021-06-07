package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Education;

@RestController
@RequestMapping("/api/educations")
public class EducationsController {

	private EducationService educationService;

	public EducationsController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Education education){
		return this.educationService.add(education);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Education education){
		return this.educationService.update(education);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Education education){
		return this.educationService.delete(education);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Education>> getAll(){
		return this.educationService.getAll();
	}
	
	@GetMapping("/getAllByCandidateIdOrderByEndAtDesc")
	public DataResult<List<Education>> getAllByCandidateIdOrderByEndAtDesc(@RequestParam int id){
		return this.educationService.getAllByCandidateIdOrderByEndAtDesc(id);
	}
	
}
