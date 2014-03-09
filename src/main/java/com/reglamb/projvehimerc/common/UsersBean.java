package com.reglamb.projvehimerc.common;

import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.reglamb.projvehimerc.dao.UsersDao;
import com.reglamb.projvehimerc.domain.security.Users;
import com.reglamb.projvehimerc.exception.EntityNotFoundException;
import com.reglamb.projvehimerc.service.HabilitacionVehicular_InscripcionFacade;

@Component
@Scope("session")
public class UsersBean {
	private String login;
	private String name_user;
	private String pass;
	private HabilitacionVehicular_InscripcionFacade habilitacionVehicular_InscripcionFacade;
	private UsersDao userDao;
	
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Users showUser(String access) throws DataAccessException, EntityNotFoundException{
		return habilitacionVehicular_InscripcionFacade.getUser(access);
	}
	public Users  showvUser(String access) throws DataAccessException, EntityNotFoundException{
		return userDao.getUser(access);
	}

}
