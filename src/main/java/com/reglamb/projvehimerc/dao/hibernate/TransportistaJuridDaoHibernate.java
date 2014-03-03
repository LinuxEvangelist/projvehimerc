package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.TransportistaJuridicoDao;
import com.reglamb.projvehimerc.domain.TransportistaJuridico;

@Repository("transportistaJuriDao")
public class TransportistaJuridDaoHibernate extends HibernateDaoSupport implements TransportistaJuridicoDao{

	@Override
	public TransportistaJuridico get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransportistaJuridico> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(TransportistaJuridico object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TransportistaJuridico object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTransportistaJuridDao(
			TransportistaJuridico transportistajurid) {
		getHibernateTemplate().saveOrUpdate(transportistajurid);
	}

	@Override
	public void deleteTransportistaJuridDao(String transportistajurid) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TransportistaJuridico> getAllTransportistaJuridDao(
			TransportistaJuridico transportistajurid) {
		return (List<TransportistaJuridico>) getHibernateTemplate().find("from "
                + TransportistaJuridico.class.getName());
	}

	@Override
	public TransportistaJuridico selectTransportistaJuridDaoById(
			Long idtransportistajurid) {
		// TODO Auto-generated method stub
		return null;
	}

}
