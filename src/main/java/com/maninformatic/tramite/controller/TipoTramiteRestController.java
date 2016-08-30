package com.maninformatic.tramite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maninformatic.tramite.RestException;
import com.maninformatic.tramite.bean.TipoTramite;
import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.service.ITramiteService;

@RestController
@RequestMapping("/rest")
public class TipoTramiteRestController {
	@Autowired
	ITramiteService tramiteService;
	
	@RequestMapping(value = "/tipotramite", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TipoTramite> list() {
		return tramiteService.GetAllTipoTramite();
	}
	
	@RequestMapping(value="/tipotramite/{id}", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public TipoTramite get(@PathVariable("id") int id) {
		TipoTramite tipoTramite=tramiteService.GetTipoTramiteById(id);
		if(tipoTramite==null)
		{
			throw new RestException(1,"TipoTramite no enccontrado"," tipoTramite con id:"+ id + " No encontrado en el sistema");
		}
		return tipoTramite;
	}
}
