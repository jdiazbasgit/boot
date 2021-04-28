package curso.cap.ejemploSpringBoot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import curso.cap.ejemploSpringBoot.entitys.Estado;
import curso.cap.ejemploSpringBoot.reposotories.EstadosCRUDRepository;
@RestController
public class EjemploController {
	
	@Autowired
	private EstadosCRUDRepository repository;
	
	public EstadosCRUDRepository getRepository() {
		return repository;
	}

	public void setRepository(EstadosCRUDRepository repository) {
		this.repository = repository;
	}

	/*
	 * @GetMapping("/home")
	 * 
	 * @CrossOrigin(origins = "*") public Iterable<Estado> home() { //ModelAndView
	 * modelAndView= new ModelAndView(); //modelAndView.setViewName("home");
	 * 
	 * Iterable<Estado> estados= getRepository().findAll();
	 * 
	 * for (Estado estado : estados) { System.out.println(estado.getDescripcion());
	 * }
	 * 
	 * //modelAndView.addObject("estados",estados);
	 * 
	 * return estados; }
	 */
}
