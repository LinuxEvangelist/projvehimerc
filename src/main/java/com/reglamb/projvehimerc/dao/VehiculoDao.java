package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.Vehiculo;

public interface VehiculoDao extends GenericDao<Vehiculo>{
	public void saveVehiculo(Vehiculo vehiculo);
	public void deleteVehiculo(String vehiculo) ;
	public List<Vehiculo> getAllVehiculo(Vehiculo vehiculo) ;
	public Vehiculo selectVehiculoById(Long idVehiculo) ;

}
