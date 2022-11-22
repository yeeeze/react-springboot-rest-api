package com.example.coffee.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> new Email("accccc"));
    }

    @Test
    void testValidEmail() {
        Email email = new Email("hello@gmail.com");
        assertEquals("hello@gmail.com", email.getAddress());
    }

    @Test
    void testEqEmail() {
        Email email = new Email("hello@gmail.com");
        Email email1 = new Email("hello@gmail.com");
        assertEquals(email, email1);
    }
}