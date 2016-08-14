package com.adenuniv.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@DiscriminatorValue("0")
@EqualsAndHashCode(callSuper = false)
public class AdminUser extends User {

   private String job;

	
}
