package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> phoneNumbers;

    public PhoneBook() {
        this.phoneNumbers = new HashMap<>();
    }

    public void add(String name, String number) {
        phoneNumbers.put(name, number);
    }

    public String findByNumber(String number) {
        for (Map.Entry<String, String> entry : phoneNumbers.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null;
    }
}

