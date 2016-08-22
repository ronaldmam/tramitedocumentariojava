package com.maninformatic.tramite.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class TipoAccion implements Serializable {
	@Id
	@GeneratedValue
	private int Id;
    private String TiAcNombre;
    @JsonProperty("Id")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@JsonProperty("TiAcNombre")
	public String getTiAcNombre() {
		return TiAcNombre;
	}
	public void setTiAcNombre(String tiAcNombre) {
		TiAcNombre = tiAcNombre;
	}
}
