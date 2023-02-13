package ma.enova.radio.workflow.admin.process.histortiqueprescriptionradiotherapie.save;
import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class HistortiquePrescriptionRadiotherapieSaveAdminProcessImpl extends AbstractProcessImpl<HistortiquePrescriptionRadiotherapieSaveAdminInput, HistortiquePrescriptionRadiotherapieSaveAdminOutput> implements HistortiquePrescriptionRadiotherapieSaveAdminProcess {

    @Override
    public void init(HistortiquePrescriptionRadiotherapieSaveAdminInput input, HistortiquePrescriptionRadiotherapieSaveAdminOutput output) {
        
    }

    @Override
    public void validate(HistortiquePrescriptionRadiotherapieSaveAdminInput input, HistortiquePrescriptionRadiotherapieSaveAdminOutput output, Result<HistortiquePrescriptionRadiotherapieSaveAdminInput, HistortiquePrescriptionRadiotherapieSaveAdminOutput> result) {
        
    }

    @Override
    public void run(HistortiquePrescriptionRadiotherapieSaveAdminInput input, HistortiquePrescriptionRadiotherapieSaveAdminOutput output, Result<HistortiquePrescriptionRadiotherapieSaveAdminInput, HistortiquePrescriptionRadiotherapieSaveAdminOutput> result) {
        
    }
    


    private HistortiquePrescriptionRadiotherapieAdminService service;
    public HistortiquePrescriptionRadiotherapieSaveAdminProcessImpl(HistortiquePrescriptionRadiotherapieAdminService service) {
        this.service = service;
    }

}
