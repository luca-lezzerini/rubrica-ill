/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricaill.dto;

/**
 *
 * @author Palo
 */

/**
 * Creazione classe ContattoReq con proprietà private, costruttori,
 * metodi getter e setter
 */
public class ContattoReq {

    private String nome;
    private String cognome;
    private String telefono;
    private int id;

    public ContattoReq() {
    }

    public ContattoReq(String nome, String cognome, String telefono, int id) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ContattoReq{" + "nome=" + nome + ", cognome=" + cognome + ", telefono=" + telefono + ", ID=" + id + '}';
    }

}
