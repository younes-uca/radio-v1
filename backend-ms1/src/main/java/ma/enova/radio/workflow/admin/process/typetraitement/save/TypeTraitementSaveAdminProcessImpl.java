package ma.enova.radio.workflow.admin.process.typetraitement.save;
import ma.enova.radio.service.facade.admin.TypeTraitementAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class TypeTraitementSaveAdminProcessImpl extends AbstractProcessImpl<TypeTraitementSaveAdminInput, TypeTraitementSaveAdminOutput> implements TypeTraitementSaveAdminProcess {

    @Override
    public void init(TypeTraitementSaveAdminInput input, TypeTraitementSaveAdminOutput output) {
        
    }

    @Override
    public void validate(TypeTraitementSaveAdminInput input, TypeTraitementSaveAdminOutput output, Result<TypeTraitementSaveAdminInput, TypeTraitementSaveAdminOutput> result) {
        
    }

    @Override
    public void run(TypeTraitementSaveAdminInput input, TypeTraitementSaveAdminOutput output, Result<TypeTraitementSaveAdminInput, TypeTraitementSaveAdminOutput> result) {
        
    }
    


    private TypeTraitementAdminService service;
    public TypeTraitementSaveAdminProcessImpl(TypeTraitementAdminService service) {
        this.service = service;
    }

}
