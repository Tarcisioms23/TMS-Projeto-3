package com.projetos.projeto3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.projeto3.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
