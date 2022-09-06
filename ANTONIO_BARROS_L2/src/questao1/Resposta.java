package questao1;

// Antonio Macena - 26-02-2022


public class Resposta {
    
    public static void main(String[] args) {
         

        Square quadrado1 = new Square();
        System.out.println(quadrado1.toString());
        quadrado1.changeColor("blue");
        quadrado1.makeVisible();
        quadrado1.changeSize(125);
        quadrado1.moveHorizontal(-20);
        System.out.println(quadrado1.toString()); 
        
        Circle circulo1 = new Circle ();
        System.out.println(circulo1.toString());
        circulo1.changeColor("yellow");
        circulo1.makeVisible();
        circulo1.changeSize(100);
        circulo1.moveHorizontal(35);
        System.out.println(circulo1.toString());
        
        Circle circulo2 = new Circle ();
        System.out.println(circulo2.toString());
        circulo2.changeColor("blue");
        circulo2.makeVisible();
        circulo2.changeSize(90);
        circulo2.moveHorizontal(40);
        System.out.println(circulo2.toString());
        
        Square quadrado2 = new Square();
        System.out.println(quadrado2.toString());
        quadrado2.changeColor("blue");
        quadrado2.makeVisible();
        quadrado2.changeSize(80);
        quadrado2.moveHorizontal(-5);
        System.out.println(quadrado2.toString());
        
        Square quadrado3 = new Square();
        System.out.println(quadrado3.toString());
        quadrado3.changeColor("blue");
        quadrado3.makeVisible();
        quadrado3.changeSize(80);
        quadrado3.moveHorizontal(15);
        System.out.println(quadrado3.toString());
        
        Circle circulo3 = new Circle ();
        System.out.println(circulo3.toString());
        circulo3.changeColor("black");
        circulo3.makeVisible();
        circulo3.changeSize(25);
        circulo3.moveHorizontal(35);
        circulo3.moveDown();
        System.out.println(circulo3.toString());
        
        Circle circulo4 = new Circle ();
        System.out.println(circulo4.toString());
        circulo4.changeColor("black");
        circulo4.makeVisible();
        circulo4.changeSize(25);
        circulo4.moveHorizontal(107);
        circulo4.moveDown();
        System.out.println(circulo4.toString());
        
        
       
    }
    
}
