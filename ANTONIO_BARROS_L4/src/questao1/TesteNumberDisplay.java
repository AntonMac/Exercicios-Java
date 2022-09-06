package questao1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sidneynogueira
 */
public class TesteNumberDisplay {
    
    public static void main(String[] args) {
        NumberDisplay displayNumero1 = new NumberDisplay(10);
        System.out.println(displayNumero1.getDisplayValue());
        for (int i = 0; i < 10; i++) {
            displayNumero1.increment();
            System.out.println(displayNumero1.getDisplayValue());
        }
    }
    
}
