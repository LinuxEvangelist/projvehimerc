package com.reglamb.projvehimerc.dao.hibernate.ubigeo;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.DepartamentoDao;
import com.reglamb.projvehimerc.domain.ubigeo.Departamento;

@Repository("departamentoDao")
public class DepartamentoDaoHibernate extends HibernateDaoSupport implements DepartamentoDao{

	@Override
	public Departamento get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departamento> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Departamento object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Departamento object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveDepartamento(Departamento departamento) {
		getHibernateTemplate().saveOrUpdate(departamento);		
		
	}

	@Override
	public void deleteDepartamento(String departamento) {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Departamento> getAllDepartamento(Departamento departamento) {
		return getHibernateTemplate().find("from "
                + Departamento.class.getName());
	}

	@Override
	public Departamento selectDepartamentoById(Long iddepartamento) {
		// TODO Auto-generated method stub
		return null;
	}

}
