/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycsvparser;

import java.util.ArrayList;
import mycsvparser.MyCSVParser;
import org.apache.commons.csv.CSVParser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

/**
 *
 * @author derwin
 */
public class MyCSVParserTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();
    
    
    public MyCSVParserTest() {
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
     * Test of main method, of class CSVParser.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyCSVParser.main(args);
        // This will only fail if main crashes, we don't test anything explicit
    }
    
    @Test
    public void testOpenFile() {
        MyCSVParser c = new MyCSVParser();
        String fn = "/home/derwin/Documents/Cloudwick/CSVParser/data.csv";
        c.openFile(fn);
        String result = c.getFilename();
        assertEquals(fn, result);
    }
    
    @Test
    public void testReadCsvLine(){
    MyCSVParser c = new MyCSVParser();
    String fn = "/home/derwin/Documents/Cloudwick/CSVParser/data.csv";
    CSVParser parser = c.openFile(fn);
    ArrayList<Person> people = c.readCsvLines(parser);
    String result = people.get(0).getName();
    String expected = "Rose Castro";
    assertEquals(expected, result);
    
    }
    
}
