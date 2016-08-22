package com.maninformatic.tramite.dao;

import org.springframework.stereotype.Repository;

import com.maninformatic.tramite.bean.Destinatario;
import com.maninformatic.tramite.bean.TipoAccion;

@Repository
public class DestinatarioDaoImp extends AbstractJpaDAO<Destinatario> implements IDestinatarioDao {
	 public DestinatarioDaoImp() {
	        super();

	        setClazz(Destinatario.class);
	    }
}
