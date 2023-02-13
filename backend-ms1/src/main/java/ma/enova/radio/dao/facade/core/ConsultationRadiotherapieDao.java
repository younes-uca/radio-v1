package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.ConsultationRadiotherapie;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ConsultationRadiotherapieDao extends AbstractRepository<ConsultationRadiotherapie,Long> {

    List<ConsultationRadiotherapie> findByMedecinIpp(String ipp);
    int deleteByMedecinIpp(String ipp);
    List<ConsultationRadiotherapie> findByTypeConsultationRadiotherapieCode(String code);
    int deleteByTypeConsultationRadiotherapieCode(String code);
    List<ConsultationRadiotherapie> findByTypeToxiciteRthCode(String code);
    int deleteByTypeToxiciteRthCode(String code);
    List<ConsultationRadiotherapie> findByGradeToxiciteRthCode(String code);
    int deleteByGradeToxiciteRthCode(String code);
    List<ConsultationRadiotherapie> findByPrescriptionRadiotherapieId(Long id);
    int deleteByPrescriptionRadiotherapieId(Long id);

}
