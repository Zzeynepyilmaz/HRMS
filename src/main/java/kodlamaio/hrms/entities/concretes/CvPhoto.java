package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cv_photo")
@NoArgsConstructor
@AllArgsConstructor
public class CvPhoto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_photo_id")
	private int imageId;
	
	@ManyToOne()
	@JsonIgnore()
	@JoinColumn(name = "user_id")
	private Candidate candidate;
	
	@Column(name="photo")
	private String photo;

}
