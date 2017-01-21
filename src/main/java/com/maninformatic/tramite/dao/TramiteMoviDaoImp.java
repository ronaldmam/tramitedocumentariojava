package com.maninformatic.tramite.dao;

import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.maninformatic.tramite.bean.TramiteMovi;
import com.maninformatic.tramite.bean.usp_S_trTrMoByTramite;

@Repository
public class TramiteMoviDaoImp extends AbstractJpaDAO<TramiteMovi> implements ITramiteMoviDao {
	 public TramiteMoviDaoImp() {
	        super();

	        setClazz(TramiteMovi.class);
	    }
	 public int RecepcionarTramiteMov(int tramId, int trMovid, String usuarioLog){
		 StoredProcedureQuery storedProcedure  = entityManager.createStoredProcedureQuery("usp_I_trTramiteMov_Recibido");
		 storedProcedure.registerStoredProcedureParameter("tramId", Integer.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("trMovid", Integer.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("PersonLog", String.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("id_tramite", Integer.class, ParameterMode.OUT);

		 storedProcedure.setParameter("tramId",tramId);
		 storedProcedure.setParameter("trMovid",trMovid);
		 storedProcedure.setParameter("PersonLog",usuarioLog);
		 storedProcedure.execute();
		 Integer id_tramite=(Integer) storedProcedure.getOutputParameterValue("id_tramite");
		 return id_tramite;
	 }
	 public void ArchivarTramiteMov(int tramId, int trMovid, String usuarioLog,String trMoObserva){
		 StoredProcedureQuery storedProcedure  = entityManager.createStoredProcedureQuery("usp_I_trTramiteMov_Archivado");
		 storedProcedure.registerStoredProcedureParameter("tramId", Integer.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("trMovid", Integer.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("PersonLog", String.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("trMoObserva", String.class, ParameterMode.IN);

		 storedProcedure.setParameter("tramId",tramId);
		 storedProcedure.setParameter("trMovid",trMovid);
		 storedProcedure.setParameter("PersonLog",usuarioLog);
		 storedProcedure.setParameter("trMoObserva",trMoObserva);
		 storedProcedure.execute();
		 
	 }
	 public void DerivarTramiteMov(TramiteMovi tramitemov, int trMovid,String personLog,
	            String zonaLog, int personExt, boolean recepciono,int supervisor){
		 
		 StoredProcedureQuery storedProcedure  = entityManager.createStoredProcedureQuery("usp_I_trTramiteMov_Derivado");
		 storedProcedure.registerStoredProcedureParameter("tramId", Integer.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("trMovid", Integer.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("trMoZona", String.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("id_personaDeri", String.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("tiAcId1", Integer.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("tiAcId2", Integer.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("tiAcId3", Integer.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("trMoObserva", String.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("trMoCopia", Boolean.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("PersonLog", String.class, ParameterMode.IN);		 
		 storedProcedure.registerStoredProcedureParameter("ZonaLog", String.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("personExt", Integer.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("supervisor", Integer.class, ParameterMode.IN);
		 storedProcedure.setParameter("tramId",tramitemov.getTramId());
		 storedProcedure.setParameter("trMovid",trMovid);
		 storedProcedure.setParameter("trMoZona",tramitemov.getTrMoZona());
		 storedProcedure.setParameter("id_personaDeri",tramitemov.getTrMoPersoIn());
		 storedProcedure.setParameter("tiAcId1",tramitemov.getTiAcId1());
		 storedProcedure.setParameter("tiAcId2",tramitemov.getTiAcId2());
		 storedProcedure.setParameter("tiAcId3",tramitemov.getTiAcId3());
		 storedProcedure.setParameter("trMoObserva",tramitemov.getTrMoObserva().toString());//
		 storedProcedure.setParameter("trMoCopia",tramitemov.isTrMoCopia()); //
		 storedProcedure.setParameter("PersonLog",personLog);
		 storedProcedure.setParameter("ZonaLog",zonaLog);
		 storedProcedure.setParameter("personExt",personExt);
		 storedProcedure.setParameter("supervisor",supervisor);
		 storedProcedure.execute();
	 }
	 
	 @SuppressWarnings("unchecked")
	 public List<usp_S_trTrMoByTramite> GetAllTramiteMovByTramite(int trMoid){
		 StoredProcedureQuery storedProcedure  = entityManager.createNamedStoredProcedureQuery("usp_S_trTrMoByTramite");
		 storedProcedure.setParameter(1,trMoid);
		// List lista= storedProcedure.getResultList();
		 storedProcedure.execute();
		 List<usp_S_trTrMoByTramite> valor=storedProcedure.getResultList();
		 return valor;
		 
	 }
}
