package questao1;

public class MaquinaBilhete
{
    private float preco;
    private float saldo;
    private float total;

    public MaquinaBilhete(float custo)
    {
        this.preco = custo;
        this.saldo = 0;
        this.total = 0;

    }

    public float getPreco()
    {
        return this.preco;

    }


    public float getSaldo()
    {
        return this.saldo;

    }
    
    public float getTotal(){
        
        return this.total;

    }


    public void colocarDinheiro(float quantidade)
    {
        this.saldo += quantidade;

    }

    public void emitir()
    {
        float falta;
        if(this.saldo < this.preco){
            falta = this.preco - this.saldo;
            System.out.printf("Saldo Insuficiente. Acrescente no saldo pelo menos R$ " + falta+"\n");
        }else{
            this.total += this.preco;
            System.out.printf("##################");
            System.out.printf("\n# Bilhete Emitido");
            System.out.printf("\n# R$ " + this.preco);
            System.out.printf("\n##################\n");
        }

    }

    public float darTroco()
    {
        float troco = this.saldo - this.preco;
        this.saldo = 0;
        return troco;

    }
}
