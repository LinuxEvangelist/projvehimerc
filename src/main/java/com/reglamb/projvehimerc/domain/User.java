package com.reglamb.projvehimerc.domain;

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
/**
 * @author   mastervodoo
 */
@Entity
@SequenceGenerator(
	    name="SEQ_USER",
	    sequenceName="sequenceuser",
	    initialValue= 101 ,
	    allocationSize=20)
@Table(name ="`USER`")
public class User implements Serializable,DomainObject {
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="id_user"
	 */
	private Long id_user;
	/**
	 * @uml.property  name="cod_user"
	 */
	private Integer cod_user;
	/**
	 * @uml.property  name="pass_user"
	 */
	@SuppressWarnings("unused")
	private String pass_user;
	/**
	 * @uml.property  name="name_user"
	 */
	private String name_user;
	/**
	 * @uml.property  name="cargo"
	 */
	private String cargo;
	/**
	 * @uml.property  name="enable"
	 */
	private Boolean enable;
	/**
	 * @uml.property  name="habilitacionVehicular_Inscripcion"
	 */
	private Set<HabilitacionVehicular_Inscripcion> habilitacionVehicular_Inscripcion=new HashSet<HabilitacionVehicular_Inscripcion>();
	/**
	 * @uml.property  name="habilitacionVehicular_IncremtSusti"
	 */
	private Set<HabilitacionVehicular_IncremtSusti> habilitacionVehicular_IncremtSusti=new HashSet<HabilitacionVehicular_IncremtSusti>();

	/**
	 * @return
	 * @uml.property  name="id_user"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_USER")
	@Column(name = "`ID_USER`")
	public Long getId_user() {
		return id_user;
	}
	/**
	 * @param id_user
	 * @uml.property  name="id_user"
	 */
	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}
	/**
	 * @return
	 * @uml.property  name="cod_user"
	 */
	@Column(name = "`COD_USER`")
	public Integer getCod_user() {
		return cod_user;
	}
	/**
	 * @param cod_user
	 * @uml.property  name="cod_user"
	 */
	public void setCod_user(Integer cod_user) {
		this.cod_user = cod_user;
	}
	/**
	 * @param pass_user
	 * @uml.property  name="pass_user"
	 */
	@Column(name = "`PASS_USER`")
	public void setPass_user(String pass_user) {
		this.pass_user = pass_user;
	}
	/**
	 * @param pass_user
	 * @uml.property  name="name_user"
	 */
	@Column(name = "`NAME_USER`")
	public String getName_user() {
		return name_user;
	}
	public void setName_user(String name_user) {
		this.name_user = name_user;
	}
	/**
	 * @param pass_user
	 * @uml.property  name="cargo"
	 */
	@Column(name = "`CARGO`")
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	/**
	 * @param pass_user
	 * @uml.property  name="enable"
	 */
	@Column(name = "`ENABLE_USER`")
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	/**
	 * @param habilitacionvehicularinscripcion
	 * @uml.property  name="habilitacionVehicular_Inscripcion"
	 */
	@OneToMany(targetEntity=HabilitacionVehicular_Inscripcion.class,
			orphanRemoval = true,cascade={javax.persistence.CascadeType.ALL})
			@JoinColumn(name="`ID_USER`")
	public Set<HabilitacionVehicular_Inscripcion> getHabilitacionVehicular_Inscripcion() {
		return habilitacionVehicular_Inscripcion;
	}
	public void setHabilitacionVehicular_Inscripcion(
			Set<HabilitacionVehicular_Inscripcion> habilitacionVehicular_Inscripcion) {
		this.habilitacionVehicular_Inscripcion = habilitacionVehicular_Inscripcion;
	}
	/**
	 * @param habilitacionvehicularinscripcion
	 * @uml.property  name="habilitacionVehicular_IncremtSusti"
	 */
	@OneToMany(targetEntity=HabilitacionVehicular_IncremtSusti.class,
			orphanRemoval = true,cascade={javax.persistence.CascadeType.ALL})
			@JoinColumn(name="`ID_USER`")
	public Set<HabilitacionVehicular_IncremtSusti> getHabilitacionVehicular_IncremtSusti() {
		return habilitacionVehicular_IncremtSusti;
	}
	public void setHabilitacionVehicular_IncremtSusti(
			Set<HabilitacionVehicular_IncremtSusti> habilitacionVehicular_IncremtSusti) {
		this.habilitacionVehicular_IncremtSusti = habilitacionVehicular_IncremtSusti;
	}

}
