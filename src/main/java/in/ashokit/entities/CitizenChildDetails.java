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
@Table(name = "CITIZEN_CHILD_DTLS")
public class CitizenChildDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CHILD_ID")
	private Integer childId;

	@Column(name = "CASE_NUM")
	private Integer caseNum;

	@Column(name = "CHILD_NAME")
	private String childName;

	@Column(name = "CHILD_DOB")
	private LocalDate childDob;

	@Column(name = "CHILD_SSN")
	private Integer childSsn;

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
