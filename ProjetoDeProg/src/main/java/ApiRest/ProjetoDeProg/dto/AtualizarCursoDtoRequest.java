package ApiRest.ProjetoDeProg.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import ApiRest.ProjetoDeProg.model.CursoEntity;
import ApiRest.ProjetoDeProg.repository.cursoRepository;

public class AtualizarCursoDtoRequest {
	
	private String nome;
	private String descricao;
	private String ementa;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataCadastro;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataInicio;
	private float valor;
	
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
	
	public CursoEntity atualizar(int id, cursoRepository repositorio) {
		CursoEntity curso = repositorio.getById(id);
		curso.setNome(this.nome);
		curso.setDescricao(this.descricao);
		curso.setEmenta(this.ementa);
		curso.setDataCadastro(this.dataCadastro);
		curso.setDataInicio(this.dataInicio);
		curso.setValor(this.valor);
		repositorio.save(curso);
		return curso;
		
	}
}
