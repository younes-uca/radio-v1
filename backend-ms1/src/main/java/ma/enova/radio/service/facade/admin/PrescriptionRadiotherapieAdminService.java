package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.ws.dto.PrescriptionRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.PrescriptionRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.PrescriptionRadiotherapieHistoryCriteria;


public interface PrescriptionRadiotherapieAdminService extends IService<PrescriptionRadiotherapie, PrescriptionRadiotherapieDto,PrescriptionRadiotherapieCriteria, PrescriptionRadiotherapieHistoryCriteria> {

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
