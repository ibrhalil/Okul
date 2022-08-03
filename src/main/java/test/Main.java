package test;

import lombok.AllArgsConstructor;
import lombok.Data;
import modal.*;
import modal.Class;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person ahmet = new Teacher();

        ahmet.setName("ahmet");
        ahmet.setLastName("aydın");
        ahmet.setGender(Gender.MAN);

        User userAhmet = (User) ahmet;

        userAhmet.setNickName("karabela2001");
        userAhmet.setPassword("ahmet123");
        userAhmet.setActive(true);

        Address addressAhmet1 = new Address("istanbul", "turkey", "34000");
        Address addressAhmet2 = new Address("ankara", "turkey", "090000");

        Map<ContactType, Address> mapAhmetAdresleri = new HashMap<>();
        mapAhmetAdresleri.put(ContactType.HOME, addressAhmet1);
        mapAhmetAdresleri.put(ContactType.OTHER, addressAhmet2);

        Set<String> emails = new HashSet<>();
        emails.add("ahmet.aydin@falanfilan.com");
        emails.add("karabela_ahmet@gggg.com");

        Set<String> phones = new HashSet<>();
        phones.add("111111111");
        phones.add("22222222");

        Contact contactAhmet = new Contact();

        contactAhmet.setAddresses(mapAhmetAdresleri);
        contactAhmet.setEMails(emails);
        contactAhmet.setPhones(phones);

        userAhmet.setContact(contactAhmet);

        Teacher teacherAhmet = (Teacher) userAhmet;

        teacherAhmet.setJob("bilgisayar öğretmeni");

        Class c1 = new Class("4/b");
        Class c2 = new Class("4/c");
        Class c3 = new Class("4/d");

        Set<Class> classes = new HashSet<>();
        classes.add(c1);
        classes.add(c2);
        classes.add(c3);

        teacherAhmet.setClasses(classes);

        //System.out.println(ahmet);
        //System.out.println(userAhmet);
        //System.out.println(teacherAhmet);


        Set<String> haticePhones = Arrays.asList("1234567", "3456789", "345678").stream().collect(Collectors.toSet());
        Set<String> haticeMails = Arrays.asList("hatice@falan.com").stream().collect(Collectors.toSet());

        @Data
        @AllArgsConstructor
        class InnerAddreses {
            ContactType type;
            Address address;
        }

        Map<ContactType, Address> mapHaticeAdresleri = Arrays.asList(
                        new InnerAddreses(ContactType.HOME, new Address("izmir", "turkey", "35000")),
                        new InnerAddreses(ContactType.SCHOOL, new Address("trabzon", "turkey", "61000")))
                .stream().collect(Collectors.toMap(InnerAddreses::getType, InnerAddreses::getAddress));


        Person hatice = new Student();
        hatice.setName("hatice");
        hatice.setLastName("Kavak");
        hatice.setGender(Gender.WOMAN);
        hatice.setContact(new Contact(mapHaticeAdresleri, haticePhones, haticeMails));

        User userHatice = (User) hatice;
        userHatice.setNickName("haticee");
        userHatice.setPassword("qwerqwer");
        userHatice.setActive(true);

        System.out.println(hatice);

    }

}
