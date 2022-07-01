package restcontroller;

import converter.RecensioneConverter;
import entity.Recensione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.RecensioneService;

import java.util.List;

@RestController
@RequestMapping("api/recensione")
public class RecensioneRestController {
    @Autowired
    RecensioneService recensioneService;
    @Autowired
    RecensioneConverter recensioneConverter;
    @GetMapping(value = "/getAllRecensioni")
    List<Recensione> getAllRecensioni() {
        List<Recensione> recensioneList = recensioneService.getAllRecensioni();
        return recensioneList;
    }
    @GetMapping(value = "/addRecensione")
    List<Recensione> getAddRecensione() {
        List<Recensione> recensioneList = recensioneService.getAddRecensione();
        return recensioneList;
    }
    @GetMapping(value = "/getsaveRecensione")
    List<Recensione> getSaveArticolo() {
        List<Recensione> recensioneList = recensioneService.getSaveRecensione();
        return recensioneList;
    }
}