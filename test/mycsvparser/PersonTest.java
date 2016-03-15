/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycsvparser;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author derwin
 */
public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEmail method, of class Person.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Person instance = new Person("Derwin McGeary","dez@cantab.net");
        String expResult = "dez@cantab.net";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new Person("Derwin McGeary","dez@cantab.net");
        String expResult = "Derwin McGeary";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToString() {
        Person instance = new Person("Derwin McGeary","dez@cantab.net");
        String expResult = "Name: Derwin McGeary Email: dez@cantab.net";
        String result = instance.toString();
        assertEquals(expResult,result);
    }
    
}
