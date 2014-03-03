package com.reglamb.projvehimerc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.reglamb.projvehimerc.domain.ubigeo.Departamento;

@Entity
@SequenceGenerator(
	    name="SEQ_STORE",
	    sequenceName="sequenceubigeoinei",
	    initialValue= 1 ,
	    allocationSize=20)
@Table(name ="`UBIGEO_INEI`")
public class Ubigeo_Inei implements Serializable,DomainObject {
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="id_ubigeo"
	 */
	private Integer id_ubigeoinei;
	/**
	 * @uml.property  name="departamento"
	 * @uml.associationEnd 
	 */
	private Departamento departamento;
	
	
	/**
	 * @uml.property  name="observacioninei" 
	 */
	private String observacioninei;
	/**
	 * @return
	 * @uml.property  name="id_ubigeoinei"
	 */
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name ="`ID_UBIGEOINEI`")
	public Integer getId_ubigeoinei() {
		return id_ubigeoinei;
	}
	/**
	 * @param observacion
	 * @uml.property  name="id_ubigeoinei"
	 */
	public void setId_ubigeoinei(Integer id_ubigeoinei) {
		this.id_ubigeoinei = id_ubigeoinei;
	}
	/**
	 * @return
	 * @uml.property  name="departamento"
	 */
	@ManyToOne
	@Cascade (value=CascadeType.SAVE_UPDATE)
	@JoinColumn (name="`CODDPTO`")
	public Departamento getDepartamento() {
		return departamento;
	}
	/**
	 * @param observacion
	 * @uml.property  name="departamento"
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	/**
	 * @return
	 * @uml.property  name="provincia"
	 */
	
	/**
	 * @return
	 * @uml.property  name="observacioninei"
	 */
	@Column(name ="`OBSERVACIONINEI`")
	public String getObservacioninei() {
		return observacioninei;
	}
	/**
	 * @param observacion
	 * @uml.property  name="observacioninei"
	 */
	public void setObservacioninei(String observacioninei) {
		this.observacioninei = observacioninei;
	}

}
