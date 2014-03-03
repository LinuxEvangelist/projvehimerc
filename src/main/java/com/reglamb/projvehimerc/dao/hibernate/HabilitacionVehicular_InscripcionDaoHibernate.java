package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.HabilitacionVehicular_InscripcionDao;
import com.reglamb.projvehimerc.domain.HabilitacionVehicular_Inscripcion;
@Repository("inscriptransportistaDao")
public class HabilitacionVehicular_InscripcionDaoHibernate extends HibernateDaoSupport implements HabilitacionVehicular_InscripcionDao{

	@Override
	public HabilitacionVehicular_Inscripcion get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HabilitacionVehicular_Inscripcion> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(HabilitacionVehicular_Inscripcion object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(HabilitacionVehicular_Inscripcion object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveHabilitacionVehicularInscrip(
			HabilitacionVehicular_Inscripcion habilitacioninscrip) {
		getHibernateTemplate().saveOrUpdate(habilitacioninscrip);
	}

	@Override
	public void deleteHabilitacionVehicularInscrip(String habilitacioninscrip) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HabilitacionVehicular_Inscripcion> getAllHabilitacionVehicularInscrip(
			HabilitacionVehicular_Inscripcion habilitacioninscrip) {
		return (List<HabilitacionVehicular_Inscripcion>) getHibernateTemplate().find("from "
                + HabilitacionVehicular_Inscripcion.class.getName());
	}

	@Override
	public HabilitacionVehicular_Inscripcion selectHabilitacionVehicularInscripById(
			Long idhabilitacioninscrip) {
		// TODO Auto-generated method stub
		return null;
	}

}
