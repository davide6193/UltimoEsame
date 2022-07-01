package com.example.ultimoesame.Client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface RecensioneClient {

    @GetMapping(value = "/gettitoloarticoloById")
    public String getTitoloArticolo(@RequestParam Long id);


}