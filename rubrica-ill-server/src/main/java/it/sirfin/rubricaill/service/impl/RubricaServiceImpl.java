/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricaill.service.impl;

import it.sirfin.rubricaill.dto.ContattoReq;
import it.sirfin.rubricaill.service.RubricaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RubricaServiceImpl implements RubricaService {

    int contatoreId = 0;
    List<ContattoReq> rubrica = new ArrayList<>();

    @Override
    public List<ContattoReq> rubricaAgg(ContattoReq contatto) {
        contatto.setId(contatoreId);
        rubrica.add(contatto);
        contatoreId++;
        return rubrica;

    }

    @Override
    public List<ContattoReq> cancellaPerID(ContattoReq contatto) {
        rubrica.removeIf(r -> r.getId() == contatto.getId());
        return rubrica;
    }

    @Override
    public List<ContattoReq> rubricaSvuota() {
        rubrica.clear();
        contatoreId = 0;
        return rubrica;
    }

    @Override
    public List<ContattoReq> ritornaLista() {
        return rubrica;
    }
}
