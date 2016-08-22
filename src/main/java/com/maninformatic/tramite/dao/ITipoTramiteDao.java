package com.maninformatic.tramite.dao;

import java.util.List;

import com.maninformatic.tramite.bean.TipoTramite;


public interface ITipoTramiteDao {
	TipoTramite findOne(int id);
	 List<TipoTramite> findAll();

}
