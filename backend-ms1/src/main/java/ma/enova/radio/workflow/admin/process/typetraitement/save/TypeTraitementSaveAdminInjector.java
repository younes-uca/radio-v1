package ma.enova.radio.workflow.admin.process.typetraitement.save;
import ma.enova.radio.service.facade.admin.TypeTraitementAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TypeTraitementSaveAdminInjector{

    @Bean
    public TypeTraitementSaveAdminProcess typeTraitementSaveAdmin(TypeTraitementAdminService service) {
        return new TypeTraitementSaveAdminProcessImpl(service);
    }

}
