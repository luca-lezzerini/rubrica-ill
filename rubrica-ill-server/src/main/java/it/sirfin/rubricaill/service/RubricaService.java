
package it.sirfin.rubricaill.service;

import it.sirfin.rubricaill.model.ContattoReq;
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
