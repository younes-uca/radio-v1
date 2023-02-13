package  ma.enova.radio.dao.criteria.core;



import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.util.List;



public class GradeToxiciteRthCriteria extends BaseCriteria {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;



    public GradeToxiciteRthCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }


}
