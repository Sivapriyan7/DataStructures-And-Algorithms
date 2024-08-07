package Coding_Problems.PBL.Collections;

import java.util.Properties;
import java.util.Iterator;
import java.util.Enumeration;

public class StatesAndCapitals {
    public static void main(String[] args) {
        Properties statesAndCapitals = new Properties();

        statesAndCapitals.setProperty("Maharashtra", "Mumbai");
        statesAndCapitals.setProperty("Karnataka", "Bengaluru");
        statesAndCapitals.setProperty("Tamil Nadu", "Chennai");
        statesAndCapitals.setProperty("Kerala", "Thiruvananthapuram");
        statesAndCapitals.setProperty("Telangana", "Hyderabad");

        Iterator<Object> iterator = statesAndCapitals.keySet().iterator();
        while (iterator.hasNext()) {
            String state = (String) iterator.next();
            System.out.println("State: " + state + ", Capital: " + statesAndCapitals.getProperty(state));
        }

        Enumeration<?> enumeration = statesAndCapitals.propertyNames();
        while (enumeration.hasMoreElements()) {
            String state = (String) enumeration.nextElement();
            System.out.println("State: " + state + ", Capital: " + statesAndCapitals.getProperty(state));
        }
    }
}

