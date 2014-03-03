package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.transportista.Transportista_Representante;

public interface Transportista_RepresentanteDao extends GenericDao<Transportista_Representante>{
	public void saveTransportistaRepresentate(Transportista_Representante transportistarepre);
	   public void deleteTransportistaRepresentate(String transportistarepre) ;
	   public List<Transportista_Representante> getAllTransportistaRepresentate(Transportista_Representante transportistarepre) ;
	   public Transportista_Representante selectTransportistaRepresentateById(Long idtransportistarepre) ;

}
