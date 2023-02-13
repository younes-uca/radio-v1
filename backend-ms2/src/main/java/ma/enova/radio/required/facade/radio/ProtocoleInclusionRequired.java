package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.ProtocoleInclusionDto;
import ma.enova.radio.required.criteria.radio.ProtocoleInclusionCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/protocoleInclusion")
public class ProtocoleInclusionRequired extends AbstractRequired<ProtocoleInclusionDto,ProtocoleInclusionDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "protocoleInclusion/";


    @GetMapping("")
    public List<ProtocoleInclusionDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<ProtocoleInclusionDto> findByCriteria(@RequestBody ProtocoleInclusionCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public ProtocoleInclusionRequired() {
        super(ProtocoleInclusionDto.class, ProtocoleInclusionDto[].class);
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
