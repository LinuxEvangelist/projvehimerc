package com.reglamb.projvehimerc.dao.hibernate.ubigeo;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.DistritoDao;
import com.reglamb.projvehimerc.domain.ubigeo.Distrito;

@Repository("distritoDao")
public class DistritoDaoHibernate extends HibernateDaoSupport implements DistritoDao{

	@Override
	public Distrito get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Distrito> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Distrito object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Distrito object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveDistrito(Distrito distrito) {
		getHibernateTemplate().saveOrUpdate(distrito);		
		
	}

	@Override
	public void deleteDistrito(String distrito) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Distrito> getAllDistrito(Distrito distrito) {
		return getHibernateTemplate().find("from "
                + Distrito.class.getName());
	}

	@Override
	public Distrito selectDistritoById(Long iddistrito) {
		// TODO Auto-generated method stub
		return null;
	}

}
