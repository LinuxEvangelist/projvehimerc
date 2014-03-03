package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.ubigeo.Distrito;

public interface DistritoDao extends GenericDao<Distrito>{
	public void saveDistrito(Distrito distrito);
	public void deleteDistrito(String distrito) ;
	public List<Distrito> getAllDistrito(Distrito distrito) ;
	public Distrito selectDistritoById(Long iddistrito) ;

}
