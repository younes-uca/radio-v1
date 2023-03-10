package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.DecisionTraitement;
import ma.enova.radio.bean.history.DecisionTraitementHistory;
import ma.enova.radio.dao.criteria.core.DecisionTraitementCriteria;
import ma.enova.radio.dao.criteria.history.DecisionTraitementHistoryCriteria;
import ma.enova.radio.dao.facade.core.DecisionTraitementDao;
import ma.enova.radio.dao.facade.history.DecisionTraitementHistoryDao;
import ma.enova.radio.dao.specification.core.DecisionTraitementSpecification;
import ma.enova.radio.service.facade.admin.DecisionTraitementAdminService;
import ma.enova.radio.ws.converter.DecisionTraitementConverter;
import ma.enova.radio.ws.dto.DecisionTraitementDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;




import java.util.List;

@Service
public class DecisionTraitementAdminServiceImpl extends AbstractServiceImpl<DecisionTraitement, DecisionTraitementDto,DecisionTraitementHistory, DecisionTraitementCriteria, DecisionTraitementHistoryCriteria, DecisionTraitementDao,
DecisionTraitementHistoryDao, DecisionTraitementConverter> implements DecisionTraitementAdminService {


    public DecisionTraitement findByReferenceEntity(DecisionTraitement t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(DecisionTraitement t){
        if( t != null) {
        }
    }


    public void configure() {
        super.configure(DecisionTraitement.class, DecisionTraitementDto.class, DecisionTraitementHistory.class, DecisionTraitementHistoryCriteria.class, DecisionTraitementSpecification.class);
    }

    public DecisionTraitementAdminServiceImpl(DecisionTraitementDao dao, DecisionTraitementHistoryDao historyDao, DecisionTraitementConverter converter) {
        super(dao, historyDao, converter);
    }

}