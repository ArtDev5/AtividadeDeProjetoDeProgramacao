package ApiRest.ProjetoDeProg.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import ApiRest.ProjetoDeProg.entity.Curso;

public class cursoDto {
	
	private int id;
	private String nome;
	private String descricao;
	private String ementa;
	private Date dataCadastro;
	private Date dataInicio;
	private float valor;
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getEmenta() {
		return ementa;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public float getValor() {
		return valor;
	}
	
	public cursoDto(Curso curso) {
		this.nome = curso.getNome();
		this.descricao = curso.getDescricao();
		this.ementa = curso.getEmenta();
		this.dataCadastro = curso.getDataCadastro();
		this.dataInicio = curso.getDataInicio();
		this.valor = curso.getValor();
	}
	 
	public static List<cursoDto> converter(List<Curso> cursos){
		return cursos.stream().map(cursoDto::new).collect(Collectors.toList());
	}
	
}
