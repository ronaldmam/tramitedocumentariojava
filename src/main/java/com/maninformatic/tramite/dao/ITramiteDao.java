package com.maninformatic.tramite.dao;

import java.util.List;






import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.bean.uspTramiteDocEnvi;
import com.maninformatic.tramite.bean.usp_S_trTrMoTramByRecibir;

public interface ITramiteDao {
	Tramite findOne(int id);
    List<Tramite> findAll();
    void create(Tramite entity);
    Tramite update(Tramite entity);
    void delete(Tramite entity);
    void deleteById(int entityId);
    int enviarTramite(int tramiteId,String idZona,String usuarioLog);
    List<uspTramiteDocEnvi> GetAllTramitesEnv(String id_cap);
    List<uspTramiteDocEnvi> GetAllTramitesEnviado(String id_cap);
    List<usp_S_trTrMoTramByRecibir> GetAllTramiteMovByRecibir(String capcod,String usuario_id,String recibido, int supervisor);
    List<usp_S_trTrMoTramByRecibir> GetAllTramiteMovByTipoTramite(String capcod,String usuario_id,int tipotramite);
    

}
