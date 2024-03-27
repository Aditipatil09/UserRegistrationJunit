package com.lcwd.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

        @Test

        public void testValidEmailId(){

            assertTrue(userRegistration.isValid("aditipatil2002@gmail.com"));
        }


    }

