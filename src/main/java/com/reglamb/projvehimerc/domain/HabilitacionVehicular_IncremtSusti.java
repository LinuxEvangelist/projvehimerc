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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Type;

import com.reglamb.projvehimerc.domain.User;


@Entity
@SequenceGenerator(
	    name="SEQ_STORE",
	    sequenceName="sequencevehicularincrementosustitucion",
	    initialValue= 100 ,
	    allocationSize=20)
@Table(name = "`HABILITACIONVEHICULAR_INCREMTSUSTI`")
public class HabilitacionVehicular_IncremtSusti implements Serializable,DomainObject{
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="idincrementosustitucion"
	 */
	private Long idincrementosustitucion;
	/**
	 * @uml.property  name="numsisgedo"
	 */
	private Long numsisgedo;
	/**
	 * @uml.property  name="numrecibobanc"
	 */
	private Long numrecibobanc;
	/**
	 * @uml.property  name="copiasimpltarjeta"
	 */
	private byte copiasimpltarjeta;
	/**
	 * @uml.property  name="nominavehiculo"
	 */
	private byte nominavehiculobajainter;
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
	 * @uml.property  name="precioincremento"
	 */
	private Float precioincremento;
	/**
	 * @uml.property  name="modificacionfecha"
	 */
	private Date modificacionfecha=new Date();
	/**
	 * @uml.property  name="transportista"
	 * @uml.associationEnd  
	 */
	private Transportista transportista;
	/**
	 * @uml.property  name="actaincrementosustitucion"
	 */
	private byte[] actaincrementosustitucion;
	/**
	 * @uml.property  name="user"
	 * @uml.associationEnd  
	 */
	private User user;
	/**
	 * @return
	 * @uml.property  name="idincrementosustitucion"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name="`ID_INCREMENTOSUSTITUCION`")
	public Long getIdincrementosustitucion() {
		return idincrementosustitucion;
	}
	/**
	 * @param ruc
	 * @uml.property  name="incrementosustitucion"
	 */
	public void setIdincrementosustitucion(Long idincrementosustitucion) {
		this.idincrementosustitucion = idincrementosustitucion;
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
	 * @param ruc
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
	 * @param ruc
	 * @uml.property  name="numrecibobanc"
	 */
	public void setNumrecibobanc(Long numrecibobanc) {
		this.numrecibobanc = numrecibobanc;
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
	 * @param ruc
	 * @uml.property  name="copiasimpltarjeta"
	 */
	public void setCopiasimpltarjeta(byte copiasimpltarjeta) {
		this.copiasimpltarjeta = copiasimpltarjeta;
	}
	/**
	 * @return
	 * @uml.property  name="nominavehiculobajainter"
	 */
	 @Column(name = "`NOMINA_VEHICULARBAJA`")
	public byte getNominavehiculobajainter() {
		return nominavehiculobajainter;
	}
	/**
	 * @param ruc
	 * @uml.property  name="nominavehiculobajainter"
	 */
	public void setNominavehiculobajainter(byte nominavehiculobajainter) {
		this.nominavehiculobajainter = nominavehiculobajainter;
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
	 * @param ruc
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
	 * @param ruc
	 * @uml.property  name="copiasoat"
	 */
	public void setCopiasoat(byte copiasoat) {
		this.copiasoat = copiasoat;
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
	 * @param ruc
	 * @uml.property  name="observaciones"
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	/**
	 * @return
	 * @uml.property  name="precioincremento"
	 */
	 @Column(name = "`PRECIO_INCREMENTOBAJA`")
	public Float getPrecioincremento() {
		return precioincremento;
	}
	/**
	 * @param ruc
	 * @uml.property  name="precioincremento"
	 */
	public void setPrecioincremento(Float precioincremento) {
		this.precioincremento = precioincremento;
	}
	/**
	 * @return
	 * @uml.property  name="modificacionfecha"
	 */
	 @Column(name = "`MODIFICACION_FECHA`")
	public Date getModificacionfecha() {
		return modificacionfecha;
	}
	/**
	 * @param ruc
	 * @uml.property  name="modificacionfecha"
	 */
	public void setModificacionfecha(Date modificacionfecha) {
		this.modificacionfecha = modificacionfecha;
	}
	/**
	 * @return
	 * @uml.property  name="transportista"
	 */
	/*@ManyToOne
	@JoinTable(name="HabilitacionVehicular_IncremtSusti",joinColumns= 
	@JoinColumn(name="`ID_INCREMENTOSUSTITUCION`"))@JoinColumn (name="`ID_TRANSPORTISTA")*/
	@ManyToOne
	@JoinColumn(name="transportista_fk")
	public Transportista getTransportista() {
		return transportista;
	}
	/**
	 * @param ruc
	 * @uml.property  name="transportista"
	 */
	public void setTransportista(Transportista transportista) {
		this.transportista = transportista;
	}
	/**
	 * @return
	 * @uml.property  name="actaincrementosustitucion"
	 */
	@Lob
	@Basic(fetch=javax.persistence.FetchType.LAZY)
	//Only for PostgreSql, Oracle different configuration, on developed for same develop
	@Type(type="org.hibernate.type.PrimitiveByteArrayBlobType")
	@Column(name = "`ACTA_INCREMENTOSUSTITUCION`")
	public byte[] getActaincrementosustitucion() {
		return actaincrementosustitucion;
	}
	/**
	 * @param ruc
	 * @uml.property  name="actaincrementosustitucion"
	 */
	public void setActaincrementosustitucion(byte[] actaincrementosustitucion) {
		this.actaincrementosustitucion = actaincrementosustitucion;
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
}
