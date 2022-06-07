package in.ashokit.entities;

import java.time.LocalDate;
import java.util.Date;

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
@Table(name = "ELIGIBILITY_DETAILS")
public class EligibilityDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ELIG_ID")
	private Integer eligId;

	@Column(name = "CASE_NUM")
	private Integer caseNum;

	@Column(name = "PLAN_ID")
	private String planId;

	@Column(name = "PLAN_STATUS")
	private String planStatus;

	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "BENEFIT_AMT")
	private Double benefitAmt;

	@Column(name = "DENIAL_REASON")
	private String denialReason;

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
