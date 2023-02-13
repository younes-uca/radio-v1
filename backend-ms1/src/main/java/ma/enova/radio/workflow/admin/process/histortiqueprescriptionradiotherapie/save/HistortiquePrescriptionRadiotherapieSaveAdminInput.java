package ma.enova.radio.workflow.admin.process.histortiqueprescriptionradiotherapie.save;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;

import ma.enova.radio.ws.dto.PrescriptionRadiotherapieDto;
import ma.enova.radio.ws.dto.StatutRadiotherapieDto;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.process.AbstractProcessInput;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HistortiquePrescriptionRadiotherapieSaveAdminInput extends AbstractProcessInput {

    private String dateHistortiquePrescriptionRadiotherapie ;
    private String description  ;

    private PrescriptionRadiotherapieDto prescriptionRadiotherapie ;
    private StatutRadiotherapieDto statutRadiotherapie ;



    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateHistortiquePrescriptionRadiotherapie(){
        return this.dateHistortiquePrescriptionRadiotherapie;
    }
    public void setDateHistortiquePrescriptionRadiotherapie(String dateHistortiquePrescriptionRadiotherapie){
        this.dateHistortiquePrescriptionRadiotherapie = dateHistortiquePrescriptionRadiotherapie;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public PrescriptionRadiotherapieDto getPrescriptionRadiotherapie(){
        return this.prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapieDto(PrescriptionRadiotherapieDto prescriptionRadiotherapie){
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }
    public StatutRadiotherapieDto getStatutRadiotherapie(){
        return this.statutRadiotherapie;
    }

    public void setStatutRadiotherapieDto(StatutRadiotherapieDto statutRadiotherapie){
        this.statutRadiotherapie = statutRadiotherapie;
    }

}



