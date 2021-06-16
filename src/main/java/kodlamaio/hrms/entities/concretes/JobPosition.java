package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity
@Data
@Table(name="job_positions")
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="job_id")
	private int id;
	@Column(name="position")
	private String position;
}
