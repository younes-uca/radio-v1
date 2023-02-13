package ma.enova.radio.workflow.admin.process.statutradiotherapie.save;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class StatutRadiotherapieSaveAdminProcessImpl extends AbstractProcessImpl<StatutRadiotherapieSaveAdminInput, StatutRadiotherapieSaveAdminOutput> implements StatutRadiotherapieSaveAdminProcess {

    @Override
    public void init(StatutRadiotherapieSaveAdminInput input, StatutRadiotherapieSaveAdminOutput output) {
        
    }

    @Override
    public void validate(StatutRadiotherapieSaveAdminInput input, StatutRadiotherapieSaveAdminOutput output, Result<StatutRadiotherapieSaveAdminInput, StatutRadiotherapieSaveAdminOutput> result) {
        
    }

    @Override
    public void run(StatutRadiotherapieSaveAdminInput input, StatutRadiotherapieSaveAdminOutput output, Result<StatutRadiotherapieSaveAdminInput, StatutRadiotherapieSaveAdminOutput> result) {
        
    }
    


    private StatutRadiotherapieAdminService service;
    public StatutRadiotherapieSaveAdminProcessImpl(StatutRadiotherapieAdminService service) {
        this.service = service;
    }

}
