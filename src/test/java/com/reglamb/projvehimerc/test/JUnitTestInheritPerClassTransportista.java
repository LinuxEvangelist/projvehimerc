package com.reglamb.projvehimerc.test;
/*
//import java.util.HashSet;
//import java.util.Set;

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

import com.reglamb.projvehimerc.dao.TransportistaDao;
import com.reglamb.projvehimerc.dao.TransportistaJuridicoDao;
import com.reglamb.projvehimerc.dao.Transportista_UbigeoDao;
//import com.reglamb.projvehimerc.domain.Transportista;
import com.reglamb.projvehimerc.domain.TransportistaJuridico;
import com.reglamb.projvehimerc.domain.Transportista_Ubigeo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath:/META-INF/spring/spring-master.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional()
public class JUnitTestInheritPerClassTransportista {


	@Autowired
	TransportistaDao transportistaDao;
	@Autowired
	TransportistaJuridicoDao transportistajuriDao;	
	@Autowired
	Transportista_UbigeoDao transportistaubigeoDao;
	*//*
	@Before
	public void preMethodSetup(){
		Transportista trans = new Transportista();
	 	trans.setRuc(212563596);
	    trans.setTipodocumento("DNI");
	    trans.setNumerodocumento(44159616);
	    trans.setReferencias("Ojala");
	    trans.setEmail("riczor16@gmail.com");
	    trans.setObjectosocial("Transporte de Mercancias");
	    transportistaDao.saveTransportista(trans);
	}
	*//*
	@Test
	public void testCreateData() {
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

    int o =transportistajuriDao.getAllTransportistaJuridDao(new TransportistaJuridico()).size();
    Assert.assertEquals(o, transportistajuriDao.getAllTransportistaJuridDao(new TransportistaJuridico()).size());
	}
	
	@Test
	public void testCreateData2() {
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
	 
	    transportistaubigeoDao.saveTransportistaubi(trans_1);
	    Set<Transportista_Ubigeo> transubi = new HashSet<Transportista_Ubigeo>();
	    transubi.add(trans_1);
	    juridico.setUbigeoTransportista(transubi);
	    
	    *//*Transportista_Ubigeo ubigeoTransportistas = new HashSet<Transportista_Ubigeo>();
	    ubigeoTransportistas.add(trans_1);
	    juridico.setUbigeoTransportista(ubigeoTransportistas);*//*
	    
	    int o =transportistaDao.getAllTransportista(new TransportistaJuridico()).size();
	    Assert.assertEquals(o, transportistaDao.getAllTransportista(new TransportistaJuridico()).size());

	}

}
*/