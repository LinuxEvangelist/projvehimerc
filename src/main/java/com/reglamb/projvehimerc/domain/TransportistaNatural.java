package com.reglamb.projvehimerc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//No pueden haber valores not null, SINGLE CLASS
@Entity
@Table (name ="`TRANSPORTISTA_NATURAL`")
//@DiscriminatorValue("TRANSPORTISTA_NATURAL")
public class TransportistaNatural extends Transportista implements Serializable,DomainObject{

	private static final long serialVersionUID = 1L;
	private String natapellidos;
	private String natnombre;
	
	/**
	 * @return
	 * @uml.property  name="natapellidos"
	 */
	@Column(name = "`TRANS_NATURAL_APELLIDOS`")
	public String getNatApellidos(){
		return natapellidos;
	}
	/**
	 * @param razonsocial
	 * @uml.property  name="natapellidos"
	 */
	public void setNatApellidos(String natapellidos){
		this.natapellidos = natapellidos;
	}
	/**
	 * @return
	 * @uml.property  name="natnombre"
	 */
	@Column(name = "`TRANS_NATURAL_NOMBRE`")
	public String getNatNombre(){
		return natnombre;
	}
	/**
	 * @param razonsocial
	 * @uml.property  name="natnombre"
	 */
	public void setNatNombre(String natnombre){
		this.natnombre = natnombre;
	}
	
	

}
