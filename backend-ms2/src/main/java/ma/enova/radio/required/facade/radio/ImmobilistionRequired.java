package  ma.enova.radio.required.facade.radio;

import ma.enova.radio.required.dto.radio.ImmobilistionDto;
import ma.enova.radio.required.criteria.radio.ImmobilistionCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/immobilistion")
public class ImmobilistionRequired extends AbstractRequired<ImmobilistionDto,ImmobilistionDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "immobilistion/";


    @GetMapping("")
    public List<ImmobilistionDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<ImmobilistionDto> findByCriteria(@RequestBody ImmobilistionCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public ImmobilistionRequired() {
        super(ImmobilistionDto.class, ImmobilistionDto[].class);
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
