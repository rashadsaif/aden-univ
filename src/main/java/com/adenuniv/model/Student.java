package com.adenuniv.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@DiscriminatorValue("1")
@EqualsAndHashCode(callSuper = false)
@JsonInclude(Include.NON_NULL)
public class Student extends User {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CURRENT_YEAR_ID")
	@JsonIgnore
	private Year curentYear;


	
}
