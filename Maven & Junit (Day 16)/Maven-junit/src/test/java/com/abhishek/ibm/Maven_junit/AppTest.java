package com.abhishek.ibm.Maven_junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AppTest
{
		@BeforeAll
		void RunBeforeAll() {
			System.out.println("Test Case Exccution Started ...");
		}
		@AfterAll
		void RunAfterAll() {
			System.out.println("All the test cases are Executed");
		}
		@org.junit.jupiter.api.Test
		@DisplayName("Division of two numbers")
        void testDivide(){
        App ref = new App();
        //assertThrows( ArithmeticException.class , () -> ref.divide(300,10) ); 
			assertAll(
        			() -> assertEquals(30,ref.divide(300,10)),
        			() -> assertEquals(4,ref.divide(100,25)),
        			() -> assertNotEquals(20, ref.divide(100, 5))
        			);
    }
		@ParameterizedTest
		@ValueSource(strings = { "aabaa","cc"})
		@DisplayName("Check for Pallendrome")
		void TestPallendrome(String values) {
			App ref = new App();
			//assertEquals("true",ref.isPallendrome(values));
			assertTrue(ref.isPallendrome(values));
		}
}

