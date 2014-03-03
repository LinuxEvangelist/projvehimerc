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
	    sequenceName="sequencerepresentante",
	    initialValue= 100 ,
	    allocationSize=20)
@Table(name="`TRANSPORTISTA_REPRESENTANTE`")
public class Transportista_Representante implements Serializable,DomainObject{

	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="idtransportistarepresentate"
	 */
	private Long idtransportistarepresentate;
	/**
	 * @uml.property  name="ruc_repre"
	 */
	private Long ruc_repre;
	/**
	 * @uml.property  name="fech_ingreso_repre"
	 */
	private Date fech_ingreso_repre;
	/**
	 * @uml.property  name="direccion_repre"
	 */
	private String direccion_repre;
	/**
	 * @uml.property  name="telefono_repre"
	 */
	private String telefono_repre;
	/**
	 * @uml.property  name="correo_repre"
	 */
	private String correo_repre;
	/**
	 * @uml.property  name="transportistajuridico"
	 * @uml.associationEnd  
	 */
	private TransportistaJuridico transportistajuridico;
	
	/**
	 * @return
	 * @uml.property  name="idtransportistarepresentate"
	 */
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name ="`IDTRANSPORTISTA_REPRESENTANTE`")
	public Long getIdtransportistarepresentate() {
		return idtransportistarepresentate;
	}
	/**
	 * @param idtransportistarepresentate
	 * @uml.property  name="idtransportistarepresentate"
	 */
	public void setIdtransportistarepresentate(Long idtransportistarepresentate) {
		this.idtransportistarepresentate = idtransportistarepresentate;
	}
	/**
	 * @return
	 * @uml.property  name="ruc_repre"
	 */
	@Column(name ="`RUC_REPRESENTANTE`")
	public Long getRuc_repre() {
		return ruc_repre;
	}
	/**
	 * @param ruc
	 * @uml.property  name="ruc_repre"
	 */
	public void setRuc_repre(Long ruc_repre) {
		this.ruc_repre = ruc_repre;
	}
	/**
	 * @return
	 * @uml.property  name="fech_ingreso_repre"
	 */
	@Column(name ="`FECHAINGRESO_REPRE`")
	public Date getFech_ingreso_repre() {
		return fech_ingreso_repre;
	}
	/**
	 * @param fech_ingreso
	 * @uml.property  name="fech_ingreso_repre"
	 */
	public void setFech_ingreso_repre(Date fech_ingreso_repre) {
		this.fech_ingreso_repre = fech_ingreso_repre;
	}
	/**
	 * @return
	 * @uml.property  name="direccion_repre"
	 */
	@Column(name ="`DIRECCION_REPRE`")
	public String getDireccion_repre() {
		return direccion_repre;
	}
	/**
	 * @param direccion
	 * @uml.property  name="direccion_repre"
	 */
	public void setDireccion_repre(String direccion_repre) {
		this.direccion_repre = direccion_repre;
	}
	/**
	 * @return
	 * @uml.property  name="telefono_repre"
	 */
	@Column(name ="`TELEFONO_REPRE`")
	public String getTelefono_repre() {
		return telefono_repre;
	}
	/**
	 * @param telefono
	 * @uml.property  name="telefono_repre"
	 */
	public void setTelefono_repre(String telefono_repre) {
		this.telefono_repre = telefono_repre;
	}
	/**
	 * @return
	 * @uml.property  name="correo_repre"
	 */
	@Column(name ="`CORREO_REPRE`")
	public String getCorreo_repre() {
		return correo_repre;
	}
	/**
	 * @param correo_electronico
	 * @uml.property  name="correo_repre"
	 */
	public void setCorreo_repre(String correo_repre) {
		this.correo_repre = correo_repre;
	}
	/**
	 * @return
	 * @uml.property  name="transportistajuridico"
	 */
	@ManyToOne
	@JoinColumn(name="`ID_TRANSPORTISTA`", nullable=true)
	public TransportistaJuridico getTransportistajuridico() {
		return transportistajuridico;
	}
	/**
	 * @param transportistajuridico
	 * @uml.property  name="transportistajuridico"
	 */
	public void setTransportistajuridico(TransportistaJuridico transportistajuridico) {
		this.transportistajuridico = transportistajuridico;
	}	

}
