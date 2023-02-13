package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.DecisionTraitement;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.DecisionTraitement;
import java.util.List;


@Repository
public interface DecisionTraitementDao extends AbstractRepository<DecisionTraitement,Long> {
    DecisionTraitement findByCode(String code);
    int deleteByCode(String code);


}
