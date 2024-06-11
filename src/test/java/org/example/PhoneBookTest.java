package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @Test
    void add() {
        int act = phoneBook.add("Иван", "8900-011-33-55");
        Assertions.assertEquals(1, act);
    }
}