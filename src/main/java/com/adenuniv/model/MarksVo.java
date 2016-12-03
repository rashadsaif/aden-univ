package com.adenuniv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;
@Data
@Entity
public class MarksVo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "SUBJECT_ID")
	private Subject subject;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID")
	private Student student;
	private Short mark;

}
