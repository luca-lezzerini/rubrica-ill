/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricaill.service.impl;

import it.sirfin.rubricaill.model.ContattoReq;
import it.sirfin.rubricaill.repository.ContattoRepository;
import it.sirfin.rubricaill.service.RubricaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementazione dei Servizi.
 */
@Service

/**
 * Creazione classe che implementa l'interfaccia.
 */
public class RubricaServiceImpl implements RubricaService {

    @Autowired
    ContattoRepository contattoRepository;

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
        contattoRepository.save(contatto);
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
        contattoRepository.deleteById(contatto.getId());
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
        contattoRepository.deleteAllInBatch();
        return rubrica;

    }

    /**
     * ritornaLista() serve a ritornare la rubrica per mostrarla.
     *
     * @return
     */
    @Override
    public List<ContattoReq> ritornaLista() {
        List<ContattoReq> el = contattoRepository.findAll();
        return el;

    }
}
