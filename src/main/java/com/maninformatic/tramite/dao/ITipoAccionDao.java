package com.maninformatic.tramite.dao;

import java.util.List;

import com.maninformatic.tramite.bean.TipoAccion;


public interface ITipoAccionDao {
	TipoAccion findOne(int id);
	List<TipoAccion> findAll();

}
