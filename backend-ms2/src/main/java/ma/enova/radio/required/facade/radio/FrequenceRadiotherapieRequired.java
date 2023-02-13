package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.FrequenceRadiotherapieDto;
import ma.enova.radio.required.criteria.radio.FrequenceRadiotherapieCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/frequenceRadiotherapie")
public class FrequenceRadiotherapieRequired extends AbstractRequired<FrequenceRadiotherapieDto,FrequenceRadiotherapieDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "frequenceRadiotherapie/";


    @GetMapping("")
    public List<FrequenceRadiotherapieDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<FrequenceRadiotherapieDto> findByCriteria(@RequestBody FrequenceRadiotherapieCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public FrequenceRadiotherapieRequired() {
        super(FrequenceRadiotherapieDto.class, FrequenceRadiotherapieDto[].class);
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
