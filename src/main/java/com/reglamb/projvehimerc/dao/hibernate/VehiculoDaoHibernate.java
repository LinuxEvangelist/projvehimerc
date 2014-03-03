package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.VehiculoDao;
import com.reglamb.projvehimerc.domain.Vehiculo;
@Repository("vehiculoDao")
public class VehiculoDaoHibernate extends HibernateDaoSupport implements VehiculoDao{

	@Override
	public Vehiculo get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehiculo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Vehiculo object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Vehiculo object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveVehiculo(Vehiculo vehiculo) {
		getHibernateTemplate().saveOrUpdate(vehiculo);
	}

	@Override
	public void deleteVehiculo(String vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo> getAllVehiculo(Vehiculo vehiculo) {
		return (List<Vehiculo>) getHibernateTemplate().find("from "
                + Vehiculo.class.getName());
	}

	@Override
	public Vehiculo selectVehiculoById(Long idVehiculo) {
		// TODO Auto-generated method stub
		return null;
	}

}
