package com.maninformatic.tramite.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maninformatic.tramite.bean.TipoAccion;
import com.maninformatic.tramite.bean.TipoDocumento;
import com.maninformatic.tramite.bean.TipoTramite;
import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.bean.TramiteMovi;
import com.maninformatic.tramite.bean.uspTramiteDocEnvi;
import com.maninformatic.tramite.bean.usp_S_trTrMoByTramite;
import com.maninformatic.tramite.bean.usp_S_trTrMoTramByRecibir;
import com.maninformatic.tramite.dao.ITipoAccionDao;
import com.maninformatic.tramite.dao.ITipoDocumentoDao;
import com.maninformatic.tramite.dao.ITipoTramiteDao;
import com.maninformatic.tramite.dao.ITramiteDao;
import com.maninformatic.tramite.dao.ITramiteMoviDao;

@Service
@Transactional
public class TramiteServiceImp implements ITramiteService {

	private ITramiteDao tramiteDao;
	private ITramiteMoviDao tramiteMoviDao;
	private ITipoTramiteDao tipoTramiteDao;
	private ITipoAccionDao tipoAccionDao;
	private ITipoDocumentoDao tipoDocumentoDao;
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	public void setTramiteDao(ITramiteDao tramiteDao) {
		 this.tramiteDao = tramiteDao;
		 
		 }
	public void setTramiteMoviDao(ITramiteMoviDao tramiteMoviDao) {
		 this.tramiteMoviDao = tramiteMoviDao;
		 
		 }
	public void setTipoTramiteDao(ITipoTramiteDao tipoTramiteDao ) {
		
		 this.tipoTramiteDao = tipoTramiteDao;
		 }
	public void setTipoAccionDao(ITipoAccionDao tipoAccionDao ) {
		
		 this.tipoAccionDao = tipoAccionDao;
		 }
	public void setTipoDocumentoDao(ITipoDocumentoDao tipoDocumentoDao ) {
		
		 this.tipoDocumentoDao = tipoDocumentoDao;
		 }

	public void Save(Tramite tramite) {
		// TODO Auto-generated method stub
		if (tramite.getId()>0)
		{
			this.tramiteDao.update(tramite);
		}
		else
		{
			
			tramite.setTramFecha(new Date() );
			this.tramiteDao.create(tramite);
		}
		
	}
	public void Delete(int id){
		 this.tramiteDao.deleteById(id);
	 }
	public List<Tramite> findAll() {
		// TODO Auto-generated method stub
		return tramiteDao.findAll();
	}

	public Tramite findOne(int id) {
		// TODO Auto-generated method stub
		return tramiteDao.findOne(id);
	}
	public int EnviarTramite(int tramiteId,String idZona,String usuarioLog){
		return tramiteDao.enviarTramite(tramiteId, idZona, usuarioLog);
	}
	//metodos de TramiteMovi
	public List<TramiteMovi> findAllTramiteMovi(){
		return tramiteMoviDao.findAll();
	}
	public TramiteMovi findOneTramiteId(int id){
		return tramiteMoviDao.findOne(id);
	}
	
	public void CreateTramiteMovi(TramiteMovi tramiteMovi){
		this.tramiteMoviDao.create(tramiteMovi);
	}
	public void UpdateTramiteMovi(int id,TramiteMovi tramiteMovi){
		TramiteMovi _tramiteMovi=new TramiteMovi();
		_tramiteMovi=findOneTramiteId(id);
		_tramiteMovi.setTiTrId(tramiteMovi.getTiTrId());
		this.tramiteMoviDao.update(_tramiteMovi);		
	}
	public void DeleteTramiteMovi(int id){
		this.tramiteMoviDao.deleteById(id);
	}
	
	public int RecepcionarTramiteMov(int tramId, int trMovid, String usuarioLog){
		return tramiteMoviDao.RecepcionarTramiteMov(tramId, trMovid, usuarioLog);
	}
	public  void ArchivarTramiteMov(int tramId, int trMovid, String usuarioLog,String trMoObserva,boolean recepciono){
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
        try{
        	transaction.begin();
			if (recepciono=false){
				//Registramos primero la recepcion
				 int _trModId;
				 _trModId=tramiteMoviDao.RecepcionarTramiteMov(tramId, trMovid, usuarioLog);
				//Registramos el Archivamiento
				 tramiteMoviDao.ArchivarTramiteMov(tramId, _trModId, usuarioLog, trMoObserva);
			}
			else{
				//Registramos el Archivamiento
				//registramos solamente el archivamiento porque se esta tomando de un registro ya recepcionado
				 tramiteMoviDao.ArchivarTramiteMov(tramId, trMovid, usuarioLog, trMoObserva);			
			}
			transaction.commit();
        }	
	    catch(Exception e){
	    	transaction.rollback();
	        throw new RuntimeException(e);
	    }
	    finally{
	      	entityManager.close();
	    }
			
	}
	
	public void DerivarTramiteMov(TramiteMovi tramitemov, String personLog,
	            String zonaLog, int personExt, boolean recepciono,int supervisor){
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction(); 
		try{
	        	transaction.begin();
				if (recepciono=false){
					//Registramos primero la recepcion
					 int _trModId;
					 _trModId=tramiteMoviDao.RecepcionarTramiteMov(tramitemov.getTramId(), tramitemov.getId(), personLog);
					//Registramos La Derivacion
					 tramiteMoviDao.DerivarTramiteMov(tramitemov,_trModId, personLog, zonaLog, personExt, recepciono, supervisor);
				}
				else{
					//Registramos La Derivacion
					//registramos solamente la derivacion porque se esta tomando de un registro ya recepcionado
					 tramiteMoviDao.DerivarTramiteMov(tramitemov,tramitemov.getId(), personLog, zonaLog, personExt, recepciono, supervisor);			
				}
			transaction.commit();
	        }	
		    catch(Exception e){
		    	transaction.rollback();
		        throw new RuntimeException(e);
		    }
		    finally{
		      	entityManager.close();
		    }
	 }

	@SuppressWarnings("unchecked")
	public List<uspTramiteDocEnvi> GetAllTramitesEnv(String id_cap) {
		// TODO Auto-generated method stub
		return tramiteDao.GetAllTramitesEnv(id_cap);
	}

	public List<uspTramiteDocEnvi> GetAllTramitesEnviado(String id_cap) {
		// TODO Auto-generated method stub
		return tramiteDao.GetAllTramitesEnviado(id_cap);
	}
	public List<usp_S_trTrMoTramByRecibir> GetAllTramiteMovByRecibir(String capcod,String usuario_id,String recibido, int supervisor){
		return tramiteDao.GetAllTramiteMovByRecibir(capcod,usuario_id,recibido,supervisor);
	}
	public List<usp_S_trTrMoTramByRecibir> GetAllTramiteMovByTipoTramite(String capcod,String usuario_id, int tipoTramite){
		return tramiteDao.GetAllTramiteMovByTipoTramite(capcod,usuario_id,tipoTramite);
	}
	public List<usp_S_trTrMoByTramite> GetAllTramiteMovByTramite(int trMoid){
		return tramiteMoviDao.GetAllTramiteMovByTramite(trMoid);
	}
	
	//Entidad TipoTramite
	public TipoTramite GetTipoTramiteById(int id){
		return tipoTramiteDao.findOne(id);
	}
	public List<TipoTramite> GetAllTipoTramite() {
		return tipoTramiteDao.findAll();
	}
	public TipoAccion GetTipoAccionById(int id){
		return tipoAccionDao.findOne(id);
	}
	public List<TipoAccion> GetAllTipoAccion() {
		return tipoAccionDao.findAll();
	}
	public TipoDocumento GetTipoDocumentoById(int id){
		return tipoDocumentoDao.findOne(id);
	}
	public List<TipoDocumento> GetAllTipoDocumento() {
		return tipoDocumentoDao.findAll();
	}

}
