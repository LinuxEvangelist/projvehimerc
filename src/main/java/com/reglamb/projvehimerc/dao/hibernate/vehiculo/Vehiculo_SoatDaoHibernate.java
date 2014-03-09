package com.reglamb.projvehimerc.dao.hibernate.vehiculo;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.Vehiculo_SoatDao;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Soat;
@Repository("vehiculosoatDao")

public class Vehiculo_SoatDaoHibernate extends HibernateDaoSupport implements Vehiculo_SoatDao{

	@Override
	public Vehiculo_Soat get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehiculo_Soat> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Vehiculo_Soat object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Vehiculo_Soat object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveVehiculoSoat(Vehiculo_Soat vehiculosoat) {
		getHibernateTemplate().saveOrUpdate(vehiculosoat);
	}

	@Override
	public void deleteVehiculoSoat(String vehiculosoat) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo_Soat> getAllVehiculoSoat(Vehiculo_Soat vehiculosoat) {
		return getHibernateTemplate().find("from "
                + Vehiculo_Soat.class.getName());
	}

	@Override
	public Vehiculo_Soat selectVehiculoSoatById(Long idvehiculosoat) {
		// TODO Auto-generated method stub
		return null;
	}

}
