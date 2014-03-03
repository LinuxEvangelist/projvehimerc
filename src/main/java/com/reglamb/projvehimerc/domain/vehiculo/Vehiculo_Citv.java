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
	    sequenceName="sequencevehiculocitv",
	    initialValue= 100 ,
	    allocationSize=20)
@Table(name="`VEHICULO_CITV`")
public class Vehiculo_Citv  implements Serializable,DomainObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="id_citv"
	 */
	private Long id_citv;
	/**
	 * @uml.property  name="num_citv"
	 */
	private Integer num_citv;
	/**
	 * @uml.property  name="fech_expe"
	 */
	private Date fech_inspeccion;

	/**
	 * @return
	 * @uml.property  name="id_citv"
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name = "`IDVEHI_CITV`")
	public Long getId_citv() {
		return id_citv;
	}
	/**
	 * @param id_citv
	 * @uml.property  name="id_citv"
	 */
	public void setId_citv(Long id_citv) {
		this.id_citv = id_citv;
	}
	/**
	 * @return
	 * @uml.property  name="num_citv"
	 */
	@Column(name = "`NUMERO_CITV`")
	public Integer getNum_citv() {
		return num_citv;
	}
	/**
	 * @param num_citv
	 * @uml.property  name="num_citv"
	 */
	public void setNum_citv(Integer num_citv) {
		this.num_citv = num_citv;
	}
	/**
	 * @return
	 * @uml.property  name="fech_inspeccion"
	 */
	@Column(name = "`FECHA_INSPECCION`")
	public Date getFech_inspeccion() {
		return fech_inspeccion;
	}
	/**
	 * @param fech_expe
	 * @uml.property  name="fech_inspeccion"
	 */
	public void setFech_inspeccion(Date fech_inspeccion) {
		this.fech_inspeccion = fech_inspeccion;
	}

}
