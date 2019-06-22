package Persistencia;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the asignaturas database table.
 * 
 */
@Entity
@Table(name="asignaturas")
@NamedQuery(name="Asignatura.findAll", query="SELECT a FROM Asignatura a")
public class Asignatura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int idAsignatura;

	private int apuntes;

	private String asignatura;

	private int idProfesor;

	private String profesor;

	//bi-directional many-to-one association to Apunte
	@OneToMany(mappedBy="asignatura")
	private List<Apunte> apuntesSet;

	public Asignatura() {
	}

	public int getIdAsignatura() {
		return this.idAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public int getApuntes() {
		return this.apuntes;
	}

	public void setApuntes(int apuntes) {
		this.apuntes = apuntes;
	}

	public String getAsignatura() {
		return this.asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getIdProfesor() {
		return this.idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getProfesor() {
		return this.profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public List<Apunte> getApuntesSet() {
		return this.apuntesSet;
	}

	public void setApuntesSet(List<Apunte> apuntesSet) {
		this.apuntesSet = apuntesSet;
	}

	public Apunte addApuntesSet(Apunte apuntesSet) {
		getApuntesSet().add(apuntesSet);
		apuntesSet.setAsignatura(this);

		return apuntesSet;
	}

	public Apunte removeApuntesSet(Apunte apuntesSet) {
		getApuntesSet().remove(apuntesSet);
		apuntesSet.setAsignatura(null);

		return apuntesSet;
	}

}