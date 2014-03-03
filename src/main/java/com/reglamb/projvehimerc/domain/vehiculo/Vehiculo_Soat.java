package com.reglamb.projvehimerc.domain.vehiculo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
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
	    sequenceName="sequencevehiculosoat",
	    initialValue= 100 ,
	    allocationSize=20)
@Table(name ="`VEHICULO_SOAT`")
public class Vehiculo_Soat  implements Serializable,DomainObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="id_soat"
	 */
	private Long id_soat;
	/**
	 * @uml.property  name="num_poliza"
	 */
	private Integer num_poliza;
	/**
	 * @uml.property  name="num_expediente"
	 */
	private Integer num_expediente;
	/**
	 * @uml.property  name="fech_expe"
	 */
	private Date fech_expe;
	/**
	 * @uml.property  name="fech_vigentedesde"
	 */
	private Date fech_vigentedesde;
	/**
	 * @uml.property  name="fech_vigentehasta"
	 */
	private Date fech_vigentehasta;
	/**
	 * @uml.property  name="empresaaseg"
	 */
	private String empresaaseg;
	/**
	 * @return
	 * @uml.property  name="id_soat"
	 */
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@GeneratedValue
	@Column(name = "`IDVEHI_SOAT`")
	public Long getId_soat() {
		return id_soat;
	}
	/**
	 * @param id_soat
	 * @uml.property  name="id_soat"
	 */
	public void setId_soat(Long id_soat) {
		this.id_soat = id_soat;
	}
	/**
	 * @return
	 * @uml.property  name="num_poliza"
	 */
	@Column(name = "`NUM_POLIZA`")
	public Integer getNum_poliza() {
		return num_poliza;
	}
	/**
	 * @param num_poliza
	 * @uml.property  name="num_poliza"
	 */
	public void setNum_poliza(Integer num_poliza) {
		this.num_poliza = num_poliza;
	}
	/**
	 * @return
	 * @uml.property  name="num_expediente"
	 */
	@Column(name = "`NUMERO_EXPEDIENTE`")
	public Integer getNum_expediente() {
		return num_expediente;
	}
	/**
	 * @param num_expediente
	 * @uml.property  name="num_expediente"
	 */
	public void setNum_expediente(Integer num_expediente) {
		this.num_expediente = num_expediente;
	}
	/**
	 * @return
	 * @uml.property  name="fech_expe"
	 */
	@Column(name = "`FECHA_EXPEDIENTE`")
	public Date getFech_expe() {
		return fech_expe;
	}
	/**
	 * @param fech_expe
	 * @uml.property  name="fech_expe"
	 */
	public void setFech_expe(Date fech_expe) {
		this.fech_expe = fech_expe;
	}
	/**
	 * @return
	 * @uml.property  name="fech_vigentedesde"
	 */
	@Column(name = "`FECHA_VIGENTEDESDE`")
	public Date getFech_vigentedesde() {
		return fech_vigentedesde;
	}
	/**
	 * @param fech_vigentedesde
	 * @uml.property  name="fech_vigentedesde"
	 */
	public void setFech_vigentedesde(Date fech_vigentedesde) {
		this.fech_vigentedesde = fech_vigentedesde;
	}
	/**
	 * @return
	 * @uml.property  name="fech_vigentehasta"
	 */
	@Column(name = "`FECHA_VIGENTEHASTA`")
	public Date getFech_vigentehasta() {
		return fech_vigentehasta;
	}
	/**
	 * @param fech_vigentehasta
	 * @uml.property  name="fech_vigentehasta"
	 */
	public void setFech_vigentehasta(Date fech_vigentehasta) {
		this.fech_vigentehasta = fech_vigentehasta;
	}
	/**
	 * @return
	 * @uml.property  name="empresaaseg"
	 */
	@Column(name = "`EMPRESAASEGURADORA`")
	public String getEmpresaaseg() {
		return empresaaseg;
	}
	/**
	 * @param empresaaseg
	 * @uml.property  name="empresaaseg"
	 */
	public void setEmpresaaseg(String empresaaseg) {
		this.empresaaseg = empresaaseg;
	}
}
