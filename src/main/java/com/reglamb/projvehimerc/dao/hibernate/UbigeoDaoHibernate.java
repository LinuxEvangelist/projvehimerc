package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.UbigeoDao;
import com.reglamb.projvehimerc.domain.Ubigeo_Transportista;

@Repository("ubigeoTransDao")
public class UbigeoDaoHibernate extends HibernateDaoSupport implements UbigeoDao{

	@Override
	public Ubigeo_Transportista get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ubigeo_Transportista> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Ubigeo_Transportista object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Ubigeo_Transportista object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveUbigeo(Ubigeo_Transportista ubigeo) {
		getHibernateTemplate().saveOrUpdate(ubigeo);		
	}

	@Override
	public void deleteUbigeo(String ubigeo) {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Ubigeo_Transportista> getAllUbigeo(Ubigeo_Transportista ubigeo) {
		return (List<Ubigeo_Transportista>) getHibernateTemplate().find("from "
                + Ubigeo_Transportista.class.getName());
	}

	@Override
	public Ubigeo_Transportista selectUbigeoById(Long idubigeo) {
		// TODO Auto-generated method stub
		return null;
	}

}
