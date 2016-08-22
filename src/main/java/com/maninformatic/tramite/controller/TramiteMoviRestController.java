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
import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.bean.TramiteMovi;
import com.maninformatic.tramite.bean.usp_S_trTrMoByTramite;
import com.maninformatic.tramite.bean.usp_S_trTrMoTramByRecibir;
import com.maninformatic.tramite.service.ITramiteService;

@RestController
@RequestMapping("/rest")
public class TramiteMoviRestController {
	@Autowired
	ITramiteService tramiteService;
	
	@RequestMapping(value = "/tramitesmovi", method=RequestMethod.GET)
	public List<TramiteMovi> list() {
		return tramiteService.findAllTramiteMovi();
	}
	
	@RequestMapping(value="/tramitesmovi/{id}", method=RequestMethod.GET)
	public TramiteMovi get(@PathVariable("id") int id) {
		TramiteMovi tramiteMovi=tramiteService.findOneTramiteId(id);
		if(tramiteMovi==null)
		{
			throw new RestException(1,"TramiteMovi no enccontrado"," Tramite con id:"+ id + " No encontrado en el sistema");
		}
		return tramiteMovi;
	}
	@RequestMapping(value = "/tramitesmovi/save", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<TramiteMovi> CreateTramiteMovi(@Valid @RequestBody TramiteMovi tramiteMovi) {
		tramiteService.CreateTramiteMovi(tramiteMovi);
		return new ResponseEntity<TramiteMovi>(tramiteMovi, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/tramitesmovi/getalltramitemovbyrecibir",params = { "codcap", "id_usuario","recibido","superv"}, method=RequestMethod.GET)
	public List<usp_S_trTrMoTramByRecibir> GetAllTramiteMovByRecibir(@RequestParam("codcap") String codcap,@RequestParam("id_usuario") String id_usuario,
			@RequestParam("recibido") String recibido,@RequestParam("superv") int supervisor) {
		return tramiteService.GetAllTramiteMovByRecibir(codcap,id_usuario,recibido,supervisor);
	}
	@RequestMapping(value = "/tramitesmovi/getalltramovbytipotra",params = { "codcap", "id_usuario","tipotramite"}, method=RequestMethod.GET)
	public List<usp_S_trTrMoTramByRecibir> GetAllTramiteMovByTipoTramite(@RequestParam("codcap") String codcap,@RequestParam("id_usuario") String usuario_id,
			@RequestParam("tipotramite") int tipoTramite) {
		return tramiteService.GetAllTramiteMovByTipoTramite(codcap,usuario_id,tipoTramite);
	}
	@RequestMapping(value = "/tramitesmovi/getalltramitemovbytramite",params = {"trMoid"}, method=RequestMethod.GET)
	public List<usp_S_trTrMoByTramite> GetAllTramiteMovByTramite(@RequestParam("trMoid") int trmoid) {
		return tramiteService.GetAllTramiteMovByTramite(trmoid);
	}
	@RequestMapping(value = "/tramitesmovi/recepcionartramitemov",params = {"tramId","trMovid","usuarioLog"}, method=RequestMethod.GET)
	public ResponseEntity<Boolean> RecepcionarTramiteMov(@RequestParam("tramId") int tramId,@RequestParam("trMovid") int trMovid,@RequestParam("usuarioLog") String usuarioLog) {
		tramiteService.RecepcionarTramiteMov(tramId, trMovid, usuarioLog);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
	@RequestMapping(value = "/tramitesmovi/archivar", method=RequestMethod.POST)
	public ResponseEntity<Boolean> ArchivarTramiteMov(@Valid @RequestBody TramiteMovi tramiteMovi) {
		if (tramiteMovi.getId()>0)
		{
			tramiteService.ArchivarTramiteMov(tramiteMovi.getTramId(), tramiteMovi.getId(), tramiteMovi.getTrMoPersonLog(), tramiteMovi.getTrMoObserva(),tramiteMovi.isTrMoRecepciono());
			return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
		}
		return new ResponseEntity<Boolean>(Boolean.FALSE, HttpStatus.NOT_ACCEPTABLE);
	}
	@RequestMapping(value = "/tramitesmovi/derivar", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<TramiteMovi> DerivarTramiteMov(@RequestBody TramiteMovi tramiteMovi) {
		if (tramiteMovi.getId()>0)
		{
			tramiteService.DerivarTramiteMov(tramiteMovi,tramiteMovi.getTrMoPersonLog(), tramiteMovi.getTrMoCAP(), tramiteMovi.getTrMoPersoEx(), tramiteMovi.isTrMoRecepciono(), tramiteMovi.getTrMoTraTramite());
			return new ResponseEntity<TramiteMovi>(tramiteMovi, HttpStatus.OK);
		}
		return new ResponseEntity<TramiteMovi>(tramiteMovi, HttpStatus.NOT_ACCEPTABLE);
	}
	
	

}
