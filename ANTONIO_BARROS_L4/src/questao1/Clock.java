package questao1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sidneynogueira
 */
public class Clock {
    
    private ClockDisplay display;

    public Clock() {
        this.display = new ClockDisplay();
    }
    
    public void setTime(int hour, int minute, int segundo){
        this.display.setTime(hour, minute, segundo);
    }
    
    public void run(){
        while(true){
            System.out.println(this.display.getTime());
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            this.display.timeTick();
        }
    }   
    
}
