package com.maninformatic.tramite.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class TipoTramite implements Serializable  {
	@Id
	@GeneratedValue
	private int Id;
    private String TiTrNombre;
    private String TiTrAbrevia;
    
    @JsonProperty("Id")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@JsonProperty("TiTrNombre")
	public String getTiTrNombre() {
		return TiTrNombre;
	}
	public void setTiTrNombre(String tiTrNombre) {
		TiTrNombre = tiTrNombre;
	}
	@JsonProperty("TiTrAbrevia")
	public String getTiTrAbrevia() {
		return TiTrAbrevia;
	}
	public void setTiTrAbrevia(String tiTrAbrevia) {
		TiTrAbrevia = tiTrAbrevia;
	}
}
