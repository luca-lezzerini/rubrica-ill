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
import it.sirfin.rubricaill.dto.ContattoRes;
import it.sirfin.rubricaill.model.ContattoReq;
import it.sirfin.rubricaill.service.RubricaService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Creazione classe Controller.
 */
@CrossOrigin("*")
@RestController
public class RubricaIllController {

    /**
     * Con @Autowired inietto l'implementazione.
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
    public ContattoRes rubricaAgg(@RequestBody ContattoReq reqDto) {
        ContattoRes ins = new ContattoRes(rubricaService.rubricaAgg(reqDto));
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
    public ContattoRes cancellaPerID(@RequestBody ContattoReq reqDto) {
        ContattoRes rem = new ContattoRes(rubricaService.cancellaPerID(reqDto));
        return rem;
    }

    /**
     * Metodo rubricaSvuota() che utilizza il servizio per svuotare la rubrica
     *
     * @return
     */
    @RequestMapping("/rubricasvu")
    @ResponseBody
    public ContattoRes rubricaSvuota() {
        ContattoRes svu = new ContattoRes(rubricaService.rubricaSvuota());
        return svu;
    }

    /**
     * Metodo ritornaLista() hce utilizza il servizio per mostrare la lista.
     *
     * @return
     */
    @RequestMapping("/rubricalis")
    @ResponseBody
    public ContattoRes ritornaLista() {
        ContattoRes list = new ContattoRes(rubricaService.ritornaLista());
        return list;
    }

}
