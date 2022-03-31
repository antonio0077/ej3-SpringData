package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
    
	private long idCliente;	
	private String nombreCliente;	
	private String apellidosCliente;	
	private String docIdentidad;
	private Date nacimiento;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	@Column(name = "NOMBRE_CLIENTE")
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	@Column(name = "APELLIDOS_CLIENTE")
	public String getPrimerApellidoCliente() {
		return apellidosCliente;
	}

	public void setapellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}

	@Column(name = "DOC_IDENTIDAD", unique = true, nullable = false, length = 9)
	public String getDocIdentidad() {
		return docIdentidad;
	}

	public void setDocIdentidad(String docIdentidad) {
		this.docIdentidad = docIdentidad;
	}

	@Column(name = "FECHA_NACIMIENTO")
	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	
}

