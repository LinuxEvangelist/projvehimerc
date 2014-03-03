package com.reglamb.projvehimerc.dao.hibernate.vehiculo;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.Vehiculo_TenenciaDao;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Tenencia;
@Repository("vehiculoteneciaDao")
public class Vehiculo_TenenciaDaoHibernate extends HibernateDaoSupport implements Vehiculo_TenenciaDao{

	@Override
	public Vehiculo_Tenencia get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehiculo_Tenencia> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Vehiculo_Tenencia object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Vehiculo_Tenencia object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveVehiculoTenencia(Vehiculo_Tenencia vehiculotenencia) {
		getHibernateTemplate().saveOrUpdate(vehiculotenencia);
	}

	@Override
	public void deleteVehiculoTenencia(String vehiculotenencia) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo_Tenencia> getAllVehiculoTenencia(
			Vehiculo_Tenencia vehiculotenencia) {
		return (List<Vehiculo_Tenencia>) getHibernateTemplate().find("from "
                + Vehiculo_Tenencia.class.getName());
	}

	@Override
	public Vehiculo_Tenencia selectVehiculoTenenciaById(
			Long idvehiculotenencia) {
		// TODO Auto-generated method stub
		return null;
	}

}
