package ma.enova.radio.workflow.admin.process.histortiqueprescriptionradiotherapie.save;
import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HistortiquePrescriptionRadiotherapieSaveAdminInjector{

    @Bean
    public HistortiquePrescriptionRadiotherapieSaveAdminProcess histortiquePrescriptionRadiotherapieSaveAdmin(HistortiquePrescriptionRadiotherapieAdminService service) {
        return new HistortiquePrescriptionRadiotherapieSaveAdminProcessImpl(service);
    }

}
