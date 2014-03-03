package com.reglamb.projvehimerc.test;
/*
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.reglamb.projvehimerc.dao.TransportistaDao;
import com.reglamb.projvehimerc.dao.TransportistaNaturalDao;
import com.reglamb.projvehimerc.domain.Transportista;
import com.reglamb.projvehimerc.domain.TransportistaNatural;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath:/META-INF/spring/spring-master.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional()
public class JUnitTestInheritSingleTransportista {
	
	@Autowired
	TransportistaDao transportistaDao;
	@Autowired
	TransportistaNaturalDao transportistanatuDao;	
	
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
	
	@Test
	public void testCreateData() {
    TransportistaNatural natural = new TransportistaNatural();
    natural.setRuc(212563596);
    natural.setTipodocumento("DNI");
    natural.setNumerodocumento(44159616);
    natural.setReferencias("Persona Natural");
    natural.setEmail("elchatocesar@gmail.com");
    natural.setNatApellidos("Ayambo Toledo");
    natural.setNatNombre("Cesar Augusto");
    natural.setObjectosocial("Transporte de Mercancias");
    transportistanatuDao.saveTransportistaNatuDao(natural);

    int o =transportistaDao.getAllTransportista(new Transportista()).size();
    Assert.assertEquals(o, transportistaDao.getAllTransportista(new Transportista()).size());
	}

}
*/