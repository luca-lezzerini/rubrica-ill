/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricaill.controller;

import it.sirfin.rubricaill.dto.RubricaRequest;
import it.sirfin.rubricaill.dto.RubricaResponse;
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

    List<RubricaResponse> rubrica = new ArrayList<>();

    int ID = 0;

    @RequestMapping("/rubricagg")
    @ResponseBody
    public List<RubricaResponse> rubrica(@RequestBody RubricaRequest dto) {
        System.out.println("Ricevuto dto " + dto);
        String n = dto.getNome();
        String c = dto.getCognome();
        String t = dto.getTelefono();
        ID++;
        RubricaResponse r = new RubricaResponse();
        r.setNome(n);
        r.setCognome(c);
        r.setTelefono(t);
        r.setID(ID);
        rubrica.add(r);
        System.out.println("Restituisco dto " + rubrica);
        return rubrica;
    }

    @RequestMapping("/rubricasvu")
    @ResponseBody
    public List<RubricaResponse> svuota(@RequestBody RubricaRequest dto) {
        System.out.println("Ricevuto dto " + dto);
        ID = 0;
        rubrica.clear();
        System.out.println("Restituisco dto " + rubrica);
        return rubrica;
    }

    @RequestMapping("/rubricalis")
    @ResponseBody
    public List<RubricaResponse> ritornaLista(@RequestBody RubricaRequest dto) {
        System.out.println("Ricevuto dto " + dto);
        System.out.println("Restituisco dto " + rubrica);
        return rubrica;
    }

}
