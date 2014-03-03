package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Citv;

public interface Vehiculo_CitvDao extends GenericDao<Vehiculo_Citv>{
	public void saveVehiculoCitv(Vehiculo_Citv vehiculocitv);
	public void deleteVehiculoCitv(String vehiculocitv) ;
	public List<Vehiculo_Citv> getAllVehiculoCitv(Vehiculo_Citv vehiculocitv) ;
	public Vehiculo_Citv selectVehiculoCitvById(Long idvehiculocitv) ;
}
