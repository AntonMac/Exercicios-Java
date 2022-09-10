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
public class Menor extends Paciente{
    private Adulto responsavel;
    private String nome;
    private LocalDate nascimento;
    private String cpf;

    public Menor(String nome, LocalDate nascimento, String cpf, Adulto responsavel) {
        super(nome, nascimento, cpf);
        this.responsavel = responsavel;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: "+ this.getNome() +
               " ,Nascimento: " + this.getNascimento() + 
               " , Cpf: " + this.getCpf() +
               " ,Responsavel: " + this.responsavel.getNome();
    }

    public Adulto getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(Adulto responsavel) {
        this.responsavel = responsavel;
    }
    
    @Override
    public int getIdade(){
        LocalDate hoje = LocalDate.now();
        return Util.diferencaAnos(this.nascimento, hoje);      
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Menor){
            return this.cpf.contentEquals(Menor.this.cpf);
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