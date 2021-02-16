/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricaill.dto;

import it.sirfin.rubricaill.model.Contatto;

/**
 *
 * @author Admin
 */
public class ContattoReq {
    private Contatto contatto;

    public ContattoReq() {
    }

    public ContattoReq(Contatto contatto) {
        this.contatto = contatto;
    }

    public Contatto getContatto() {
        return contatto;
    }

    public void setContatto(Contatto contatto) {
        this.contatto = contatto;
    }

    @Override
    public String toString() {
        return "ContattoReq{" + "contatto=" + contatto + '}';
    }
    
}
