package com.reglamb.projvehimerc.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.reglamb.projvehimerc.domain.Conductor;
import com.reglamb.projvehimerc.domain.HabilitacionVehicular_IncremtSusti;
import com.reglamb.projvehimerc.domain.HabilitacionVehicular_Inscripcion;
import com.reglamb.projvehimerc.domain.TransportistaJuridico;
import com.reglamb.projvehimerc.domain.TransportistaNatural;
import com.reglamb.projvehimerc.domain.Ubigeo_Transportista;
import com.reglamb.projvehimerc.domain.Ubigeo_Inei;
import com.reglamb.projvehimerc.domain.User;
import com.reglamb.projvehimerc.domain.Vehiculo;
import com.reglamb.projvehimerc.domain.security.Authorities;
import com.reglamb.projvehimerc.domain.security.Users;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Accionista;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Representante;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Sucursal;
import com.reglamb.projvehimerc.domain.ubigeo.Departamento;
import com.reglamb.projvehimerc.domain.ubigeo.Distrito;
import com.reglamb.projvehimerc.domain.ubigeo.Provincia;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Citv;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Soat;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Tenencia;
import com.reglamb.projvehimerc.exception.AuthenticationException;
import com.reglamb.projvehimerc.exception.EntityNotFoundException;

public interface HabilitacionVehicular_InscripcionFacade {
	
	/*Proceso Inscripcion*/
	public void saveHabilitacionVehicularInscrip(
			HabilitacionVehicular_Inscripcion habilitacioninscrip);

	public List<HabilitacionVehicular_Inscripcion> getAllHabilitacionVehicularInscrip(
			HabilitacionVehicular_Inscripcion habilitacioninscrip);
	
	/*Proceso Incremento_Sustitucion*/
	public void saveHabilitacionVehicularIncremtSusti(
			HabilitacionVehicular_IncremtSusti habilitacionincremtsusti);

	public List<HabilitacionVehicular_IncremtSusti> getAllHabilitacionVehicularIncremtSusti(
			HabilitacionVehicular_IncremtSusti habilitacionincremtsusti);

	/*Transportista*/
	public void saveTransportistaJuridDao(
			TransportistaJuridico transportistajurid) throws DataAccessException;

	public List<TransportistaJuridico> getAllTransportistaJuridDao(
			TransportistaJuridico transportistajurid) throws DataAccessException;

	public void saveTransportistaNatuDao(TransportistaNatural transportistanatu);

	public List<TransportistaNatural> getAllTransportistaNatuDao(
			TransportistaNatural transportistanatu) throws DataAccessException;
	
	public void saveTransportistaSucursal(
			Transportista_Sucursal transportistasucu) throws DataAccessException;

	public List<Transportista_Sucursal> getAllTransportistaSucursal(
			Transportista_Sucursal transportistasucu) throws DataAccessException;

	public void saveTransportistaRepresentate(
			Transportista_Representante transportistarepre) throws DataAccessException;

	public List<Transportista_Representante> getAllTransportistaRepresentate(
			Transportista_Representante transportistarepre) throws DataAccessException;

	public void saveTransportistaAccionista(
			Transportista_Accionista transportistasaccio) throws DataAccessException;

	public List<Transportista_Accionista> getAllTransportistaAccionista(
			Transportista_Accionista transportistasaccio) throws DataAccessException;
	
	/*Vehiculo*/
	public void saveVehiculo(Vehiculo vehiculo) throws DataAccessException;

	public List<Vehiculo> getAllVehiculo(Vehiculo vehiculo) throws DataAccessException;
	
	public void saveVehiculoCitv(Vehiculo_Citv vehiculocitv) throws DataAccessException;

	public List<Vehiculo_Citv> getAllVehiculoCitv(Vehiculo_Citv vehiculocitv) throws DataAccessException;

	public void saveVehiculoSoat(Vehiculo_Soat vehiculosoat) throws DataAccessException;

	public List<Vehiculo_Soat> getAllVehiculoSoat(Vehiculo_Soat vehiculosoat) throws DataAccessException;

	public void saveVehiculoTenencia(Vehiculo_Tenencia vehiculotenencia) throws DataAccessException;

	public List<Vehiculo_Tenencia> getAllVehiculoTenencia(
			Vehiculo_Tenencia vehiculotenencia) throws DataAccessException;
	
	/*Conductor*/
	public void saveConductor(Conductor conductor) throws DataAccessException;

	public List<Conductor> getAllConductor(Conductor conductor) throws DataAccessException;
	
	/*Ubigeo*/
	public void saveUbigeo(Ubigeo_Transportista ubigeo) throws DataAccessException;

	public List<Ubigeo_Transportista> getAllUbigeo(Ubigeo_Transportista ubigeo) throws DataAccessException;
	
	public void saveUbigeoInei(Ubigeo_Inei ubigeo) throws DataAccessException;

	public List<Ubigeo_Inei> getAllUbigeoInei(Ubigeo_Inei ubigeo) throws DataAccessException;

	public void saveDepartamento(Departamento departamento) throws DataAccessException;

	public List<Departamento> getAllDepartamento(Departamento departamento) throws DataAccessException;

	public void saveDistrito(Distrito distrito) throws DataAccessException;

	public List<Distrito> getAllDistrito(Distrito distrito) throws DataAccessException;

	public void saveProvincia(Provincia provincia) throws DataAccessException;

	public List<Provincia> getAllProvincia(Provincia provincia) throws DataAccessException;
	
	/*User*/
	public User authenticateUser(String name_user,String pass_user)throws DataAccessException, AuthenticationException;
	
	public User getUserByname(String username) throws DataAccessException, EntityNotFoundException;
	
	/*Users*/
    public Users getUser(String login) throws DataAccessException, EntityNotFoundException;
    
    public void save(Users object) throws DataAccessException;

	/*Authorities*/
    public Authorities getAuthority(int id) throws DataAccessException, EntityNotFoundException;  


}
