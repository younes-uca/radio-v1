package ma.enova.radio.workflow.admin.process.statutradiotherapie.save;


import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatutRadiotherapieSaveAdminOutput {

     private String code  ;
     private String libelle  ;
     private String style  ;




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

    @Log
    public String getStyle(){
        return this.style;
    }
    public void setStyle(String style){
        this.style = style;
    }



}
