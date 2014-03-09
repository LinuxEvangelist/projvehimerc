package com.reglamb.projvehimerc.dao.hibernate.ubigeo;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.ProvinciaDao;
import com.reglamb.projvehimerc.domain.ubigeo.Provincia;

@Repository("provinciaDao")
public class ProvinciaDaoHibernate extends HibernateDaoSupport implements ProvinciaDao{

	@Override
	public Provincia get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Provincia> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Provincia object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Provincia object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveProvincia(Provincia provincia) {
		getHibernateTemplate().saveOrUpdate(provincia);		
		
	}

	@Override
	public void deleteProvincia(String provincia) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Provincia> getAllProvincia(Provincia provincia) {
		return getHibernateTemplate().find("from "
                + Provincia.class.getName());
	}

	@Override
	public Provincia selectProvinciaById(Long idprovincia) {
		// TODO Auto-generated method stub
		return null;
	}

}
