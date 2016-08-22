package com.maninformatic.tramite.service;


import java.util.List;







import com.maninformatic.tramite.bean.TipoAccion;
import com.maninformatic.tramite.bean.TipoDocumento;
import com.maninformatic.tramite.bean.TipoTramite;
import com.maninformatic.tramite.bean.Tramite;
import com.maninformatic.tramite.bean.TramiteMovi;
import com.maninformatic.tramite.bean.uspTramiteDocEnvi;
import com.maninformatic.tramite.bean.usp_S_trTrMoByTramite;
import com.maninformatic.tramite.bean.usp_S_trTrMoTramByRecibir;

public interface ITramiteService {
	 void Save(Tramite tramite);
	 List<Tramite> findAll();
	 Tramite findOne(int id);
	 void Delete(int id);
	 int EnviarTramite(int tramiteId,String idZona,String usuarioLog);
	 List<uspTramiteDocEnvi> GetAllTramitesEnv(String id_cap);
	 List<uspTramiteDocEnvi> GetAllTramitesEnviado(String id_cap);
	 //tramite Movi
	 List<TramiteMovi> findAllTramiteMovi();
	 TramiteMovi findOneTramiteId(int id);
	 void CreateTramiteMovi(TramiteMovi tramiteMovi);
	 void UpdateTramiteMovi(int id,TramiteMovi tramiteMovi);
	 void DeleteTramiteMovi(int id);
	 int RecepcionarTramiteMov(int tramId, int trMovid, String usuarioLog);
	 void ArchivarTramiteMov(int tramId, int trMovid, String usuarioLog,String trMoObserva,boolean recepciono);
	 void DerivarTramiteMov(TramiteMovi tramitemov, String personLog,
	            String zonaLog, int personExt, boolean recepciono,int supervisor);
	 
	 List<usp_S_trTrMoTramByRecibir> GetAllTramiteMovByRecibir(String capcod,String usuario_id,String recibido, int supervisor);
	 List<usp_S_trTrMoTramByRecibir> GetAllTramiteMovByTipoTramite(String capcod,String usuario_id, int tipoTramite);
	 List<usp_S_trTrMoByTramite> GetAllTramiteMovByTramite(int trMoid);
	 
	 TipoTramite GetTipoTramiteById(int id);
	 List<TipoTramite> GetAllTipoTramite();
	 TipoAccion GetTipoAccionById(int id);
	 List<TipoAccion> GetAllTipoAccion();
	 TipoDocumento GetTipoDocumentoById(int id);
	 List<TipoDocumento> GetAllTipoDocumento();
	 
	 
}
