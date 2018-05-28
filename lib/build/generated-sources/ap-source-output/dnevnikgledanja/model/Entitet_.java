package dnevnikgledanja.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-18T17:55:34")
@StaticMetamodel(Entitet.class)
public abstract class Entitet_ { 

    public static volatile SingularAttribute<Entitet, Date> datumPromjene;
    public static volatile SingularAttribute<Entitet, Boolean> obrisano;
    public static volatile SingularAttribute<Entitet, Date> datumKreiranja;
    public static volatile SingularAttribute<Entitet, Integer> sifra;
    public static volatile SingularAttribute<Entitet, Date> datumBrisanja;

}