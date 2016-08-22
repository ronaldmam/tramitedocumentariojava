package com.maninformatic.tramite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maninformatic.tramite.RestException;
import com.maninformatic.tramite.bean.EntidadExterna;
import com.maninformatic.tramite.bean.TipoAccion;
import com.maninformatic.tramite.bean.TipoTramite;
import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.service.IPersonaService;
import com.maninformatic.tramite.service.ITramiteService;

@RestController
@RequestMapping("/rest")
public class EntidadExternaRestController {
	@Autowired
	IPersonaService personaService;
	
	@RequestMapping(value = "/entidadexterna", method=RequestMethod.GET)
	public List<EntidadExterna> list() {
		return personaService.GetAllEntidadExterna();
	}
	
	@RequestMapping(value="/entidadexterna/{id}", method=RequestMethod.GET)
	public EntidadExterna get(@PathVariable("id") int id) {
		EntidadExterna entidadExterna=personaService.GetEntidadExternaById(id);
		if(entidadExterna==null)
		{
			throw new RestException(1,"EntidadExterna no enccontrado"," entidadExterna con id:"+ id + " No encontrado en el sistema");
		}
		return entidadExterna;
	}
}
