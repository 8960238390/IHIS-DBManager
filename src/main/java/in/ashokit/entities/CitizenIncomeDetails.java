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
@Table(name = "CITIZEN_INCOME_DTLS")
@Data
public class CitizenIncomeDetails {

	@Id
	@Column(name="INCOME_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer incomeId;
	
	@Column(name="CASE_NUM")
	private Integer caseNum;

	@Column(name="SALARY_INCOME")
	private Double salaryIncome;
	
	@Column(name="RENT_INCOME")
	private Double rentIncome;
	
	@Column(name="PROPERTY_INCOME")
	private Double propertyIncome;
	
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
