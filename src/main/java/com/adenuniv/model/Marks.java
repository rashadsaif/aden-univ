package com.adenuniv.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class Marks {
	@ManyToOne
	@JoinColumn(name = "SUBJECT_ID")
	private Subject subject;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID")
	private Student student;
	private Short mark;

}
