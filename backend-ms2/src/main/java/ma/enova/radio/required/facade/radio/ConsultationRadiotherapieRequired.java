package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.ConsultationRadiotherapieDto;
import ma.enova.radio.required.criteria.radio.ConsultationRadiotherapieCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/consultationRadiotherapie")
public class ConsultationRadiotherapieRequired extends AbstractRequired<ConsultationRadiotherapieDto,ConsultationRadiotherapieDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "consultationRadiotherapie/";


    @GetMapping("")
    public List<ConsultationRadiotherapieDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<ConsultationRadiotherapieDto> findByCriteria(@RequestBody ConsultationRadiotherapieCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public ConsultationRadiotherapieRequired() {
        super(ConsultationRadiotherapieDto.class, ConsultationRadiotherapieDto[].class);
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
