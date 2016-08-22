package com.maninformatic.tramite.dao;

import java.util.List;

import com.maninformatic.tramite.bean.EntidadExterna;



public interface IEntidadExternaDao {
	EntidadExterna findOne(int id);
	List<EntidadExterna> findAll();

}
