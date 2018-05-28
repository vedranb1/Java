/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnevnikgledanja;

import dnevnikgledanja.utility.HibernateUtil;
import dnevnikgledanja.view.Autorizacija;
import dnevnikgledanja.view.Izbornik;
import dnevnikgledanja.view.Serije;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;

/**
 *
 * @author Veco
 */
public class DnevnikGledanja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        new Autorizacija().setVisible(true);
        String sql = "SELECT * FROM serija";
        SQLQuery query = HibernateUtil.getSession().createSQLQuery(sql);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List serijeList = query.list();
    }
    
}
