package com.gerenciadordefuncionarios.repository;

import com.gerenciadordefuncionarios.domain.EnderecoFuncionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface EnderecoFuncionarioRepository extends JpaRepository<EnderecoFuncionario, Long> {
}
