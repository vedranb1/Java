/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnevnikgledanja.controller;

import dnevnikgledanja.model.Korisnik;
import dnevnikgledanja.utility.HibernateUtil;
import java.util.Date;
import org.hibernate.Session;


public class ObradaKorisnik<K extends Korisnik> {

    private final Session session;

    public ObradaKorisnik() {
        session = HibernateUtil.getSession();
    }

    public Korisnik save(K Korisnik) {
        
        session.beginTransaction();
        session.saveOrUpdate(Korisnik);
        session.getTransaction().commit();
        return Korisnik;
    }
    
    public void delete(K Korisnik) {
        Korisnik.setObrisano(true);
        save(Korisnik);
    }

}
