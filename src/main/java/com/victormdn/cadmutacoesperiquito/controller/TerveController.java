package com.victormdn.cadmutacoesperiquito.controller;

import com.victormdn.cadmutacoesperiquito.service.TerveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/terve")
public class TerveController {
    @Autowired
    private TerveService terveService;

    @RequestMapping(method = RequestMethod.GET)
    public String testeInicial(){
        return terveService.testeInicial();
    }
}


