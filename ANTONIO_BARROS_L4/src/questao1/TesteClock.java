package questao1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sidneynogueira
 */
public class TesteClock {
    
    public static void main(String[] args) {
        Clock relogio = new Clock();
        relogio.setTime(11, 59, 59);
        relogio.run();
    }
    
}
