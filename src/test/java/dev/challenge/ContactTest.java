package dev.challenge;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContactTest {

    private static Contact contact;

    @BeforeAll
    public static void beforeClass() {
        contact = new Contact("Test contact");
    }

    @Test
    public void convertPhone() {
        long phoneNumber = 1234567890;
        assertEquals("(123) 456-7890", contact.convertPhone(phoneNumber));
    }
}