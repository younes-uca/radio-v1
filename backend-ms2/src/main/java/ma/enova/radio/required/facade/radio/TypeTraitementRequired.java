package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.TypeTraitementDto;
import ma.enova.radio.required.criteria.radio.TypeTraitementCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/typeTraitement")
public class TypeTraitementRequired extends AbstractRequired<TypeTraitementDto,TypeTraitementDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "typeTraitement/";


    @GetMapping("")
    public List<TypeTraitementDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<TypeTraitementDto> findByCriteria(@RequestBody TypeTraitementCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public TypeTraitementRequired() {
        super(TypeTraitementDto.class, TypeTraitementDto[].class);
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
