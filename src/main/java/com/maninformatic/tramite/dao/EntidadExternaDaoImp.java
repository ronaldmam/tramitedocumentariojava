package com.maninformatic.tramite.dao;

import org.springframework.stereotype.Repository;

import com.maninformatic.tramite.bean.EntidadExterna;


@Repository
public class EntidadExternaDaoImp extends AbstractJpaDAO<EntidadExterna> implements IEntidadExternaDao {
	 public EntidadExternaDaoImp() {
	        super();

	        setClazz(EntidadExterna.class);
	    }
}
