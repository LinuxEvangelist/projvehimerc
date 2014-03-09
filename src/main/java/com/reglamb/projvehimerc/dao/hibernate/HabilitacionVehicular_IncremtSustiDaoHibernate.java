package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.HabilitacionVehicular_IncremtSustiDao;
import com.reglamb.projvehimerc.domain.HabilitacionVehicular_IncremtSusti;

@Repository("incrementsustitransportistaDao")
public class HabilitacionVehicular_IncremtSustiDaoHibernate extends HibernateDaoSupport implements HabilitacionVehicular_IncremtSustiDao{

	@Override
	public HabilitacionVehicular_IncremtSusti get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HabilitacionVehicular_IncremtSusti> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(HabilitacionVehicular_IncremtSusti object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(HabilitacionVehicular_IncremtSusti object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveHabilitacionVehicularIncremtSusti(
			HabilitacionVehicular_IncremtSusti habilitacionincremtsusti) {
		getHibernateTemplate().saveOrUpdate(habilitacionincremtsusti);		
	}

	@Override
	public void deleteHabilitacionVehicularIncremtSusti(
			String habilitacionincremtsusti) {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<HabilitacionVehicular_IncremtSusti> getAllHabilitacionVehicularIncremtSusti(
			HabilitacionVehicular_IncremtSusti habilitacionincremtsusti) {
		return getHibernateTemplate().find("from "
                + HabilitacionVehicular_IncremtSusti.class.getName());
	}

	@Override
	public HabilitacionVehicular_IncremtSusti selectHabilitacionVehicularIncremtSustiById(
			Long idhabilitacionincremtsusti) {
		// TODO Auto-generated method stub
		return null;
	}



}
