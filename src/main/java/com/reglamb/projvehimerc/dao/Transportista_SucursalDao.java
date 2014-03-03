package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.transportista.Transportista_Sucursal;

public interface Transportista_SucursalDao extends GenericDao<Transportista_Sucursal>{
	public void saveTransportistaSucursal(Transportista_Sucursal transportistasucu);
	public void deleteTransportistaSucursal(String transportistasucu) ;
	public List<Transportista_Sucursal> getAllTransportistaSucursal(Transportista_Sucursal transportistasucu) ;
	public Transportista_Sucursal selectTransportistaSucursalById(Long idtransportistasucu) ;
}
