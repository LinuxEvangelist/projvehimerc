package com.reglamb.projvehimerc.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 *  
 * @author    banktsu
 */

@Entity
@GenericGenerator(name="SEQ_STORE", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
		parameters = { @Parameter(name = "sequence_name", value = "sequencetransportista"), 
		@Parameter(name = "initial_value", value ="1000000"), 
		@Parameter(name = "increment_size", value ="100") })
@Table(name ="`TRANSPORTISTA`")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy=InheritanceType.JOINED), diferent tables and properties of one subclasses diferent of others.
public abstract class Transportista implements Serializable,DomainObject{
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="idtransportista"
	 */
	private Long idtransportista;
	/**
	 * @uml.property  name="ruc_trans"
	 */
	private int ruc_trans;
	/**
	 * @uml.property  name="tipodocumento"
	 */
	private String tipodocumento;
	/**
	 * @uml.property  name="numerodocumento"
	 */
	private int numerodocumento;
	/**
	 * @uml.property  name="referencias"
	 */
	private String referencias;
	/**
	 * @uml.property  name="telefono_trans"
	 */
	private String telefono_trans;
	/**
	 * @uml.property  name="correo_trans"
	 */
	private String correo_trans;
	/**
	 * @uml.property  name="objectosocial"
	 */
	private String objectosocial;
	/**
	 * @uml.property  name="zonaoperacion"
	 */
	private String zonaoperacion;
	/**
	 * @uml.property  name="lote_interior_trans"
	 */
	private String lote_interior_trans;;
	/**
	 * @uml.property  name="urbani_centro_trans"
	 */
	private String urbani_centro_trans;
	/**
	 * @uml.property  name="nombre_descripcentro_trans"
	 */
	private String nombre_descripcentro_trans;
	/**
	 * @uml.property  name="ubigeo"
	 * @uml.associationEnd  
	 */
	private Ubigeo_Transportista ubigeo;
	/**
	 * @uml.property  name="vehiculo"
	 */
	private Set<Vehiculo> vehiculo = new HashSet<Vehiculo>();
	/**
	 * @uml.property  name="conductor"
	 */
	private Set<Conductor> conductor = new HashSet<Conductor>();
	/**
	 * @uml.property  name="habilitacionVehicularInscripcion"
	 * @uml.associationEnd  
	 */
	private HabilitacionVehicular_Inscripcion habilitacionVehicularInscripcion;
	/**
	 * @uml.property  name="habilitacionVehicularIncremtsusti"
	 * @uml.associationEnd  
	 */
	private Set<HabilitacionVehicular_IncremtSusti> habilitacionVehicularIncremtsusti  = new HashSet<HabilitacionVehicular_IncremtSusti>() ;
	
	/**
	 * @return
	 * @uml.property  name="idtransportista"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")	 
	@Column(name = "`ID_TRANSPORTISTA`")
	public Long getIdtransportista() {
		return idtransportista;
	}
	/**
	 * @param idtransportista
	 * @uml.property  name="idtransportista"
	 */
	public void setIdtransportista(Long idtransportista) {
		this.idtransportista = idtransportista;
	}
	/**
	 * @return
	 * @uml.property  name="ruc"
	 */
	@Column(name = "`RUC_TRANSPORTISTA`")   
	public int getRuc_trans() {
		return ruc_trans;
	}
	/**
	 * @param ruc
	 * @uml.property  name="ruc"
	 */
	public void setRuc_trans(int ruc_trans) {
		this.ruc_trans = ruc_trans;
	}
	/**
	 * @return
	 * @uml.property  name="tipodocumento"
	 */
	@Column(name = "`TIPODOCUMENTO`")
	  /*,unique=true,
    nullable=false,
    length=32)*/
	public String getTipodocumento() {
		return tipodocumento;
	}
	/**
	 * @param tipodocumento
	 * @uml.property  name="tipodocumento"
	 */
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	/**
	 * @return
	 * @uml.property  name="numerodocumento"
	 */
	@Column(name = "`NUMERODOCUMENTO`")   
	public int getNumerodocumento() {
		return numerodocumento;
	}
	/**
	 * @param numerodocumento
	 * @uml.property  name="numerodocumento"
	 */
	public void setNumerodocumento(int numerodocumento) {
		this.numerodocumento = numerodocumento;
	}
	/**
	 * @return
	 * @uml.property  name="referencias"
	 */
	@Column(name = "`REFERENCIAS`")   
	public String getReferencias() {
		return referencias;
	}
	/**
	 * @param referencias
	 * @uml.property  name="referencias"
	 */
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	/**
	 * @return
	 * @uml.property  name="telefono"
	 */
	@Column(name = "`TELEFONO_TRANSPORTISTA`")   
	public String getTelefono_trans() {
		return telefono_trans;
	}
	/**
	 * @param telefono
	 * @uml.property  name="telefono"
	 */
	public void setTelefono_trans(String telefono_trans) {
		this.telefono_trans = telefono_trans;
	}
	/**
	 * @return
	 * @uml.property  name="email"
	 */
	@Column(name = "`CORREO_TRANSPORTISTA`")   
	public String getCorreo_trans() {
		return correo_trans;
	}
	/**
	 * @param email
	 * @uml.property  name="email"
	 */
	public void setCorreo_trans(String correo_trans) {
		this.correo_trans = correo_trans;
	}
	/**
	 * @return
	 * @uml.property  name="objectosocial"
	 */
	@Column(name = "`OBJECTOSOCIAL`")   
	public String getObjectosocial() {
		return objectosocial;
	}
	/**
	 * @param objectosocial
	 * @uml.property  name="objectosocial"
	 */
	public void setObjectosocial(String objectosocial) {
		this.objectosocial = objectosocial;
	}
	
	/**
	 * @return
	 * @uml.property  name="ubigeo"
	 */

	@OneToOne (cascade=CascadeType.ALL)
	@JoinTable (name="TransportistaUbigeo",joinColumns=@JoinColumn(name="`ID_TRANSPORTISTA`"),
	inverseJoinColumns=@JoinColumn(name="`ID_UBIGEO`"))
	public Ubigeo_Transportista getUbigeo() {
		return ubigeo;
	}
	
	/**
	 * @param ubigeo
	 * @uml.property  name="ubigeo"
	 */
	public void setUbigeo(Ubigeo_Transportista ubigeo) {
		this.ubigeo = ubigeo;
	}
	/*Vehiculo ---->*/
	/**
	 * @return
	 * @uml.property  name="vehiculo"
	 */
	@OneToMany(targetEntity=Vehiculo.class,
			orphanRemoval = true,cascade={javax.persistence.CascadeType.ALL})
			@JoinColumn(name="`ID_VEHICULO`")
	public Set<Vehiculo> getVehiculo() {
		return vehiculo;
	}
	/**
	 * @param vehiculo
	 * @uml.property  name="vehiculo"
	 */
	public void setVehiculo(Set<Vehiculo> vehiculo) {
		this.vehiculo = vehiculo;
	}
	/**
	 * @return
	 * @uml.property  name="zonaoperacion"
	 */
	@Column(name = "`ZONA_OPERACION`")
	public String getZonaoperacion() {
		return zonaoperacion;
	}
	/**
	 * @param zonaoperacion
	 * @uml.property  name="zonaoperacion"
	 */	
	public void setZonaoperacion(String zonaoperacion) {
		this.zonaoperacion = zonaoperacion;
	}
	
	/**
	 * @return
	 * @uml.property  name="lote_interior_trans"
	 */
	@Column(name = "`LOTEINTERIOR_TRANS`")
	public String getLote_interior_trans() {
		return lote_interior_trans;
	}
	/**
	 * @param lote_interior_trans
	 * @uml.property  name="lote_interior_trans"
	 */
	public void setLote_interior_trans(String lote_interior_trans) {
		this.lote_interior_trans = lote_interior_trans;
	}
	/**
	 * @return
	 * @uml.property  name="urbani_centro_trans"
	 */
	@Column(name = "`URBANI_CENTRO_TRANS`")
	public String getUrbani_centro_trans() {
		return urbani_centro_trans;
	}
	/**
	 * @param urbani_centro_trans
	 * @uml.property  name="urbani_centro_trans"
	 */
	public void setUrbani_centro_trans(String urbani_centro_trans) {
		this.urbani_centro_trans = urbani_centro_trans;
	}
	/**
	 * @return
	 * @uml.property  name="nombre_descripcentro_trans"
	 */
	@Column(name = "`NOMBRE_DESCRIPCENTRO_TRANS`")
	public String getNombre_descripcentro_trans() {
		return nombre_descripcentro_trans;
	}
	/**
	 * @param nombre_descripcentro_trans
	 * @uml.property  name="nombre_descripcentro_trans"
	 */
	public void setNombre_descripcentro_trans(String nombre_descripcentro_trans) {
		this.nombre_descripcentro_trans = nombre_descripcentro_trans;
	}
	/**
	 * @return
	 * @uml.property  name="conductor"
	 */
	@OneToMany(targetEntity=Conductor.class,
			orphanRemoval = true,cascade={javax.persistence.CascadeType.ALL})
			@JoinColumn(name="`ID_CONDUCTOR`")
	public Set<Conductor> getConductor() {
		return conductor;
	}
	/**
	 * @param conductor
	 * @uml.property  name="conductor"
	 */
	public void setConductor(Set<Conductor> conductor) {
		this.conductor = conductor;
	}
	
	/*Habilitacion Vehicular*/
	/**
	 * @return
	 * @uml.property  name="habilitacionVehicularInscripcion"
	 */
    @OneToOne(optional=false, mappedBy="transportista")
	/*@JoinTable (name="TransportistaHabilitacion",
			joinColumns=@JoinColumn(name="`Id_transportista`"),
			inverseJoinColumns=@JoinColumn(name="`Id_Habilitacionvehicular`"))*/
	public HabilitacionVehicular_Inscripcion getHabilitacionVehicularInscripcion() {
		return habilitacionVehicularInscripcion;
	}
	/**
	 * @param habilitacionvehicularinscripcion
	 * @uml.property  name="habilitacionvehicularinscripcion"
	 */
	public void setHabilitacionVehicularInscripcion(
			HabilitacionVehicular_Inscripcion habilitacionVehicularInscripcion) {
		this.habilitacionVehicularInscripcion = habilitacionVehicularInscripcion;
	}
	/**
	 * @return
	 * @uml.property  name="habilitacionVehicularIncremtsusti"
	 */
	/*@OneToMany(targetEntity=HabilitacionVehicular_IncremtSusti.class,mappedBy="transportista")
	@JoinTable(name = "`HABILITACIONVEHICULAR_INCREMTSUSTI`",joinColumns = {
	@JoinColumn(name="`ID_TRANSPORTISTA`")})
	@Cascade (value={org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.DELETE_ORPHAN})*/
	@OneToMany(mappedBy="transportista")
	public Set<HabilitacionVehicular_IncremtSusti> getHabilitacionVehicularIncremtsusti() {
		return habilitacionVehicularIncremtsusti;
	}
	/**
	 * @param habilitacionvehicularinscripcion
	 * @uml.property  name="habilitacionvehicularincrementosustitucion"
	 */
	public void setHabilitacionVehicularIncremtsusti(
			Set<HabilitacionVehicular_IncremtSusti> habilitacionVehicularIncremtsusti) {
		this.habilitacionVehicularIncremtsusti = habilitacionVehicularIncremtsusti;
	}
}
