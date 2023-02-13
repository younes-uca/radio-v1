package  ma.enova.radio.required.dto.radio;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonFormat;



import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;







@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsultationRadiotherapieDto extends AuditBaseDto {

    private String dateConsultation ;
    private String classificationOms  ;
    private String observation  ;
    private String statutMedicale  ;

    private PersonnelDto medecin ;
    private TypeConsultationRadiotherapieDto typeConsultationRadiotherapie ;
    private TypeToxiciteRthDto typeToxiciteRth ;
    private GradeToxiciteRthDto gradeToxiciteRth ;
    private PrescriptionRadiotherapieDto prescriptionRadiotherapie ;


    public ConsultationRadiotherapieDto(){
        super();
    }



    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateConsultation(){
        return this.dateConsultation;
    }
    public void setDateConsultation(String dateConsultation){
        this.dateConsultation = dateConsultation;
    }

    @Log
    public String getClassificationOms(){
        return this.classificationOms;
    }
    public void setClassificationOms(String classificationOms){
         this.classificationOms = classificationOms;
    }

    @Log
    public String getObservation(){
        return this.observation;
    }
    public void setObservation(String observation){
         this.observation = observation;
    }

    @Log
    public String getStatutMedicale(){
        return this.statutMedicale;
    }
    public void setStatutMedicale(String statutMedicale){
         this.statutMedicale = statutMedicale;
    }


    public PersonnelDto getMedecin(){
        return this.medecin;
    }

    public void setMedecinDto(PersonnelDto medecin){
        this.medecin = medecin;
    }
    public TypeConsultationRadiotherapieDto getTypeConsultationRadiotherapie(){
        return this.typeConsultationRadiotherapie;
    }

    public void setTypeConsultationRadiotherapieDto(TypeConsultationRadiotherapieDto typeConsultationRadiotherapie){
        this.typeConsultationRadiotherapie = typeConsultationRadiotherapie;
    }
    public TypeToxiciteRthDto getTypeToxiciteRth(){
        return this.typeToxiciteRth;
    }

    public void setTypeToxiciteRthDto(TypeToxiciteRthDto typeToxiciteRth){
        this.typeToxiciteRth = typeToxiciteRth;
    }
    public GradeToxiciteRthDto getGradeToxiciteRth(){
        return this.gradeToxiciteRth;
    }

    public void setGradeToxiciteRthDto(GradeToxiciteRthDto gradeToxiciteRth){
        this.gradeToxiciteRth = gradeToxiciteRth;
    }
    public PrescriptionRadiotherapieDto getPrescriptionRadiotherapie(){
        return this.prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapieDto(PrescriptionRadiotherapieDto prescriptionRadiotherapie){
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }


}
