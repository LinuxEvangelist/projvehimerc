package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.ConductorDao;
import com.reglamb.projvehimerc.domain.Conductor;
@Repository("conductorDao")
public class ConductorDaoHibernate extends HibernateDaoSupport implements ConductorDao{

	@Override
	public Conductor get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conductor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Conductor object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Conductor object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveConductor(Conductor conductor) {
		getHibernateTemplate().saveOrUpdate(conductor);
	}

	@Override
	public void deleteConductor(String conductor) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Conductor> getAllConductor(Conductor conductor) {
		return (List<Conductor>) getHibernateTemplate().find("from "
        + Conductor.class.getName());
	}

	@Override
	public Conductor selectVehiculoById(Long idConductor) {
		// TODO Auto-generated method stub
		return null;
	}

}
