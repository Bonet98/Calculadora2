/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ubuntu
 */
@RunWith(Parameterized.class)
public class CalculadoraTest {
    public int num1;
    public int num2;
    public int resul;

    @Parameters
    public static Collection<Object[]> numeros(){
        return Arrays.asList(new Object [][]{{20,10,30},{3,2,5},{2,2,2}});
    }
    
    public CalculadoraTest(int num1, int num2, int resul){
        this.num1 = num1;
        this.num2 = num2;
        this.resul = resul;
    }
    
    
    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        Calculadora instance = new Calculadora(num1, num2);
        int result = instance.suma();
        assertEquals(resul, result);
    }    
}
