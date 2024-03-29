package com.gerenciadordefuncionarios.services;

import com.gerenciadordefuncionarios.domain.EnderecoFuncionario;
import com.gerenciadordefuncionarios.domain.Funcionario;
import com.gerenciadordefuncionarios.repository.EnderecoFuncionarioRepository;
import com.gerenciadordefuncionarios.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    public FuncionarioRepository funcionarioRepository;

    @Autowired
    public EnderecoFuncionarioRepository enderecoFuncionarioRepository;

    public List<Funcionario> listarFuncionarios(){
        return funcionarioRepository.findAll();
    }

    public Funcionario inserirFuncionario(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public void excluirFuncionario(long id){
        funcionarioRepository.deleteById(id);
    }

    public void atualizarFuncionario(Funcionario funcionario){
        Funcionario novoFuncionario = funcionarioRepository.getOne(funcionario.getId());
        atulizaFuncionario(novoFuncionario, funcionario);
        funcionarioRepository.save(novoFuncionario);
    }

    private void atulizaFuncionario(Funcionario novoFuncionario, Funcionario funcionario) {
        novoFuncionario.setNome(funcionario.getNome());
        novoFuncionario.setCargo(funcionario.getCargo());
        novoFuncionario.setCpf(funcionario.getCpf());
        novoFuncionario.setSalario(funcionario.getSalario());
        novoFuncionario.setSetor(funcionario.getSetor());
        novoFuncionario.setEnderecoFuncionario(funcionario.getEnderecoFuncionario());
    }
}
