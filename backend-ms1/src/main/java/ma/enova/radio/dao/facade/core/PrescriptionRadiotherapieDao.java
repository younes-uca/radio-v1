package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PrescriptionRadiotherapieDao extends AbstractRepository<PrescriptionRadiotherapie,Long> {

    List<PrescriptionRadiotherapie> findByMedecinPrescripteurIpp(String ipp);
    int deleteByMedecinPrescripteurIpp(String ipp);
    List<PrescriptionRadiotherapie> findBySiteCode(String code);
    int deleteBySiteCode(String code);
    List<PrescriptionRadiotherapie> findByModaliteRadiotherapieCode(String code);
    int deleteByModaliteRadiotherapieCode(String code);
    List<PrescriptionRadiotherapie> findByViseeCode(String code);
    int deleteByViseeCode(String code);
    List<PrescriptionRadiotherapie> findByProtocoleInclusionCode(String code);
    int deleteByProtocoleInclusionCode(String code);
    List<PrescriptionRadiotherapie> findByStatutRadiotherapieId(Long id);
    int deleteByStatutRadiotherapieId(Long id);
    List<PrescriptionRadiotherapie> findByValidateurSimulationIpp(String ipp);
    int deleteByValidateurSimulationIpp(String ipp);
    List<PrescriptionRadiotherapie> findByPatientIpp(String ipp);
    int deleteByPatientIpp(String ipp);
    List<PrescriptionRadiotherapie> findByTypeTraitementId(Long id);
    int deleteByTypeTraitementId(Long id);

}
