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

import kodlamaio.hrms.business.abstracts.CvSkillService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvSkill;

@RestController
@RequestMapping("/api/cvskills")
@CrossOrigin
public class CvSkillsController {

	private CvSkillService cvSkillService;

	@Autowired
	public CvSkillsController(CvSkillService cvSkillService) {
		super();
		this.cvSkillService = cvSkillService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvSkill cvSkill){
		return this.cvSkillService.add(cvSkill);
	}
	
	@GetMapping("/getAllByJCandidateId")
	public DataResult<List<CvSkill>> getAllByCandidateId(@RequestParam int id){
		return this.cvSkillService.getAllByCandidateId(id);
	}
}
