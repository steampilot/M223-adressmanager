package bo;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.*;


/**
 * Created by steampilot on 14.04.15.
 */
public class PersonTest {
    static SessionFactory sessionFactory;
    static ServiceRegistry serviceRegistry;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        Configuration conf = new Configuration().configure();
        serviceRegistry = new ServiceRegistryBuilder().applySetting(conf.getProperties()).buildServiceRegistry();
        sessionFactory = conf.buildSessionFactory(serviceRegistry);
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        sessionFactory.close();
    }

}
