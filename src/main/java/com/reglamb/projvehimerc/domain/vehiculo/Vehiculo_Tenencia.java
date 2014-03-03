package com.reglamb.projvehimerc.domain.vehiculo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.reglamb.projvehimerc.domain.DomainObject;
/**
 * @author  mastervodoo
 */
@Entity
@SequenceGenerator(
	    name="SEQ_STORE",
	    sequenceName="sequencevehiculotenencia",
	    initialValue= 100 ,
	    allocationSize=20)
@Table(name="`VEHICULO_TENENCIA`")
public class Vehiculo_Tenencia  implements Serializable,DomainObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="idtenenciavehic"
	 */
	private Long idtenenciavehic;
	/**
	 * @uml.property  name="tipo_arrendamiento"
	 */
	private String tipo_arrendamiento;
	/**
	 * @uml.property  name="entidad"
	 */
	private String entidad;
	/**
	 * @uml.property  name="fech_desdearrend"
	 */
	private Date fech_desdearrend;
	/**
	 * @uml.property  name="fech_hastaarrend"
	 */
	private Date fech_hastaarrend;
	/**
	 * @uml.property  name="ambito"
	 */
	private String ambito;
	/**
	 * @return
	 * @uml.property  name="idtenenciavehic"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name = "`IDVEHI_TENENCIA`")
	public Long getIdtenenciavehic() {
		return idtenenciavehic;
	}
	/**
	 * @param idtenenciavehic
	 * @uml.property  name="idtenenciavehic"
	 */
	public void setIdtenenciavehic(Long idtenenciavehic) {
		this.idtenenciavehic = idtenenciavehic;
	}
	/**
	 * @return
	 * @uml.property  name="tipo_arrendamiento"
	 */
	@Column(name = "`TIPO_ARRENDAMIENTO`")
	public String getTipo_arrendamiento() {
		return tipo_arrendamiento;
	}
	/**
	 * @param tipo_arrendamiento
	 * @uml.property  name="tipo_arrendamiento"
	 */
	public void setTipo_arrendamiento(String tipo_arrendamiento) {
		this.tipo_arrendamiento = tipo_arrendamiento;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	/**
	 * @return
	 * @uml.property  name="fech_desdearrend"
	 */
	@Column(name = "`FECHADESDE_TENENCIA`")
	public Date getFech_desdearrend() {
		return fech_desdearrend;
	}
	/**
	 * @param fech_desdearrend
	 * @uml.property  name="fech_desdearrend"
	 */
	public void setFech_desdearrend(Date fech_desdearrend) {
		this.fech_desdearrend = fech_desdearrend;
	}
	/**
	 * @return
	 * @uml.property  name="fech_hastaarrend"
	 */
	@Column(name = "`FECHAHASTA_TENENCIA`")
	public Date getFech_hastaarrend() {
		return fech_hastaarrend;
	}
	/**
	 * @param fech_hastaarrend
	 * @uml.property  name="fech_hastaarrend"
	 */
	public void setFech_hastaarrend(Date fech_hastaarrend) {
		this.fech_hastaarrend = fech_hastaarrend;
	}
	public String getAmbito() {
		return ambito;
	}
	public void setAmbito(String ambito) {
		this.ambito = ambito;
	}

}
