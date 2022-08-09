package test;

import hibernate.HibernateUtil;
import modal.Contact;
import modal.Gender;
import modal.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

public class TestHibernateTeacher {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        Date d = sdf.parse("31-08-1982");
        Date d2 = sdf.parse("03-01-1992");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Teacher teacher = new Teacher();
        teacher.setName("Ali");
        teacher.setLastName("Veli");
        teacher.setJob("Bilgisayar Öğretmeni");
        teacher.setActive(true);
        teacher.setGender(Gender.MALE);
        teacher.setNickName("ali_veli");
        teacher.setPassword("1234");
        teacher.setBirthday(d);

        //Contact contact = new Contact();
        //contact.setPhones(Arrays.asList("05327463856434", "05426474734232").stream().collect(Collectors.toSet()));
        //contact.setEMails(Arrays.asList("ali_veli@gmail.com").stream().collect(Collectors.toSet()));

        Teacher teacher2 = new Teacher();
        teacher2.setName("Elif");
        teacher2.setLastName("Yılmaz");
        teacher2.setJob("Resim Öğretmeni");
        teacher2.setActive(true);
        teacher2.setGender(Gender.FEMALE);
        teacher2.setNickName("elif21");
        teacher2.setPassword("5432");
        teacher2.setBirthday(d2);

        session.merge(teacher);
        session.merge(teacher2);
        transaction.commit();

    }
}
