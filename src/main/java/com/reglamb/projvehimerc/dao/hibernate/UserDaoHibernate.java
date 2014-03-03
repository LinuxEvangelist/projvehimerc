package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import com.reglamb.projvehimerc.dao.UserDao;
import com.reglamb.projvehimerc.domain.User;
import com.reglamb.projvehimerc.exception.AuthenticationException;
import com.reglamb.projvehimerc.exception.EntityNotFoundException;

@Repository("userDao")
public class UserDaoHibernate extends HibernateDaoSupport implements UserDao{
	
	@Override
	public User get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User authenticateUser(String name_user,String pass_user)throws DataAccessException, AuthenticationException {
	User validUser =
		(User) this.getSessionFactory().getCurrentSession().createQuery(
		"select user from User user where" +
		"user.name_user = :name_user " +
		"and user.pass_user = :pass_user")
		.setString("name_user", name_user)
		.setString("pass_user", pass_user)
		.uniqueResult();
	
		if (validUser == null) {
		throw new AuthenticationException("No users found");
		} else {
			return validUser;
		}

	}

	@Override
	public User getUserByname(String name_user) throws DataAccessException, EntityNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
