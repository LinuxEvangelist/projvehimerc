package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.TransportistaNatural;

public interface TransportistaNaturalDao extends GenericDao<TransportistaNatural>{
	 public void saveTransportistaNatuDao(TransportistaNatural transportistanatu);
	   public void deleteTransportistaNatuDao(String transportistanatu) ;
	   public List<TransportistaNatural> getAllTransportistaNatuDao(TransportistaNatural transportistanatu) ;
	   public TransportistaNatural selectTransportistaNatuDaoById(Long idtransportistanatu) ;

}
