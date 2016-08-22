package com.maninformatic.tramite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maninformatic.tramite.RestException;
import com.maninformatic.tramite.bean.TipoAccion;
import com.maninformatic.tramite.bean.TipoTramite;
import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.service.ITramiteService;

@RestController
@RequestMapping("/rest")
public class TipoAccionRestController {
	@Autowired
	ITramiteService tramiteService;
	
	@RequestMapping(value = "/tipoaccion", method=RequestMethod.GET)
	public List<TipoAccion> list() {
		return tramiteService.GetAllTipoAccion();
	}
	
	@RequestMapping(value="/tipoaccion/{id}", method=RequestMethod.GET)
	public TipoAccion get(@PathVariable("id") int id) {
		TipoAccion tipoAccion=tramiteService.GetTipoAccionById(id);
		if(tipoAccion==null)
		{
			throw new RestException(1,"TipoAccion no enccontrado"," tipoAccion con id:"+ id + " No encontrado en el sistema");
		}
		return tipoAccion;
	}
}
