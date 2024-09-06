package dev_jorge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class AppTest {

    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testMain() {
        String[] args = {};
        App.main(args);
        
    }
}
