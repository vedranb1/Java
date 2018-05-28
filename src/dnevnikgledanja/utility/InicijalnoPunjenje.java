/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnevnikgledanja.utility;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import dnevnikgledanja.controller.Obrada;
import dnevnikgledanja.controller.ObradaKorisnik;
import dnevnikgledanja.model.Korisnik;
import java.security.MessageDigest;

/**
 *
 * @author Profesor
 */
public class InicijalnoPunjenje {
    
    public static void main(String[] args) {
       
        ObradaKorisnik ok = new ObradaKorisnik();
        Korisnik k = new Korisnik();
        k.setUsername("admin");
        k.setLozinka("admin");
      
        ok.save(k);
    }
  
    
}
