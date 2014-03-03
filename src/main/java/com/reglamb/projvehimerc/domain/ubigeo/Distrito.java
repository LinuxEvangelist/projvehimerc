package com.reglamb.projvehimerc.domain.ubigeo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.reglamb.projvehimerc.domain.DomainObject;

/**
 * @author  mastervodoo
 */
@Entity
@SequenceGenerator(
	    name="SEQ_STORE",
	    sequenceName="sequencedistrito",
	    initialValue= 001 ,
	    allocationSize=1)
@Table(name ="`DISTRITO`")
public class Distrito implements Serializable,DomainObject {
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="id_distrito"
	 */
	private int id_distrito;
	/**
	 * @uml.property  name="nombre_distrito"
	 */
	private String nombre_distrito;
	/**
	 * @uml.property  name="referencia_distrito"
	 */
	private String referencia_distrito;
	/**
	 * @uml.property  name="id_provincia"
	 */
	private int id_provincia;
	/**
	 * @return
	 * @uml.property  name="id_distrito"
	 */
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name ="`CODDIST`")
	public int getId_distrito() {
		return id_distrito;
	}
	/**
	 * @param id_distrito
	 * @uml.property  name="id_distrito"
	 */
	public void setId_distrito(int id_distrito) {
		this.id_distrito = id_distrito;
	}
	/**
	 * @return
	 * @uml.property  name="nombre_distrito"
	 */
	@Column(name ="`NOMBRE_DISTRITO`")
	public String getNombre_distrito() {
		return nombre_distrito;
	}
	/**
	 * @param nombre_distrito
	 * @uml.property  name="nombre_distrito"
	 */
	public void setNombre_distrito(String nombre_distrito) {
		this.nombre_distrito = nombre_distrito;
	}
	/**
	 * @return
	 * @uml.property  name="referencia_distrito"
	 */
	@Column(name ="`REFERENCIA_DISTRITO`")
	public String getReferencia_distrito() {
		return referencia_distrito;
	}
	/**
	 * @param referencia_distrito
	 * @uml.property  name="referencia_distrito"
	 */
	public void setReferencia_distrito(String referencia_distrito) {
		this.referencia_distrito = referencia_distrito;
	}
	/**
	 * @return
	 * @uml.property  name="id_provincia"
	 */
	@Column(name ="`CODPROV`")
	public int getId_provincia() {
		return id_provincia;
	}
	/**
	 * @param referencia_distrito
	 * @uml.property  name="id_provincia"
	 */
	public void setId_provincia(int id_provincia) {
		this.id_provincia = id_provincia;
	}
}
