package it.sirfin.rubricaill.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Creazione classe ContattoReq con proprietà private, costruttori, metodi
 * getter e setter
 */
@Entity
public class ContattoReq implements Serializable {

    @Id
    @GeneratedValue
    private Long Id;

    @Column
    private String cognome;

    @Column
    private String nome;

    @Column
    private String telefono;

    public ContattoReq(String cognome, String nome, String telefono) {
        this.cognome = cognome;
        this.nome = nome;
        this.telefono = telefono;
    }

    public ContattoReq() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ContattoReq{" + "Id=" + Id + ", cognome=" + cognome + ", nome=" + nome + ", telefono=" + telefono + '}';
    }

}
