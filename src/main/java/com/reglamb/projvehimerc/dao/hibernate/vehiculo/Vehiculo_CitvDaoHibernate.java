package com.reglamb.projvehimerc.dao.hibernate.vehiculo;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.Vehiculo_CitvDao;
//import com.reglamb.projvehimerc.domain.TransportistaNatural;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Citv;
@Repository("vehiculocitvDao")
public class Vehiculo_CitvDaoHibernate extends HibernateDaoSupport implements Vehiculo_CitvDao {

	@Override
	public Vehiculo_Citv get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehiculo_Citv> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Vehiculo_Citv object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Vehiculo_Citv object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveVehiculoCitv(Vehiculo_Citv vehiculocitv) {
		getHibernateTemplate().saveOrUpdate(vehiculocitv);
	}

	@Override
	public void deleteVehiculoCitv(String vehiculocitv) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo_Citv> getAllVehiculoCitv(Vehiculo_Citv vehiculocitv) {
		return getHibernateTemplate().find("from "
                + Vehiculo_Citv.class.getName());
	}
	
	@Override
	public Vehiculo_Citv selectVehiculoCitvById(Long idvehiculocitv) {
		// TODO Auto-generated method stub
		return null;
	}

}
