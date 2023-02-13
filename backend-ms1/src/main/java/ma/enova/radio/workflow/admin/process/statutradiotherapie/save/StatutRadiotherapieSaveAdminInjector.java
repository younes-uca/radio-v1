package ma.enova.radio.workflow.admin.process.statutradiotherapie.save;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StatutRadiotherapieSaveAdminInjector{

    @Bean
    public StatutRadiotherapieSaveAdminProcess statutRadiotherapieSaveAdmin(StatutRadiotherapieAdminService service) {
        return new StatutRadiotherapieSaveAdminProcessImpl(service);
    }

}
