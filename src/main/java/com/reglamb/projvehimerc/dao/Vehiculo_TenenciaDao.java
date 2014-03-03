package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Tenencia;

public interface Vehiculo_TenenciaDao extends GenericDao<Vehiculo_Tenencia>{
	public void saveVehiculoTenencia(Vehiculo_Tenencia vehiculotenencia);
	public void deleteVehiculoTenencia(String vehiculotenencia) ;
	public List<Vehiculo_Tenencia> getAllVehiculoTenencia(Vehiculo_Tenencia vehiculotenencia) ;
	public Vehiculo_Tenencia selectVehiculoTenenciaById(Long idvehiculotenencia) ;
}
