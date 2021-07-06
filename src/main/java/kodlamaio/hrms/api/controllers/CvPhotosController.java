package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.CvPhotoService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.CvPhoto;

@RestController
@RequestMapping("/api/cvphotos")
@CrossOrigin
public class CvPhotosController {
	
	private CvPhotoService cvPhotoService;

	public CvPhotosController(CvPhotoService cvPhotoService) {
		super();
		this.cvPhotoService = cvPhotoService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CvPhoto>> getAll(){
		return this.cvPhotoService.getAll();
	}
	
	@GetMapping("/getByCandidateId")
	public DataResult<CvPhoto> getByJobseekerId(@RequestParam int id){
		return this.cvPhotoService.getByCandidateId(id);
	}
	
	
}
