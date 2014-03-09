package com.reglamb.projvehimerc.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author  mastervodoo
 */
@Entity
@SequenceGenerator(
	    name="SEQ_STORE",
	    sequenceName="sequenceubigeo",
	    initialValue= 1 ,
	    allocationSize=20)
@Table(name ="`UBIGEO`")
public class Ubigeo_Transportista implements Serializable,DomainObject {
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="id_ubigeo"
	 */
	private Integer id_ubigeo;
	/**
	 * @uml.property  name="direccion_ubigeo"
	 */
	private String direccion_ubigeo;
	/**
	 * @uml.property  name="numero_ubigeo"
	 */
	private int numero_ubigeo;
	/**
	 * @uml.property  name="observacion"
	 */
	private String observacion;	
	/**
	/**
	 * @uml.property  name="transportista"
	 * @uml.associationEnd  
	 */
	private Transportista transportista;
	/**
	/**
	 * @uml.property  name="ubigeo_inei"
	 * @uml.associationEnd  
	 */
	private Ubigeo_Inei ubigeo_inei;
		
	/**
	 * @return
	 * @uml.property  name="id_ubigeo"
	 */
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name ="`ID_UBIGEO`")
	public Integer getId_ubigeo() {
		return id_ubigeo;
	}
	/**
	 * @param id_ubigeo
	 * @uml.property  name="id_ubigeo"
	 */
	public void setId_ubigeo(Integer id_ubigeo) {
		this.id_ubigeo = id_ubigeo;
	}	
	/**
	 * @return
	 * @uml.property  name="direccion_ubigeo"
	 */
	@Column(name = "`DIRECCION_UBIGEO`")
	public String getDireccion_ubigeo() {
		return direccion_ubigeo;
	}

	/**
	 * @param direccion_ubigeo
	 * @uml.property  name="direccion_ubigeo"
	 */
	public void setDireccion_ubigeo(String direccion_ubigeo) {
		this.direccion_ubigeo = direccion_ubigeo;
	}
	
	/**
	 * @return
	 * @uml.property  name="numero_ubigeo"
	 */
	@Column(name = "`NUMERO_UBIGEO`")
	public int getNumero_ubigeo() {
		return numero_ubigeo;
	}
	/**
	 * @param numero_ubigeo
	 * @uml.property  name="numero_ubigeo"
	 */
	public void setNumero_ubigeo(int numero_ubigeo) {
		this.numero_ubigeo = numero_ubigeo;
	}
	/**
	 * @return
	 * @uml.property  name="observacion"
	 */
	@Column(name = "`OBSERVACION`")
	public String getObservacion() {
		return observacion;
	}
	/**
	 * @param observacion
	 * @uml.property  name="observacion"
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	/**
	 * @return
	 * @uml.property  name="transportista"
	 */
	@OneToOne (mappedBy="ubigeo")
	public Transportista getTransportista() {
		return transportista;
	}
	/**
	 * @param observacion
	 * @uml.property  name="transportista"
	 */
	public void setTransportista(Transportista transportista) {
		this.transportista = transportista;
	}
	/**
	 * @return
	 * @uml.property  name="ubigeo_inei"
	 */
	@ManyToOne
	@Cascade (value=CascadeType.SAVE_UPDATE)
	@JoinColumn (name="ID_UBIGEOINEI")
	public Ubigeo_Inei getUbigeo_inei() {
		return ubigeo_inei;
	}
	/**
	 * @param observacion
	 * @uml.property  name="ubigeo_inei"
	 */
	public void setUbigeo_inei(Ubigeo_Inei ubigeo_inei) {
		this.ubigeo_inei = ubigeo_inei;
	}
	
}
