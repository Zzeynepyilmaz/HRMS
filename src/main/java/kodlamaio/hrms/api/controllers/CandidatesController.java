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

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.CandidateCvDto;

@RestController
@RequestMapping("api/candidates")
@CrossOrigin
public class CandidatesController {

	CandidateService candidateService;

	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Candidate>> findAll(){
		return candidateService.findAll();	
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate){
		return candidateService.add(candidate);
	} 
	
	@GetMapping("/getCandidateCvById")
	public DataResult<CandidateCvDto> getCandidateCvById(@RequestParam int id){
		return this.candidateService.getCandidateCvById(id);
	}
}
