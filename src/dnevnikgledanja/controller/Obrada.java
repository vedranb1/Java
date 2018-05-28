/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnevnikgledanja.controller;

import dnevnikgledanja.model.Entitet;
import dnevnikgledanja.utility.HibernateUtil;
import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * 
 * 
 */
public class Obrada<T extends Entitet> {

    private final Session session;

    public Obrada() {
        session = HibernateUtil.getSession();
    }

    public T save(T entitet) {
        if (entitet.getSifra() == 0) {
            entitet.setDatumKreiranja(new Date());
        } else if (entitet.getDatumBrisanja() == null) {
            entitet.setDatumPromjene(new Date());
        }

        session.beginTransaction();
        session.saveOrUpdate(entitet);
        session.getTransaction().commit();
        return entitet;
    }
    
    public List<T> getAll(){
        String nazivKlase=((Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName();
        System.out.println(nazivKlase);
        Query q = session.createQuery("from " + nazivKlase + " a where a.obrisano=false ");
        return q.list();
    }
    
    @Deprecated
    public List<T> createQuery(String hql) {
        Query q = session.createQuery(hql);
        return q.list();
    }

    public void delete(T entitet) {
        entitet.setDatumBrisanja(new Date());
        entitet.setObrisano(true);
        save(entitet);
    }

    public List<T> save(List<T> lista) {
        session.beginTransaction();
        lista.stream().forEach((entitet) -> {
            session.saveOrUpdate(entitet);
        });
        session.getTransaction().commit();
        return lista;
    }

}
