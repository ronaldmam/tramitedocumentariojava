package com.maninformatic.tramite.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Destinatario implements Serializable  {
	@Id 
	@GeneratedValue
	private int Id;
	 private int TramId=0;
	 private String DestAmbito;
	 private String DestZona;
	 private String DestPersoInterno;
	 private Integer EnExId=0;
	 private String DestCap;
	 private String DestSigla;
	 private String DestObserva;
	 private boolean DestCopia;
	 private String DestAnomes;
	 private String DestNoTramita;
	 
	 @JsonProperty("Id")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	//@JsonProperty("TramId")
	public Integer getTramId() {
		return TramId;
	}
	public void setTramId(Integer tramId) {
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
	public Integer getEnExId() {
		return EnExId;
	}
	public void setEnExId(Integer enExId) {
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

}
