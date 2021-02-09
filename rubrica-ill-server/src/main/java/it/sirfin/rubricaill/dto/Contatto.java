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
public class Contatto {

    private String nome;
    private String cognome;
    private String telefono;
    private int ID;

    public Contatto() {
    }

    public Contatto(String nome, String cognome, String telefono, int ID) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
        return "RubricaResponse{" + "nome=" + nome + ", cognome=" + cognome + ", telefono=" + telefono + ", ID=" + ID + '}';
    }

}
