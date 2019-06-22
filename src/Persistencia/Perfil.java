package Persistencia;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the perfil database table.
 * 
 */
@Entity
@NamedQuery(name="Perfil.findAll", query="SELECT p FROM Perfil p")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int idUsuario;

	private String apellidos;

	private String clave;

	private String dirección;

	private String email;

	private String nombre;

	private int nºTelefono;

	private int tipo;

	//bi-directional many-to-one association to Alumno
	@OneToMany(mappedBy="perfil")
	private List<Alumno> alumnos;

	//bi-directional many-to-one association to Graduado
	@OneToMany(mappedBy="perfil")
	private List<Graduado> graduados;

	//bi-directional many-to-one association to Profesore
	@OneToMany(mappedBy="perfil")
	private List<Profesore> profesores;

	public Perfil() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDirección() {
		return this.dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNºTelefono() {
		return this.nºTelefono;
	}

	public void setNºTelefono(int nºTelefono) {
		this.nºTelefono = nºTelefono;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public List<Alumno> getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Alumno addAlumno(Alumno alumno) {
		getAlumnos().add(alumno);
		alumno.setPerfil(this);

		return alumno;
	}

	public Alumno removeAlumno(Alumno alumno) {
		getAlumnos().remove(alumno);
		alumno.setPerfil(null);

		return alumno;
	}

	public List<Graduado> getGraduados() {
		return this.graduados;
	}

	public void setGraduados(List<Graduado> graduados) {
		this.graduados = graduados;
	}

	public Graduado addGraduado(Graduado graduado) {
		getGraduados().add(graduado);
		graduado.setPerfil(this);

		return graduado;
	}

	public Graduado removeGraduado(Graduado graduado) {
		getGraduados().remove(graduado);
		graduado.setPerfil(null);

		return graduado;
	}

	public List<Profesore> getProfesores() {
		return this.profesores;
	}

	public void setProfesores(List<Profesore> profesores) {
		this.profesores = profesores;
	}

	public Profesore addProfesore(Profesore profesore) {
		getProfesores().add(profesore);
		profesore.setPerfil(this);

		return profesore;
	}

	public Profesore removeProfesore(Profesore profesore) {
		getProfesores().remove(profesore);
		profesore.setPerfil(null);

		return profesore;
	}

}