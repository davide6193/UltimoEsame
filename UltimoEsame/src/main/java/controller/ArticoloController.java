package controller;


import com.example.ultimoesame.entity.Articolo;
import entity.Articolo;
import entity.Recensione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ArticoloService;

import java.util.List;

@Controller
@RequestMapping(value = "/Articolo")
public class ArticoloController {
    @Autowired
    ArticoloService articoloService;
    @GetMapping(value = "/listaArticoli")
    public ModelAndView getArticoli(){
        ModelAndView modelAndView = new ModelAndView();
        List<Articolo> articoloList = articoloService.getAllArticoli();
        modelAndView.addObject("elencoArticoli",articoloList);
        modelAndView.setViewName("/Articolo/List");
        return  modelAndView;
    }
    @GetMapping(value = "/AddArticolo")
    public ModelAndView addArticolo(){
        String AddEditArticolo = null;
        Articolo articolo;
        ModelAndView modelAndView = new ModelAndView("Articolo" AddEditArticolo");
        Articolo articolo = new Articolo();
        modelAndView.addObject("oggettoArticolo",articolo);
        return modelAndView;
    }
    @PostMapping(value = "/SaveArticolo")
    public ModelAndView saveArticolo(@ModelAttribute("oggettoArticolo") Articolo articolo) {
        ModelAndView modelAndView = new ModelAndView();
        articoloService.save(articolo);
        List<Articolo> articoloList = articoloService.getAllArticoli();
        modelAndView.addObject("elencoArticoli",articoloList);
        modelAndView.setViewName("/Articolo/List");
        return  modelAndView;
    }
    @GetMapping(value="/DeleteArticolo/{id}")
    public ModelAndView deleteArticolo(@PathVariable("id") long id){
        articoloService.deleteById(id);
        return  getArticoli();
    }
    @GetMapping (value="/EditArticolo/{id}")
    public ModelAndView editArticolo(@PathVariable("id") long id){
        Recensione articoloUpdate = articoloService.getReferenceById(id);
        ModelAndView modelAndView=new ModelAndView("Articolo/AddEditArticolo");
        modelAndView.addObject("oggettoArticolo",articoloUpdate);
        return modelAndView;
    }
}