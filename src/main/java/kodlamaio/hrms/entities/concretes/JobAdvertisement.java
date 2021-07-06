package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_advertisements")
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int jobAdvertisementId;
	
	@Column(name = "job_details")
	private String jobDetails;
	
	@Column(name = "min_salary")
	private double minSalary;
	
	@Column(name = "max_salary")
	private double maxSalary;
	
	@Column(name = "number_of_open_position")
	private int numberOfOpenPositions;
	
	@Column(name = "last_apply_date")
	private LocalDate lastApplyDate;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "release_date")
	private LocalDate releaseDate;
	

	@ManyToOne()
	@JoinColumn(name = "company_id")
	private Employer employer;
	
	
	@ManyToOne()
	@JoinColumn(name = "job_id")
	private JobPosition jobPosition;
	
	
    @ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;
}

