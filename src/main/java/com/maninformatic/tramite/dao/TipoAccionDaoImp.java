package com.maninformatic.tramite.dao;

import org.springframework.stereotype.Repository;

import com.maninformatic.tramite.bean.TipoAccion;

@Repository
public class TipoAccionDaoImp extends AbstractJpaDAO<TipoAccion> implements ITipoAccionDao {
	 public TipoAccionDaoImp() {
	        super();

	        setClazz(TipoAccion.class);
	    }
}
