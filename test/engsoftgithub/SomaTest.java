/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoftgithub;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20131064010088
 */
public class SomaTest {
    
    public SomaTest() {
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
     * Test of somar method, of class Soma.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        int num1 = 1;
        int num2 = 1;
        Soma instance = new Soma();
        float expResult = 2.0F;
        float result = instance.somar(num1, num2);
        assertEquals(expResult, result, 2.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of somarN1 method, of class Soma.
     */
    @Test
    public void testSomarN1() {
        System.out.println("somarN1");
        int num1 = 1;
        Soma instance = new Soma();
        float expResult = 2.0F;
        float result = instance.somarN1(num1);
        assertEquals(expResult, result, 2.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of somarN2 method, of class Soma.
     */
    @Test
    public void testSomarN2() {
        System.out.println("somarN2");
        int num2 = 1;
        Soma instance = new Soma();
        float expResult = 2.0F;
        float result = instance.somarN2(num2);
        assertEquals(expResult, result, 2.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
