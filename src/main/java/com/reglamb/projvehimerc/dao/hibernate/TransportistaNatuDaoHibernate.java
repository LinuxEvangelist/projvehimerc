package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.TransportistaNaturalDao;
import com.reglamb.projvehimerc.domain.TransportistaNatural;
@Repository("transportistaNatuDao")
public class TransportistaNatuDaoHibernate extends HibernateDaoSupport implements TransportistaNaturalDao{

	@Override
	public TransportistaNatural get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransportistaNatural> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(TransportistaNatural object) {
		
		
	}

	@Override
	public void delete(TransportistaNatural object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTransportistaNatuDao(TransportistaNatural transportistanatu) {
		getHibernateTemplate().saveOrUpdate(transportistanatu);
		
	}

	@Override
	public void deleteTransportistaNatuDao(String transportistanatu) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public List<TransportistaNatural> getAllTransportistaNatuDao(
			TransportistaNatural transportistanatu) {
		return (List<TransportistaNatural>) getHibernateTemplate().find("from "
                + TransportistaNatural.class.getName());
	}

	@Override
	public TransportistaNatural selectTransportistaNatuDaoById(
			Long idtransportistanatu) {
		// TODO Auto-generated method stub
		return null;
	}

}
