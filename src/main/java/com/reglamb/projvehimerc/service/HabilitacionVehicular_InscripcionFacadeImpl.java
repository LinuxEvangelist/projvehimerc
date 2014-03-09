package com.reglamb.projvehimerc.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.reglamb.projvehimerc.dao.AuthoritiesDao;
import com.reglamb.projvehimerc.dao.ConductorDao;
import com.reglamb.projvehimerc.dao.DepartamentoDao;
import com.reglamb.projvehimerc.dao.DistritoDao;
import com.reglamb.projvehimerc.dao.HabilitacionVehicular_IncremtSustiDao;
import com.reglamb.projvehimerc.dao.HabilitacionVehicular_InscripcionDao;
import com.reglamb.projvehimerc.dao.ProvinciaDao;
import com.reglamb.projvehimerc.dao.TransportistaJuridicoDao;
import com.reglamb.projvehimerc.dao.TransportistaNaturalDao;
import com.reglamb.projvehimerc.dao.Transportista_AccionistaDao;
import com.reglamb.projvehimerc.dao.Transportista_RepresentanteDao;
import com.reglamb.projvehimerc.dao.Transportista_SucursalDao;
import com.reglamb.projvehimerc.dao.UbigeoDao;
import com.reglamb.projvehimerc.dao.UbigeoIneiDao;
import com.reglamb.projvehimerc.dao.UserDao;
import com.reglamb.projvehimerc.dao.UsersDao;
import com.reglamb.projvehimerc.dao.VehiculoDao;
import com.reglamb.projvehimerc.dao.Vehiculo_CitvDao;
import com.reglamb.projvehimerc.dao.Vehiculo_SoatDao;
import com.reglamb.projvehimerc.dao.Vehiculo_TenenciaDao;
import com.reglamb.projvehimerc.domain.Conductor;
import com.reglamb.projvehimerc.domain.HabilitacionVehicular_IncremtSusti;
import com.reglamb.projvehimerc.domain.HabilitacionVehicular_Inscripcion;
import com.reglamb.projvehimerc.domain.TransportistaJuridico;
import com.reglamb.projvehimerc.domain.TransportistaNatural;
import com.reglamb.projvehimerc.domain.Ubigeo_Inei;
import com.reglamb.projvehimerc.domain.Ubigeo_Transportista;
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


@Service(value = "inscripcionHabilitacionVehicFacade")
@Transactional
public class HabilitacionVehicular_InscripcionFacadeImpl implements HabilitacionVehicular_InscripcionFacade{
	/*Dao's*/
	HabilitacionVehicular_InscripcionDao habilitacionVehicular_InscripcionDao;
	HabilitacionVehicular_IncremtSustiDao habilitacionVehicular_IncremtSustiDao;
	TransportistaJuridicoDao transportistaJuridicoDao;
	TransportistaNaturalDao transportistaNaturalDao;
	Transportista_SucursalDao transportistaSucursalDao;
	Transportista_RepresentanteDao transportistaRepresentanteDao;
	Transportista_AccionistaDao transportistaAccionistaDao;
	VehiculoDao vehiculoDao;
	Vehiculo_CitvDao vehiculoCitvDao;
	Vehiculo_SoatDao vehiculoSoatDao;
	Vehiculo_TenenciaDao vehiculoTenenciaDao;
	ConductorDao conductorDao;
	UbigeoDao ubigeoDao;
	UbigeoIneiDao ubigeoIneiDao;
	DepartamentoDao departamentoDao;
	DistritoDao distritoDao;
	ProvinciaDao provinciaDao;
	UserDao userDao;
	UsersDao usersDao;
	AuthoritiesDao authoritiesDao;
	
	
	/*Habilitacion Vehicular Inscripcion*/
	@Override
	@Transactional(readOnly = false,isolation=Isolation.DEFAULT)
	public void saveHabilitacionVehicularInscrip(
			HabilitacionVehicular_Inscripcion habilitacioninscrip) {
		habilitacionVehicular_InscripcionDao.saveHabilitacionVehicularInscrip(habilitacioninscrip);
	}

	@Override
	@Transactional(readOnly = true)
	public List<HabilitacionVehicular_Inscripcion> getAllHabilitacionVehicularInscrip(
			HabilitacionVehicular_Inscripcion habilitacioninscrip) {
		return habilitacionVehicular_InscripcionDao.getAllHabilitacionVehicularInscrip(habilitacioninscrip);
	}
	
	/*Incremento_Sustitucion*/
	@Override
	public void saveHabilitacionVehicularIncremtSusti(
			HabilitacionVehicular_IncremtSusti habilitacionincremtsusti) {
		habilitacionVehicular_IncremtSustiDao.saveHabilitacionVehicularIncremtSusti(habilitacionincremtsusti);
	}

	@Override
	public List<HabilitacionVehicular_IncremtSusti> getAllHabilitacionVehicularIncremtSusti(
			HabilitacionVehicular_IncremtSusti habilitacionincremtsusti) {
		return habilitacionVehicular_IncremtSustiDao.getAllHabilitacionVehicularIncremtSusti(habilitacionincremtsusti);		
	}

	/*Transportista Juridico*/
	@Override
	@Transactional(readOnly = false,isolation=Isolation.DEFAULT)
	public void saveTransportistaJuridDao(
			TransportistaJuridico transportistajurid)
			throws DataAccessException {
		transportistaJuridicoDao.saveTransportistaJuridDao(transportistajurid);
	}

	@Override
	@Transactional(readOnly = true)
	public List<TransportistaJuridico> getAllTransportistaJuridDao(
			TransportistaJuridico transportistajurid)
			throws DataAccessException {
		return transportistaJuridicoDao.getAllTransportistaJuridDao(transportistajurid);
	}
	
	/*Transportista Natural*/
	@Override
	@Transactional(readOnly = false,isolation=Isolation.DEFAULT)
	public void saveTransportistaNatuDao(TransportistaNatural transportistanatu) {
		transportistaNaturalDao.saveTransportistaNatuDao(transportistanatu);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<TransportistaNatural> getAllTransportistaNatuDao(
			TransportistaNatural transportistanatu) throws DataAccessException {
		return transportistaNaturalDao.getAllTransportistaNatuDao(transportistanatu);
	}
	
	/*Transportista Sucursal*/
	@Override
	@Transactional(readOnly = false,isolation=Isolation.DEFAULT)
	public void saveTransportistaSucursal(
			Transportista_Sucursal transportistasucu)
			throws DataAccessException {
		transportistaSucursalDao.saveTransportistaSucursal(transportistasucu);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Transportista_Sucursal> getAllTransportistaSucursal(
			Transportista_Sucursal transportistasucu)
			throws DataAccessException {
		return transportistaSucursalDao.getAllTransportistaSucursal(transportistasucu);
	}
	
	/*Transportista Representante*/
	@Override
	@Transactional(readOnly = false,isolation=Isolation.DEFAULT)
	public void saveTransportistaRepresentate(
			Transportista_Representante transportistarepre)
			throws DataAccessException {
		transportistaRepresentanteDao.saveTransportistaRepresentate(transportistarepre);		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Transportista_Representante> getAllTransportistaRepresentate(
			Transportista_Representante transportistarepre)
			throws DataAccessException {
		return transportistaRepresentanteDao.getAllTransportistaRepresentate(transportistarepre);
	}
	
	/*Transportista Accionista*/
	@Override
	@Transactional(readOnly = false,isolation=Isolation.DEFAULT)
	public void saveTransportistaAccionista(
			Transportista_Accionista transportistasaccio)
			throws DataAccessException {
		transportistaAccionistaDao.saveTransportistaAccionista(transportistasaccio);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Transportista_Accionista> getAllTransportistaAccionista(
			Transportista_Accionista transportistasaccio)
			throws DataAccessException {
		return transportistaAccionistaDao.getAllTransportistaAccionista(transportistasaccio);
	}
	
		
	/*Vehiculo*/
	@Override
	@Transactional(readOnly = false,isolation=Isolation.DEFAULT)
	public void saveVehiculo(Vehiculo vehiculo) throws DataAccessException {
		vehiculoDao.saveVehiculo(vehiculo);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo> getAllVehiculo(Vehiculo vehiculo)
			throws DataAccessException {
		return vehiculoDao.getAllVehiculo(vehiculo);
	}
	
	/*Vehiculo Citv*/
	@Override
	@Transactional(readOnly = false,isolation=Isolation.DEFAULT)
	public void saveVehiculoCitv(Vehiculo_Citv vehiculocitv)
			throws DataAccessException {
		vehiculoCitvDao.saveVehiculoCitv(vehiculocitv);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo_Citv> getAllVehiculoCitv(Vehiculo_Citv vehiculocitv)
			throws DataAccessException {
		return vehiculoCitvDao.getAllVehiculoCitv(vehiculocitv);
	}
	
	/*Vehiculo Soat*/
	@Override
	@Transactional(readOnly = false,isolation=Isolation.DEFAULT)
	public void saveVehiculoSoat(Vehiculo_Soat vehiculosoat)
			throws DataAccessException {
		vehiculoSoatDao.saveVehiculoSoat(vehiculosoat);	
	}
	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo_Soat> getAllVehiculoSoat(Vehiculo_Soat vehiculosoat)
			throws DataAccessException {
		return vehiculoSoatDao.getAllVehiculoSoat(vehiculosoat);
	}

	/*Vehiculo Tenencia*/
	@Override
	@Transactional(readOnly = false,isolation=Isolation.DEFAULT)
	public void saveVehiculoTenencia(Vehiculo_Tenencia vehiculotenencia)
			throws DataAccessException {
		vehiculoTenenciaDao.saveVehiculoTenencia(vehiculotenencia);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo_Tenencia> getAllVehiculoTenencia(
			Vehiculo_Tenencia vehiculotenencia) throws DataAccessException {
		return vehiculoTenenciaDao.getAllVehiculoTenencia(vehiculotenencia);
	}
	
	/*Conductor*/
	@Override
	@Transactional(readOnly = false,isolation=Isolation.DEFAULT)
	public void saveConductor(Conductor conductor) throws DataAccessException {
		conductorDao.saveConductor(conductor);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Conductor> getAllConductor(Conductor conductor)
			throws DataAccessException {
		return conductorDao.getAllConductor(conductor);
	}
	
	/*Soat*/
	@Transactional(readOnly = false,isolation=Isolation.DEFAULT)
	public Vehiculo_SoatDao getVehiculoSoatDao() {
		return vehiculoSoatDao;
	}
	
	@Transactional(readOnly = true)
	public void setVehiculoSoatDao(Vehiculo_SoatDao vehiculoSoatDao) {
		this.vehiculoSoatDao = vehiculoSoatDao;
	}
	
	/*User*/

	@Override
	public User authenticateUser(String name_user, String pass_user)
			throws DataAccessException, AuthenticationException {
		return userDao.authenticateUser(name_user, pass_user);
	}

	@Override
	public User getUserByname(String username) throws DataAccessException,
			EntityNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*Ubigeo*/
	@Override
	public void saveUbigeo(Ubigeo_Transportista ubigeo) throws DataAccessException {
		ubigeoDao.saveUbigeo(ubigeo);		
	}

	@Override
	public List<Ubigeo_Transportista> getAllUbigeo(Ubigeo_Transportista ubigeo) throws DataAccessException {
		return ubigeoDao.getAllUbigeo(ubigeo);
	}
	
	@Override
	public void saveUbigeoInei(Ubigeo_Inei ubigeo) throws DataAccessException {
		ubigeoIneiDao.saveUbigeoInei(ubigeo);
	}
	
	@Override
	public List<Ubigeo_Inei> getAllUbigeoInei(Ubigeo_Inei ubigeo)
			throws DataAccessException {
		return ubigeoIneiDao.getAllUbigeoInei(ubigeo);
	}

	@Override
	public void saveDepartamento(Departamento departamento)
			throws DataAccessException {
		departamentoDao.saveDepartamento(departamento);				
	}

	@Override
	public List<Departamento> getAllDepartamento(Departamento departamento)
			throws DataAccessException {
		return departamentoDao.getAllDepartamento(departamento);
	}

	@Override
	public void saveDistrito(Distrito distrito) throws DataAccessException {
		distritoDao.saveDistrito(distrito);				
	}

	@Override
	public List<Distrito> getAllDistrito(Distrito distrito)
			throws DataAccessException {
		return distritoDao.getAllDistrito(distrito);
	}
	
	@Override
	public void saveProvincia(Provincia provincia) throws DataAccessException {
		provinciaDao.saveProvincia(provincia);						
	}

	@Override
	public List<Provincia> getAllProvincia(Provincia provincia)
			throws DataAccessException {
		return provinciaDao.getAllProvincia(provincia);
	}

	@Override
	public Users getUser(String login) throws DataAccessException,
			EntityNotFoundException {
        return usersDao.getUser(login);
	}
	
	@Override
	public void save(Users users) throws DataAccessException {
		usersDao.save(users);
	}

	@Override
	public Authorities getAuthority(int id) throws DataAccessException,
			EntityNotFoundException {
        return authoritiesDao.getAuthority(id);  
	}

	

		
}
