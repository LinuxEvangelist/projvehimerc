package com.reglamb.projvehimerc.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.reglamb.projvehimerc.domain.transportista.Transportista_Accionista;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Representante;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Sucursal;

/**
 * @author  mastervodoo
 */
@Entity
@Table (name ="`TRANSPORTISTA_JURIDICO`")
//@PrimaryKeyJoinColumn(name = "`Id_transportista`")
public class TransportistaJuridico extends Transportista implements Serializable,DomainObject{

	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="razonsocial"
	 */
	private String razonsocial;
	/**
	 * @uml.property  name="constitucion"
	 */
	private String constitucion;
	/**
	 * @uml.property  name="representanteTransportista"
	 */
	private Set<Transportista_Representante> representanteTransportista = new HashSet<Transportista_Representante>();
	/**
	 * @uml.property  name="accionistaTransportista"
	 */
	private Set<Transportista_Accionista> accionistaTransportista = new HashSet<Transportista_Accionista>();
	/**
	 * @uml.property  name="sucursalTransportista"
	 */
	private Set<Transportista_Sucursal> sucursalTransportista = new HashSet<Transportista_Sucursal>();
	
	/**
	 * @return
	 * @uml.property  name="razonsocial"
	 */
	@Column(name = "`RAZON_SOCIAL`")   
	public String getRazonsocial() {
		return razonsocial;
	}
	/**
	 * @param razonsocial
	 * @uml.property  name="razonsocial"
	 */
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	/**
	 * @return
	 * @uml.property  name="constitucion"
	 */
	@Column(name = "`CONSTITUCION`")   
	public String getConstitucion() {
		return constitucion;
	}
	/**
	 * @param constitucion
	 * @uml.property  name="constitucion"
	 */
	public void setConstitucion(String constitucion) {
		this.constitucion = constitucion;
	}
	/**
	 * @return
	 * @uml.property  name="representanteTransportista"
	 */
	@OneToMany(targetEntity=Transportista_Representante.class,
			orphanRemoval = true,cascade={javax.persistence.CascadeType.ALL})
			@JoinColumn(name="`ID_TRANSPORTISTA`")
	public Set<Transportista_Representante> getRepresentanteTransportista() {
		return representanteTransportista;
	}
	
	/**
	 * @param representanteTransportista
	 * @uml.property  name="representanteTransportista"
	 */
	public void setRepresentanteTransportista(
			Set<Transportista_Representante> representanteTransportista) {
		this.representanteTransportista = representanteTransportista;
	}
	/**
	 * @return
	 * @uml.property  name="accionistaTransportista"
	 */
	@OneToMany(targetEntity=Transportista_Accionista.class,
			orphanRemoval = true,cascade={javax.persistence.CascadeType.ALL})
			@JoinColumn(name="`ID_TRANSPORTISTA`")
	public Set<Transportista_Accionista> getAccionistaTransportista() {
		return accionistaTransportista;
	}
	/**
	 * @param accionistaTransportista
	 * @uml.property  name="accionistaTransportista"
	 */
	public void setAccionistaTransportista(
			Set<Transportista_Accionista> accionistaTransportista) {
		this.accionistaTransportista = accionistaTransportista;
	}
	
	/**
	 * @return
	 * @uml.property  name="sucursalTransportista"
	 */
	@OneToMany(targetEntity=Transportista_Sucursal.class,
			orphanRemoval = true,cascade={javax.persistence.CascadeType.ALL})
			@JoinColumn(name="`ID_TRANSPORTISTA`")
	public Set<Transportista_Sucursal> getSucursalTransportista() {
		return sucursalTransportista;
	}
	/**
	 * @param sucursalTransportista
	 * @uml.property  name="sucursalTransportista"
	 */
	public void setSucursalTransportista(
			Set<Transportista_Sucursal> sucursalTransportista) {
		this.sucursalTransportista = sucursalTransportista;
	}

}
