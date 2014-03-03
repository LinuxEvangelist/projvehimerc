package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.TransportistaJuridico;


public interface TransportistaJuridicoDao extends GenericDao<TransportistaJuridico>{
	public void saveTransportistaJuridDao(TransportistaJuridico transportistajurid);
	   public void deleteTransportistaJuridDao(String transportistajurid) ;
	   public List<TransportistaJuridico> getAllTransportistaJuridDao(TransportistaJuridico transportistajurid) ;
	   public TransportistaJuridico selectTransportistaJuridDaoById(Long idtransportistajurid) ;


}
