package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.transportista.Transportista_Accionista;

public interface Transportista_AccionistaDao extends GenericDao<Transportista_Accionista> {
	public void saveTransportistaAccionista(Transportista_Accionista transportistasaccio);
	public void deleteTransportistaAccionista(String transportistasaccio) ;
	public List<Transportista_Accionista> getAllTransportistaAccionista(Transportista_Accionista transportistasaccio) ;
	public Transportista_Accionista selectTransportistaAccionistaById(Long idtransportistasaccio) ;
}
