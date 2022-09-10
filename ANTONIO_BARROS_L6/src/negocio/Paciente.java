/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDate;

/**
 *
 * @author anton
 */
public abstract class Paciente {
    private String nome;
    private LocalDate nascimento;
    private String cpf;

    public Paciente(String nome, LocalDate nascimento, String cpf) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }
    
    public abstract int getIdade();
    
    @Override
    public abstract boolean equals(Object o);


    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract LocalDate getNascimento();

    public abstract void setNascimento(LocalDate nascimento);

    public abstract String getCpf();

    public abstract void setCpf(String cpf);
    
    
    
    
}
