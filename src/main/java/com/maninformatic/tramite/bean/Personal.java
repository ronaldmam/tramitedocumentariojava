package com.maninformatic.tramite.bean;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@NamedStoredProcedureQueries({		
	@NamedStoredProcedureQuery(name = "usp_S_peRhppersoByUsuario", 
	procedureName = "usp_S_peRhppersoByUsuario",
	resultClasses = Personal.class , 
	parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class)
	})
})
public class Personal implements Serializable  {

	@Id
	@GeneratedValue
	private int Id;
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
	private String username;
	
	private String password;
	private String userrole;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
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
	public void setId_zona(String id_zon) {
		this.id_zona = id_zon;
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
