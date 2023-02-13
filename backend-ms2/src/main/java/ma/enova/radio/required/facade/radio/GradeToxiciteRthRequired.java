package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.GradeToxiciteRthDto;
import ma.enova.radio.required.criteria.radio.GradeToxiciteRthCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/gradeToxiciteRth")
public class GradeToxiciteRthRequired extends AbstractRequired<GradeToxiciteRthDto,GradeToxiciteRthDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "gradeToxiciteRth/";


    @GetMapping("")
    public List<GradeToxiciteRthDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<GradeToxiciteRthDto> findByCriteria(@RequestBody GradeToxiciteRthCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public GradeToxiciteRthRequired() {
        super(GradeToxiciteRthDto.class, GradeToxiciteRthDto[].class);
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
