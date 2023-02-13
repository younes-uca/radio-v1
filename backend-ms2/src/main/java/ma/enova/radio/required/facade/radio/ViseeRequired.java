package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.ViseeDto;
import ma.enova.radio.required.criteria.radio.ViseeCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/visee")
public class ViseeRequired extends AbstractRequired<ViseeDto,ViseeDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "visee/";


    @GetMapping("")
    public List<ViseeDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<ViseeDto> findByCriteria(@RequestBody ViseeCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public ViseeRequired() {
        super(ViseeDto.class, ViseeDto[].class);
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
