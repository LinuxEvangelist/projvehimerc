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
	    sequenceName="sequencesucursal",
	    initialValue= 100 ,
	    allocationSize=20)
@Table(name = "`TRANSPORTISTA_SUCURSAL`")
public class Transportista_Sucursal implements Serializable, DomainObject {
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="idtransportistasucursal"
	 */
	private Long idtransportistasucursal;
	/**
	 * @uml.property  name="ruc_sucur"
	 */
	private Long ruc_sucur;
	/**
	 * @uml.property  name="fech_ingreso_sucur"
	 */
	private Date fech_ingreso_sucur;
	/**
	 * @uml.property  name="telefono_sucur"
	 */
	private String telefono_sucur;
	/**
	 * @uml.property  name="correo_sucur"
	 */
	private String correo_sucur;
	/**
	 * @uml.property  name="transportistajuridico"
	 * @uml.associationEnd  
	 */
	private TransportistaJuridico transportistajuridico;
	/**
	 * @return
	 * @uml.property  name="idtransportistasucursal"
	 */
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name ="`IDTRANSPORTISTA_SUCURSAL`")
	public Long getIdtransportistasucursal() {
		return idtransportistasucursal;
	}
	/**
	 * @param idtransportistasucursal
	 * @uml.property  name="idtransportistasucursal"
	 */
	public void setIdtransportistasucursal(Long idtransportistasucursal) {
		this.idtransportistasucursal = idtransportistasucursal;
	}
	/**
	 * @return
	 * @uml.property  name="ruc_sucur"
	 */
	@Column(name ="`RUC_SUCURSAL`")
	public Long getRuc_sucur() {
		return ruc_sucur;
	}
	/**
	 * @param ruc
	 * @uml.property  name="ruc_sucur"
	 */
	public void setRuc_sucur(Long ruc_sucur) {
		this.ruc_sucur = ruc_sucur;
	}
	/**
	 * @return
	 * @uml.property  name="fech_ingreso_sucur"
	 */
	@Column(name ="`FECHAINGRESO_SUCURSAL`")
	public Date getFech_ingreso_sucur() {
		return fech_ingreso_sucur;
	}
	/**
	 * @param fech_ingreso
	 * @uml.property  name="fech_ingreso_sucur"
	 */
	public void setFech_ingreso_sucur(Date fech_ingreso_sucur) {
		this.fech_ingreso_sucur = fech_ingreso_sucur;
	}
	/**
	 * @return
	 * @uml.property  name="telefono_sucur"
	 */
	@Column(name ="`TELEFONO_SUCURSAL`")
	public String getTelefono_sucur() {
		return telefono_sucur;
	}
	/**
	 * @param telefono
	 * @uml.property  name="telefono_sucur"
	 */
	public void setTelefono_sucur(String telefono_sucur) {
		this.telefono_sucur = telefono_sucur;
	}
	/**
	 * @return
	 * @uml.property  name="correo_sucur"
	 */
	@Column(name ="`CORREO_SUCURSAL`")
	public String getCorreo_sucur() {
		return correo_sucur;
	}
	/**
	 * @param correo
	 * @uml.property  name="correo_sucur"
	 */
	public void setCorreo_sucur(String correo_sucur) {
		this.correo_sucur = correo_sucur;
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
