package com.reglamb.projvehimerc.test;


/*
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath:/META-INF/spring/spring-master.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional()
public class JUnitTestTransportista {
		@Autowired
		TransportistaDao transportistaDao;
		@Autowired
		Transportista_UbigeoDao transportistaubigeoDao;	
		
		@Test
		public void testCreateData() {
	   
		Transportista trans = new Transportista();
		 	trans.setRuc(212563596);
		    trans.setTipodocumento("DNI");
		    trans.setNumerodocumento(44159616);
		    trans.setReferencias("Ojala");
		    trans.setEmail("riczor16@gmail.com");
		    trans.setObjectosocial("Transporte de Mercancias");
		    transportistaDao.saveTransportista(trans);
		    
		Transportista_Ubigeo trans_1= new Transportista_Ubigeo();
			trans_1.setIdubigeotransportista(trans.getIdtransportista());
		    trans_1.setDireccion("calle nose");
		    trans_1.setNumerodireccion("2333");
		    trans_1.setDistrito("sdsd");
		    trans_1.setDepartamento("sss");
		    trans_1.setProvincia("Chiclayo");
		    transportistaubigeoDao.saveTransportistaubi(trans_1);
		    
		    Set<Transportista_Ubigeo> ubigeoTransportistas = new HashSet<Transportista_Ubigeo>();
		    ubigeoTransportistas.add(trans_1);
		    trans.setUbigeoTransportista(ubigeoTransportistas);
		    
		    int o =transportistaDao.getAllTransportista(new Transportista()).size();
		    Assert.assertEquals(o, transportistaDao.getAllTransportista(new Transportista()).size());

		}
}
*/