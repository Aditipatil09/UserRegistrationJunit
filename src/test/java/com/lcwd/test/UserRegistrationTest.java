package com.lcwd.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

        @Test

        public void testValidPassword(){

            assertTrue(userRegistration.isValid("Aditipatil2"));
        }


    }

