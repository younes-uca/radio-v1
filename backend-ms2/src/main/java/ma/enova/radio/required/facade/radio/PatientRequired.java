package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.PatientDto;
import ma.enova.radio.required.criteria.radio.PatientCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/patient")
public class PatientRequired extends AbstractRequired<PatientDto,PatientDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "patient/";


    @GetMapping("")
    public List<PatientDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<PatientDto> findByCriteria(@RequestBody PatientCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public PatientRequired() {
        super(PatientDto.class, PatientDto[].class);
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
