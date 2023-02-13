package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.GradeToxiciteRth;
import ma.enova.radio.ws.dto.GradeToxiciteRthDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.GradeToxiciteRthCriteria;
import ma.enova.radio.dao.criteria.history.GradeToxiciteRthHistoryCriteria;


public interface GradeToxiciteRthAdminService extends IService<GradeToxiciteRth, GradeToxiciteRthDto,GradeToxiciteRthCriteria, GradeToxiciteRthHistoryCriteria> {

    List<GradeToxiciteRth> findByServicesCode(String code);
    int deleteByServicesCode(String code);
    Long getNextOrdre();



}
