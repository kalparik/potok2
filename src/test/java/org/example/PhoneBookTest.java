package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    private final String nameExample = "Иван";
    private final String phoneExample = "8-900-011-33-55";

    @BeforeEach
    void setUp() {
        phoneBook.add(nameExample, phoneExample);
    }

    @Test
    void add() {
        int act = phoneBook.add(nameExample, phoneExample);
        Assertions.assertEquals(1, act);
    }

    @Test
    void findByNumber() {
        String name = phoneBook.findByNumber(phoneExample);
        Assertions.assertEquals(nameExample, name);
        String badPhoneExample = "1";
        Assertions.assertNull(phoneBook.findByNumber(badPhoneExample));
    }
}