/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricaill.dto;

import it.sirfin.rubricaill.model.Contatto;
import java.util.List;

/**
 * Creazione classe contatto, creazione arraylist di Contattoreq con costruttori
 * e metodi getter e setter
 */
public class ContattoRes {

    List<Contatto> listaContatti;

    public ContattoRes(List<Contatto> contatto) {
        this.listaContatti = contatto;
    }

    public ContattoRes() {
    }

    public List<Contatto> getListaContatti() {
        return listaContatti;
    }

    public void setListaContatti(List<Contatto> listaContatti) {
        this.listaContatti = listaContatti;
    }

    @Override
    public String toString() {
        return "ContattoRes{" + "listaContatti=" + listaContatti + '}';
    }

}
