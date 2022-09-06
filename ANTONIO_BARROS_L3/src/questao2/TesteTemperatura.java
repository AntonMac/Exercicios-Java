/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

/**
 *
 * @author sidneynogueira
 */
public class TesteTemperatura {
    
    public static void main(String[] args) {

        Temperatura t1 = new Temperatura();
        System.out.println(t1.toString());
        t1.setDelta(50.0F);
        System.out.println(t1.toString());
        t1.setDelta(-1F);
        System.out.println(t1.toString());
        t1.decrementa();
        System.out.println(t1.toString());
        t1.decrementa();
        System.out.println(t1.toString());
        t1.incrementa();
        System.out.println(t1.toString());
        t1.incrementa();
        System.out.println(t1.toString());        
        t1.incrementa();
        System.out.println(t1.toString());        
        t1.setAtual(-50);
        System.out.println(t1.toString());        
        t1.setAtual(-70);
        System.out.println(t1.toString());        
        t1.setAtual(70);
        System.out.println(t1.toString());        
        t1.setMax(100);
        System.out.println(t1.toString());        
        t1.setMax(-51);
        System.out.println(t1.toString());      
        t1.setMin(0);
        System.out.println(t1.toString());              
        t1.setMin(101);
        System.out.println(t1.toString());  
 
    }
    
}
