/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnevnikgledanja.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Veco
 */
@Entity
@Table
public class Serija extends Entitet implements Serializable{
    
    private String naziv;
    private int brojsezona;
   
    private int dnevnik = 0;

    public int getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(int dnevnik) {
        this.dnevnik = dnevnik;
    }

    @OneToMany(mappedBy = "serija")
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojsezona() {
        return brojsezona;
    }

    public void setBrojsezona(int brojsezona) {
        this.brojsezona = brojsezona;
    }

    
    
}
