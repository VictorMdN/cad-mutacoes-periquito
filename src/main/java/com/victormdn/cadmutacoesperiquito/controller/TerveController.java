package com.victormdn.cadmutacoesperiquito.controller;

import com.victormdn.cadmutacoesperiquito.service.TerveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/terve")
public class TerveController {
    @Autowired
    private TerveService terveService;

    @RequestMapping(method = RequestMethod.GET)
    public String testeInicial(@RequestParam(required = false) String p1){
        return terveService.testeInicial(p1);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String testePost(@RequestBody String body){
        return terveService.testePost(body);
    }
}


