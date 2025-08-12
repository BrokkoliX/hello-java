package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void greeting_is_hello_world() {
        assertEquals("Hello, World!", App.getGreeting());
    }
}
