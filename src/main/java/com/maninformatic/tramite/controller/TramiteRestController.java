package com.maninformatic.tramite.controller;

import java.util.List;







import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;











import com.maninformatic.tramite.RestException;
import com.maninformatic.tramite.bean.TipoTramite;
import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.bean.uspTramiteDocEnvi;
import com.maninformatic.tramite.service.ITramiteService;

@RestController
@RequestMapping("/rest")
public class TramiteRestController {
	@Autowired
	ITramiteService tramiteService;
	
	@RequestMapping(value = "/tramites", method=RequestMethod.GET)
	public List<Tramite> list() {
		return tramiteService.findAll();
	}
	
	@RequestMapping(value="/tramites/{id}", method=RequestMethod.GET)
	public Tramite get(@PathVariable("id") int id) {
		Tramite tramite=tramiteService.findOne(id);
		if(tramite==null)
		{
			throw new RestException(1,"Tramite no enccontrado"," Tramite con id:"+ id + " No encontrado en el sistema");
		}
		return tramiteService.findOne(id);
	}
	@RequestMapping(value="/tramites/new", method=RequestMethod.GET)
	public Tramite NewTramite(){
		return new Tramite();
	}
	@RequestMapping(value = "/tramites/save", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Tramite> save(@Valid @RequestBody Tramite tramite) {
		tramiteService.Save(tramite);
		return new ResponseEntity<Tramite>(tramite, HttpStatus.OK);
	}
	
	@RequestMapping(value="/tramites/delete/{id}", method=RequestMethod.POST)
	public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
		tramiteService.Delete(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
	@RequestMapping(value = "/tramites/enviartramite",params = { "tramiteid", "zonaid","usuarioLog"}, method=RequestMethod.GET)
	public ResponseEntity<Boolean> EnviarTramite(@RequestParam("tramiteid") int tramiteid, @RequestParam("zonaid") String zonaid,@RequestParam("usuarioLog") String usuarioLog){
		tramiteService.EnviarTramite(tramiteid, zonaid, usuarioLog);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/tramites/getalltramitesenv/{id_cap}", method=RequestMethod.GET)
	public List<uspTramiteDocEnvi> GetAllTramitesEnv(@PathVariable("id_cap") String id_cap) {
		return tramiteService.GetAllTramitesEnv(id_cap);
	}
	@RequestMapping(value = "/tramites/getalltramitesenviado",params = { "id_cap"}, method=RequestMethod.GET)
	public List<uspTramiteDocEnvi> GetAllTramitesEnviado(@RequestParam("id_cap") String id_cap) {
		return tramiteService.GetAllTramitesEnviado(id_cap);
	}
	

}
