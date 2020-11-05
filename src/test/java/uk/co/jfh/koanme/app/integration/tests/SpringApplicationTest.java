package uk.co.jfh.koanme.app.integration.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class SpringApplicationTest {

    @Autowired
    ApplicationContext context;

    @Test
    void checkApplicationContextLoaded() {
        assertTrue(context != null);
    }
}
