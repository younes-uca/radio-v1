package ma.enova.radio.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "decision_traitement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="decision_traitement_seq",sequenceName="decision_traitement_seq",allocationSize=1, initialValue = 1)
public class DecisionTraitement   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String code;
    private LocalDateTime dateDecisionTraitement ;
    @Column(length = 500)
    private String decisionTherapeutique;
    @Column(length = 500)
    private String etat;
    @Column(columnDefinition = "boolean default false")
    private Boolean urgence = false;



    public DecisionTraitement(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="decision_traitement_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public LocalDateTime getDateDecisionTraitement(){
        return this.dateDecisionTraitement;
    }
    public void setDateDecisionTraitement(LocalDateTime dateDecisionTraitement){
        this.dateDecisionTraitement = dateDecisionTraitement;
    }
    public String getDecisionTherapeutique(){
        return this.decisionTherapeutique;
    }
    public void setDecisionTherapeutique(String decisionTherapeutique){
        this.decisionTherapeutique = decisionTherapeutique;
    }
    public String getEtat(){
        return this.etat;
    }
    public void setEtat(String etat){
        this.etat = etat;
    }
    public Boolean  getUrgence(){
        return this.urgence;
    }
    public void setUrgence(Boolean urgence){
        this.urgence = urgence;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DecisionTraitement decisionTraitement = (DecisionTraitement) o;
        return id != null && id.equals(decisionTraitement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

