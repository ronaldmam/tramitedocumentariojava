package com.maninformatic.tramite.dao;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.maninformatic.tramite.bean.Personal;
import com.maninformatic.tramite.bean.usp_S_peRhppersoByarea;
import com.maninformatic.tramite.bean.usp_S_trDestinatarioListado;


@Repository
public class PersonalDaoImp extends AbstractJpaDAO<Personal> implements IPersonalDao {

	 public PersonalDaoImp() {
	        super();

	        setClazz(Personal.class);
	    }
	  @SuppressWarnings("unchecked")
	    public List<usp_S_peRhppersoByarea> findAll_SP() {
	    	StoredProcedureQuery storedProcedure  = entityManager.createNamedStoredProcedureQuery("usp_S_peRhpperso");
	    	//query.setParameter();
	        return storedProcedure .getResultList();
	    }
	  @SuppressWarnings("unchecked")
	    public List<usp_S_peRhppersoByarea> GetRhppersoByAreaCap(String id_cap) {
	    	StoredProcedureQuery storedProcedure  = entityManager.createNamedStoredProcedureQuery("usp_S_peRhppersoByarea");
	    	storedProcedure.setParameter(1,id_cap);
	        return storedProcedure .getResultList();
	    }
	  @SuppressWarnings("unchecked")
	    public List<Personal> GetRhppersoByUsuario(String id_usuario) {
	    	StoredProcedureQuery storedProcedure  = entityManager.createNamedStoredProcedureQuery("usp_S_peRhppersoByUsuario");
	    	storedProcedure.setParameter(1,id_usuario);
	        return storedProcedure.getResultList();
	    }
	  @SuppressWarnings("unchecked")
	  public List<usp_S_trDestinatarioListado> GetAllDestinatariosByTram(int tramId){
	    	StoredProcedureQuery storedProcedure  = entityManager.createNamedStoredProcedureQuery("usp_S_trDestinatarioListado");
	    	storedProcedure.setParameter(1,tramId);
	        return storedProcedure .getResultList();
	    }

}
