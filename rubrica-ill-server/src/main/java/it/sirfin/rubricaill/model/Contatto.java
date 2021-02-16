package it.sirfin.rubricaill.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Creazione classe Contatto con proprietà private, costruttori, metodi
 getter e setter
 */
@Entity
public class Contatto implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String cognome;

    @Column
    private String nome;

    @Column
    private String telefono;

    public Contatto(String cognome, String nome, String telefono) {
        this.cognome = cognome;
        this.nome = nome;
        this.telefono = telefono;
    }

    public Contatto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
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
        return "ContattoReq{" + "Id=" + id + ", cognome=" + cognome + ", nome=" + nome + ", telefono=" + telefono + '}';
    }

}
