package com.reglamb.projvehimerc.dao.hibernate.transportista;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.Transportista_RepresentanteDao;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Representante;

@Repository("transrepresentanteDao")
public class Transportista_RepresentanteDaoHibernate extends HibernateDaoSupport implements Transportista_RepresentanteDao{

	@Override
	public Transportista_Representante get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transportista_Representante> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Transportista_Representante object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Transportista_Representante object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTransportistaRepresentate(
			Transportista_Representante transportistarepre) {
		getHibernateTemplate().saveOrUpdate(transportistarepre);
		
	}

	@Override
	public void deleteTransportistaRepresentate(String transportistarepre) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Transportista_Representante> getAllTransportistaRepresentate(
			Transportista_Representante transportistarepre) {
		return (List<Transportista_Representante>) getHibernateTemplate().find("from "
                + Transportista_Representante.class.getName());
	}

	@Override
	public Transportista_Representante selectTransportistaRepresentateById(
			Long idtransportistarepre) {
		// TODO Auto-generated method stub
		return null;
	}

}
