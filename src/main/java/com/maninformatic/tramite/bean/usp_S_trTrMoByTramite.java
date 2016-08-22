package com.maninformatic.tramite.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@NamedStoredProcedureQuery(name = "usp_S_trTrMoByTramite", 
procedureName = "usp_S_trTrMoByTramite",
resultClasses = usp_S_trTrMoByTramite.class , 
parameters = {
	@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class)
})
public class usp_S_trTrMoByTramite {
	@Id 
	private int TramId;
	
	 private int TrMoId;
	 private String TrMoAmbito;
	 private Date TrMoFecha;
	 private String TiTrAbrevia;
	 private String TrMoCAP;
	 private String TrMoPersoIn;
	 private String nombrecom;
	 private Integer TrMoPersoEx;
	 private String EnExNombre;
	 private String TrMoPersoZon;
	 private Integer TiAcId1;
	 private Integer TiAcId2;
	 private Integer TiAcId3;
	 private String TrMoObserva;
	 private boolean TrMoRecepciono;
	 private boolean TrMoDerivo;
	 private int TiTrId;
	 private Integer TrMoTraTramite;
	 private String TrMoPersonLog;
	 private String nombreUsu;
	 
	@JsonProperty("TramId")
	public int getTramId() {
		return TramId;
	}
	
	@JsonProperty("TrMoId")
	public int getTrMoId() {
		return TrMoId;
	}
	@JsonProperty("TrMoAmbito")
	public String getTrMoAmbito() {
		return TrMoAmbito;
	}
	@JsonProperty("TrMoFecha")
	public Date getTrMoFecha() {
		return TrMoFecha;
	}
	@JsonProperty("TiTrAbrevia")
	public String getTiTrAbrevia() {
		return TiTrAbrevia;
	}
	@JsonProperty("TrMoCAP")
	public String getTrMoCAP() {
		return TrMoCAP;
	}
	@JsonProperty("TrMoPersoIn")
	public String getTrMoPersoIn() {
		return TrMoPersoIn;
	}
	@JsonProperty("nombrecom")
	public String getNombrecom() {
		return nombrecom;
	}
	@JsonProperty("TrMoPersoEx")
	public Integer getTrMoPersoEx() {
		return TrMoPersoEx;
	}
	@JsonProperty("EnExNombre")
	public String getEnExNombre() {
		return EnExNombre;
	}
	@JsonProperty("TrMoPersoZon")
	public String getTrMoPersoZon() {
		return TrMoPersoZon;
	}
	@JsonProperty("TiAcId1")
	public Integer getTiAcId1() {
		return (Integer)TiAcId1;
	}
	@JsonProperty("TiAcId2")
	public Integer getTiAcId2() {
		
		return TiAcId2;
	}
	@JsonProperty("TiAcId3")
	public Integer getTiAcId3() {
		return TiAcId3;
	}
	@JsonProperty("TrMoObserva")
	public String getTrMoObserva() {
		return TrMoObserva;
	}
	@JsonProperty("TrMoRecepciono")
	public boolean isTrMoRecepciono() {
		return TrMoRecepciono;
	}
	@JsonProperty("TrMoDerivo")
	public boolean isTrMoDerivo() {
		return TrMoDerivo;
	}
	@JsonProperty("TiTrId")
	public int getTiTrId() {
		return TiTrId;
	}
	@JsonProperty("TrMoTraTramite")
	public Integer getTrMoTraTramite() {
		return TrMoTraTramite;
	}
	@JsonProperty("TrMoPersonLog")
	public String getTrMoPersonLog() {
		return TrMoPersonLog;
	}
	@JsonProperty("nombreUsu")
	public String getNombreUsu() {
		return nombreUsu;
	}
	

}
