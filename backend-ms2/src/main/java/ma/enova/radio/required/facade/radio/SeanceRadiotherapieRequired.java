package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.SeanceRadiotherapieDto;
import ma.enova.radio.required.criteria.radio.SeanceRadiotherapieCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/seanceRadiotherapie")
public class SeanceRadiotherapieRequired extends AbstractRequired<SeanceRadiotherapieDto,SeanceRadiotherapieDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "seanceRadiotherapie/";


    @GetMapping("")
    public List<SeanceRadiotherapieDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<SeanceRadiotherapieDto> findByCriteria(@RequestBody SeanceRadiotherapieCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public SeanceRadiotherapieRequired() {
        super(SeanceRadiotherapieDto.class, SeanceRadiotherapieDto[].class);
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
