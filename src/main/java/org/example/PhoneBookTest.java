package org.example;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "1234567890");
        assertEquals("1234567890", phoneBook.findByNumber("John"));
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "1234567890");
        assertEquals("John", phoneBook.findByNumber("1234567890"));
    }
}
