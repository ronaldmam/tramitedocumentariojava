package com.maninformatic.tramite.dao;

import java.util.List;


import com.maninformatic.tramite.bean.TipoDocumento;


public interface ITipoDocumentoDao {
	TipoDocumento findOne(int id);
	List<TipoDocumento> findAll();

}
