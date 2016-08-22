package com.maninformatic.tramite.dao;

import java.util.List;








import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.bean.TramiteMovi;
import com.maninformatic.tramite.bean.uspTramiteDocEnvi;
import com.maninformatic.tramite.bean.usp_S_trTrMoByTramite;
import com.maninformatic.tramite.bean.usp_S_trTrMoTramByRecibir;

public interface ITramiteMoviDao {
	TramiteMovi findOne(int id);
    List<TramiteMovi> findAll();
    void create(TramiteMovi entity);
    TramiteMovi update(TramiteMovi entity);
    void delete(TramiteMovi entity);
    void deleteById(int entityId);
    int RecepcionarTramiteMov(int tramId, int trMovid, String usuarioLog);
    void ArchivarTramiteMov(int tramId, int trMovid, String usuarioLog,String trMoObserva);
    void DerivarTramiteMov(TramiteMovi tramitemov, int trMovid, String personLog,
            String zonaLog, int personExt, boolean recepciono,int supervisor);
    
    List<usp_S_trTrMoByTramite> GetAllTramiteMovByTramite(int trMoid);
    //List<usp_S_trTrMoTramByRecibir> GetAllTramiteMovByRecibir(String capcod,String usuario_id,String recibido, int supervisor);
    //List<usp_S_trTrMoTramByRecibir> GetAllTramiteMovByTipoTramite(String capcod,String usuario_id,int tipotramite);
    

}
