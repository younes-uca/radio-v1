package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.DecisionTraitement;
import ma.enova.radio.bean.history.DecisionTraitementHistory;
import ma.enova.radio.dao.criteria.core.DecisionTraitementCriteria;
import ma.enova.radio.dao.criteria.history.DecisionTraitementHistoryCriteria;
import ma.enova.radio.service.facade.admin.DecisionTraitementAdminService;
import ma.enova.radio.ws.converter.DecisionTraitementConverter;
import ma.enova.radio.ws.dto.DecisionTraitementDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages decisionTraitement services")
@RestController
@RequestMapping("/api/decisionTraitement")
public class DecisionTraitementRestAdmin  extends AbstractController<DecisionTraitement, DecisionTraitementDto, DecisionTraitementHistory, DecisionTraitementCriteria, DecisionTraitementHistoryCriteria, DecisionTraitementAdminService, DecisionTraitementConverter> {

    @ApiOperation("Finds a list of all decisionTraitements")
    @GetMapping("")
    public ResponseEntity<List<DecisionTraitementDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  decisionTraitement")
    @PutMapping("")
    public ResponseEntity<DecisionTraitementDto> update(@RequestBody DecisionTraitementDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a decisionTraitement by id")
    @GetMapping("{id}")
    public ResponseEntity<DecisionTraitementDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  decisionTraitement")
    @PostMapping("")
    public ResponseEntity<DecisionTraitementDto> save(@RequestBody DecisionTraitementDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of decisionTraitement")
    @DeleteMapping("/delete")
    public ResponseEntity<List<DecisionTraitementDto>> delete(@RequestBody List<DecisionTraitementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified decisionTraitement")
    @DeleteMapping("")
    public ResponseEntity<DecisionTraitementDto> delete(DecisionTraitementDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("Finds decisionTraitements by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<DecisionTraitementDto>> findByCriteria(@RequestBody DecisionTraitementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated decisionTraitements by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DecisionTraitementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports decisionTraitements by criteria")
    @PostMapping("exportDecisionTraitements")
    public ResponseEntity<InputStreamResource> export(@RequestBody DecisionTraitementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets decisionTraitement data size by criteria")
    @PostMapping("getDecisionTraitementsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody DecisionTraitementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets decisionTraitement history by id")
    @GetMapping("histDecisionTraitement/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets decisionTraitement paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DecisionTraitementHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports decisionTraitement history by criteria")
    @PostMapping("exportDecisionTraitementsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DecisionTraitementHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets decisionTraitement history data size by criteria")
    @PostMapping("getHistDecisionTraitementsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DecisionTraitementHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public DecisionTraitementRestAdmin (DecisionTraitementAdminService service, DecisionTraitementConverter converter) {
        super(service, converter);
    }


}