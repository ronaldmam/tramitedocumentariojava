package com.maninformatic.tramite.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Temporal;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "usp_S_trTrMoTramByRecibir", 
	procedureName = "usp_S_trTrMoTramByRecibir",
	resultClasses = usp_S_trTrMoTramByRecibir.class , 
	parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "capcod"),
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "usuario_id"),
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "recibido"),
		@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class,name = "supervisor")
	}),
	@NamedStoredProcedureQuery(name = "usp_S_trTrMoTramByTiTramite", 
	procedureName = "usp_S_trTrMoTramByTiTramite",
	resultClasses = usp_S_trTrMoTramByRecibir.class , 
	parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "capcod"),
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "usuario_id"),		
		@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class,name = "tipotramite")
	})
})
public class usp_S_trTrMoTramByRecibir {
	@Id
	private int TramId;
	private int TrMoId;
	private boolean TrMoCopia;
	private String TrMoCAP;
	private String TramArchivo;
	private String TramNumero;
	private Date TramFechaRecepcionOrig;
	private String TramDocRecibido;
	@DateTimeFormat(pattern = "dd.MM.yyyy HH:mm:ss.SSSZ")  
	private Date TramFecha;
	private String TramCodCAP;
	private String TramCodEmisor;
	private String EnExNombre;
	private String TramAsunto;
	private String nombrecom; 
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date TrMoFecha ;
	private int TiTrId;
	private String TiTrAbrevia;
	
	@JsonProperty("TramId")
	public int getTramId() {
		return TramId;
	}
	@JsonProperty("TrMoId")
	public int getTrMoId() {
		return TrMoId;
	}
	@JsonProperty("TrMoCopia")
	public boolean isTrMoCopia() {
		return TrMoCopia;
	}
	@JsonProperty("TrMoCAP")
	public String getTrMoCAP() {
		return TrMoCAP;
	}
	@JsonProperty("TramArchivo")
	public String getTramArchivo() {
		return TramArchivo;
	}
	@JsonProperty("TramNumero")
	public String getTramNumero() {
		return TramNumero;
	}
	@JsonProperty("TramFechaRecepcionOrig")
	public Date getTramFechaRecepcionOrig() {
		return TramFechaRecepcionOrig;
	}
	@JsonProperty("TramDocRecibido")
	public String getTramDocRecibido() {
		return TramDocRecibido;
	}
	@JsonProperty("TramFecha")
	public Date getTramFecha() {
		return TramFecha;
	}
	@JsonProperty("TramCodCAP")
	public String getTramCodCAP() {
		return TramCodCAP;
	}
	@JsonProperty("TramCodEmisor")
	public String getTramCodEmisor() {
		return TramCodEmisor;
	}
	@JsonProperty("EnExNombre")
	public String getEnExNombre() {
		return EnExNombre;
	}
	@JsonProperty("TramAsunto")
	public String getTramAsunto() {
		return TramAsunto;
	}
	@JsonProperty("nombrecom")
	public String getNombrecom() {
		return nombrecom;
	}
	@JsonProperty("TrMoFecha")
	public Date getTrMoFecha() {
		return TrMoFecha;
	}
	@JsonProperty("TiTrId")
	public int getTiTrId() {
		return TiTrId;
	}
	@JsonProperty("TiTrAbrevia")
	public String getTiTrAbrevia() {
		return TiTrAbrevia;
	}
	

}
