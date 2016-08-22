package com.maninformatic.tramite.service;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maninformatic.tramite.bean.Destinatario;
import com.maninformatic.tramite.bean.EntidadExterna;
import com.maninformatic.tramite.bean.Personal;
import com.maninformatic.tramite.bean.usp_S_peRhppersoByarea;
import com.maninformatic.tramite.bean.usp_S_trDestinatarioListado;
import com.maninformatic.tramite.dao.IDestinatarioDao;
import com.maninformatic.tramite.dao.IEntidadExternaDao;
import com.maninformatic.tramite.dao.IPersonalDao;


@Service
@Transactional
public class PersonaServiceImp implements IPersonaService {
	
	private IPersonalDao personalDao;
	private IEntidadExternaDao entidadExternaDao;
	private IDestinatarioDao destinatarioDao;
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	public void setPersonalDao(IPersonalDao personalDao) {
		 this.personalDao = personalDao;
		 }
	public void setEntidadExternaDao(IEntidadExternaDao entidadExternaDao) {
		 this.entidadExternaDao = entidadExternaDao;
		 }
	public void setDestinatarioDao(IDestinatarioDao detinatarioDao) {
		 this.destinatarioDao = detinatarioDao;
		 }
	public List<usp_S_peRhppersoByarea> findAll_SP() {
		// TODO Auto-generated method stub
		return personalDao.findAll_SP();
	}
	 
	public Personal findOne_personal(int id){
		return personalDao.findOne(id);
	}
	public void SaveDestinatario(Destinatario destinatario){
		this.destinatarioDao.create(destinatario);
	}
	public void DeleteDestinatario(int idDestinatario){
		this.destinatarioDao.deleteById(idDestinatario);
	}
	public List<usp_S_peRhppersoByarea> GetRhppersoByAreaCap(String id_cap){
		return personalDao.GetRhppersoByAreaCap(id_cap);
		
	}
	public List<Personal> GetRhppersoByUsuario(String id_usuario){
		return personalDao.GetRhppersoByUsuario(id_usuario);
	}
	public List<usp_S_trDestinatarioListado> GetAllDestinatariosByTram(int tramId){
		return personalDao.GetAllDestinatariosByTram(tramId);
	}
	public EntidadExterna GetEntidadExternaById(int enExId){
		return entidadExternaDao.findOne(enExId);
	}
	public List<EntidadExterna> GetAllEntidadExterna(){
		return entidadExternaDao.findAll();
	}

}
