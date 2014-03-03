package com.reglamb.projvehimerc.dao;

import org.springframework.dao.DataAccessException;

import com.reglamb.projvehimerc.domain.User;
import com.reglamb.projvehimerc.exception.AuthenticationException;
import com.reglamb.projvehimerc.exception.EntityNotFoundException;


public interface UserDao extends GenericDao<User>{
	public User authenticateUser(String name_user,String pass_user)throws DataAccessException, AuthenticationException;
	public User getUserByname(String name_user)  throws DataAccessException, EntityNotFoundException;

}
