package  ma.enova.radio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.history.SpecialiteHistory;
import ma.enova.radio.bean.core.Specialite;
import ma.enova.radio.ws.dto.SpecialiteDto;

@Component
public class SpecialiteConverter extends AbstractConverter<Specialite, SpecialiteDto, SpecialiteHistory> {

    @Autowired
    private ServicesConverter servicesConverter ;
    private boolean services;

    public  SpecialiteConverter(){
        super(Specialite.class, SpecialiteDto.class, SpecialiteHistory.class);
    }

    @Override
    public Specialite toItem(SpecialiteDto dto) {
        if (dto == null) {
            return null;
        } else {
        Specialite item = new Specialite();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(this.services && dto.getServices()!=null)
                item.setServices(servicesConverter.toItem(dto.getServices())) ;



        return item;
        }
    }

    @Override
    public SpecialiteDto toDto(Specialite item) {
        if (item == null) {
            return null;
        } else {
    SpecialiteDto dto = new SpecialiteDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getCode()))
             dto.setCode(item.getCode());
        if(StringUtil.isNotEmpty(item.getLibelle()))
             dto.setLibelle(item.getLibelle());
        if(this.services && item.getServices()!=null) {
            dto.setServicesDto(servicesConverter.toDto(item.getServices())) ;
        }
        return dto;
        }
    }



    public ServicesConverter getServicesConverter(){
        return this.servicesConverter;
    }
    public void setServicesConverter(ServicesConverter servicesConverter ){
        this.servicesConverter = servicesConverter;
    }


    public boolean  isServices(){
        return this.services;
    }
    public void  setServices(boolean services){
        this.services = services;
    }
}
