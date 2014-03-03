package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.Transportista;

public interface TransportistaDao extends GenericDao<Transportista>{
	   public void saveTransportista(Transportista transportista);
	   public void deleteTransportista(String transportista) ;
	   public List<Transportista> getAllTransportista(Transportista transportista) ;
	   public Transportista selectTransportistaById(Long idtransportista) ;
	
}
