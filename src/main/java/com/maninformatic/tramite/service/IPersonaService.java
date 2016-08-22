package com.maninformatic.tramite.service;

import java.util.List;

import com.maninformatic.tramite.bean.Destinatario;
import com.maninformatic.tramite.bean.EntidadExterna;
import com.maninformatic.tramite.bean.Personal;
import com.maninformatic.tramite.bean.usp_S_peRhppersoByarea;
import com.maninformatic.tramite.bean.usp_S_trDestinatarioListado;

public interface IPersonaService {
	 public List<usp_S_peRhppersoByarea> findAll_SP();
	 public Personal findOne_personal(int id);
	 void SaveDestinatario(Destinatario destinatario);
	 void DeleteDestinatario(int id);
	 List<usp_S_peRhppersoByarea> GetRhppersoByAreaCap(String id_cap);
	 List<Personal> GetRhppersoByUsuario(String id_usuario);
	 List<usp_S_trDestinatarioListado> GetAllDestinatariosByTram(int tramId);
	 EntidadExterna GetEntidadExternaById(int enExId);
	 List<EntidadExterna> GetAllEntidadExterna();
}
