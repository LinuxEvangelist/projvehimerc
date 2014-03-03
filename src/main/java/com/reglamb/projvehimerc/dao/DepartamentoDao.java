package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.ubigeo.Departamento;

public interface DepartamentoDao extends GenericDao<Departamento>{
	public void saveDepartamento(Departamento departamento);
	public void deleteDepartamento(String departamento) ;
	public List<Departamento> getAllDepartamento(Departamento departamento) ;
	public Departamento selectDepartamentoById(Long iddepartamento) ;

}
