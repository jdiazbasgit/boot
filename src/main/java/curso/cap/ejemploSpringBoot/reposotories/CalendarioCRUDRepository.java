package curso.cap.ejemploSpringBoot.reposotories;

import org.springframework.data.repository.CrudRepository;

import curso.cap.ejemploSpringBoot.entitys.Calendario;

public interface CalendarioCRUDRepository extends CrudRepository<Calendario, Integer> {
	
	

}
