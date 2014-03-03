package com.reglamb.projvehimerc.dao.hibernate.transportista;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.Transportista_AccionistaDao;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Accionista;
@Repository("transaccionistaDao")
public class Transportista_AccionistaDaoHibernate extends HibernateDaoSupport implements Transportista_AccionistaDao{

	@Override
	public Transportista_Accionista get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transportista_Accionista> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Transportista_Accionista object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Transportista_Accionista object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTransportistaAccionista(
			Transportista_Accionista transportistasaccio) {
		getHibernateTemplate().saveOrUpdate(transportistasaccio);
		
	}

	@Override
	public void deleteTransportistaAccionista(String transportistasaccio) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Transportista_Accionista> getAllTransportistaAccionista(
			Transportista_Accionista transportistasaccio) {
		return (List<Transportista_Accionista>) getHibernateTemplate().find("from "
                + Transportista_Accionista.class.getName());
	}

	@Override
	public Transportista_Accionista selectTransportistaAccionistaById(
			Long idtransportistasaccio) {
		// TODO Auto-generated method stub
		return null;
	}

}
