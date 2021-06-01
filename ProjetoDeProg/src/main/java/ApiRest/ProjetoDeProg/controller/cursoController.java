package ApiRest.ProjetoDeProg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ApiRest.ProjetoDeProg.dto.cursoDto;
import ApiRest.ProjetoDeProg.entity.Curso;
import ApiRest.ProjetoDeProg.repository.cursoRepository;

@RestController
@RequestMapping("/curso")
public class cursoController {
	
	@Autowired
	private cursoRepository CursoRepository;
	
	@GetMapping
	public List<cursoDto> ReadCursos(){
		List<Curso> cursos = CursoRepository.findAll();
		return cursoDto.converter(cursos);
		
	}
	
//	@PostMapping
//	@ResponseStatus(HttpStatus.CREATED)
//	public Curso CreateCurso(@RequestBody Curso curso){
//		
//		return CursoRepository.save(curso);
//	}
	
	
}
