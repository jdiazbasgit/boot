package curso.cap.ejemploSpringBoot.reposotories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.cap.ejemploSpringBoot.entitys.Estado;

@Repository
public interface EstadosCRUDRepository extends CrudRepository<Estado, Integer> {

}
