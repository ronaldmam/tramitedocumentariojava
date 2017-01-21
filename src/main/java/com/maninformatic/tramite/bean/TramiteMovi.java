package com.maninformatic.tramite.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class TramiteMovi implements Serializable{
	@Id
	@GeneratedValue
	 private int Id; 
	 private int TramId; 
	 private Integer TiDoId=0;
	 private Integer TiTrId ;
	 private String TrMoAmbito ;
	 private String TrMoZona ;
	 private String TrMoCAP ;
	 private String TrMoPersoIn;
	 private Integer TrMoPersoEx=0;
	 private String TrMoPersoZon ;
	 //@Temporal(javax.persistence.TemporalType.DATE)
	 private Date TrMoFecha ;
	 private Integer TiAcId1=0;
	 private Integer TiAcId2=0 ;
	 private Integer TiAcId3=0;
	 private String TrMoObserva="" ;
	 private Boolean TrMoRecepciono=false ;
	 private Boolean TrMoDerivo=false ;
	 private Boolean TrMoArchivo=false ;
	 private Boolean TrMoCopia=false ;
	 private String TrMoPersonLog ;
	 private Integer TrMoTraTramite=0 ;
	 private String TrMoCapZona;
	 //private int Tramite_Id ;
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
	@JsonProperty("TiDoId")
	public Integer getTiDoId() {
		return TiDoId;
	}
	public void setTiDoId(int tiDoId) {
		TiDoId = tiDoId;
	}
	@JsonProperty("TiTrId")
	public Integer getTiTrId() {
		return TiTrId;
	}
	public void setTiTrId(int tiTrId) {
		TiTrId = tiTrId;
	}
	@JsonProperty("TrMoAmbito")
	public String getTrMoAmbito() {
		return TrMoAmbito;
	}
	public void setTrMoAmbito(String trMoAmbito) {
		TrMoAmbito = trMoAmbito;
	}
	@JsonProperty("TrMoZona")
	public String getTrMoZona() {
		return TrMoZona;
	}
	public void setTrMoZona(String trMoZona) {
		TrMoZona = trMoZona;
	}
	@JsonProperty("TrMoCAP")
	public String getTrMoCAP() {
		return TrMoCAP;
	}
	public void setTrMoCAP(String trMoCAP) {
		TrMoCAP = trMoCAP;
	}
	@JsonProperty("TrMoPersoIn")
	public String getTrMoPersoIn() {
		return TrMoPersoIn;
	}
	public void setTrMoPersoIn(String trMoPersoIn) {
		TrMoPersoIn = trMoPersoIn;
	}
	@JsonProperty("TrMoPersoEx")
	public Integer getTrMoPersoEx() {
		return TrMoPersoEx;
	}
	public void setTrMoPersoEx(int trMoPersoEx) {
		TrMoPersoEx = trMoPersoEx;
	}
	@JsonProperty("TrMoPersoZon")
	public String getTrMoPersoZon() {
		return TrMoPersoZon;
	}
	public void setTrMoPersoZon(String trMoPersoZon) {
		TrMoPersoZon = trMoPersoZon;
	}
	@JsonProperty("TrMoFecha")
	public Date getTrMoFecha() {
		return TrMoFecha;
	}
	public void setTrMoFecha(Date trMoFecha) {
		TrMoFecha = trMoFecha;
	}
	@JsonProperty("TiAcId1")
	public Integer getTiAcId1() {
		return TiAcId1;
	}
	public void setTiAcId1(int tiAcId1) {
		TiAcId1 = tiAcId1;
	}
	@JsonProperty("TiAcId2")
	public Integer getTiAcId2() {
		return TiAcId2;
	}
	public void setTiAcId2(int tiAcId2) {
		TiAcId2 = tiAcId2;
	}
	@JsonProperty("TiAcId3")
	public Integer getTiAcId3() {
		return TiAcId3;
	}
	public void setTiAcId3(int tiAcId3) {
		TiAcId3 = tiAcId3;
	}
	@JsonProperty("TrMoObserva")
	public String getTrMoObserva() {
		return TrMoObserva;
	}
	public void setTrMoObserva(String trMoObserva) {
		TrMoObserva = trMoObserva;
	}
	@JsonProperty("TrMoRecepciono")
	public Boolean isTrMoRecepciono() {
		return TrMoRecepciono;
	}
	public void setTrMoRecepciono(Boolean trMoRecepciono) {
		TrMoRecepciono = trMoRecepciono;
	}
	@JsonProperty("TrMoDerivo")
	public Boolean isTrMoDerivo() {
		return TrMoDerivo;
	}
	public void setTrMoDerivo(Boolean trMoDerivo) {
		TrMoDerivo = trMoDerivo;
	}
	@JsonProperty("TrMoArchivo")
	public Boolean isTrMoArchivo() {
		return TrMoArchivo;
	}
	public void setTrMoArchivo(Boolean trMoArchivo) {
		TrMoArchivo = trMoArchivo;
	}
	@JsonProperty("TrMoCopia")
	public Boolean isTrMoCopia() {
		return TrMoCopia;
	}
	public void setTrMoCopia(Boolean trMoCopia) {
		TrMoCopia = trMoCopia;
	}
	@JsonProperty("TrMoPersonLog")
	public String getTrMoPersonLog() {
		return TrMoPersonLog;
	}
	public void setTrMoPersonLog(String trMoPersonLog) {
		TrMoPersonLog = trMoPersonLog;
	}
	@JsonProperty("TrMoTraTramite")
	public Integer getTrMoTraTramite() {
		return TrMoTraTramite;
	}
	public void setTrMoTraTramite(int trMoTraTramite) {
		TrMoTraTramite = trMoTraTramite;
	}
	
	@JsonProperty("TrMoCapZona")
	public String getTrMoCapZona() {
		return TrMoCapZona;
	}
	public void setTrMoCapZona(String TrMoCapZona) {
		TrMoPersonLog = TrMoCapZona;
	}
/*	public int getTramite_Id() {
		return Tramite_Id;
	}
	public void setTramite_Id(int tramite_Id) {
		Tramite_Id = tramite_Id;
	}
*/
}
