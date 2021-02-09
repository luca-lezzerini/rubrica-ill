/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricaill.controller;

import it.sirfin.rubricaill.dto.ContattoReq;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RubricaIllController {

    List<ContattoReq> rubrica = new ArrayList<>();

    int contatore = 0;

    @RequestMapping("/rubricagg")
    @ResponseBody
    public List<ContattoReq> rubricaAgg(@RequestBody ContattoReq Contatto) {
        Contatto.setID(contatore);
        this.rubrica.add(Contatto);
        contatore++;
        return this.rubrica;
    }

    @RequestMapping("/rubricasvu")
    @ResponseBody
    public List<ContattoReq> rubricaSvuota() {
        this.rubrica = new ArrayList();
        this.contatore = 0;
        return this.rubrica;
    }

    @RequestMapping("/rubricalis")
    @ResponseBody
    public List<ContattoReq> ritornaLista() {
        return this.rubrica;
    }

    @RequestMapping("/rubricarem")
    @ResponseBody
    public List<ContattoReq> cancellaPerID(@RequestBody ContattoReq dto) {
        System.out.println("Elemento da rimuovere" + dto);
        try {
            this.rubrica.removeIf(r -> r.getID() == dto.getID());
            System.out.println("Elemento cancellato");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return this.rubrica;
    }

}
