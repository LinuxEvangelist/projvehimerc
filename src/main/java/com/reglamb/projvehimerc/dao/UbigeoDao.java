package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.Ubigeo_Transportista;

public interface UbigeoDao extends GenericDao<Ubigeo_Transportista>{
	public void saveUbigeo(Ubigeo_Transportista ubigeo);
	public void deleteUbigeo(String ubigeo) ;
	public List<Ubigeo_Transportista> getAllUbigeo(Ubigeo_Transportista ubigeo) ;
	public Ubigeo_Transportista selectUbigeoById(Long idubigeo) ;

}
