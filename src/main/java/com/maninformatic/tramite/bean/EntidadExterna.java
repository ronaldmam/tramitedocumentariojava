package com.maninformatic.tramite.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class EntidadExterna implements Serializable {
	@Id
	private int Id;
	private String EnExRUC;
	private String EnExDNI;
	private String EnExNombre;
	private String EnExLugar;
	private String EnExDireccion;
	private String EnExTelefono;
	private String EnExFax;
	private String EnExEmail;
	
	@JsonProperty("Id")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@JsonProperty("EnExRUC")
	public String getEnExRUC() {
		return EnExRUC;
	}
	public void setEnExRUC(String enExRUC) {
		EnExRUC = enExRUC;
	}
	@JsonProperty("EnExDNI")
	public String getEnExDNI() {
		return EnExDNI;
	}
	public void setEnExDNI(String enExDNI) {
		EnExDNI = enExDNI;
	}
	@JsonProperty("EnExNombre")
	public String getEnExNombre() {
		return EnExNombre;
	}
	public void setEnExNombre(String enExNombre) {
		EnExNombre = enExNombre;
	}
	@JsonProperty("EnExLugar")
	public String getEnExLugar() {
		return EnExLugar;
	}
	public void setEnExLugar(String enExLugar) {
		EnExLugar = enExLugar;
	}
	@JsonProperty("EnExDireccion")
	public String getEnExDireccion() {
		return EnExDireccion;
	}
	public void setEnExDireccion(String enExDireccion) {
		EnExDireccion = enExDireccion;
	}
	@JsonProperty("EnExTelefono")
	public String getEnExTelefono() {
		return EnExTelefono;
	}
	public void setEnExTelefono(String enExTelefono) {
		EnExTelefono = enExTelefono;
	}
	@JsonProperty("EnExFax")
	public String getEnExFax() {
		return EnExFax;
	}
	public void setEnExFax(String enExFax) {
		EnExFax = enExFax;
	}
	@JsonProperty("EnExEmail")
	public String getEnExEmail() {
		return EnExEmail;
	}
	public void setEnExEmail(String enExEmail) {
		EnExEmail = enExEmail;
	}
}
