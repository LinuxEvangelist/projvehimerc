package com.reglamb.projvehimerc.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.UsersDao;
import com.reglamb.projvehimerc.domain.security.Users;
@Repository("usersDao")
public class UsersDaoHibernate implements UsersDao{
	@Autowired  
    private SessionFactory sessionFactory;  
    private PasswordEncoder passwordEncoder;
      
    private Session openSession() {  
        return sessionFactory.getCurrentSession();  
    }
    protected Session getSession()
    {
    	return sessionFactory.openSession();//.getCurrentSession();
    }

	@Override
	public Users get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Users object) {
		System.out.println("Create User in DAOIMPL..");
		String encodedPassword = passwordEncoder.encode(object.getPassword());
        object.setPassword(encodedPassword);
        getSession().saveOrUpdate("users",object);
                getSession().close();
                System.out.println("Updated or Created........."+object.getLogin());		
	}

	@Override
	public void delete(Users object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public Users getUser(String login) {
		List<Users> userList = new ArrayList<Users>();  
        Query query = openSession().createQuery("from Users u where u.login = :login");  
        query.setParameter("login", login);  
        userList = query.list();  
        if (userList.size() > 0)  
            return userList.get(0);  
        else
            return null;

	}

}
