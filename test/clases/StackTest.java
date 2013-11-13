
package clases;

import java.io.InvalidObjectException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;


/**
 * @author Facundo Valverdi
 * @author Eduardo Villalobo 
 */
public class StackTest {
    
    private clases.Stack pilaPrueba;
    
    public StackTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        pilaPrueba = new clases.Stack();
    }
    
    @After
    public void tearDown() {
    }
    //Item 1
    @Test
    public void testisEmpty()
    {
        assertTrue(pilaPrueba.isEmpty());
    }
    //Item 2
    @Test
    public void testPush()
    {
        pilaPrueba.push("Primer Elemento");
        assertFalse(pilaPrueba.isEmpty());
    }
    //Item 3
    @Test
    public void testPop() throws InvalidOperationException
    {
        pilaPrueba.push("Primer Elemento");
        pilaPrueba.pop();
        assertTrue(pilaPrueba.isEmpty());
    }
    //Item 4
    @Test
    public void testIguales() throws InvalidOperationException
    {
        String elemento="Primer";
        pilaPrueba.push(elemento);
        String resultado = pilaPrueba.pop();
        assertEquals(elemento,resultado);
    }
    //Item 5
    @Test
    public void testTresElementos() throws InvalidOperationException
    {
        String Primero="Primero";
        String Segundo="Segundo";
        String Tercero="Tercero";
        
        pilaPrueba.push(Primero);
        pilaPrueba.push(Segundo);
        pilaPrueba.push(Tercero);
        
        String PopTercero = pilaPrueba.pop().toString();
        assertEquals(Tercero, PopTercero);
        String PopSegundo = pilaPrueba.pop().toString();
        assertEquals(Segundo, PopSegundo);
        String PopPrimero = pilaPrueba.pop().toString();
        assertEquals(Primero, PopPrimero);
        System.out.print("Objetos sacados en orden:"+PopTercero+"."+PopSegundo+"."+PopPrimero+".");
        
    }
    //Item 6
    @Test
    public void sacarElementoExcepcion () throws InvalidOperationException 
    {    
        try {
            pilaPrueba.pop();
        } catch (InvalidOperationException ex) {
            Logger.getLogger(StackTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
