package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.PrescriptionRadiotherapieDto;
import ma.enova.radio.required.criteria.radio.PrescriptionRadiotherapieCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/prescriptionRadiotherapie")
public class PrescriptionRadiotherapieRequired extends AbstractRequired<PrescriptionRadiotherapieDto,PrescriptionRadiotherapieDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "prescriptionRadiotherapie/";


    @GetMapping("")
    public List<PrescriptionRadiotherapieDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<PrescriptionRadiotherapieDto> findByCriteria(@RequestBody PrescriptionRadiotherapieCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public PrescriptionRadiotherapieRequired() {
        super(PrescriptionRadiotherapieDto.class, PrescriptionRadiotherapieDto[].class);
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
