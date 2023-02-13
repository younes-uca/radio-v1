package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.PersonnelDto;
import ma.enova.radio.required.criteria.radio.PersonnelCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/personnel")
public class PersonnelRequired extends AbstractRequired<PersonnelDto,PersonnelDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "personnel/";


    @GetMapping("")
    public List<PersonnelDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<PersonnelDto> findByCriteria(@RequestBody PersonnelCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public PersonnelRequired() {
        super(PersonnelDto.class, PersonnelDto[].class);
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
