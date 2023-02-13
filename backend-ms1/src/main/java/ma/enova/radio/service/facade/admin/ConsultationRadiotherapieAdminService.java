package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.ConsultationRadiotherapie;
import ma.enova.radio.ws.dto.ConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.ConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.ConsultationRadiotherapieHistoryCriteria;


public interface ConsultationRadiotherapieAdminService extends IService<ConsultationRadiotherapie, ConsultationRadiotherapieDto,ConsultationRadiotherapieCriteria, ConsultationRadiotherapieHistoryCriteria> {

    List<ConsultationRadiotherapie> findByMedecinIpp(String ipp);
    int deleteByMedecinIpp(String ipp);
    List<ConsultationRadiotherapie> findByTypeConsultationRadiotherapieCode(String code);
    int deleteByTypeConsultationRadiotherapieCode(String code);
    List<ConsultationRadiotherapie> findByTypeToxiciteRthCode(String code);
    int deleteByTypeToxiciteRthCode(String code);
    List<ConsultationRadiotherapie> findByGradeToxiciteRthCode(String code);
    int deleteByGradeToxiciteRthCode(String code);
    List<ConsultationRadiotherapie> findByPrescriptionRadiotherapieId(Long id);
    int deleteByPrescriptionRadiotherapieId(Long id);



}
