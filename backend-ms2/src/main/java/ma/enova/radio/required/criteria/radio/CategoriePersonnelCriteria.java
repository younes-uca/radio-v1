package  ma.enova.radio.required.criteria.radio;

import ma.enova.radio.zynerator.criteria.BaseCriteria;
    import java.util.List;



public class CategoriePersonnelCriteria extends BaseCriteria {

    private String libelle;
    private String libelleLike;
    private String code;
    private String codeLike;

    private ServicesCriteria services ;
    private List<ServicesCriteria> servicess ;


    public CategoriePersonnelCriteria(){}

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



    public ServicesCriteria getServices(){
        return this.services;
    }

    public void setServices(ServicesCriteria services){
        this.services = services;
    }
    public List<ServicesCriteria> getServicess(){
        return this.servicess;
    }

    public void setServicess(List<ServicesCriteria> servicess){
        this.servicess = servicess;
    }
}
