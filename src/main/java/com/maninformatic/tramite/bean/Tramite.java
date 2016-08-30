package com.maninformatic.tramite.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
//@JsonInclude(Include.NON_NULL) 
//@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "usp_I_trTramiteMov_Envio", 
	procedureName = "usp_I_trTramiteMov_Envio",
	resultClasses = Integer.class , 
	parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class,name = "tramId"),
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "zona_id"),
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "PersonLog")
	})
})

public class Tramite implements Serializable  {

//private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int Id;
	private String TramAsunto;
	
	//@DateTimeFormat(pattern = "dd.MM.yyyy HH:mm:ss.SSSZ")  
	private Date TramFecha;
	private String TramNumero;
	private int TiDoId;
	private String TramCodCAP;
	private String TramSiglaCAP;
	private String TramCodEmisor;
	
	
	private Integer EnExId=0;
	
	private Boolean TramEnviado;
	private String TramObserva;
	private String TramDocRefere;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date TramFechaDoc;
	
	@Column(name="TramArchivo")
	private String TramArchivo;
	
	
	@Column(name = "TramArchivoPub")
	private Boolean TramArchivoPub=true;
	private Date TramFechaRegistroDoc;
	private String TramDocRecibido;
	private Date TramFechaRecepcionOrig;
	private Date TramFechaRespuesta;
	@Column(name="TramNotificar")
	private Boolean TramNotificar;
	
	@JsonProperty("Id")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@JsonProperty("TramAsunto")
	public String getTramAsunto() {
		return TramAsunto;
	}
	
	public void setTramAsunto(String tramAsunto) {
		TramAsunto = tramAsunto;
	}
	
	@JsonProperty("TramFecha")
	public Date getTramFecha() {
		return TramFecha;
	}
	public void setTramFecha(Date tramFecha) {
		TramFecha = tramFecha;
	}
	@JsonProperty("TramNumero")
	public String getTramNumero() {
		return TramNumero;
	}
	public void setTramNumero(String tramNumero) {
		TramNumero = tramNumero;
	}
	@JsonProperty("TiDoId")
	public int getTiDoId() {
		return TiDoId;
	}
	public void setTiDoId(int tiDoId) {
		TiDoId = tiDoId;
	}
	@JsonProperty("TramCodCAP")
	public String getTramCodCAP() {
		return TramCodCAP;
	}
	public void setTramCodCAP(String tramCodCAP) {
		TramCodCAP = tramCodCAP;
	}
	@JsonProperty("TramSiglaCAP")
	public String getTramSiglaCAP() {
		return TramSiglaCAP;
	}
	public void setTramSiglaCAP(String tramSiglaCAP) {
		TramSiglaCAP = tramSiglaCAP;
	}
	@JsonProperty("TramCodEmisor")
	public String getTramCodEmisor() {
		return TramCodEmisor;
	}
	public void setTramCodEmisor(String tramCodEmisor) {
		TramCodEmisor = tramCodEmisor;
	}
	@JsonProperty("EnExId")
	public Integer getEnExId() {
		return EnExId;
	}
	
	public void setEnExId(Integer enExId) {
		EnExId = enExId;
	}
	@JsonProperty("TramEnviado")
	public boolean isTramEnviado() {
		return TramEnviado;
	}
	public void setTramEnviado(boolean tramEnviado) {
		TramEnviado = tramEnviado;
	}
	@JsonProperty("TramObserva")
	public String getTramObserva() {
		return TramObserva;
	}
	public void setTramObserva(String tramObserva) {
		TramObserva = tramObserva;
	}
	@JsonProperty("TramDocRefere")
	public String getTramDocRefere() {
		return TramDocRefere;
	}
	public void setTramDocRefere(String tramDocRefere) {
		TramDocRefere = tramDocRefere;
	}
	@JsonProperty("TramFechaDoc")
	public Date getTramFechaDoc() {
		return TramFechaDoc;
	}
	public void setTramFechaDoc(Date tramFechaDoc) {
		TramFechaDoc = tramFechaDoc;
	}
	@JsonProperty("TramArchivo")
	public String getTramArchivo() {
		return TramArchivo;
	}
	public void setTramArchivo(String tramArchivo) {
		TramArchivo = tramArchivo;
	}
	@JsonProperty("TramArchivoPub")
	public Boolean isTramArchivoPub() {
		return TramArchivoPub;
	}
	public void setTramArchivoPub(Boolean tramArchivoPub) {
		TramArchivoPub = tramArchivoPub;
	}
	@JsonProperty("TramFechaRegistroDoc")
	public Date getTramFechaRegistroDoc() {
		return TramFechaRegistroDoc;
	}
	public void setTramFechaRegistroDoc(Date tramFechaRegistroDoc) {
		TramFechaRegistroDoc = tramFechaRegistroDoc;
	}
	@JsonProperty("TramDocRecibido")
	public String getTramDocRecibido() {
		return TramDocRecibido;
	}
	public void setTramDocRecibido(String tramDocRecibido) {
		TramDocRecibido = tramDocRecibido;
	}
	@JsonProperty("TramFechaRecepcionOrig")
	public Date getTramFechaRecepcionOrig() {
		return TramFechaRecepcionOrig;
	}
	public void setTramFechaRecepcionOrig(Date tramFechaRecepcionOrig) {
		TramFechaRecepcionOrig = tramFechaRecepcionOrig;
	}
	@JsonProperty("TramFechaRespuesta")
	public Date getTramFechaRespuesta() {
		return TramFechaRespuesta;
	}
	public void setTramFechaRespuesta(Date tramFechaRespuesta) {
		TramFechaRespuesta = tramFechaRespuesta;
	}
	@JsonProperty("TramNotificar")
	public Boolean isTramNotificar() {
		return TramNotificar;
	}
	public void setTramNotificar(Boolean tramNotificar) {
		TramNotificar = tramNotificar;
	}
	
}
