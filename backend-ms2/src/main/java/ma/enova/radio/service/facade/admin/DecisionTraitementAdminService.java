package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.DecisionTraitement;
import ma.enova.radio.ws.dto.DecisionTraitementDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.DecisionTraitementCriteria;
import ma.enova.radio.dao.criteria.history.DecisionTraitementHistoryCriteria;


public interface DecisionTraitementAdminService extends IService<DecisionTraitement, DecisionTraitementDto,DecisionTraitementCriteria, DecisionTraitementHistoryCriteria> {




}
