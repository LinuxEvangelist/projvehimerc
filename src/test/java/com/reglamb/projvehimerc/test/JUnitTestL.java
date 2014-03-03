package com.reglamb.projvehimerc.test;

//import java.text.DateFormat;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.reglamb.projvehimerc.dao.Vehiculo_SoatDao;
import com.reglamb.projvehimerc.domain.security.Users;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Soat;
import com.reglamb.projvehimerc.exception.EntityNotFoundException;
import com.reglamb.projvehimerc.service.HabilitacionVehicular_InscripcionFacade;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath:/META-INF/spring/spring-master.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional()
public class JUnitTestL {
	@Autowired
	Vehiculo_SoatDao vehiculoSoatDao;
	HabilitacionVehicular_InscripcionFacade habilitacionVehicular_InscripcionFacade;
	
	@Test
	public void testCreateData() throws ParseException, DataAccessException, EntityNotFoundException{
	    
		Users uu = habilitacionVehicular_InscripcionFacade.getUser("admin");
		System.out.println("sss"+uu.getName_user());
		
		
		
		
		
	    /*Vehiculo Soat*/
//	    Vehiculo_Soat vehiculosoat = new Vehiculo_Soat();
//	    //DateFormat formatvehic = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//	    //Date fechexped = (Date)formatvehic.parse("2010-06-22 00:00:00");
//	    //Date fechdesde =(Date)formatvehic.parse("2010-05-11 00:00:00");
//	    //Date fechhasta =(Date)formatvehic.parse("2006-04-19 00:00:00");
//	    vehiculosoat.setNum_poliza(200012);
//	    vehiculosoat.setNum_expediente(2000120);
//	    //vehiculosoat.setFech_expe(fechexped);
//	    //vehiculosoat.setFech_vigentedesde(fechdesde);
//	    //vehiculosoat.setFech_vigentehasta(fechhasta);
//	    //vehiculosoat.setEmpresaaseg("RIMAC S.A.");
//	    vehiculoSoatDao.saveVehiculoSoat(vehiculosoat);
//	    
//	    int o =vehiculoSoatDao.getAllVehiculoSoat(new Vehiculo_Soat()).size();
//	    Assert.assertEquals(o, vehiculoSoatDao.getAllVehiculoSoat(new Vehiculo_Soat()).size());   
	

	}
}

