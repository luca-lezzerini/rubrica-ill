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

/**
 * Implementazione dei Servizi.
 */
@Service

/**
 * Creazione classe che implementa l'interfaccia.
 */
public class RubricaServiceImpl implements RubricaService {

    int contatoreId = 0;
    List<ContattoReq> rubrica = new ArrayList<>();

    /**
     * Metodo rubricaAgg() Il metodo inserisce il contatto nella rubrica. Con
     * l'utilizzo di .setId() si inserisce nel campo id di contatto il valore di
     * contatoreid (da incrementare) e con add viene aggiunto all'arraylist.
     *
     * @param contatto
     * @return
     */
    @Override
    public List<ContattoReq> rubricaAgg(ContattoReq contatto) {
        contatto.setId(contatoreId);
        rubrica.add(contatto);
        contatoreId++;
        return rubrica;

    }

    /**
     * Si utilizza .removeIf() per rimuovere il contatto della rubrica che ha
     * l'id uguale all'id del contatto ricevuto come request.
     *
     * @param contatto
     * @return
     */
    @Override
    public List<ContattoReq> cancellaPerID(ContattoReq contatto) {
        rubrica.removeIf(r -> r.getId() == contatto.getId());
        return rubrica;
    }

    /**
     * Metodo rubricaSvuota(). Si utilizza .clear() per rimuove tutti gli
     * elementi dalla lista.
     *
     * @return
     */
    @Override
    public List<ContattoReq> rubricaSvuota() {
        rubrica.clear();
        contatoreId = 0;
        return rubrica;
    }

    /**
     * ritornaLista() serve a ritornare la rubrica per mostrarla.
     *
     * @return
     */
    @Override
    public List<ContattoReq> ritornaLista() {
        return rubrica;
    }
}
