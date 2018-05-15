/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnevnikgledanja.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Veco
 */
@Entity
@Table
public class Sezona extends Entitet implements Serializable{
    
    private String naziv;
    private int brojepizoda;
    private int serija; 
    private int rednibroj;
    private int ocjena;

    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }
    private int pogledano=1;

    public int getPogledano() {
        return pogledano;
    }

    public void setPogledano(int pogledano) {
        this.pogledano = pogledano;
    }
    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojepizoda() {
        return brojepizoda;
    }

    public void setBrojepizoda(int brojepizoda) {
        this.brojepizoda = brojepizoda;
    }

    public int getSerija() {
        return serija;
    }

    public void setSerija(int serija) {
        this.serija = serija;
    }

    public int getRednibroj() {
        return rednibroj;
    }

    public void setRednibroj(int rednibroj) {
        this.rednibroj = rednibroj;
    }
}
