package com.gerenciadordefuncionarios.resources;

import com.gerenciadordefuncionarios.domain.Funcionario;
import com.gerenciadordefuncionarios.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class FuncionarioResource {

    @Autowired
    public FuncionarioService funcionarioService;

    @GetMapping(value = "listaDeFuncionarios")
    public ResponseEntity<List<Funcionario>> listarFuncionario(){
        List<Funcionario> listaDeFuncionarios = funcionarioService.listarFuncionarios();
        return ResponseEntity.ok(listaDeFuncionarios);
    }

    @PostMapping(value = "inserirFuncionario")
    public ResponseEntity<Void> inserirFuncionario(@RequestBody Funcionario funcionario){
        funcionario = funcionarioService.inserirFuncionario(funcionario);
        URI uri = ServletUriComponentsBuilder.
                fromCurrentRequest().
                path("/{id}").
                buildAndExpand(funcionario.getId()).
                toUri();
        return ResponseEntity.created(uri).build();
    }
    @DeleteMapping(value = "excluirFuncionario/{id}")
    public ResponseEntity<Void> excluirFuncionario(@PathVariable long id){
        funcionarioService.excluirFuncionario(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "atualizarFuncionario/{id}")
    public ResponseEntity<Void> atualizarFuncionario(@RequestBody Funcionario funcionario, @PathVariable long id){
        funcionario.setId(id);
        funcionarioService.atualizarFuncionario(funcionario);
        return ResponseEntity.noContent().build();
    }



}
