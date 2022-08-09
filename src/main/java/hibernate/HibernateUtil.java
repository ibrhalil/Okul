package hibernate;

import modal.Address;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory SESSION_FACTORY = buildSessionFacktory();
    private static final Logger LOGGER = LogManager.getLogger(HibernateUtil.class);

    private static SessionFactory buildSessionFacktory() {

        try {
            Configuration configuration = new Configuration();
            //configuration.addAnnotatedClass(Address.class); xml mapping yerine kullanabilir
            SessionFactory sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
            return sessionFactory;
        } catch (Exception e) {
            LOGGER.error("ERROR: HibernateUtil buildSessionFacktory {}", e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}
