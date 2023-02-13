package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.PositionnementDto;
import ma.enova.radio.required.criteria.radio.PositionnementCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/positionnement")
public class PositionnementRequired extends AbstractRequired<PositionnementDto,PositionnementDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "positionnement/";


    @GetMapping("")
    public List<PositionnementDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<PositionnementDto> findByCriteria(@RequestBody PositionnementCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public PositionnementRequired() {
        super(PositionnementDto.class, PositionnementDto[].class);
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
