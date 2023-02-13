package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.HistortiquePrescriptionRadiotherapieDto;
import ma.enova.radio.required.criteria.radio.HistortiquePrescriptionRadiotherapieCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/histortiquePrescriptionRadiotherapie")
public class HistortiquePrescriptionRadiotherapieRequired extends AbstractRequired<HistortiquePrescriptionRadiotherapieDto,HistortiquePrescriptionRadiotherapieDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "histortiquePrescriptionRadiotherapie/";


    @GetMapping("")
    public List<HistortiquePrescriptionRadiotherapieDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<HistortiquePrescriptionRadiotherapieDto> findByCriteria(@RequestBody HistortiquePrescriptionRadiotherapieCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public HistortiquePrescriptionRadiotherapieRequired() {
        super(HistortiquePrescriptionRadiotherapieDto.class, HistortiquePrescriptionRadiotherapieDto[].class);
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
