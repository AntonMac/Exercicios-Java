/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sidneynogueira
 */
public class MaquinaBilheteTest {
    
    public MaquinaBilheteTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getPreco method, of class MaquinaBilhete.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        MaquinaBilhete instance = new MaquinaBilhete(100);
        float expResult = 100;
        float result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getSaldo method, of class MaquinaBilhete.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        MaquinaBilhete instance = new MaquinaBilhete(100);
        float expResult = 0.0F;
        float result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getTotal method, of class MaquinaBilhete.
     */
    @Test
    public void testGetTotalZero() {
        System.out.println("getTotal");
        MaquinaBilhete instance = new MaquinaBilhete(100);
        float expResult = 0.0F;
        float result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
    }
    
       /**
     * Test of getTotal method, of class MaquinaBilhete.
     */
    @Test
    public void testGetTotalNaoZero() {
        System.out.println("getTotal");
        MaquinaBilhete instance = new MaquinaBilhete(100);
        instance.colocarDinheiro(150);
        instance.emitir();
        float expResult = 50;
        float result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of colocarDinheiro method, of class MaquinaBilhete.
     */
    @Test
    public void testColocarDinheiro() {
        System.out.println("colocarDinheiro");
        float quantidade = 150;
        MaquinaBilhete instance = new MaquinaBilhete(1000);
        instance.colocarDinheiro(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(quantidade, instance.getSaldo(), 0.0);
    }

    /**
     * Test of emitir method, of class MaquinaBilhete.
     */
    @Test
    public void testEmitirTemSaldo() {
        System.out.println("emitir");
        MaquinaBilhete instance = new MaquinaBilhete(100);
        instance.colocarDinheiro(150);
        instance.emitir();
        float expResult = 50;
        float result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test of emitir method, of class MaquinaBilhete.
     */
    @Test
    public void testEmitirNaoTemSaldo() {
        System.out.println("emitir");
        MaquinaBilhete instance = new MaquinaBilhete(100);
        instance.colocarDinheiro(90);
        instance.emitir();
        float expResult = 100;
        float result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of darTroco method, of class MaquinaBilhete.
     */
    @Test
    public void testDarTroco() {
        System.out.println("darTroco");
        MaquinaBilhete instance = new MaquinaBilhete(400);
        float expResult = 0.0F;
        instance.colocarDinheiro(100);
        float result = instance.darTroco();
        assertEquals(expResult, result, 0.0);
    }
    
}
