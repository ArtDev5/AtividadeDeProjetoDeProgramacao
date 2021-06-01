package ApiRest.ProjetoDeProg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ApiRest.ProjetoDeProg.entity.Curso;

@Repository
public interface cursoRepository extends JpaRepository<Curso, Long>{

}
