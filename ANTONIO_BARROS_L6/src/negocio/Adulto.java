/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDate;
import util.Util;

/**
 *
 * @author anton
 */
public class Adulto extends Paciente{
    private String nome;
    private LocalDate nascimento;
    private String cpf;
    private String endereco;

    public Adulto(String nome, LocalDate nascimento, String cpf, String endereco) {
        super(nome, nascimento, cpf);
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    

    @Override
    public String toString() {
        return "Nome: " + this.getNome()+
               ", Nascimento: " + this.getNascimento()+
               " ,Cpf: " + this.getCpf() +
               " ,Endereço: " + this.endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public int getIdade(){
        LocalDate hoje = LocalDate.now();
        return Util.diferencaAnos(getNascimento(),hoje);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Adulto){
            return true;
        } else {
            return false;
        }
        
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public LocalDate getNascimento() {
        return this.nascimento;
    }

    @Override
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    
    
}