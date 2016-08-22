package com.maninformatic.tramite.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "usp_S_peRhppersoByarea", 
	procedureName = "usp_S_peRhppersoByarea",
	resultClasses = usp_S_peRhppersoByarea.class , 
	parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class)
	}),
	@NamedStoredProcedureQuery(name = "usp_S_peRhpperso", 
	procedureName = "usp_S_peRhpperso",
	resultClasses = usp_S_peRhppersoByarea.class /*, 
	parameters = {
		@StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, type = void.class)
	}*/)
})
public class usp_S_peRhppersoByarea {
	
	private int Id;
	@Id	
	private String id_persona;
	private String sigla;
	private String id_zona;
	private String apellidopa;
	private String apellidoma;
	private String nombres;
	private String nombrecom;
	private Date fechacese;
	private String  id_regimen;
	private String id_cap;
	private String cap_per;
	private String anomes;
	private String nombre;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getId_persona() {
		return id_persona;
	}
	public void setId_persona(String id_persona) {
		this.id_persona = id_persona;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getId_zona() {
		return id_zona;
	}
	public void setId_zona(String id_zona) {
		this.id_zona = id_zona;
	}
	public String getApellidopa() {
		return apellidopa;
	}
	public void setApellidopa(String apellidopa) {
		this.apellidopa = apellidopa;
	}
	public String getApellidoma() {
		return apellidoma;
	}
	public void setApellidoma(String apellidoma) {
		this.apellidoma = apellidoma;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getNombrecom() {
		return nombrecom;
	}
	public void setNombrecom(String nombrecom) {
		this.nombrecom = nombrecom;
	}
	public Date getFechacese() {
		return fechacese;
	}
	public void setFechacese(Date fechacese) {
		this.fechacese = fechacese;
	}
	public String getId_regimen() {
		return id_regimen;
	}
	public void setId_regimen(String id_regimen) {
		this.id_regimen = id_regimen;
	}
	public String getId_cap() {
		return id_cap;
	}
	public void setId_cap(String id_cap) {
		this.id_cap = id_cap;
	}
	public String getCap_per() {
		return cap_per;
	}
	public void setCap_per(String cap_per) {
		this.cap_per = cap_per;
	}
	public String getAnomes() {
		return anomes;
	}
	public void setAnomes(String anomes) {
		this.anomes = anomes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
