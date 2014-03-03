package com.reglamb.projvehimerc.domain;

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
/**
 * @author  mastervodoo
 */
@Entity
@SequenceGenerator(
	    name="SEQ_STORE",
	    sequenceName="sequenceconductor",
	    initialValue= 10 ,
	    allocationSize=20)
@Table(name="`CONDUCTOR`")
public class Conductor implements Serializable,DomainObject{
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="id_conductor"
	 */
	private Long id_conductor;
	/**
	 * @uml.property  name="licencia"
	 */
	private Integer licencia;
	/**
	 * @uml.property  name="clase_categoria"
	 */
	private String clase_categoria;
	/**
	 * @uml.property  name="fech_validacion"
	 */
	private Date fech_validacion;
	/**
	 * @uml.property  name="apellido_nombre"
	 */
	private String apellido_nombre;
	/**
	 * @uml.property  name="fech_nacimiento"
	 */
	private Date fech_nacimiento;
	/**
	 * @uml.property  name="transportista"
	 * @uml.associationEnd  
	 */
	private Transportista transportista;
	/**
	 * @return
	 * @uml.property  name="id_conductor"
	 */
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name ="`ID_CONDUCTOR`")
	public Long getId_conductor() {
		return id_conductor;
	}
	/**
	 * @param id_conductor
	 * @uml.property  name="id_conductor"
	 */
	public void setId_conductor(Long id_conductor) {
		this.id_conductor = id_conductor;
	}
	/**
	 * @return
	 * @uml.property  name="licencia"
	 */
	 @Column(name = "`LICENCIA`")
	public Integer getLicencia() {
		return licencia;
	}
	/**
	 * @param licencia
	 * @uml.property  name="licencia"
	 */
	public void setLicencia(Integer licencia) {
		this.licencia = licencia;
	}
	/**
	 * @return
	 * @uml.property  name="clase_categoria"
	 */
	 @Column(name = "`CLASE_CATEGORIA`")
	public String getClase_categoria() {
		return clase_categoria;
	}
	/**
	 * @param clase_categoria
	 * @uml.property  name="clase_categoria"
	 */
	public void setClase_categoria(String clase_categoria) {
		this.clase_categoria = clase_categoria;
	}
	/**
	 * @return
	 * @uml.property  name="fech_validacion"
	 */
	 @Column(name = "`FECHA_VALIDACION`")
	public Date getFech_validacion() {
		return fech_validacion;
	}
	/**
	 * @param fech_validacion
	 * @uml.property  name="fech_validacion"
	 */
	public void setFech_validacion(Date fech_validacion) {
		this.fech_validacion = fech_validacion;
	}
	/**
	 * @return
	 * @uml.property  name="apellido_nombre"
	 */
	 @Column(name = "`NOMBRE_COMPLETO`")
	public String getApellido_nombre() {
		return apellido_nombre;
	}
	/**
	 * @param apellido_nombre
	 * @uml.property  name="apellido_nombre"
	 */
	public void setApellido_nombre(String apellido_nombre) {
		this.apellido_nombre = apellido_nombre;
	}
	/**
	 * @return
	 * @uml.property  name="fech_nacimiento"
	 */
	 @Column(name = "`FECHA_NACIMIENTO`")
	public Date getFech_nacimiento() {
		return fech_nacimiento;
	}
	/**
	 * @param fech_nacimiento
	 * @uml.property  name="fech_nacimiento"
	 */
	public void setFech_nacimiento(Date fech_nacimiento) {
		this.fech_nacimiento = fech_nacimiento;
	}
	/**
	 * @return
	 * @uml.property  name="transportista"
	 */
	@ManyToOne
	@JoinColumn(name="`ID_TRANSPORTISTA`", nullable=false)
	//@JoinColumn(name="`Id_Vehiculo`", insertable=false, updatable=false)
	public Transportista getTransportista() {
		return transportista;
	}
	/**
	 * @param transportista
	 * @uml.property  name="transportista"
	 */
	public void setTransportista(Transportista transportista) {
		this.transportista = transportista;
	}


}
