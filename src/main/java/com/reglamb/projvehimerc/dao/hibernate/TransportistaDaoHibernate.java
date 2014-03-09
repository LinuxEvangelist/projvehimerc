package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.TransportistaDao;
import com.reglamb.projvehimerc.domain.Transportista;
@Repository("transportistaDao")
public class TransportistaDaoHibernate extends HibernateDaoSupport implements TransportistaDao{

	@Override
	public Transportista get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Transportista> getAll() {
		return getHibernateTemplate().find("from "
                + Transportista.class.getName());
	}

	@Override
	public void save(Transportista object) {
		
		
	}

	@Override
	public void delete(Transportista object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTransportista(Transportista transportista) {
		getHibernateTemplate().saveOrUpdate(transportista);
		
	}

	@Override
	public void deleteTransportista(String transportista) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Transportista> getAllTransportista(Transportista transportista) {
		return getHibernateTemplate().find("from "
                + Transportista.class.getName());
	}

	@Override
	public Transportista selectTransportistaById(Long idtransportista) {
		// TODO Auto-generated method stub
		return null;
	}

}
