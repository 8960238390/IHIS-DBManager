package in.ashokit.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "APP_PLANS")
@Data
public class AppPlans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PLAN_ID")
	private Integer planId;
	
	@Column(name = "PLAN_NAME")
	private String planName;
	
	@Column(name = "PLAN_START_DATE")
	private LocalDate planStartDate;
	
	@Column(name = "PLAN_END_DATE")
	private LocalDate planEndDate;
	
	@Column(name = "CATEGORY_ID")
	private Integer categoryId;
	
	@Column(name = "ACTIVE_SW")
	private char activeSw;

	@CreationTimestamp
	@Column(name = "CREATED_DATE")
	private LocalDate createdDate;

	@UpdateTimestamp
	@Column(name = "UPDATED_DATE")
	private LocalDate updatedDate;


	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

}
