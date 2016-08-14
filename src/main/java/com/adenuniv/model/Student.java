package com.adenuniv.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@DiscriminatorValue("1")
@EqualsAndHashCode(callSuper = false)
public class Student extends User {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CURRENT_YEAR_ID")
	private Year cuurentYear;


	
}
