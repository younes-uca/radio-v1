package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.ModaliteRadiotherapieDto;
import ma.enova.radio.required.criteria.radio.ModaliteRadiotherapieCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/modaliteRadiotherapie")
public class ModaliteRadiotherapieRequired extends AbstractRequired<ModaliteRadiotherapieDto,ModaliteRadiotherapieDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "modaliteRadiotherapie/";


    @GetMapping("")
    public List<ModaliteRadiotherapieDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<ModaliteRadiotherapieDto> findByCriteria(@RequestBody ModaliteRadiotherapieCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public ModaliteRadiotherapieRequired() {
        super(ModaliteRadiotherapieDto.class, ModaliteRadiotherapieDto[].class);
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
