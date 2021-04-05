/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.marks;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class YearMarkTest {
    
    private YearMark yearmark1;
    private YearMark yearmark2;
    private YearMark yearmark3;
    
    
    
    
    
    @Before
    public void setUp() {
        yearmark1 = new YearMark();
        yearmark2 = new YearMark();
        yearmark3 = yearmark1;
    }
    
    @Test
    public void testIdentity() {
        assertSame(yearmark1, yearmark3);
    }
    @Test
    public void testEquality() {
        assertEquals(yearmark1, yearmark3);
    }
    
    @Test
    public void testGetName() {
        System.out.println("getName");
        YearMark instance = new YearMark();
        String expResults = "";
        String results = instance.getName();
        assertEquals(expResults, results);
        
        fail("test case is a prototype.");
    }
    
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name ="";
        YearMark instance = new YearMark();
        instance.setName(name);
        
        fail("test case is a prototype.");
    }
    @Test
    public void testGetMark() {
        System.out.println("getMark");
        YearMark instance = new YearMark();
        String expResults = "";
        String results = instance.getMark();
        assertEquals(expResults, results);
        
        fail("test case is a prototype.");
    }
    
    @Test
    public void testSetMark() {
        System.out.println("setMark");
        String mark ="";
        YearMark instance = new YearMark();
        instance.setMark(mark);
        
        fail("test case is a prototype.");
    }
    
    @Test(timeout = 2000) 
    public void testWithTimeout() {
      System.out.println("");
    }

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
