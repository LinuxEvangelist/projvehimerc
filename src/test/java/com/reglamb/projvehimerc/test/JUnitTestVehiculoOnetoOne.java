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

import com.reglamb.projvehimerc.dao.TransportistaNaturalDao;
import com.reglamb.projvehimerc.dao.VehiculoDao;
import com.reglamb.projvehimerc.dao.Vehiculo_CitvDao;
import com.reglamb.projvehimerc.dao.Vehiculo_SoatDao;
import com.reglamb.projvehimerc.dao.Vehiculo_TenenciaDao;
import com.reglamb.projvehimerc.domain.TransportistaNatural;
import com.reglamb.projvehimerc.domain.Vehiculo;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Citv;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Soat;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Tenencia;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath:/META-INF/spring/spring-master.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional()
public class JUnitTestVehiculoOnetoOne {
	@Autowired
	TransportistaNaturalDao transportistaNatuDao;
	@Autowired
	VehiculoDao vehiculoDao;
	@Autowired
	Vehiculo_CitvDao vehiculoCitvDao;
	@Autowired
	Vehiculo_SoatDao vehiculoSoatDao;
	@Autowired
	Vehiculo_TenenciaDao vehiculoTenenciaDao;
	
	@Test
	public void testCreateData() throws ParseException {
	    DateFormat formatvehic = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		TransportistaNatural transnatural = new TransportistaNatural();
		
		transnatural.setRuc(212563596);
		transnatural.setTipodocumento("DNI");
		transnatural.setNumerodocumento(44159616);
		transnatural.setReferencias("PERSONA NATURAL");
		transnatural.setEmail("elchatocesar@gmail.com");
	    transnatural.setNatApellidos("Ayambo Toledo");
	    transnatural.setNatNombre("Cesar Augusto");
	    transportistaNatuDao.saveTransportistaNatuDao(transnatural);
	   
	    //Vehiculo Citv
	    Vehiculo_Citv vehiculocitv = new Vehiculo_Citv();
	    //DateFormat formatcitv = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	    Date fechexpe = (Date)formatvehic.parse("2010-01-01 00:00:00");
	    Date fechproxexpe = (Date)formatvehic.parse("2012-01-01 00:00:00");
	    vehiculocitv.setFech_expe(fechexpe);
	    vehiculocitv.setFech_prox_expe(fechproxexpe);
	    vehiculocitv.setNum_citv(0110011220);
	    
	    //Vehiculo Soat
	    Vehiculo_Soat vehiculosoat = new Vehiculo_Soat();
	    Date fechexped = (Date)formatvehic.parse("2010-06-22 00:00:00");
	    Date fechdesde =(Date)formatvehic.parse("2010-05-11 00:00:00");
	    Date fechhasta =(Date)formatvehic.parse("2006-04-19 00:00:00");
	    vehiculosoat.setNum_poliza(200012);
	    vehiculosoat.setNum_expediente(2000120);
	    vehiculosoat.setFech_expe(fechexped);
	    vehiculosoat.setFech_vigentedesde(fechdesde);
	    vehiculosoat.setFech_vigentehasta(fechhasta);
	    vehiculosoat.setEmpresaaseg("RIMAC S.A.");
	    
	    //Vehiculo Tenecia
	    Vehiculo_Tenencia vehiculotenen = new Vehiculo_Tenencia();
	    vehiculotenen.setTipo_arrendamiento("Leasing");
	    Date fecharredesde =(Date)formatvehic.parse("2010-05-11 00:00:00");
	    Date fecharrehasta =(Date)formatvehic.parse("2006-04-19 00:00:00");
	    vehiculotenen.setFech_desdearrend(fecharredesde);
	    vehiculotenen.setFech_hastaarrend(fecharrehasta);
	    
		//Vehiculo
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
	    
	   //One To Many Transportista and vehiculo
	    vehiculo.setVehicsoat(vehiculosoat);
	    vehiculo.setVehiccitv(vehiculocitv);
	    vehiculo.setVehictenec(vehiculotenen);
	    
	    /////////////////////////////////////////////
	    
	    vehiculoDao.saveVehiculo(vehiculo);
	   	transnatural.getVehiculo().add(vehiculo);
	   	
	  ///One To One vehiculo Citv
	    *//*vehiculocitv.setVehiculo(vehiculo);
	    vehiculoCitvDao.saveVehiculoCitv(vehiculocitv);
	    vehiculo.setVehiccitv(vehiculocitv);
	  ///One To One vehiculo Soat
	    vehiculosoat.setVehiculo(vehiculo);
	    vehiculoSoatDao.saveVehiculoSoat(vehiculosoat);
	    vehiculo.setVehicsoat(vehiculosoat);
	  ///One To One vehiculo Tenencia
	    vehiculotenen.setVehiculo(vehiculo);
	    vehiculoTenenciaDao.saveVehiculoTenencia(vehiculotenen);
	    vehiculo.setVehictenec(vehiculotenen);*//*

	    int o =vehiculoDao.getAllVehiculo(new Vehiculo()).size();
	    Assert.assertEquals(o, vehiculoDao.getAllVehiculo(new Vehiculo()).size());   
	

	}
}
*/