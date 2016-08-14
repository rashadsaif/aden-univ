package com.adenuniv.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Year {
	@Id
	private Long id;
	private String name;
	@OneToMany(mappedBy = "year", cascade = { CascadeType.ALL })
	private List<Subject> subjects;

}
