package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.CategoriePersonnelDto;
import ma.enova.radio.required.criteria.radio.CategoriePersonnelCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/categoriePersonnel")
public class CategoriePersonnelRequired extends AbstractRequired<CategoriePersonnelDto,CategoriePersonnelDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "categoriePersonnel/";


    @GetMapping("")
    public List<CategoriePersonnelDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<CategoriePersonnelDto> findByCriteria(@RequestBody CategoriePersonnelCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public CategoriePersonnelRequired() {
        super(CategoriePersonnelDto.class, CategoriePersonnelDto[].class);
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
