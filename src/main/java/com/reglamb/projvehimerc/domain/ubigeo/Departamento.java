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
	    sequenceName="sequencedepartamento",
	    initialValue= 01 ,
	    allocationSize=20)
@Table(name ="`DEPARTAMENTO`")
public class Departamento implements Serializable,DomainObject {
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="id_depart"
	 */
	private int id_depart;
	/**
	 * @uml.property  name="nombre_depart"
	 */
	private String nombre_depart;
	/**
	 * @uml.property  name="referencia_depart"
	 */
	private String referencia_depart;
	/**
	 * @uml.property  name="provincia"
	 * @uml.associationEnd 
	 */
	private Set<Provincia> provincia = new HashSet<Provincia>();
	
	/**
	 * @return
	 * @uml.property  name="id_depart"
	 */
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name ="`CODDPTO`")
	public int getId_depart() {
		return id_depart;
	}
	/**
	 * @param id_depart
	 * @uml.property  name="id_depart"
	 */
	public void setId_depart(int id_depart) {
		this.id_depart = id_depart;
	}
	/**
	 * @return
	 * @uml.property  name="nombre_depart"
	 */
	@Column(name ="`NOMBRE_DEPART`")
	public String getNombre_depart() {
		return nombre_depart;
	}
	/**
	 * @param nombre_depart
	 * @uml.property  name="nombre_depart"
	 */
	public void setNombre_depart(String nombre_depart) {
		this.nombre_depart = nombre_depart;
	}
	/**
	 * @return
	 * @uml.property  name="referencia_depart"
	 */
	@Column(name ="`REFERENCIA_DEPART`")
	public String getReferencia_depart() {
		return referencia_depart;
	}
	/**
	 * @param referencia_depart
	 * @uml.property  name="referencia_depart"
	 */
	public void setReferencia_depart(String referencia_depart) {
		this.referencia_depart = referencia_depart;
	}
	
	@OneToMany(targetEntity=Provincia.class)
	@Cascade (value=CascadeType.SAVE_UPDATE)
	@JoinColumn (name="`CODDPTO`")
	@Column(nullable=false)
	public Set<Provincia> getProvincia() {
		return provincia;
	}
	/**
	 * @param observacion
	 * @uml.property  name="provincia"
	 */
	public void setProvincia(Set<Provincia> provincia) {
		this.provincia = provincia;
	}

}
