package in.ashokit.entities;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "CO_TRIGGERS")
public class CoTriggers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRG_ID")
	private Integer trgId;

	@Column(name = "CASE_NUM")
	private Integer caseNum;

	@Column(name = "TRG_STATUS")
	private char trgStatus = 'P';

	@Column(name = "NOTICE")
	private Blob notice;

}
