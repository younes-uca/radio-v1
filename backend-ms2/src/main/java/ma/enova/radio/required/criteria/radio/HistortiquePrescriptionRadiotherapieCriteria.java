package  ma.enova.radio.required.criteria.radio;

import ma.enova.radio.zynerator.criteria.BaseCriteria;
    import java.util.List;
    import com.fasterxml.jackson.annotation.JsonFormat;
    import ma.enova.radio.zynerator.criteria.BaseCriteria;
    import java.time.LocalDateTime;



public class HistortiquePrescriptionRadiotherapieCriteria extends BaseCriteria {

    private LocalDateTime dateHistortiquePrescriptionRadiotherapie;
    private LocalDateTime dateHistortiquePrescriptionRadiotherapieFrom;
    private LocalDateTime dateHistortiquePrescriptionRadiotherapieTo;

    private PrescriptionRadiotherapieCriteria prescriptionRadiotherapie ;
    private List<PrescriptionRadiotherapieCriteria> prescriptionRadiotherapies ;
    private StatutRadiotherapieCriteria statutRadiotherapie ;
    private List<StatutRadiotherapieCriteria> statutRadiotherapies ;


    public HistortiquePrescriptionRadiotherapieCriteria(){}

    public LocalDateTime getDateHistortiquePrescriptionRadiotherapie(){
        return this.dateHistortiquePrescriptionRadiotherapie;
    }
    public void setDateHistortiquePrescriptionRadiotherapie(LocalDateTime dateHistortiquePrescriptionRadiotherapie){
        this.dateHistortiquePrescriptionRadiotherapie = dateHistortiquePrescriptionRadiotherapie;
    }
    public LocalDateTime getDateHistortiquePrescriptionRadiotherapieFrom(){
        return this.dateHistortiquePrescriptionRadiotherapieFrom;
    }
    public void setDateHistortiquePrescriptionRadiotherapieFrom(LocalDateTime dateHistortiquePrescriptionRadiotherapieFrom){
        this.dateHistortiquePrescriptionRadiotherapieFrom = dateHistortiquePrescriptionRadiotherapieFrom;
    }
    public LocalDateTime getDateHistortiquePrescriptionRadiotherapieTo(){
        return this.dateHistortiquePrescriptionRadiotherapieTo;
    }
    public void setDateHistortiquePrescriptionRadiotherapieTo(LocalDateTime dateHistortiquePrescriptionRadiotherapieTo){
        this.dateHistortiquePrescriptionRadiotherapieTo = dateHistortiquePrescriptionRadiotherapieTo;
    }


    public PrescriptionRadiotherapieCriteria getPrescriptionRadiotherapie(){
        return this.prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapie(PrescriptionRadiotherapieCriteria prescriptionRadiotherapie){
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }
    public List<PrescriptionRadiotherapieCriteria> getPrescriptionRadiotherapies(){
        return this.prescriptionRadiotherapies;
    }

    public void setPrescriptionRadiotherapies(List<PrescriptionRadiotherapieCriteria> prescriptionRadiotherapies){
        this.prescriptionRadiotherapies = prescriptionRadiotherapies;
    }

    public StatutRadiotherapieCriteria getStatutRadiotherapie(){
        return this.statutRadiotherapie;
    }

    public void setStatutRadiotherapie(StatutRadiotherapieCriteria statutRadiotherapie){
        this.statutRadiotherapie = statutRadiotherapie;
    }
    public List<StatutRadiotherapieCriteria> getStatutRadiotherapies(){
        return this.statutRadiotherapies;
    }

    public void setStatutRadiotherapies(List<StatutRadiotherapieCriteria> statutRadiotherapies){
        this.statutRadiotherapies = statutRadiotherapies;
    }
}
