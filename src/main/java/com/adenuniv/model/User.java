package com.adenuniv.model;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.INTEGER)
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "username", name = "UK_USER_ID") })
public class User  {

	private static final long serialVersionUID = -2175150694352541150L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	@NotBlank
	
	private String username;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	private String name;


	@NotBlank
	private String mobileNumber;
	@Email
	private String email;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private Date lastLoginTime;

//	@Transient
//	@JsonIgnore
//	private Collection<? extends GrantedAuthority> authorities;
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "USER_PERMISSION", joinColumns = {
//			@JoinColumn(name = "USER_ID", referencedColumnName = "ID") }, inverseJoinColumns = {
//					@JoinColumn(name = "PERMISSION_ID", referencedColumnName = "ID") })
//	@JsonIgnore
//	private List<Permission> permissions;
//
//	private Boolean changePassword;
//
//	@Transient
//	@JsonIgnore
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	@Transient
//	@JsonIgnore
//	public boolean isAccountNonLocked() {
//		return suspendedToDateTime == null || suspendedToDateTime.before(Calendar.getInstance().getTime());
//	}
//
//	@Override
//	@Transient
//	@JsonIgnore
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	@Transient
//	@JsonIgnore
//	public boolean isEnabled() {
//		return Boolean.TRUE.equals(getStatus());
//	}

}
