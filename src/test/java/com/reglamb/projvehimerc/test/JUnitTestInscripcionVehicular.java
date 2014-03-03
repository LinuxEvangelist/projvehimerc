package com.reglamb.projvehimerc.test;
/*
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Ignore;
//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.reglamb.projvehimerc.dao.HabilitacionVehicular_InscripcionDao;
import com.reglamb.projvehimerc.dao.TransportistaDao;
import com.reglamb.projvehimerc.dao.TransportistaJuridicoDao;
import com.reglamb.projvehimerc.dao.Transportista_AccionistaDao;
import com.reglamb.projvehimerc.dao.Transportista_RepresentanteDao;
import com.reglamb.projvehimerc.dao.Transportista_SucursalDao;
//import com.reglamb.projvehimerc.dao.Transportista_UbigeoDao;
import com.reglamb.projvehimerc.domain.HabilitacionVehicular_Inscripcion;
import com.reglamb.projvehimerc.domain.TransportistaJuridico;
//import com.reglamb.projvehimerc.domain.Transportista_Ubigeo;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Accionista;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Representante;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Sucursal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath:/META-INF/spring/spring-master.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional()

public class JUnitTestInscripcionVehicular {
	@Autowired
	TransportistaDao transportistaDao;
	@Autowired
	TransportistaJuridicoDao transportistajuriDao;	
	@Autowired
	Transportista_UbigeoDao transportistaubigeoDao;
	@Autowired
	Transportista_RepresentanteDao transportistarepresentanteDao;
	@Autowired
	Transportista_SucursalDao transportistasucursalDao;
	@Autowired
	Transportista_AccionistaDao transportistaaccionistaDao;
	@Autowired
	HabilitacionVehicular_InscripcionDao habilitacioninscripDao;
	@Ignore
	@Test
	public void testCreateData2() throws ParseException {
		DateFormat formattransac = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		//Transportista Accionista
		Transportista_Accionista  transaccionista= new Transportista_Accionista();
		transaccionista.setRuc(128888888693L);
		transaccionista.setRazonsocial("SAC");
		transaccionista.setDni(121212121);
		 Date fechingre = (Date)formattransac.parse("2010-01-01 00:00:00");
		transaccionista.setFech_ingreso(fechingre);
		transaccionista.setDireccion("Calle Diego Ferre 539");
		transaccionista.setParticipacion(12.366F);
		//Transportista Sucursal
		Transportista_Sucursal transsucursal = new Transportista_Sucursal();
		transsucursal.setRuc(121212991L);
		Date fechingres = (Date)formattransac.parse("2002-01-01 00:00:00");
		transsucursal.setFech_ingreso(fechingres);
		transsucursal.setTelefono("121215151");
		transsucursal.setCorreo("riczor16@gmail.com");
		//Transportista Representante
		Transportista_Representante  transrepresentante= new Transportista_Representante();
		transrepresentante.setRuc(12322222222L);
		Date fechingrere = (Date)formattransac.parse("2002-01-01 00:00:00");	
		transrepresentante.setFech_ingreso(fechingrere);
		transrepresentante.setDireccion("Calle Siempre Viva333");
		transrepresentante.setTelefono("15415151515");
		transrepresentante.setCorreo_electronico("kkokokok@gmail.com");
		
		HabilitacionVehicular_Inscripcion habilitainscrip = new HabilitacionVehicular_Inscripcion();
		habilitainscrip.setNumsisgedo(3244333333333L);
		habilitainscrip.setNumrecibobanc(234444344443333L);
		habilitainscrip.setNominaconductores((byte) 1);
		habilitainscrip.setCopiasimpltarjeta((byte) 1);
		habilitainscrip.setNominavehiculo((byte) 1);
		habilitainscrip.setCopiasimplcitv((byte)1);
		habilitainscrip.setCopiasoat((byte)1);
		habilitainscrip.setActacertificacion("Cesar".getBytes());
		
		
		TransportistaJuridico juridico = new TransportistaJuridico();
	    juridico.setRuc(212563596);
	    juridico.setTipodocumento("DNI");
	    juridico.setNumerodocumento(44159616);
	    juridico.setReferencias("PERSONA JURIDICA");
	    juridico.setEmail("elchatocesar@gmail.com");
	    juridico.setObjectosocial("Transporte de Mercancias");
	    juridico.setRazonsocial("SUNARP");
	    juridico.setConstitucion("S.A.");
	    
	    //One To One Habilitacion - Inscripcion
	    habilitainscrip.setTransportista(juridico);
	    habilitacioninscripDao.saveHabilitacionVehicularInscrip(habilitainscrip);
	    juridico.setHabilitacionvehicularinscripcion(habilitainscrip);
	    
	    //Save Transportista of type Juridico
	    transportistajuriDao.saveTransportistaJuridDao(juridico);
	
	    
	    Transportista_Ubigeo trans_1= new Transportista_Ubigeo();
	    trans_1.setDireccion("calle nose");
	    trans_1.setNumerodireccion("2333");
	    trans_1.setDistrito("sdsd");
	    trans_1.setDepartamento("sss");
	    trans_1.setProvincia("Chiclayo");

	    
	    //Transportista and Accionista
	    transaccionista.setTransportistajuridico(juridico);
	    transportistaaccionistaDao.saveTransportistaAccionista(transaccionista);
	    juridico.getAccionistaTransportista().add(transaccionista);
	    //Transportista and Sucursal
	    transsucursal.setTransportistajuridico(juridico);
	    transportistasucursalDao.saveTransportistaSucursal(transsucursal);
	    juridico.getSucursalTransportista().add(transsucursal);
	    //Transportista and Representate
	    transrepresentante.setTransportistajuridico(juridico);
	    transportistarepresentanteDao.saveTransportistaRepresentate(transrepresentante);
	    juridico.getRepresentanteTransportista().add(transrepresentante);	    
	    
	    //Transportista y Ubigeo
	    Set<Transportista_Ubigeo> transubi = new HashSet<Transportista_Ubigeo>();
	    transubi.add(trans_1);
	    juridico.setUbigeoTransportista(transubi);
	    
	    int o =transportistaDao.getAllTransportista(new TransportistaJuridico()).size();
	    Assert.assertEquals(o, transportistaDao.getAllTransportista(new TransportistaJuridico()).size());

	}

}
*/

