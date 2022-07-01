package com.example.ultimoesame.Client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface ArticoloClient {

    @GetMapping(value = "/getNomePrezzoById")
    public String getNomePrezzo(@RequestParam Long id);


}