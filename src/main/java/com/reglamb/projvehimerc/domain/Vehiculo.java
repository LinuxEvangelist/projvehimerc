package com.reglamb.projvehimerc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Citv;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Soat;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Tenencia;

/**
 * @uml.dependency  supplier="com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Tenencia"
 * @uml.dependency  supplier="com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Soat"
 * @uml.dependency  supplier="com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Citv"
 */
@Entity
@SequenceGenerator(
	    name="SEQ_STORE",
	    sequenceName="sequencevehiculo",
	    initialValue= 100 ,
	    allocationSize=20)
@Table(name ="`VEHICULO`")
public class Vehiculo implements Serializable,DomainObject {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @uml.property  name="id_vehiculo"
	 */
	private Long id_vehiculo;
	/**
	 * @uml.property  name="marca"
	 */
	private String marca;
	/**
	 * @uml.property  name="modelo"
	 */
	private String modelo;
	/**
	 * @uml.property  name="clase"
	 */
	private String clase;
	/**
	 * @uml.property  name="carroceria"
	 */
	private String carroceria;
	/**
	 * @uml.property  name="año_fab"
	 */
	private Date año_fab;
	/**
	 * @uml.property  name="n_chasis"
	 */
	private Integer n_chasis;
	/**
	 * @uml.property  name="n_ejes"
	 */
	private Integer n_ejes;
	/**
	 * @uml.property  name="combustible"
	 */
	private String combustible;
	/**
	 * @uml.property  name="peso_seco"
	 */
	private Float peso_seco;
	/**
	 * @uml.property  name="carga_util"
	 */
	private Float carga_util;
	/**
	 * @uml.property  name="largo"
	 */
	private String largo;
	/**
	 * @uml.property  name="ancho"
	 */
	private String ancho;
	/**
	 * @uml.property  name="altura"
	 */
	private String altura;
	/**
	 * @uml.property  name="transportista"
	 * @uml.associationEnd  
	 */
	private Transportista transportista;
	/*Relacion One To One*/
	/**
	 * @uml.property  name="vehiccitv"
	 * @uml.associationEnd  
	 */
	private Vehiculo_Citv vehiccitv;
	/**
	 * @uml.property  name="vehicsoat"
	 * @uml.associationEnd  
	 */
	private Vehiculo_Soat vehicsoat;
	/**
	 * @uml.property  name="vehictenec"
	 * @uml.associationEnd  
	 */
	private Vehiculo_Tenencia vehictenec;
	/**
	 * @return
	 * @uml.property  name="id_vehiculo"
	 */
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name ="`ID_VEHICULO`")
	public Long getId_vehiculo() {
		return id_vehiculo;
	}
	/**
	 * @param id_vehiculo
	 * @uml.property  name="id_vehiculo"
	 */
	public void setId_vehiculo(Long id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}
	/**
	 * @return
	 * @uml.property  name="marca"
	 */
	@Column(name="`MARCA`")
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca
	 * @uml.property  name="marca"
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return
	 * @uml.property  name="modelo"
	 */
	@Column(name="`MODELO`")
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo
	 * @uml.property  name="modelo"
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return
	 * @uml.property  name="clase"
	 */
	@Column(name ="`CLASE`")
	public String getClase() {
		return clase;
	}
	/**
	 * @param clase
	 * @uml.property  name="clase"
	 */
	public void setClase(String clase) {
		this.clase = clase;
	}
	/**
	 * @return
	 * @uml.property  name="carroceria"
	 */
	@Column(name ="`CARROCERIA`")
	public String getCarroceria() {
		return carroceria;
	}
	/**
	 * @param carroceria
	 * @uml.property  name="carroceria"
	 */
	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}
	/**
	 * @return
	 * @uml.property  name="año_fab"
	 */
	@Column(name ="`ANO_FABRICACION`")
	public Date getAño_fab() {
		return año_fab;
	}
	/**
	 * @param año_fab
	 * @uml.property  name="año_fab"
	 */
	public void setAño_fab(Date año_fab) {
		this.año_fab = año_fab;
	}
	/**
	 * @return
	 * @uml.property  name="n_chasis"
	 */
	@Column(name ="`NUMERO_CHASIS`")
	public Integer getN_chasis() {
		return n_chasis;
	}
	/**
	 * @param n_chasis
	 * @uml.property  name="n_chasis"
	 */
	public void setN_chasis(Integer n_chasis) {
		this.n_chasis = n_chasis;
	}
	/**
	 * @return
	 * @uml.property  name="n_ejes"
	 */
	@Column(name ="`NUMERO_EJES`")
	public Integer getN_ejes() {
		return n_ejes;
	}
	/**
	 * @param n_ejes
	 * @uml.property  name="n_ejes"
	 */
	public void setN_ejes(Integer n_ejes) {
		this.n_ejes = n_ejes;
	}
	/**
	 * @return
	 * @uml.property  name="combustible"
	 */
	@Column(name ="`COMBUSTIBLE`")
	public String getCombustible() {
		return combustible;
	}
	/**
	 * @param combustible
	 * @uml.property  name="combustible"
	 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	/**
	 * @return
	 * @uml.property  name="peso_seco"
	 */
	@Column(name ="`PESO_SECO`")
	public Float getPeso_seco() {
		return peso_seco;
	}
	/**
	 * @param peso_seco
	 * @uml.property  name="peso_seco"
	 */
	public void setPeso_seco(Float peso_seco) {
		this.peso_seco = peso_seco;
	}
	/**
	 * @return
	 * @uml.property  name="carga_util"
	 */
	@Column(name ="`CARGA_UTIL`")
	public Float getCarga_util() {
		return carga_util;
	}
	/**
	 * @param carga_util
	 * @uml.property  name="carga_util"
	 */
	public void setCarga_util(Float carga_util) {
		this.carga_util = carga_util;
	}
	/**
	 * @return
	 * @uml.property  name="largo"
	 */
	@Column(name ="`LARGO`")
	public String getLargo() {
		return largo;
	}
	/**
	 * @param largo
	 * @uml.property  name="largo"
	 */
	public void setLargo(String largo) {
		this.largo = largo;
	}
	/**
	 * @return
	 * @uml.property  name="ancho"
	 */
	@Column(name ="`ANCHO`")
	public String getAncho() {
		return ancho;
	}
	/**
	 * @param ancho
	 * @uml.property  name="ancho"
	 */
	public void setAncho(String ancho) {
		this.ancho = ancho;
	}
	/**
	 * @return
	 * @uml.property  name="altura"
	 */
	@Column(name ="`ALTURA`")
	public String getAltura() {
		return altura;
	}
	/**
	 * @param altura
	 * @uml.property  name="altura"
	 */
	public void setAltura(String altura) {
		this.altura = altura;
	}
	/*Transportista ---> */
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
	
	/**
	 * @return
	 * @uml.property  name="vehiccitv"
	 */
	@OneToOne(cascade={javax.persistence.CascadeType.ALL},orphanRemoval = true)
    @JoinColumn(name = "`IDVEHI_CITV`",nullable=false)
	public Vehiculo_Citv getVehiccitv() {
		return vehiccitv;
	}
	/**
	 * @param vehiccitv
	 * @uml.property  name="vehiccitv"
	 */
	public void setVehiccitv(Vehiculo_Citv vehiccitv) {
		this.vehiccitv = vehiccitv;
	}
	/**
	 * @return
	 * @uml.property  name="vehicsoat"
	 */
	@OneToOne(cascade={javax.persistence.CascadeType.ALL},orphanRemoval = true)
    @JoinColumn(name = "`IDVEHI_SOAT`",nullable=false)
	public Vehiculo_Soat getVehicsoat() {
		return vehicsoat;
	}
	/**
	 * @param vehicsoat
	 * @uml.property  name="vehicsoat"
	 */
	public void setVehicsoat(Vehiculo_Soat vehicsoat) {
		this.vehicsoat = vehicsoat;
	}
	/**
	 * @return
	 * @uml.property  name="vehictenec"
	 */
	@OneToOne(cascade={javax.persistence.CascadeType.ALL},orphanRemoval = true)
    @JoinColumn(name = "`IDVEHI_TENENCIA`",nullable=false)
	public Vehiculo_Tenencia getVehictenec() {
		return vehictenec;
	}
	/**
	 * @param vehictenec
	 * @uml.property  name="vehictenec"
	 */
	public void setVehictenec(Vehiculo_Tenencia vehictenec) {
		this.vehictenec = vehictenec;
	}
    
}
