package com.gerenciadordefuncionarios.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name = "Endereço_id")
    private EnderecoFuncionario enderecoFuncionario;

    private String nome;
    private String cpf;
    private String cargo;
    private String setor;
    private long salario;

    public Funcionario(String nome, String cpf, String cargo, String setor, long salario, EnderecoFuncionario enderecoFuncionario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.setor = setor;
        this.salario = salario;
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public Funcionario(){
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public EnderecoFuncionario getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(EnderecoFuncionario enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }
}
