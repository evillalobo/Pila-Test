/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.InvalidObjectException;
import java.util.ArrayList;

/**
 * @author Facundo Valverdi
 * @author Eduardo Villalobo 
 */
public class Stack {
    
    private String elemento;
    private ArrayList elementos = new ArrayList();
    
    //Verifica si la pila está vacia
    public boolean isEmpty(){
        return (elementos.isEmpty());
    }
    
    //Ingresa un elemento a la pila
    public void push(String elemento) {
        elementos.add(0,elemento);
    }
    //Saca el último elemento ingresado
    public String pop()throws InvalidOperationException {
        if(this.isEmpty()==false)
        {
            String tope = elementos.get(0).toString();
            elementos.remove(0);
            return tope;
        }
        else
        {
           throw new InvalidOperationException("error - pop a pila vacia") ;
        }
    }
}
