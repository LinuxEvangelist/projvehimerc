package com.reglamb.projvehimerc.domain.ubigeo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.reglamb.projvehimerc.domain.DomainObject;
/**
 * @author  mastervodoo
 */
@Entity
@SequenceGenerator(
	    name="SEQ_STORE",
	    sequenceName="sequenceprovincia",
	    initialValue= 01 ,
	    allocationSize=20)
@Table(name ="`PROVINCIA`")
public class Provincia implements Serializable,DomainObject {
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="id_provincia"
	 */
	private int id_provincia;
	/**
	 * @uml.property  name="nombre_provincia"
	 */
	private String nombre_provincia;
	/**
	 * @uml.property  name="referencia_provincia"
	 */
	private String referencia_provincia;
	/**
	 * @uml.property  name="id_depart"
	 */
	private int id_depart;
	/**
	 * @uml.property  name="distrito"
	 * @uml.associationEnd 
	 */
	private Set<Distrito> distrito=new HashSet<Distrito>();
	/**
	 * @return
	 * @uml.property  name="id_provincia"
	 */
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name ="`CODPROV`")
	public int getId_provincia() {
		return id_provincia;
	}
	/**
	 * @param id_provincia
	 * @uml.property  name="id_provincia"
	 */
	public void setId_provincia(int id_provincia) {
		this.id_provincia = id_provincia;
	}
	/**
	 * @return
	 * @uml.property  name="nombre_provincia"
	 */
	@Column(name ="`NOMBRE_PROVINCIA`")
	public String getNombre_provincia() {
		return nombre_provincia;
	}
	/**
	 * @param nombre_provincia
	 * @uml.property  name="nombre_provincia"
	 */
	public void setNombre_provincia(String nombre_provincia) {
		this.nombre_provincia = nombre_provincia;
	}
	/**
	 * @return
	 * @uml.property  name="referencia_provincia"
	 */
	@Column(name ="`REFERENCIA_PROVINCIA`")
	public String getReferencia_provincia() {
		return referencia_provincia;
	}
	/**
	 * @param referencia_provincia
	 * @uml.property  name="referencia_provincia"
	 */
	public void setReferencia_provincia(String referencia_provincia) {
		this.referencia_provincia = referencia_provincia;
	}
	/**
	 * @return
	 * @uml.property  name="distrito"
	 */
	@OneToMany(targetEntity=Distrito.class)
	@Cascade (value=CascadeType.SAVE_UPDATE)
	@JoinColumn (name="`CODPROV`")
	@Column(nullable=false)
	public Set<Distrito> getDistrito() {
		return distrito;
	}
	/**
	 * @param observacion
	 * @uml.property  name="distrito"
	 */
	public void setDistrito(Set<Distrito> distrito) {
		this.distrito = distrito;
	}
	/**
	 * @return
	 * @uml.property  name="id_depart"
	 */
	@Column(name ="`CODDPTO`")
	public int getId_depart() {
		return id_depart;
	}
	/**
	 * @param observacion
	 * @uml.property  name="id_depart"
	 */
	public void setId_depart(int id_depart) {
		this.id_depart = id_depart;
	}
}
