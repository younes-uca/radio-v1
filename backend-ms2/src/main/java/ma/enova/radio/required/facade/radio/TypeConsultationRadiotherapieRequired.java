package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.TypeConsultationRadiotherapieDto;
import ma.enova.radio.required.criteria.radio.TypeConsultationRadiotherapieCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/typeConsultationRadiotherapie")
public class TypeConsultationRadiotherapieRequired extends AbstractRequired<TypeConsultationRadiotherapieDto,TypeConsultationRadiotherapieDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "typeConsultationRadiotherapie/";


    @GetMapping("")
    public List<TypeConsultationRadiotherapieDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<TypeConsultationRadiotherapieDto> findByCriteria(@RequestBody TypeConsultationRadiotherapieCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public TypeConsultationRadiotherapieRequired() {
        super(TypeConsultationRadiotherapieDto.class, TypeConsultationRadiotherapieDto[].class);
    }

    @Override
    public RestTemplate getRestTemplate() {
        return restTemplate;
    }
    @Override
    public String getMsUrl() {
        return msUrl;
    }
    @Override
    public String getLocalUrl() {
        return localUrl;
    }
}
