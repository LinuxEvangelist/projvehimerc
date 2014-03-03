package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.Ubigeo_Inei;

public interface UbigeoIneiDao extends GenericDao<Ubigeo_Inei>{
	public void saveUbigeoInei(Ubigeo_Inei ubigeo);
	public void deleteUbigeoInei(String ubigeo) ;
	public List<Ubigeo_Inei> getAllUbigeoInei(Ubigeo_Inei ubigeo) ;
	public Ubigeo_Inei selectUbigeoIneiById(Long idubigeo) ;

}