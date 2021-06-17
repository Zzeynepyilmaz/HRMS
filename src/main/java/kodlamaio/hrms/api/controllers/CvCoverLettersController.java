package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvCoverLetterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvCoverLetter;

@RestController
@RequestMapping("/api/cvcoverletters")
public class CvCoverLettersController {

	private CvCoverLetterService cvCoverLetterService;

	@Autowired
	public CvCoverLettersController(CvCoverLetterService cvCoverLetterService) {
		super();
		this.cvCoverLetterService = cvCoverLetterService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvCoverLetter cvCoverLetter){
		return this.cvCoverLetterService.add(cvCoverLetter);
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<CvCoverLetter>> getAllByCandidateId(@RequestParam int id){
		return this.cvCoverLetterService.getAllByCandidateId(id);
	}
}
