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
@Table(name = "CW_ACCOUNTS")
public class CaseWorkerAccounts {

	@Id
	@Column(name = "ACC_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accId;

	@Column(name = "FULLNAME")
	private String fullName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PWD")
	private String pzw;

	@Column(name = "MOBILE_NUM")
	private Long mobileNumber;

	@Column(name = "GENDER")
	private char gender;

	@Column(name = "DOB")
	private LocalDate dob;

	@Column(name = "SSN")
	private Integer ssn;

	@Column(name = "ACTIVE_SW")
	private char activeSw;

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
