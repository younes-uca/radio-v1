package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.SiteDto;
import ma.enova.radio.required.criteria.radio.SiteCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/site")
public class SiteRequired extends AbstractRequired<SiteDto,SiteDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "site/";


    @GetMapping("")
    public List<SiteDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<SiteDto> findByCriteria(@RequestBody SiteCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public SiteRequired() {
        super(SiteDto.class, SiteDto[].class);
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
