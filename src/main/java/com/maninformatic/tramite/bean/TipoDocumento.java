package com.maninformatic.tramite.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class TipoDocumento  implements Serializable {
	@Id
	@GeneratedValue
	private int Id;
    private String TiDocNombre;
    private String TiDocAbrevia;
     
    @JsonProperty("Id")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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

}
