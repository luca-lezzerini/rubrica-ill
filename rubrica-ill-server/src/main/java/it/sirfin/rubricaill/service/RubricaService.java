/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricaill.service;

import it.sirfin.rubricaill.dto.ContattoReq;
import java.util.List;

/**
 * Definisce l'interfaccia della dipendenza da iniettare
 */
public interface RubricaService {

    List<ContattoReq> rubricaAgg(ContattoReq reqDto);

    List<ContattoReq> cancellaPerID(ContattoReq reqDto);

    List<ContattoReq> rubricaSvuota();

    List<ContattoReq> ritornaLista();

}
