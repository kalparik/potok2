package org.example;

import java.util.TreeMap;

public class PhoneBook {
    TreeMap<String, String> phoneBook = new TreeMap<>();

    public int add(String name, String phone) {
        if(!phoneBook.containsKey(name) && !phoneBook.containsValue(phone)) {
            phoneBook.putIfAbsent(name, phone);
        }
        return phoneBook.size();
    }

    public String findByNumber(String name) {
        return null;
    }
}
