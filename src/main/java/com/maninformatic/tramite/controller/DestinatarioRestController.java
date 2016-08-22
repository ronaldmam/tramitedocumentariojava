package com.maninformatic.tramite.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maninformatic.tramite.RestException;
import com.maninformatic.tramite.bean.Destinatario;
import com.maninformatic.tramite.bean.Personal;
import com.maninformatic.tramite.bean.TipoAccion;
import com.maninformatic.tramite.bean.TipoTramite;
import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.bean.usp_S_trDestinatarioListado;
import com.maninformatic.tramite.service.IPersonaService;
import com.maninformatic.tramite.service.ITramiteService;


@RestController
@RequestMapping("/rest")
public class DestinatarioRestController {
	@Autowired
	IPersonaService personaService;
	
	@RequestMapping(value="/destinatario/new", method=RequestMethod.GET)
	public Destinatario NewDestinatario(){
		return new Destinatario();
	}
	@RequestMapping(value = "/destinatario/save", method=RequestMethod.POST) //headers = { "Content-Type=application/json", "Access-Control-Allow-Origin=*","Access-Control-Allow-Methods= POST, GET, OPTIONS","Access-Control-Allow-Headers=X-Requested-With" },
	@ResponseBody
	public ResponseEntity<Destinatario> save(@Valid @RequestBody Destinatario destinatario) {
		personaService.SaveDestinatario(destinatario);
		return new ResponseEntity<Destinatario>(destinatario, HttpStatus.OK);
	}
	@RequestMapping(value="/destinatario/delete/{id}", method=RequestMethod.POST)
	public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
		personaService.DeleteDestinatario(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
	@RequestMapping(value="/destinatario/getalldestinatariobytram", params = { "tramid"},method=RequestMethod.GET)
	public List<usp_S_trDestinatarioListado> GetAllDestinatariosByTram(@RequestParam("tramid") int tramId) {
		List<usp_S_trDestinatarioListado> personal=personaService.GetAllDestinatariosByTram(tramId);
		if(personal==null)
		{
			throw new RestException(1,"Personal no enccontrado"," Personal con id_usuario:"+ tramId + " No encontrado en el sistema");
		}
		return personal;
	}
	@RequestMapping(method = RequestMethod.OPTIONS)
    public ResponseEntity handle() {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
