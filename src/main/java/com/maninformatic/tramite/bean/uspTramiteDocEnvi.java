package com.maninformatic.tramite.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@NamedStoredProcedureQueries({
	
	@NamedStoredProcedureQuery(name = "usp_S_trTramiteDocEnvi", 
	procedureName = "usp_S_trTramiteDocEnvi",
	resultClasses = uspTramiteDocEnvi.class , 
	parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class)
	}),
	@NamedStoredProcedureQuery(name = "usp_S_trTramiteDocEnviados", 
	procedureName = "usp_S_trTramiteDocEnviados",
	resultClasses = uspTramiteDocEnvi.class , 
	parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class)
	})
})
public class uspTramiteDocEnvi {
	
	@Id
	private int id;
	
	//@JsonProperty("TramAsunto")//Esto es para que aparezca el nombre del campo tal como se indica en JSON, respetando las mayusculas al inicio
	private String TramAsunto;	
	private String TramNumero;	
	private Date TramFecha;	
	private String TramCodCAP;	
	private String TramSiglaCAP;	
	private String TramCodEmisor;		
	private String TiDocNombre;	
	private String TiDocAbrevia;	
	private String EnExRUC;	
	private String EnExDNI;
	private String EnExNombre;
	private boolean TramEnviado;	
	private String nombreCom;
	
	@JsonProperty("Id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@JsonProperty("TramAsunto")
	public String getTramAsunto() {
		return TramAsunto;
	}
	
	public void setTramAsunto(String tramAsunto) {
		TramAsunto = tramAsunto;
	}
	@JsonProperty("TramNumero")
	public String getTramNumero() {
		return TramNumero;
	}
	public void setTramNumero(String tramNumero) {
		TramNumero = tramNumero;
	}
	@JsonProperty("TramFecha")
	public Date getTramFecha() {
		return TramFecha;
	}
	public void setTramFecha(Date tramFecha) {
		TramFecha = tramFecha;
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
	@JsonProperty("TiDocNombre")
	public String getTiDocNombre() {
		return TiDocNombre;
	}
	public void setTiDocNombre(String tiDocNombre) {
		TiDocNombre = tiDocNombre;
	}
	@JsonProperty("TiDocAbrevia")
	public String getTiDocAbrevia() {
		return TiDocAbrevia;
	}
	public void setTiDocAbrevia(String tiDocAbrevia) {
		TiDocAbrevia = tiDocAbrevia;
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
	@JsonProperty("TramEnviado")
	public boolean isTramEnviado() {
		return TramEnviado;
	}
	public void setTramEnviado(boolean tramEnviado) {
		TramEnviado = tramEnviado;
	}
	@JsonProperty("nombrecom")
	public String getNombreCom() {
		return nombreCom;
	}
	public void setNombreCom(String nombrecom) {
		this.nombreCom = nombrecom;
	}
	
	

}
