package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.TypeToxiciteRthDto;
import ma.enova.radio.required.criteria.radio.TypeToxiciteRthCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/typeToxiciteRth")
public class TypeToxiciteRthRequired extends AbstractRequired<TypeToxiciteRthDto,TypeToxiciteRthDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "typeToxiciteRth/";


    @GetMapping("")
    public List<TypeToxiciteRthDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<TypeToxiciteRthDto> findByCriteria(@RequestBody TypeToxiciteRthCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public TypeToxiciteRthRequired() {
        super(TypeToxiciteRthDto.class, TypeToxiciteRthDto[].class);
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
