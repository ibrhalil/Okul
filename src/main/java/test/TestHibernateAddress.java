package test;

import hibernate.HibernateUtil;
import modal.Address;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestHibernateAddress {
    public static void main(String[] args) {
        TestAddress testAddress = new TestAddress();
        Address address =  testAddress.address1;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.merge(testAddress.address1);
        session.merge(testAddress.address2);
        session.merge(testAddress.address3);
        session.merge(testAddress.address4);
        session.merge(testAddress.address5);
        session.merge(testAddress.address6);
        session.merge(testAddress.address7);
        session.merge(testAddress.address8);
        session.merge(testAddress.address9);

        transaction.commit();
    }
}
