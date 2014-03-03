package com.reglamb.projvehimerc.domain.security;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.reglamb.projvehimerc.domain.DomainObject;
/**
 * @author mastervodoo
 */
@Entity
@SequenceGenerator(name = "SEQ_STORE", sequenceName = "sequenceauthorities", initialValue = 1, allocationSize = 20)
@Table(name = "authorities")
public class Authorities implements Serializable, DomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_STORE")
	private Integer id;

	private String role;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "users_authorities", 
	joinColumns = { @JoinColumn(name = "authorities_id", referencedColumnName = "id") }, 
	inverseJoinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") })
	private Set<Users> userAuthorities;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<Users> getUserAuthorities() {
		return userAuthorities;
	}

	public void setUserAuthorities(Set<Users> userAuthorities) {
		this.userAuthorities = userAuthorities;
	}

}