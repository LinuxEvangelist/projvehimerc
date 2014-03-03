package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.UbigeoIneiDao;
import com.reglamb.projvehimerc.domain.Ubigeo_Inei;

@Repository("ubigeoIneiTransDao")
public class UbigeoIneiDaoHibernate extends HibernateDaoSupport implements UbigeoIneiDao{

	@Override
	public Ubigeo_Inei get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ubigeo_Inei> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Ubigeo_Inei object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Ubigeo_Inei object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveUbigeoInei(Ubigeo_Inei ubigeo) {
		getHibernateTemplate().saveOrUpdate(ubigeo);		
	}

	@Override
	public void deleteUbigeoInei(String ubigeo) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ubigeo_Inei> getAllUbigeoInei(Ubigeo_Inei ubigeo) {
		return (List<Ubigeo_Inei>) getHibernateTemplate().find("from "
                + Ubigeo_Inei.class.getName());
	}

	@Override
	public Ubigeo_Inei selectUbigeoIneiById(Long idubigeo) {
		// TODO Auto-generated method stub
		return null;
	}

}
