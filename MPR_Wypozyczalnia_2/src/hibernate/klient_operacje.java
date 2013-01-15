package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
 import org.hibernate.tool.hbm2ddl.SchemaExport;

public class klient_operacje {

    
    public static void main(String[] args) {
        

        AnnotationConfiguration config = new AnnotationConfiguration();
         
        config.addAnnotatedClass(klient.class);
        
        config.configure();
        
        new SchemaExport(config).create(true, true);
        
        
        SessionFactory factory = config.buildSessionFactory();
         Session session = factory.getCurrentSession();
        
        
        session.beginTransaction();
        
        klient Krzysztof = new klient();
        klient Iwona = new klient();
        klient Marzena = new klient();
        
        Krzysztof.setNumer_klienta(1);
        Krzysztof.setImie_klienta("Krzysztof");
        Krzysztof.setNazwisko_klienta("Raczkowski");
         
        Iwona.setNumer_klienta(2);
        Iwona.setImie_klienta("Iwona");
        Iwona.setNazwisko_klienta("Testowa");
        
        
        Marzena.setNumer_klienta(3);
         Marzena.setImie_klienta("Marzena");
        Marzena.setNazwisko_klienta("Hibernatowa");
        
        
        session.save(Krzysztof);
        session.save(Marzena);
        session.save(Iwona);
         
        session.getTransaction().commit(); //save to database
        
        
        
        
        
    }

}