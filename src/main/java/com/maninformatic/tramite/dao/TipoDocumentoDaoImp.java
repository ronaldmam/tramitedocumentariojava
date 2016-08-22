package com.maninformatic.tramite.dao;

import org.springframework.stereotype.Repository;


import com.maninformatic.tramite.bean.TipoDocumento;

@Repository
public class TipoDocumentoDaoImp extends AbstractJpaDAO<TipoDocumento> implements ITipoDocumentoDao {
	 public TipoDocumentoDaoImp() {
	        super();

	        setClazz(TipoDocumento.class);
	    }
}
