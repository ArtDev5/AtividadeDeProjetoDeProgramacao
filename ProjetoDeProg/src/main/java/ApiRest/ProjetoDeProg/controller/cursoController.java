package ApiRest.ProjetoDeProg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ApiRest.ProjetoDeProg.dto.CursoDtoRequest;
import ApiRest.ProjetoDeProg.dto.CursoDtoResponse;
import ApiRest.ProjetoDeProg.model.CursoEntity;
import ApiRest.ProjetoDeProg.repository.cursoRepository;

@RestController
@RequestMapping("/curso")
public class cursoController {
	
	@Autowired
	private cursoRepository CursoRepository;
	
	@GetMapping
	public List<CursoDtoResponse> ReadCursos(){
		List<CursoEntity> cursos = CursoRepository.findAll();
		return CursoDtoResponse.converter(cursos);
		
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CursoDtoRequest CreateCurso(@RequestBody CursoDtoRequest cursoDto){
		CursoRepository.save(cursoDto.build());
		return cursoDto;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> DeleteCurso(@PathVariable int id){
		CursoRepository.deleteById(id);
		return new ResponseEntity<>("Curso deletado!", HttpStatus.OK);
	}
	
	
	
}
