package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.DecisionTraitementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DecisionTraitementHistoryDao extends AbstractHistoryRepository<DecisionTraitementHistory,Long> {

}
