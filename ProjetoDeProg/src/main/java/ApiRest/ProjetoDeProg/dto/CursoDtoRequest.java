package ApiRest.ProjetoDeProg.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import ApiRest.ProjetoDeProg.model.CursoEntity;

public class CursoDtoRequest {
	
	private String nome;
	private String descricao;
	private String ementa;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataCadastro;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataInicio;
	private float valor;
	
	public CursoDtoRequest() {
		
	}
	
	public CursoDtoRequest(String nome, String descricao, String ementa, Date dataCadastro, Date dataInicio, float valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.ementa = ementa;
		this.dataCadastro = dataCadastro;
		this.dataInicio = dataInicio;
		this.valor = valor;
	}
	
	public CursoEntity build() {
		CursoEntity curso = new CursoEntity(nome, descricao, ementa, dataCadastro, dataInicio, valor);
		return curso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
