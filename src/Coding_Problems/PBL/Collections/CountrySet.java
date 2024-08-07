package Coding_Problems.PBL.Collections;

import java.util.HashSet;

public class CountrySet {
    private HashSet<String> H1;

    public CountrySet() {
        H1 = new HashSet<>();
    }

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        if (H1.contains(countryName)) {
            return countryName;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        CountrySet countrySet = new CountrySet();

        countrySet.saveCountryNames("USA");
        countrySet.saveCountryNames("Canada");
        countrySet.saveCountryNames("Mexico");

        System.out.println(countrySet.getCountry("USA")); // prints "USA"
        System.out.println(countrySet.getCountry("Germany")); // prints null
    }
}