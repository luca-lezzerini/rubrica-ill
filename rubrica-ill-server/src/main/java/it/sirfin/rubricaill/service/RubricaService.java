package it.sirfin.rubricaill.service;

import it.sirfin.rubricaill.model.Contatto;
import java.util.List;

/**
 * Definisce l'interfaccia della dipendenza da iniettare
 */
public interface RubricaService {

    List<Contatto> rubricaAgg(Contatto c);

    List<Contatto> cancellaPerID(Contatto c);

    List<Contatto> rubricaSvuota();

    List<Contatto> ritornaLista();

    List<Contatto> cercaStringa(String stringa);

}
