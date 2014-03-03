package com.reglamb.projvehimerc.dao;
import java.util.List;

import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Soat;

public interface Vehiculo_SoatDao extends GenericDao<Vehiculo_Soat>{
	public void saveVehiculoSoat(Vehiculo_Soat vehiculosoat);
	public void deleteVehiculoSoat(String vehiculosoat) ;
	public List<Vehiculo_Soat> getAllVehiculoSoat(Vehiculo_Soat vehiculosoat) ;
	public Vehiculo_Soat selectVehiculoSoatById(Long idvehiculosoat) ;
}
