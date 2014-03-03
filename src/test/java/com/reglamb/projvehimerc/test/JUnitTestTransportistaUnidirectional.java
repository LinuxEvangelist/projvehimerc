package com.reglamb.projvehimerc.test;
/*
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.reglamb.projvehimerc.dao.ConductorDao;
import com.reglamb.projvehimerc.dao.TransportistaDao;
import com.reglamb.projvehimerc.dao.TransportistaJuridicoDao;
import com.reglamb.projvehimerc.dao.Transportista_RepresentanteDao;
import com.reglamb.projvehimerc.dao.Transportista_UbigeoDao;
import com.reglamb.projvehimerc.domain.Conductor;
import com.reglamb.projvehimerc.domain.TransportistaJuridico;
import com.reglamb.projvehimerc.domain.Transportista_Ubigeo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath:/META-INF/spring/spring-master.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional()
public class JUnitTestTransportistaUnidirectional {
		@Autowired
		TransportistaDao transportistaDao;
		@Autowired
		TransportistaJuridicoDao transportistajuriDao;	
		@Autowired
		Transportista_UbigeoDao transportistaubigeoDao;
		@Autowired
		Transportista_RepresentanteDao transportistarepresentanteDao;
		@Autowired
		ConductorDao conductorDao;
		
		@Test
		public void testCreateData2() throws ParseException {
			DateFormat formatvehic = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			//Conductor
			Conductor conductor = new Conductor();
			conductor.setLicencia(020202002);
			conductor.setClase_categoria("GH4521");
			Date fechvalid = (Date)formatvehic.parse("2010-01-01 00:00:00");
			conductor.setFech_validacion(fechvalid);
			conductor.setApellido_nombre("Izquierdo Espinoza Rafael Ernesto");
			Date fechnac = (Date)formatvehic.parse("1986-01-01 00:00:00");
			conductor.setFech_nacimiento(fechnac);
			
			//Transportista

			TransportistaJuridico juridico = new TransportistaJuridico();
		    juridico.setRuc(212563596);
		    juridico.setTipodocumento("DNI");
		    juridico.setNumerodocumento(44159616);
		    juridico.setReferencias("PERSONA JURIDICA");
		    juridico.setEmail("elchatocesar@gmail.com");
		    juridico.setObjectosocial("Transporte de Mercancias");
		    juridico.setRazonsocial("SUNARP");
		    juridico.setConstitucion("S.A.");
		    transportistajuriDao.saveTransportistaJuridDao(juridico);

		    Transportista_Ubigeo trans_1= new Transportista_Ubigeo();
			//trans_1.setIdubigeotransportista(juridico.getIdtransportista());
		    trans_1.setDireccion("calle nose");
		    trans_1.setNumerodireccion("2333");
		    trans_1.setDistrito("sdsd");
		    trans_1.setDepartamento("sss");
		    trans_1.setProvincia("Chiclayo");
	
		    Set<Conductor> setconduct = new HashSet<Conductor>();
		    setconduct.add(conductor);
		    juridico.setConductor(setconduct);
		   
		    //Transportista y Ubigeo
		    transportistaubigeoDao.saveTransportistaubi(trans_1);
		    Set<Transportista_Ubigeo> transubi = new HashSet<Transportista_Ubigeo>();
		    transubi.add(trans_1);
		    juridico.setUbigeoTransportista(transubi);
		    
		    int o =transportistaDao.getAllTransportista(new TransportistaJuridico()).size();
		    Assert.assertEquals(o, transportistaDao.getAllTransportista(new TransportistaJuridico()).size());

		}

}
*/