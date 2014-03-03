package com.reglamb.projvehimerc.domain.transportista;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.reglamb.projvehimerc.domain.DomainObject;
import com.reglamb.projvehimerc.domain.TransportistaJuridico;

/**
 * @author  mastervodoo
 */
@Entity
@SequenceGenerator(
	    name="SEQ_STORE",
	    sequenceName="sequenceaccionista",
	    initialValue= 100 ,
	    allocationSize=20)
@Table(name="`TRANSPORTISTA_ACCIONISTA`")
public class Transportista_Accionista implements Serializable,DomainObject {
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="idtransportistaaccionista"
	 */
	private Long idtransportistaaccionista;
	private Long ruc_accio;
	private String razonsocial_accio;
	private int dni_accio;
	private Date fech_ingreso_accio;
	private String direccion_accio;
	private Float participacion_accio;
	/**
	 * @uml.property  name="transportistajuridico"
	 * @uml.associationEnd  
	 */
	private TransportistaJuridico transportistajuridico;
	/**
	 * @return
	 * @uml.property  name="idtransportistaaccionista"
	 */
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name="`IDTRANSPORTISTA_ACCIONISTA`")
	public Long getIdtransportistaaccionista() {
		return idtransportistaaccionista;
	}
	/**
	 * @param idtransportistaaccionista
	 * @uml.property  name="idtransportistaaccionista"
	 */
	public void setIdtransportistaaccionista(Long idtransportistaaccionista) {
		this.idtransportistaaccionista = idtransportistaaccionista;
	}
	/**
	 * @return
	 * @uml.property  name="ruc"
	 */
	@Column(name="`RUC_ACCIONISTA`")
	public Long getRuc_accio() {
		return ruc_accio;
	}
	/**
	 * @param ruc
	 * @uml.property  name="ruc"
	 */
	public void setRuc_accio(Long ruc_accio) {
		this.ruc_accio = ruc_accio;
	}
	/**
	 * @return
	 * @uml.property  name="razonsocial"
	 */
	@Column(name="`RAZONSOCIAL_ACCIONISTA`")
	public String getRazonsocial_accio() {
		return razonsocial_accio;
	}
	/**
	 * @param razonsocial
	 * @uml.property  name="razonsocial"
	 */
	public void setRazonsocial_accio(String razonsocial_accio) {
		this.razonsocial_accio = razonsocial_accio;
	}
	/**
	 * @return
	 * @uml.property  name="dni"
	 */
	@Column(name="`DNI_ACCIONISTA`")
	public int getDni_accio() {
		return dni_accio;
	}
	/**
	 * @param dni
	 * @uml.property  name="dni"
	 */
	public void setDni_accio(int dni_accio) {
		this.dni_accio = dni_accio;
	}
	/**
	 * @return
	 * @uml.property  name="fech_ingreso"
	 */
	@Column(name="`FECHAINGRESO_ACCIONISTA`")
	public Date getFech_ingreso_accio() {
		return fech_ingreso_accio;
	}
	/**
	 * @param fech_ingreso
	 * @uml.property  name="fech_ingreso"
	 */
	public void setFech_ingreso_accio(Date fech_ingreso_accio) {
		this.fech_ingreso_accio = fech_ingreso_accio;
	}
	/**
	 * @return
	 * @uml.property  name="direccion"
	 */
	@Column(name="`DIRECCION_ACCIONISTA`")
	public String getDireccion_accio() {
		return direccion_accio;
	}
	/**
	 * @param direccion
	 * @uml.property  name="direccion"
	 */
	public void setDireccion_accio(String direccion_accio) {
		this.direccion_accio = direccion_accio;
	}
	/**
	 * @return
	 * @uml.property  name="participacion"
	 */
	@Column(name="`PARTICIPACION_ACCIONISTA`")
	public Float getParticipacion_accio() {
		return participacion_accio;
	}
	/**
	 * @param participacion
	 * @uml.property  name="participacion"
	 */
	public void setParticipacion_accio(Float participacion_accio) {
		this.participacion_accio = participacion_accio;
	}
	/**
	 * @return
	 * @uml.property  name="transportistajuridico"
	 */
	@ManyToOne
	@JoinColumn(name="`ID_TRANSPORTISTA`")
	public TransportistaJuridico getTransportistajuridico() {
		return transportistajuridico;
	}
	/**
	 * @param transportistajuridico
	 * @uml.property  name="transportistajuridico"
	 */
	public void setTransportistajuridico(
			TransportistaJuridico transportistajuridico) {
		this.transportistajuridico = transportistajuridico;
	}
	
}
