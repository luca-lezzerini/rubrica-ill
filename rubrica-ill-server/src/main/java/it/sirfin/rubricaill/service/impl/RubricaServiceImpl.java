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
 * Iniezione dei Servizi.
 */
@Service
public class RubricaServiceImpl implements RubricaService {

    int contatoreId = 0;
    List<ContattoReq> rubrica = new ArrayList<>();

    /**
     * Metodo rubricaAgg()
     * Il metodo inserisce il contatto nella rubrica.
     * Con l'utilizzo di .setId inserisco dentro l'oggetto contatto il valore
     * dell'Id e con add lo aggiungo alla rubrica (arraylist).
     */
    
    @Override
    public List<ContattoReq> rubricaAgg(ContattoReq contatto) {
        contatto.setId(contatoreId);
        rubrica.add(contatto);
        contatoreId++;
        return rubrica;

    }
       /**
         *  Utilizzo del metodo getter. Il metodo all'interno della classe
         *  serve a rimuovere il contatto dalla rubrica che ha l'Id uguale
         *  all'Id dell'oggetto ricevuto come richiesta.
         */
    
    @Override
    public List<ContattoReq> cancellaPerID(ContattoReq contatto) {
        rubrica.removeIf(r -> r.getId() == contatto.getId());
        return rubrica;
    }
       /**
         * Utilizzo del metodo clear nell'arraylist. Rimuove tutti
         * gli elementi dalla lista.
         */

    @Override
    public List<ContattoReq> rubricaSvuota() {
        rubrica.clear();
        contatoreId = 0;
        return rubrica;
    }
       /**
         * L'utilizzo di tale metodo serve a tornare sulla rubrica
         * per poi mostrarla.
         *
         */

    @Override
    public List<ContattoReq> ritornaLista() {
        return rubrica;
    }
}
