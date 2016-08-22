package com.maninformatic.tramite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.maninformatic.tramite.RestException;
import com.maninformatic.tramite.bean.Personal;
import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.bean.usp_S_peRhppersoByarea;
import com.maninformatic.tramite.service.IPersonaService;


@RestController
@RequestMapping("/rest")
public class PersonalRestController {
	@Autowired
	IPersonaService personaService;
	
	@RequestMapping(value = "/personal", method=RequestMethod.GET)
	public List<usp_S_peRhppersoByarea> list() {
		return personaService.findAll_SP();
	}
	@RequestMapping(value="/personal/{id}", method=RequestMethod.GET)
	public Personal get(@PathVariable("id") int id) {
		Personal personal=personaService.findOne_personal(id);
		if(personal==null)
		{
			throw new RestException(1,"Personal no enccontrado"," Personal con id:"+ id + " No encontrado en el sistema");
		}
		return personaService.findOne_personal(id);
	}
	@RequestMapping(value="/personal/getrhppersobyareacap/{id_cap}", method=RequestMethod.GET)
	public List<usp_S_peRhppersoByarea> GetRhppersoByAreaCap(@PathVariable("id_cap") String id_cap) {
		List<usp_S_peRhppersoByarea> personal=personaService.GetRhppersoByAreaCap(id_cap);
		if(personal==null)
		{
			throw new RestException(1,"Personal no enccontrado"," Personal con id_cap:"+ id_cap + " No encontrado en el sistema");
		}		
        
		return personal; 
	}
	
	@RequestMapping(value="/personal/getrhppersobyusuario/{id_usuario}", method=RequestMethod.GET)
	public List<Personal> GetRhppersoByUsuario(@PathVariable("id_usuario") String id_usuario) {
		List<Personal> personal=personaService.GetRhppersoByUsuario(id_usuario);
		if(personal==null)
		{
			throw new RestException(1,"Personal no enccontrado"," Personal con id_usuario:"+ id_usuario + " No encontrado en el sistema");
		}
		return personaService.GetRhppersoByUsuario(id_usuario);
	}

}
