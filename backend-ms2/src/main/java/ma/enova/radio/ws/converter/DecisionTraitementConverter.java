package  ma.enova.radio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.history.DecisionTraitementHistory;
import ma.enova.radio.bean.core.DecisionTraitement;
import ma.enova.radio.ws.dto.DecisionTraitementDto;

@Component
public class DecisionTraitementConverter extends AbstractConverter<DecisionTraitement, DecisionTraitementDto, DecisionTraitementHistory> {


    public  DecisionTraitementConverter(){
        super(DecisionTraitement.class, DecisionTraitementDto.class, DecisionTraitementHistory.class);
    }

    @Override
    public DecisionTraitement toItem(DecisionTraitementDto dto) {
        if (dto == null) {
            return null;
        } else {
        DecisionTraitement item = new DecisionTraitement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getDateDecisionTraitement()))
                item.setDateDecisionTraitement(DateUtil.stringEnToDate(dto.getDateDecisionTraitement()));
            if(StringUtil.isNotEmpty(dto.getDecisionTherapeutique()))
                item.setDecisionTherapeutique(dto.getDecisionTherapeutique());
            if(StringUtil.isNotEmpty(dto.getEtat()))
                item.setEtat(dto.getEtat());
            if(dto.getUrgence() != null)
                item.setUrgence(dto.getUrgence());


        return item;
        }
    }

    @Override
    public DecisionTraitementDto toDto(DecisionTraitement item) {
        if (item == null) {
            return null;
        } else {
    DecisionTraitementDto dto = new DecisionTraitementDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getCode()))
             dto.setCode(item.getCode());
        if(item.getDateDecisionTraitement()!=null)
             dto.setDateDecisionTraitement(DateUtil.dateTimeToString(item.getDateDecisionTraitement()));
        if(StringUtil.isNotEmpty(item.getDecisionTherapeutique()))
             dto.setDecisionTherapeutique(item.getDecisionTherapeutique());
        if(StringUtil.isNotEmpty(item.getEtat()))
             dto.setEtat(item.getEtat());
            dto.setUrgence(item.getUrgence());
        return dto;
        }
    }





}
