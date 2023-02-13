package  ma.enova.radio.ws.dto;

import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class DecisionTraitementDto  extends AuditBaseDto {

    private String code  ;
    private String dateDecisionTraitement ;
    private String decisionTherapeutique  ;
    private String etat  ;
    private Boolean urgence  ;



    public DecisionTraitementDto(){
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDecisionTraitement(){
        return this.dateDecisionTraitement;
    }
    public void setDateDecisionTraitement(String dateDecisionTraitement){
        this.dateDecisionTraitement = dateDecisionTraitement;
    }

    @Log
    public String getDecisionTherapeutique(){
        return this.decisionTherapeutique;
    }
    public void setDecisionTherapeutique(String decisionTherapeutique){
         this.decisionTherapeutique = decisionTherapeutique;
    }

    @Log
    public String getEtat(){
        return this.etat;
    }
    public void setEtat(String etat){
         this.etat = etat;
    }

    @Log
    public Boolean getUrgence(){
        return this.urgence;
    }
    public void setUrgence(Boolean urgence){
         this.urgence = urgence;
    }




}
