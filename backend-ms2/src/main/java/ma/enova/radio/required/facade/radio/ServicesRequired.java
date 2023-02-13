package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.ServicesDto;
import ma.enova.radio.required.criteria.radio.ServicesCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/services")
public class ServicesRequired extends AbstractRequired<ServicesDto,ServicesDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "services/";


    @GetMapping("")
    public List<ServicesDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<ServicesDto> findByCriteria(@RequestBody ServicesCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public ServicesRequired() {
        super(ServicesDto.class, ServicesDto[].class);
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
