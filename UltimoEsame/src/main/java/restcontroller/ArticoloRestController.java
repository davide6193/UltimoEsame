package restcontroller;

import converter.ArticoloConverter;
import entity.Articolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ArticoloService;

import java.util.List;

@RestController
@RequestMapping("api/articolo")
public class ArticoloRestController {
    @Autowired
    ArticoloService articoloService;
    @Autowired
    ArticoloConverter articoloConverter;
    @GetMapping(value = "/getAllArticoli")
    List<Articolo> getAllDocenti() {
        List<Articolo> articoloList = articoloService.getAllArticoli();
        return articoloList;
    }
    @GetMapping(value = "/addArticolo")
    List<Articolo> getAddArticolo() {
        List<Articolo> articoloList = articoloService.getAddArticolo();
        return articoloList;
    }
    @GetMapping(value = "/getsaveArticolo")
    List<Articolo> getSaveArticolo() {
        List<Articolo> articoloList = articoloService.getSaveArticolo();
        return articoloList;
    }
}