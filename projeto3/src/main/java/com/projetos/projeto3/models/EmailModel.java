package com.projetos.projeto3.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.projetos.projeto3.enums.StatusEmail;

import lombok.Data;


@Data // LOMBOK NAO PRECISAR COLOCAR GETSET E CONSTRUTORES
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long emailId; 
	
	private String ownerRef;
	private String emailFrom;
	private String emailTo;
	private String subject;
	
	@Column(columnDefinition = "TEXT") //  colocar  texto pode ser maior que 250 caracteres 
	private String text;
	
	private LocalDateTime senDateEmail;
	private StatusEmail statusEmail; // criar esse  enum e importar ele aqui.

}
