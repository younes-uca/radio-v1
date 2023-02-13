package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.SpecialiteDto;
import ma.enova.radio.required.criteria.radio.SpecialiteCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/specialite")
public class SpecialiteRequired extends AbstractRequired<SpecialiteDto,SpecialiteDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "specialite/";


    @GetMapping("")
    public List<SpecialiteDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<SpecialiteDto> findByCriteria(@RequestBody SpecialiteCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public SpecialiteRequired() {
        super(SpecialiteDto.class, SpecialiteDto[].class);
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
