package controller;


import com.example.ultimoesame.entity.Recensione;
import entity.Recensione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.RecensioneService;

import java.util.List;

@Controller
@RequestMapping(value = "/Recensione")
public class RecensioneController {
    @Autowired
    RecensioneService recensioneService;
    private String AddEditRecensione;

    @GetMapping(value = "/listaRecensioni")
    public ModelAndView getRecensioni(){
        ModelAndView modelAndView = new ModelAndView();
        List<Recensione> recensioneList = recensioneService.getAllRecensioni();
        modelAndView.addObject("elencoRecensioni",recensioneList);
        modelAndView.setViewName("/Recensione/List");
        return  modelAndView;
    }
    @GetMapping(value = "/AddRecensione")
    public ModelAndView addRecensione(){
        Recensione recensione;

        ModelAndView modelAndView = new ModelAndView("Recensione"/AddEditRecensione");
        Recensione recensione = new Recensione();
        modelAndView.addObject("oggettoRecensione",recensione);
        return modelAndView;
    }
    @PostMapping(value = "/SaveRecensione")
    public ModelAndView saveRecensione(@ModelAttribute("oggettoRecensione") Recensione recensione) {
        ModelAndView modelAndView = new ModelAndView();
        recensioneService.save(recensione);
        List<Recensione> recensioneList = recensioneService.getAllRecensioni();
        modelAndView.addObject("elencoRecensioni",recensioneList);
        modelAndView.setViewName("/Recensione/List");
        return  modelAndView;
    }
    @GetMapping(value="/DeleteRecensione/{id}")
    public ModelAndView deleteRecensione(@PathVariable("id") long id){
        recensioneService.deleteById(id);
        return  getRecensioni();
    }
    @GetMapping (value="/EditRecensione/{id}")
    public ModelAndView editRecensione(@PathVariable("id") long id){
        Recensione recensioneUpdate = recensioneService.getReferenceById(id);
        ModelAndView modelAndView=new ModelAndView("Recensione/AddEditRecensione");
        modelAndView.addObject("oggettoRecensione",recensioneUpdate);
        return modelAndView;
    }
}