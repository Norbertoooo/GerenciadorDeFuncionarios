package com.gerenciadordefuncionarios.repository;

import com.gerenciadordefuncionarios.domain.EnderecoFuncionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoFuncionarioRepository extends JpaRepository<EnderecoFuncionario, Long> {
}
