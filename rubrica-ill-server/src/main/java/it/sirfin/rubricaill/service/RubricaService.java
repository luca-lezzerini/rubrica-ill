
package it.sirfin.rubricaill.service;

import it.sirfin.rubricaill.dto.ContattoRes;
import it.sirfin.rubricaill.model.ContattoReq;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Definisce l'interfaccia della dipendenza da iniettare
 */
public interface RubricaService {

    List<ContattoReq> rubricaAgg(ContattoReq reqDto);

    List<ContattoReq> cancellaPerID(ContattoReq reqDto);

    List<ContattoReq> rubricaSvuota();

    List<ContattoReq> ritornaLista();
    
    @ResponseBody
    ContattoRes inizializzazioneAggiungi(@RequestBody ContattoReq reqDto);
    
    void inizializzazioneCancella();
    
    void inizializzazioneSvuota();
    
    void inizializzazioneLista();
}
