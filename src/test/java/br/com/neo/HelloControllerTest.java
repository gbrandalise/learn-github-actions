package br.com.neo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HelloControllerTest {

    @InjectMocks HelloController controller;

    @Test
    void testInstanceSuccess() {
        assertNotNull(controller);
    }

    @Test
    void testHelloSuccess() {
        String result = controller.hello("test");
        assertNotNull(result);
        assertEquals("Hello test", result);
    }
    
}
