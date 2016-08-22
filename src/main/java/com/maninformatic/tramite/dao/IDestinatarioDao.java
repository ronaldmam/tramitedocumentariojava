package com.maninformatic.tramite.dao;

import java.util.List;

import com.maninformatic.tramite.bean.Destinatario;




public interface IDestinatarioDao {
	Destinatario findOne(int id);
	List<Destinatario> findAll();
	void create(Destinatario entity);
	Destinatario update(Destinatario entity);
	void delete(Destinatario entity);
    void deleteById(int entityId);

}
