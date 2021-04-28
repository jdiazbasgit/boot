package curso.cap.ejemploSpringBoot.entitys;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="calendarios")
public class Calendario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	@Column
	private GregorianCalendar fecha;
	
	@Column
	private int diaSemana;
	
	@Column
	private int semanaMes;
	
	
	@ManyToOne
	//@JoinColumn(name = "estados_id")
	private Estado estado;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public GregorianCalendar getFecha() {
		return fecha;
	}


	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}


	public int getDiaSemana() {
		return diaSemana;
	}


	public void setDiaSemana(int diaSemana) {
		this.diaSemana = diaSemana;
	}


	public int getSemanaMes() {
		return semanaMes;
	}


	public void setSemanaMes(int semanaMes) {
		this.semanaMes = semanaMes;
	}


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


}
