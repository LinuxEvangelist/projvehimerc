package com.reglamb.projvehimerc.test;
/*

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.reglamb.projvehimerc.dao.DepartamentoDao;
import com.reglamb.projvehimerc.dao.ProvinciaDao;
import com.reglamb.projvehimerc.dao.TransportistaNaturalDao;
import com.reglamb.projvehimerc.dao.VehiculoDao;
import com.reglamb.projvehimerc.domain.TransportistaNatural;
import com.reglamb.projvehimerc.domain.Vehiculo;
import com.reglamb.projvehimerc.domain.ubigeo.Departamento;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath:/META-INF/spring/spring-master.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional()
public class JUnitTestVehiculo {
	//@Autowired
	//TransportistaNaturalDao transportistaNatuDao;
	//@Autowired
	//VehiculoDao vehiculoDao;
	@Autowired
	DepartamentoDao departamentoDao;
	@Autowired
	ProvinciaDao provinciaDao;
	
	@Test
	public void testCreateData() throws ParseException {
		
		Departamento departamento = new Departamento();
		departamento.setNombre_depart("Lambayeque");
		
		TransportistaNatural transnatural = new TransportistaNatural();
				
		transnatural.setRuc(212563596);
		transnatural.setTipodocumento("DNI");
		transnatural.setNumerodocumento(44159616);
		transnatural.setReferencias("PERSONA NATURAL");
		transnatural.setEmail("elchatocesar@gmail.com");
	    transnatural.setNatApellidos("Ayambo Toledo");
	    transnatural.setNatNombre("Cesar Augusto");
	    transportistaNatuDao.saveTransportistaNatuDao(transnatural);

	    Vehiculo vehiculo = new Vehiculo();
	    DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	    Date añoFab = (Date)format.parse("2005-01-01 00:00:00");
	    vehiculo.setMarca("HYUNDAI");
	    vehiculo.setModelo("HP-HI");
	    vehiculo.setCarroceria("PICAUTY");
	    vehiculo.setAño_fab(añoFab);
	    vehiculo.setN_chasis(1252000);
	    vehiculo.setN_ejes(5);
	    vehiculo.setCombustible("petrolero");
	    vehiculo.setPeso_seco((float)0.12);
	    vehiculo.setCarga_util((float)12.22);
	    vehiculo.setLargo("12.2 cm");
	    vehiculo.setAncho("16 cm");
	    vehiculo.setAltura("14.6 cm");
	    vehiculo.setTransportista(transnatural);
	    vehiculoDao.saveVehiculo(vehiculo);
	    transnatural.getVehiculo().add(vehiculo);
	    
	    

	    int o =transportistaNatuDao.getAllTransportistaNatuDao(new TransportistaNatural()).size();
	    Assert.assertEquals(o, transportistaNatuDao.getAllTransportistaNatuDao(new TransportistaNatural()).size());   
	    
	}

}
*/
