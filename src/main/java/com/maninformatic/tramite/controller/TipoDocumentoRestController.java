package com.maninformatic.tramite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maninformatic.tramite.RestException;
import com.maninformatic.tramite.bean.TipoAccion;
import com.maninformatic.tramite.bean.TipoDocumento;
import com.maninformatic.tramite.bean.TipoTramite;
import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.service.ITramiteService;

@RestController
@RequestMapping("/rest")
public class TipoDocumentoRestController {
	@Autowired
	ITramiteService tramiteService;
	
	@RequestMapping(value = "/tipodocumento", method=RequestMethod.GET)
	public List<TipoDocumento> list() {
		return tramiteService.GetAllTipoDocumento();
	}
	
	@RequestMapping(value="/tipodocumento/{id}", method=RequestMethod.GET)
	public TipoDocumento get(@PathVariable("id") int id) {
		TipoDocumento tipoDocumento=tramiteService.GetTipoDocumentoById(id);
		if(tipoDocumento==null)
		{
			throw new RestException(1,"TipoDocumento no enccontrado"," tipoDocumento con id:"+ id + " No encontrado en el sistema");
		}
		return tipoDocumento;
	}
}
