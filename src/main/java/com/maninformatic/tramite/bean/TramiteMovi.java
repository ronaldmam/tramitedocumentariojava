package com.maninformatic.tramite.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
@Entity
public class TramiteMovi implements Serializable{
	@Id
	@GeneratedValue
	 private int Id; 
	 private int TramId; 
	 private Integer TiDoId ;
	 private Integer TiTrId ;
	 private String TrMoAmbito ;
	 private String TrMoZona ;
	 private String TrMoCAP ;
	 private String TrMoPersoIn;
	 private Integer TrMoPersoEx;
	 private String TrMoPersoZon ;
	 @Temporal(javax.persistence.TemporalType.DATE)
	 private Date TrMoFecha ;
	 private Integer TiAcId1;
	 private Integer TiAcId2 ;
	 private Integer TiAcId3;
	 private String TrMoObserva ;
	 private boolean TrMoRecepciono ;
	 private boolean TrMoDerivo ;
	 private boolean TrMoArchivo ;
	 private boolean TrMoCopia ;
	 private String TrMoPersonLog ;
	 private Integer TrMoTraTramite ;
	 //private int Tramite_Id ;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getTramId() {
		return TramId;
	}
	public void setTramId(int tramId) {
		TramId = tramId;
	}
	public Integer getTiDoId() {
		return TiDoId;
	}
	public void setTiDoId(int tiDoId) {
		TiDoId = tiDoId;
	}
	public Integer getTiTrId() {
		return TiTrId;
	}
	public void setTiTrId(int tiTrId) {
		TiTrId = tiTrId;
	}
	public String getTrMoAmbito() {
		return TrMoAmbito;
	}
	public void setTrMoAmbito(String trMoAmbito) {
		TrMoAmbito = trMoAmbito;
	}
	public String getTrMoZona() {
		return TrMoZona;
	}
	public void setTrMoZona(String trMoZona) {
		TrMoZona = trMoZona;
	}
	public String getTrMoCAP() {
		return TrMoCAP;
	}
	public void setTrMoCAP(String trMoCAP) {
		TrMoCAP = trMoCAP;
	}
	public String getTrMoPersoIn() {
		return TrMoPersoIn;
	}
	public void setTrMoPersoIn(String trMoPersoIn) {
		TrMoPersoIn = trMoPersoIn;
	}
	public Integer getTrMoPersoEx() {
		return TrMoPersoEx;
	}
	public void setTrMoPersoEx(int trMoPersoEx) {
		TrMoPersoEx = trMoPersoEx;
	}
	public String getTrMoPersoZon() {
		return TrMoPersoZon;
	}
	public void setTrMoPersoZon(String trMoPersoZon) {
		TrMoPersoZon = trMoPersoZon;
	}
	public Date getTrMoFecha() {
		return TrMoFecha;
	}
	public void setTrMoFecha(Date trMoFecha) {
		TrMoFecha = trMoFecha;
	}
	public Integer getTiAcId1() {
		return TiAcId1;
	}
	public void setTiAcId1(int tiAcId1) {
		TiAcId1 = tiAcId1;
	}
	public Integer getTiAcId2() {
		return TiAcId2;
	}
	public void setTiAcId2(int tiAcId2) {
		TiAcId2 = tiAcId2;
	}
	public Integer getTiAcId3() {
		return TiAcId3;
	}
	public void setTiAcId3(int tiAcId3) {
		TiAcId3 = tiAcId3;
	}
	public String getTrMoObserva() {
		return TrMoObserva;
	}
	public void setTrMoObserva(String trMoObserva) {
		TrMoObserva = trMoObserva;
	}
	public boolean isTrMoRecepciono() {
		return TrMoRecepciono;
	}
	public void setTrMoRecepciono(boolean trMoRecepciono) {
		TrMoRecepciono = trMoRecepciono;
	}
	public boolean isTrMoDerivo() {
		return TrMoDerivo;
	}
	public void setTrMoDerivo(boolean trMoDerivo) {
		TrMoDerivo = trMoDerivo;
	}
	public boolean isTrMoArchivo() {
		return TrMoArchivo;
	}
	public void setTrMoArchivo(boolean trMoArchivo) {
		TrMoArchivo = trMoArchivo;
	}
	public boolean isTrMoCopia() {
		return TrMoCopia;
	}
	public void setTrMoCopia(boolean trMoCopia) {
		TrMoCopia = trMoCopia;
	}
	public String getTrMoPersonLog() {
		return TrMoPersonLog;
	}
	public void setTrMoPersonLog(String trMoPersonLog) {
		TrMoPersonLog = trMoPersonLog;
	}
	public Integer getTrMoTraTramite() {
		return TrMoTraTramite;
	}
	public void setTrMoTraTramite(int trMoTraTramite) {
		TrMoTraTramite = trMoTraTramite;
	}
/*	public int getTramite_Id() {
		return Tramite_Id;
	}
	public void setTramite_Id(int tramite_Id) {
		Tramite_Id = tramite_Id;
	}
*/
}
