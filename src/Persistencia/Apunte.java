package Persistencia;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the apuntes database table.
 * 
 */
@Entity
@Table(name="apuntes")
@NamedQuery(name="Apunte.findAll", query="SELECT a FROM Apunte a")
public class Apunte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int idDocumento;

	@Lob
	private byte[] archivo;

	private int idTipo;

	private int idUsuario;

	private String nombreAsignatura;

	private String nombreAutor;

	@Column(name="`Tipo Usuario`")
	private String tipo_Usuario;

	private String titulo;

	//bi-directional many-to-one association to Asignatura
	@ManyToOne
	@JoinColumn(name="idAsignatura")
	private Asignatura asignatura;

	public Apunte() {
	}

	public int getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

	public byte[] getArchivo() {
		return this.archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public int getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreAsignatura() {
		return this.nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getNombreAutor() {
		return this.nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getTipo_Usuario() {
		return this.tipo_Usuario;
	}

	public void setTipo_Usuario(String tipo_Usuario) {
		this.tipo_Usuario = tipo_Usuario;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Asignatura getAsignatura() {
		return this.asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

}