package com.reglamb.projvehimerc.domain.security;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;


import com.reglamb.projvehimerc.domain.DomainObject;

/**
 * @author  mastervodoo
 */
@Entity  
@SequenceGenerator(
	    name="SEQ_STORE",
	    sequenceName="sequenceusers",
	    initialValue= 1 ,
	    allocationSize=20)
@Table(name="users")  
public class Users implements Serializable,DomainObject{  
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")  
    private Integer id;  
    private String login;
    private String name_user;
    private String password;
    private Boolean enabled;
      
    @OneToOne(cascade=CascadeType.ALL)  
    @JoinTable(name="users_authorities",  
        joinColumns = {@JoinColumn(name="user_id", referencedColumnName="id")},  
        inverseJoinColumns = {@JoinColumn(name="authorities_id", referencedColumnName="id")}  
    )  
    private Authorities authorities;  
  
    public Integer getId() {  
        return id;  
    }  
  
    public void setId(Integer id) {  
        this.id = id;  
    }  
  
    public String getLogin() {  
        return login;  
    }  
  
    public void setLogin(String login) {  
        this.login = login;  
    }  
  
    public String getName_user() {
		return name_user;
	}

	public void setName_user(String name_user) {
		this.name_user = name_user;
	}

	public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }  
  
    public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Authorities getauthorities() {  
        return authorities;  
    }  
  
    public void setAuthorities(Authorities authorities) {  
        this.authorities = authorities;  
    }     
  
}  