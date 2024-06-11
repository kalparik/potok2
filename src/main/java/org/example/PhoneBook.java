package org.example;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class PhoneBook {
    TreeMap<String, String> phoneBook = new TreeMap<>();

    public int add(String name, String phone) {
        if(!phoneBook.containsKey(name) && !phoneBook.containsValue(phone)) {
            phoneBook.putIfAbsent(name, phone);
        }
        return phoneBook.size();
    }

    public String findByNumber(String phone) {
        return phoneBook.entrySet()
                    .stream()
                    .filter(x -> Objects.equals(x.getValue(), phone))
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(null);
    }
}
