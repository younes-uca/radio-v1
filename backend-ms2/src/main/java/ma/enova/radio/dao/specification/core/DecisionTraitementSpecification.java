package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.DecisionTraitementCriteria;
import ma.enova.radio.bean.core.DecisionTraitement;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class DecisionTraitementSpecification extends AbstractSpecification<DecisionTraitementCriteria, DecisionTraitement> {

    @Override
    public Predicate toPredicate(Root<DecisionTraitement> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("code", criteria.getCode(),criteria.getCodeLike());
                addPredicate("dateDecisionTraitement", criteria.getDateDecisionTraitement(), criteria.getDateDecisionTraitementFrom(), criteria.getDateDecisionTraitementTo());
                addPredicate("decisionTherapeutique", criteria.getDecisionTherapeutique(),criteria.getDecisionTherapeutiqueLike());
                addPredicate("etat", criteria.getEtat(),criteria.getEtatLike());
                addPredicateBool("urgence", criteria.getUrgence());
                addOrderAndFilter();
          }
        return getResult();
    }


    public DecisionTraitementSpecification(DecisionTraitementCriteria criteria) {
        super(criteria);
    }

    public DecisionTraitementSpecification(DecisionTraitementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
