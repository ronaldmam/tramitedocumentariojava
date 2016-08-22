package com.maninformatic.tramite.dao;

import org.springframework.stereotype.Repository;

import com.maninformatic.tramite.bean.TipoTramite;


@Repository
public class TipoTramiteDaoImp extends AbstractJpaDAO<TipoTramite> implements ITipoTramiteDao {
	 public TipoTramiteDaoImp() {
	        super();

	        setClazz(TipoTramite.class);
	    }

}
