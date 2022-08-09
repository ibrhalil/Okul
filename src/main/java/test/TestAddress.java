package test;

import modal.Address;

import java.util.Arrays;
import java.util.List;

public class TestAddress {

    List<String> cityList = Arrays.asList("istanbul","ankara","izmir","bursa","trabzon","hakkari","kastamonu","bilecik","sakarya","rize","muş","sinop","paris","moskova","texsas");
    List<String> countryList = Arrays.asList("turkiye","amerika","ingiltere","mısır","yunanistan","rusya","avusturya","kanada","italya","fransa");

    public static Address address1 = new Address();
    public static Address address2 = new Address();
    public static Address address3 = new Address();
    public static Address address4 = new Address();
    public static Address address5 = new Address();
    public static Address address6 = new Address();
    public static Address address7 = new Address();
    public static Address address8 = new Address();
    public static Address address9 = new Address();

    public TestAddress () {
        addressFillData(address1);
        addressFillData(address2);
        addressFillData(address3);
        addressFillData(address4);
        addressFillData(address5);
        addressFillData(address6);
        addressFillData(address7);
        addressFillData(address8);
        addressFillData(address9);
    }

    private void addressFillData(Address address) {
        int cRandom = (int)(Math.random() * cityList.size());
        address.setCity(cityList.get(cRandom));

        int coRandom = (int)(Math.random() * countryList.size());
        address.setCountry(countryList.get(coRandom));

        int pRandom = (int)(Math.random() * 30000) + 10000;
        address.setPostCode(String.valueOf(pRandom));
    }
}
