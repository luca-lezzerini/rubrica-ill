/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricaill.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import it.sirfin.rubricaill.dto.Contatto;
import it.sirfin.rubricaill.dto.ContattoReq;
import it.sirfin.rubricaill.service.RubricaService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Creazione classe Controller.
 */
@CrossOrigin("*")
@RestController
public class RubricaIllController {

    /**
     * Con @Autowired definisco il punto di iniezione del servizio.
     */
    @Autowired
    RubricaService rubricaService;

    /**
     * Metodo rubricaAgg() che utilizza il servizio per inserire nuovi contatti.
     *
     * @param reqDto
     * @return
     */
    @RequestMapping("/rubricagg")
    @ResponseBody
    public Contatto rubricaAgg(@RequestBody ContattoReq reqDto) {
        Contatto ins = new Contatto(rubricaService.rubricaAgg(reqDto));
        return ins;
    }

    /**
     * Metodo cancellaPerID() che utilizza il servizio per cancellare i contatti
     * per id.
     *
     * @param reqDto
     * @return
     */
    @RequestMapping("/rubricarem")
    @ResponseBody
    public Contatto cancellaPerID(@RequestBody ContattoReq reqDto) {
        Contatto rem = new Contatto(rubricaService.cancellaPerID(reqDto));
        return rem;
    }

    /**
     * Metodo rubricaSvuota() che utilizza il servizio per svuotare la rubrica
     *
     * @return
     */
    @RequestMapping("/rubricasvu")
    @ResponseBody
    public Contatto rubricaSvuota() {
        Contatto svu = new Contatto(rubricaService.rubricaSvuota());
        return svu;
    }

    /**
     * Metodo ritornaLista() hce utilizza il servizio per mostrare la lista.
     *
     * @return
     */
    @RequestMapping("/rubricalis")
    @ResponseBody
    public Contatto ritornaLista() {
        Contatto list = new Contatto(rubricaService.ritornaLista());
        return list;
    }

}
