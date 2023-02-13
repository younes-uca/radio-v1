package  ma.enova.radio.required.dto.radio;

import com.fasterxml.jackson.annotation.JsonInclude;



import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoriePersonnelDto extends AuditBaseDto {

    private String libelle  ;
    private String code  ;

    private ServicesDto services ;


    public CategoriePersonnelDto(){
        super();
    }



    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
         this.libelle = libelle;
    }

    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
         this.code = code;
    }


    public ServicesDto getServices(){
        return this.services;
    }

    public void setServicesDto(ServicesDto services){
        this.services = services;
    }


}
