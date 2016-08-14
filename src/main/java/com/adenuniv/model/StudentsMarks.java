package com.adenuniv.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class StudentsMarks {
	@Id
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STUDENT_ID")
	private Student sudent;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUBJECT_ID")
	private Subject subject;
	private Long mark;

}
