package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.AuthoritiesDao;
import com.reglamb.projvehimerc.domain.security.Authorities;
@Repository("authoritiesDao")
public class AuthoritiesDaoHibernate implements AuthoritiesDao{
	@Autowired  
    private SessionFactory sessionFactory;  
      
    private Session getCurrentSession() {  
        return sessionFactory.getCurrentSession();  
    }  

	@Override
	public Authorities get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Authorities> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Authorities object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Authorities object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Authorities getAuthority(int id) {
		// TODO Auto-generated method stub
		Authorities authority = (Authorities) getCurrentSession().load(Authorities.class, id);  
		return authority;  
	}

}
