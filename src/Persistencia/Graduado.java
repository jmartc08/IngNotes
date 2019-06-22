package Persistencia;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the graduados database table.
 * 
 */
@Entity
@Table(name="graduados")
@NamedQuery(name="Graduado.findAll", query="SELECT g FROM Graduado g")
public class Graduado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	private int apuntes;

	private int idAsignatura;

	//bi-directional many-to-one association to Perfil
	@ManyToOne
	@JoinColumn(name="idGraduado")
	private Perfil perfil;

	public Graduado() {
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