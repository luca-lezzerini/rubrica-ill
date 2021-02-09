/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricaill.controller;

import it.sirfin.rubricaill.dto.Contatto;
import it.sirfin.rubricaill.dto.ContattoReq;
import it.sirfin.rubricaill.service.RubricaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RubricaIllController {

    @Autowired
    RubricaService rubricaService;

    @RequestMapping("/rubricagg")
    @ResponseBody
    public Contatto rubricaAgg(@RequestBody ContattoReq reqDto) {
        Contatto ins = new Contatto(rubricaService.rubricaAgg(reqDto));
        return ins;
    }

    @RequestMapping("/rubricarem")
    @ResponseBody
    public Contatto cancellaPerID(@RequestBody ContattoReq reqDto) {
        Contatto rem = new Contatto(rubricaService.cancellaPerID(reqDto));
        return rem;
    }

    @RequestMapping("/rubricasvu")
    @ResponseBody
    public Contatto rubricaSvuota() {
        Contatto svu = new Contatto(rubricaService.rubricaSvuota());
        return svu;
    }

    @RequestMapping("/rubricalis")
    @ResponseBody
    public Contatto ritornaLista() {
        Contatto list = new Contatto(rubricaService.ritornaLista());
        return list;
    }

}
