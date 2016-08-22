package com.maninformatic.tramite.dao;

import java.util.List;

import com.maninformatic.tramite.bean.Personal;
import com.maninformatic.tramite.bean.usp_S_peRhppersoByarea;
import com.maninformatic.tramite.bean.usp_S_trDestinatarioListado;


public interface IPersonalDao {
	List<usp_S_peRhppersoByarea> findAll_SP();
	Personal findOne(int id);
	void create(Personal entity);
	Personal update(Personal entity);
    void delete(Personal entity);
    void deleteById(int entityId);
    List<usp_S_peRhppersoByarea> GetRhppersoByAreaCap(String id_cap);
    List<Personal> GetRhppersoByUsuario(String id_usuario);
    List<usp_S_trDestinatarioListado> GetAllDestinatariosByTram(int tramId);
    
}
