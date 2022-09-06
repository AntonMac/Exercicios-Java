/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

/**
 *
 * @author sidneynogueira
 */
public class Temperatura {
    
    private float atual, delta, max, min;
    
    public Temperatura(){
        this.atual = 0;
        this.delta = 5;
        this.max = 50;
        this.min = -50;
    }
    
    public String toString(){
        
        return "Temperatura{atual="+this.atual+", delta="+this.delta+", max="+this.max+", min="+this.min+"}";
    }
    
    public void decrementa(){
        
        if(this.atual <= this.min){
            this.atual = this.min;
        }else{
            this.atual -= this.delta;
        }
    }
    
    public void incrementa(){
        
        if(this.atual >= this.max){
            this.atual = this.max;
        }else{
            this.atual += this.delta;
        }
    }
    
    public void setAtual(float atual){
        if((atual >= this.min) && (atual <= this.max)){
            
            this.atual = atual;
            
        }
    }
    
    public void setDelta(float delta){
        if(delta > 0){
            
            this.delta = delta;
            
        }
    }
    
    public void setMax(float max){
        if(max > this.min){
            
            this.max = max;
            
        }
    }
    
    public void setMin(float min){
        if(min < this.max){
            
            this.min = min;
            
        }
    }
    

 
}
