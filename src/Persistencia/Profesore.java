package Persistencia;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profesores database table.
 * 
 */
@Entity
@Table(name="profesores")
@NamedQuery(name="Profesore.findAll", query="SELECT p FROM Profesore p")
public class Profesore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	private int apuntes;

	private int idAsignatura;

	//bi-directional many-to-one association to Perfil
	@ManyToOne
	@JoinColumn(name="idProfesor")
	private Perfil perfil;

	public Profesore() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getApuntes() {
		return this.apuntes;
	}

	public void setApuntes(int apuntes) {
		this.apuntes = apuntes;
	}

	public int getIdAsignatura() {
		return this.idAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}