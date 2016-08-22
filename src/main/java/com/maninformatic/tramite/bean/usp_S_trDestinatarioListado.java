package com.maninformatic.tramite.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@NamedStoredProcedureQuery(name = "usp_S_trDestinatarioListado", 
procedureName = "usp_S_trDestinatarioListado",
resultClasses = usp_S_trDestinatarioListado.class , 
parameters = {
	@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class)
})
public class usp_S_trDestinatarioListado {
	@Id 
	private int Id;
	private int TramId;
	private String DestAmbito;
	private String DestZona;
	private String DestPersoInterno;
	private int EnExId;
	private String DestCap;
	private String DestSigla;
	private String DestObserva;
	private boolean DestCopia;
	private String DestAnomes;
	private String DestNoTramita;
	private String id_persona;
	private String nombrecom;
	private String id_cap;
	private String id_zona;
	private Date fechacese;
	private String EnExRUC;
	private String EnExDNI;
	private String EnExNombre;
	private String nombre;
	private String sigla;
	@JsonProperty("Id")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@JsonProperty("TramId")
	public int getTramId() {
		return TramId;
	}
	public void setTramId(int tramId) {
		TramId = tramId;
	}
	@JsonProperty("DestAmbito")
	public String getDestAmbito() {
		return DestAmbito;
	}
	public void setDestAmbito(String destAmbito) {
		DestAmbito = destAmbito;
	}
	@JsonProperty("DestZona")
	public String getDestZona() {
		return DestZona;
	}
	public void setDestZona(String destZona) {
		DestZona = destZona;
	}
	@JsonProperty("DestPersoInterno")
	public String getDestPersoInterno() {
		return DestPersoInterno;
	}
	public void setDestPersoInterno(String destPersoInterno) {
		DestPersoInterno = destPersoInterno;
	}
	@JsonProperty("EnExId")
	public int getEnExId() {
		return EnExId;
	}
	public void setEnExId(int enExId) {
		EnExId = enExId;
	}
	@JsonProperty("DestCap")
	public String getDestCap() {
		return DestCap;
	}
	public void setDestCap(String destCap) {
		DestCap = destCap;
	}
	@JsonProperty("DestSigla")
	public String getDestSigla() {
		return DestSigla;
	}
	public void setDestSigla(String destSigla) {
		DestSigla = destSigla;
	}
	@JsonProperty("DestObserva")
	public String getDestObserva() {
		return DestObserva;
	}
	public void setDestObserva(String destObserva) {
		DestObserva = destObserva;
	}
	@JsonProperty("DestCopia")
	public boolean isDestCopia() {
		return DestCopia;
	}
	public void setDestCopia(boolean destCopia) {
		DestCopia = destCopia;
	}
	@JsonProperty("DestAnomes")
	public String getDestAnomes() {
		return DestAnomes;
	}
	public void setDestAnomes(String destAnomes) {
		DestAnomes = destAnomes;
	}
	@JsonProperty("DestNoTramita")
	public String getDestNoTramita() {
		return DestNoTramita;
	}
	public void setDestNoTramita(String destNoTramita) {
		DestNoTramita = destNoTramita;
	}
	public String getId_persona() {
		return id_persona;
	}
	public void setId_persona(String id_persona) {
		this.id_persona = id_persona;
	}
	public String getNombrecom() {
		return nombrecom;
	}
	public void setNombrecom(String nombrecom) {
		this.nombrecom = nombrecom;
	}
	public String getId_cap() {
		return id_cap;
	}
	public void setId_cap(String id_cap) {
		this.id_cap = id_cap;
	}
	public String getId_zona() {
		return id_zona;
	}
	public void setId_zona(String id_zona) {
		this.id_zona = id_zona;
	}
	public Date getFechacese() {
		return fechacese;
	}
	public void setFechacese(Date fechacese) {
		this.fechacese = fechacese;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
