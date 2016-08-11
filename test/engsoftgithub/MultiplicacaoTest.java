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
public class MultiplicacaoTest {
    
    public MultiplicacaoTest() {
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
     * Test of multiplicar method, of class Multiplicacao.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int num1 = 1;
        int num2 = 1;
        Multiplicacao instance = new Multiplicacao();
        instance.multiplicar(num1, num2);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of multiplicarN1 method, of class Multiplicacao.
     */
    @Test
    public void testMultiplicarN1() {
        System.out.println("multiplicarN1");
        int num1 = 1;
        Multiplicacao instance = new Multiplicacao();
        float expResult = 1.0F;
        float result = instance.multiplicarN1(num1);
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multiplicarN2 method, of class Multiplicacao.
     */
    @Test
    public void testMultiplicarN2() {
        System.out.println("multiplicarN2");
        int num2 = 1;
        Multiplicacao instance = new Multiplicacao();
        float expResult = 1.0F;
        float result = instance.multiplicarN2(num2);
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
