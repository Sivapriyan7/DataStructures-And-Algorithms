package Coding_Problems.PBL.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Countrycapital {
    private Map<String, String> M1;

    public Countrycapital() {
        M1 = new HashMap<>();
    }

    public Map<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Map<String, String> getCapitalCountryMap() {
        Map<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public ArrayList<String> getCountryList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        Countrycapital countryCapital = new Countrycapital();

        countryCapital.saveCountryCapital("India", "Delhi");
        countryCapital.saveCountryCapital("Japan", "Tokyo");

        System.out.println(countryCapital.getCapital("India")); // prints "Delhi"
        System.out.println(countryCapital.getCountry("Tokyo")); // prints "Japan"

        Map<String, String> capitalCountryMap = countryCapital.getCapitalCountryMap();
        System.out.println(capitalCountryMap); // prints "{Delhi=India, Tokyo=Japan}"

        ArrayList<String> countryList = countryCapital.getCountryList();
        System.out.println(countryList); // prints "[India, Japan]"
    }
}



