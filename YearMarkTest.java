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
    
    
    
    
    
    @Before
    public void setUp() {
        yearmark1 = new YearMark();
        yearmark2 = new YearMark();
        
    }
    
    @Test
    public void testIdentity() {
        assertSame(yearmark1, yearmark2);
    }
    @Test
    public void testEquality() {
        assertEquals(yearmark1, yearmark2);
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
