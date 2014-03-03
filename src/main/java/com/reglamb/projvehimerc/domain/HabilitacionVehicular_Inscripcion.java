package com.reglamb.projvehimerc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
/*import javax.persistence.Lob;*/
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Type;

import com.reglamb.projvehimerc.domain.User;

/**
 * @author   mastervodoo
 */
@Entity
@SequenceGenerator(
	    name="SEQ_STORE",
	    sequenceName="sequencevehicularinscripcion",
	    initialValue= 100 ,
	    allocationSize=20)
@Table(name = "`HABILITACIONVEHICULAR_INSCRIPCION`")
public class HabilitacionVehicular_Inscripcion implements Serializable,DomainObject{

	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="idhabilitacionvehicularid"
	 */
	private Long idhabilitacionvehicularid;
	/**
	 * @uml.property  name="numsisgedo"
	 */
	private Long numsisgedo;
	/**
	 * @uml.property  name="numrecibobanc"
	 */
	private Long numrecibobanc;
	/**
	 * @uml.property  name="nominaconductores"
	 */
	private byte nominaconductores;
	/**
	 * @uml.property  name="copiasimpltarjeta"
	 */
	private byte copiasimpltarjeta;
	/**
	 * @uml.property  name="nominavehiculo"
	 */
	private byte nominavehiculo;
	/**
	 * @uml.property  name="copiasimplcitv"
	 */
	private byte copiasimplcitv;
	/**
	 * @uml.property  name="copiasoat"
	 */
	private byte copiasoat;
	/**
	 * @uml.property  name="observaciones"
	 */
	private String observaciones;
	/**
	 * @uml.property  name="preciovehicular"
	 */
	private Float preciovehicular;
	/**
	 * @uml.property  name="user"
	 * @uml.associationEnd  
	 */
	private User user;
	/**
	 * @uml.property  name="activo"
	 */
	private byte activo;
	/**
	 * @uml.property  name="inscripcionfecha"
	 */
	private Date inscripcionfecha=new Date();
	
	
	/**
	 * @uml.property  name="transportista"
	 * @uml.associationEnd  
	 */
	private Transportista transportista;
	/**
	 * @uml.property  name="actacertificacion"
	 */
	private byte[] actacertificacion;

	/**
	 * @return
	 * @uml.property  name="idhabilitacionvehicularid"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name="`ID_HABILITACIONVEHICULAR`")
	public Long getIdhabilitacionvehicularid() {
		return idhabilitacionvehicularid;
	}
	/**
	 * @param idhabilitacionvehicularid
	 * @uml.property  name="idhabilitacionvehicularid"
	 */
	public void setIdhabilitacionvehicularid(Long idhabilitacionvehicularid) {
		this.idhabilitacionvehicularid = idhabilitacionvehicularid;
	}
	/**
	 * @return
	 * @uml.property  name="numsisgedo"
	 */
	 @Column(name = "`NUMSISGEDO`")
	public Long getNumsisgedo() {
		return numsisgedo;
	}
	/**
	 * @param numsisgedo
	 * @uml.property  name="numsisgedo"
	 */
	public void setNumsisgedo(Long numsisgedo) {
		this.numsisgedo = numsisgedo;
	}
	/**
	 * @return
	 * @uml.property  name="numrecibobanc"
	 */
	 @Column(name = "`NUMRECIBO_BANCO`")
	public Long getNumrecibobanc() {
		return numrecibobanc;
	}
	/**
	 * @param numrecibobanc
	 * @uml.property  name="numrecibobanc"
	 */
	public void setNumrecibobanc(Long numrecibobanc) {
		this.numrecibobanc = numrecibobanc;
	}
	/**
	 * @return
	 * @uml.property  name="nominaconductores"
	 */
	 @Column(name = "`NOMINA_CONDUCTORES`")
	public byte getNominaconductores() {
		return nominaconductores;
	}
	/**
	 * @param nominaconductores
	 * @uml.property  name="nominaconductores"
	 */
	public void setNominaconductores(byte nominaconductores) {
		this.nominaconductores = nominaconductores;
	}
	/**
	 * @return
	 * @uml.property  name="copiasimpltarjeta"
	 */
	 @Column(name = "`COPIASIMPLE_TARJETA`")
	public byte getCopiasimpltarjeta() {
		return copiasimpltarjeta;
	}
	/**
	 * @param copiasimpltarjeta
	 * @uml.property  name="copiasimpltarjeta"
	 */
	public void setCopiasimpltarjeta(byte copiasimpltarjeta) {
		this.copiasimpltarjeta = copiasimpltarjeta;
	}
	/**
	 * @return
	 * @uml.property  name="nominavehiculo"
	 */
	 @Column(name = "`NOMINA_VEHICULO`")
	public byte getNominavehiculo() {
		return nominavehiculo;
	}
	/**
	 * @param nominavehiculo
	 * @uml.property  name="nominavehiculo"
	 */
	public void setNominavehiculo(byte nominavehiculo) {
		this.nominavehiculo = nominavehiculo;
	}
	/**
	 * @return
	 * @uml.property  name="copiasimplcitv"
	 */
	 @Column(name = "`COPIASIMPLE_CITV`")
	public byte getCopiasimplcitv() {
		return copiasimplcitv;
	}
	/**
	 * @param copiasimplcitv
	 * @uml.property  name="copiasimplcitv"
	 */
	public void setCopiasimplcitv(byte copiasimplcitv) {
		this.copiasimplcitv = copiasimplcitv;
	}
	/**
	 * @return
	 * @uml.property  name="copiasoat"
	 */
	 @Column(name = "`COPIASOAT`")
	public byte getCopiasoat() {
		return copiasoat;
	}
	/**
	 * @param copiasoat
	 * @uml.property  name="copiasoat"
	 */
	public void setCopiasoat(byte copiasoat) {
		this.copiasoat = copiasoat;
	}
	/**
	 * @return
	 * @uml.property  name="transportista"
	 */
	@OneToOne(optional=false)
    @JoinColumn(name="`ID_TRANSPORTISTA`", unique=true, 
    nullable=false, updatable=false)
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
	/**
	 * @return
	 * @uml.property  name="actacertificacion"
	 */
	@Lob
	@Basic(fetch=javax.persistence.FetchType.LAZY)
	//Only for PostgreSql, Oracle different configuration, on developed for same develop
    @Type(type="org.hibernate.type.PrimitiveByteArrayBlobType")	
	@Column(name = "`ACTA_CERTIFICACION`")
	public byte[] getActacertificacion() {
		return actacertificacion;
	}
	/**
	 * @param actacertificacion
	 * @uml.property  name="actacertificacion"
	 */
	public void setActacertificacion(byte[] actacertificacion) {
		this.actacertificacion = actacertificacion;
	}
	/**
	 * @return
	 * @uml.property  name="observaciones"
	 */
	@Column(name = "`OBSERVACIONES`")
	public String getObservaciones() {
		return observaciones;
	}
	/**
	 * @param observaciones
	 * @uml.property  name="observaciones"
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	/**
	 * @return
	 * @uml.property  name="preciovehicular"
	 */
	@Column(name = "`PRECIO_INSCRIPCION`")
	public Float getPreciovehicular() {
		return preciovehicular;
	}
	/**
	 * @param preciovehicular
	 * @uml.property  name="preciovehicular"
	 */
	public void setPreciovehicular(Float preciovehicular) {
		this.preciovehicular = preciovehicular;
	}
	/**
	 * @return
	 * @uml.property  name="user"
	 */
	@ManyToOne
	@Cascade (value=CascadeType.SAVE_UPDATE)
	@JoinColumn (name="id_user")
	public User getUser() {
		return user;
	}
	/**
	 * @param user
	 * @uml.property  name="user"
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return
	 * @uml.property  name="activo"
	 */
	@Column(name = "`ACTIVO`")
	public byte getActivo() {
		return activo;
	}
	/**
	 * @param activo
	 * @uml.property  name="activo"
	 */
	public void setActivo(byte activo) {
		this.activo = activo;
	}
	/**
	 * @return
	 * @uml.property  name="inscripcionfecha"
	 */
	@Column(name = "`TIEMPOINSCRIPCION`")   
	@Temporal(TemporalType.TIMESTAMP) 
	public Date getInscripcionfecha() {
		return inscripcionfecha;
	}
	/**
	 * @param inscripcionfecha
	 * @uml.property  name="inscripcionfecha"
	 */
	public void setInscripcionfecha(Date inscripcionfecha) {
		this.inscripcionfecha = inscripcionfecha;
	}

}
