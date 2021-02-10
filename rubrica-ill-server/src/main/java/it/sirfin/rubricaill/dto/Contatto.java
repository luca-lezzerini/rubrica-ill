/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricaill.dto;

import java.util.List;

/**
 * Creazione classe contatto, creazione arraylist di Contattoreq con costruttori
 * e metodi getter e setter
 */
public class Contatto {

    List<ContattoReq> contatto;

    public Contatto(List<ContattoReq> contatto) {
        this.contatto = contatto;
    }

    public Contatto() {
    }

    public List<ContattoReq> getContatto() {
        return contatto;
    }

    public void setContatto(List<ContattoReq> contatto) {
        this.contatto = contatto;
    }

    @Override
    public String toString() {
        return "Contatto{" + "contatto=" + contatto + '}';
    }

}
