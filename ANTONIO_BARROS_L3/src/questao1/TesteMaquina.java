/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1;

public class TesteMaquina {
    
    public static void main(String[] args) {
        MaquinaBilhete mb1 = new MaquinaBilhete(100);
        mb1.colocarDinheiro(80);
        mb1.emitir();
        System.out.println("Total = R$ " + mb1.getTotal());
        mb1.colocarDinheiro(50);
        System.out.println("Saldo = R$ " + mb1.getSaldo());
        mb1.emitir();
        float troco = mb1.darTroco();
        System.out.println("Troco = R$ " + troco);
        System.out.println("Saldo = R$ " + mb1.getSaldo());
        System.out.println("Total = R$ " + mb1.getTotal());
    }
    
}
