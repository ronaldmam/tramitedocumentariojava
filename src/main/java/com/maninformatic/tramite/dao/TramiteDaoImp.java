package com.maninformatic.tramite.dao;


import java.util.List;

import javax.persistence.Convert;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.bean.uspTramiteDocEnvi;
import com.maninformatic.tramite.bean.usp_S_trTrMoTramByRecibir;

@Repository
public class TramiteDaoImp extends AbstractJpaDAO<Tramite> implements ITramiteDao {

	 public TramiteDaoImp() {
	        super();

	        setClazz(Tramite.class);
	    }
	 
	 @SuppressWarnings("unchecked")
	 public int enviarTramite(int tramiteId,String idZona,String usuarioLog){
		 //StoredProcedureQuery storedProcedure  = entityManager.createNamedStoredProcedureQuery("usp_I_trTramiteMov_Envio");
		 StoredProcedureQuery storedProcedure  = entityManager.createStoredProcedureQuery("usp_I_trTramiteMov_Envio");
		 storedProcedure.registerStoredProcedureParameter("tramId", Integer.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("zona_id", String.class, ParameterMode.IN);
		 storedProcedure.registerStoredProcedureParameter("PersonLog", String.class, ParameterMode.IN);

		 storedProcedure.setParameter("tramId",tramiteId);
		 storedProcedure.setParameter("zona_id",idZona);
		 storedProcedure.setParameter("PersonLog",usuarioLog);
		 storedProcedure.execute();
		 return 1;
		 /*   List results=storedProcedure.getResultList();// .getResultList();
		    if (results == null || results.isEmpty()) {
		        return 0;
		    }

		    return (Integer) results.get(0);*/
		    //return (int)storedProcedure.getSingleResult();// .getResultList(); 
	 }
	 @SuppressWarnings("unchecked")
	public List<uspTramiteDocEnvi> GetAllTramitesEnv(String id_cap){
		//StoredProcedureQuery storedProcedure  = entityManager.createStoredProcedureQuery("usp_S_trTramiteDocEnvi");
		//storedProcedure.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		StoredProcedureQuery storedProcedure  = entityManager.createNamedStoredProcedureQuery("usp_S_trTramiteDocEnvi");
	    storedProcedure.setParameter(1,id_cap);
	    return storedProcedure.getResultList();
	 }
	 @SuppressWarnings("unchecked")
	  public List<uspTramiteDocEnvi> GetAllTramitesEnviado(String id_cap){
		 StoredProcedureQuery storedProcedure  = entityManager.createNamedStoredProcedureQuery("usp_S_trTramiteDocEnviados");
		 storedProcedure.setParameter(1,id_cap);
		 return storedProcedure.getResultList();
	    }
	  @SuppressWarnings("unchecked")
	  public List<usp_S_trTrMoTramByRecibir> GetAllTramiteMovByRecibir(String capcod,String usuario_id,String recibido, int supervisor){
		 StoredProcedureQuery storedProcedure  = entityManager.createNamedStoredProcedureQuery("usp_S_trTrMoTramByRecibir");
		 storedProcedure.setParameter("capcod",capcod);
		 storedProcedure.setParameter("usuario_id",usuario_id);
		 storedProcedure.setParameter("recibido",recibido);
		 storedProcedure.setParameter("supervisor",supervisor);
		 return storedProcedure.getResultList();
	    }
	  @SuppressWarnings("unchecked")
	  public List<usp_S_trTrMoTramByRecibir> GetAllTramiteMovByTipoTramite(String capcod,String usuario_id, int tipoTramite){
		 StoredProcedureQuery storedProcedure  = entityManager.createNamedStoredProcedureQuery("usp_S_trTrMoTramByTiTramite");
		 storedProcedure.setParameter("capcod",capcod);
		 storedProcedure.setParameter("usuario_id",usuario_id);
		 storedProcedure.setParameter("tipotramite",tipoTramite);
		 return storedProcedure.getResultList();
	    }
}
