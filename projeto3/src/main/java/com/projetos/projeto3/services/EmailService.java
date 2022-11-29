package com.projetos.projeto3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetos.projeto3.models.EmailModel;
import com.projetos.projeto3.repositories.EmailRepository;

@Service
public class EmailService {

	@Autowired
	EmailRepository emailRepository;

	public void sendEmail(EmailModel emailModel) {
		
		
	}
	
}
