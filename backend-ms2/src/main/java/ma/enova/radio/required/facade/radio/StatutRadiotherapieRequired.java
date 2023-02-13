package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.StatutRadiotherapieDto;
import ma.enova.radio.required.criteria.radio.StatutRadiotherapieCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/statutRadiotherapie")
public class StatutRadiotherapieRequired extends AbstractRequired<StatutRadiotherapieDto,StatutRadiotherapieDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "statutRadiotherapie/";


    @GetMapping("")
    public List<StatutRadiotherapieDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<StatutRadiotherapieDto> findByCriteria(@RequestBody StatutRadiotherapieCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public StatutRadiotherapieRequired() {
        super(StatutRadiotherapieDto.class, StatutRadiotherapieDto[].class);
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
