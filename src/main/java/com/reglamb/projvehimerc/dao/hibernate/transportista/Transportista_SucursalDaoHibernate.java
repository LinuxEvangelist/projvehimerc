package com.reglamb.projvehimerc.dao.hibernate.transportista;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.Transportista_SucursalDao;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Sucursal;
@Repository("transsucursalDao")
public class Transportista_SucursalDaoHibernate extends HibernateDaoSupport implements Transportista_SucursalDao{

	@Override
	public Transportista_Sucursal get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transportista_Sucursal> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Transportista_Sucursal object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Transportista_Sucursal object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTransportistaSucursal(
			Transportista_Sucursal transportistasucu) {
		getHibernateTemplate().saveOrUpdate(transportistasucu);
	}

	@Override
	public void deleteTransportistaSucursal(String transportistasucu) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Transportista_Sucursal> getAllTransportistaSucursal(
			Transportista_Sucursal transportistasucu) {
		return (List<Transportista_Sucursal>) getHibernateTemplate().find("from "
                + Transportista_Sucursal.class.getName());
	}

	@Override
	public Transportista_Sucursal selectTransportistaSucursalById(
			Long idtransportistasucu) {
		// TODO Auto-generated method stub
		return null;
	}

}
