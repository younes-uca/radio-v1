package  ma.enova.radio.ws.dto;

import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeConsultationRadiotherapieDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;

    private ServicesDto services ;


    public TypeConsultationRadiotherapieDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
         this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
         this.libelle = libelle;
    }


    public ServicesDto getServices(){
        return this.services;
    }

    public void setServicesDto(ServicesDto services){
        this.services = services;
    }


}
