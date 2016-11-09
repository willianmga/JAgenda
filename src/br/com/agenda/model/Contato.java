package br.com.agenda.model;

import java.util.Calendar;

public class Contato {

	private int codigo;
	private String nome;
	private Calendar dataNascimento;
	private String endereco;
	private String telefoneCelular;
	private String telefoneResidencial;
	private String perfilFacebook;
	private String perfilLinkedIn;
	private String perfilGitHub;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}
	
	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	
	public String getPerfilFacebook() {
		return perfilFacebook;
	}
	
	public void setPerfilFacebook(String perfilFacebook) {
		this.perfilFacebook = perfilFacebook;
	}
	
	public String getPerfilLinkedIn() {
		return perfilLinkedIn;
	}
	
	public void setPerfilLinkedIn(String perfilLinkedIn) {
		this.perfilLinkedIn = perfilLinkedIn;
	}
	
	public String getPerfilGitHub() {
		return perfilGitHub;
	}
	
	public void setPerfilGitHub(String perfilGitHub) {
		this.perfilGitHub = perfilGitHub;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
