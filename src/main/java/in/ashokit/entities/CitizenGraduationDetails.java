package in.ashokit.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name = "CITIZEN_GRADUATION_DTLS")
public class CitizenGraduationDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GRADUATION_ID")
	private Integer graduationId;

	@Column(name = "CASE_NUM")
	private Integer caseNum;

	@Column(name = "HIGHEST_DEGREE")
	private String highestDegree;

	@Column(name = "GRADUATION_YEAR_ID")
	private Integer graduationYearId;

	@Column(name = "UNIVERSITY")
	private String university;

	@CreationTimestamp
	@Column(name = "CREATED_DATE")
	private LocalDate createdDate;

	@CreationTimestamp
	@Column(name = "UPDATED_DATE")
	private LocalDate updatedDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

}
