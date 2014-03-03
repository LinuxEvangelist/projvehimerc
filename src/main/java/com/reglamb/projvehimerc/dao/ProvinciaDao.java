package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.ubigeo.Provincia;

public interface ProvinciaDao extends GenericDao<Provincia>{
	public void saveProvincia(Provincia provincia);
	public void deleteProvincia(String provincia) ;
	public List<Provincia> getAllProvincia(Provincia provincia) ;
	public Provincia selectProvinciaById(Long idprovincia) ;

}
