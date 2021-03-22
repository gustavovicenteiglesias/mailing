package muni.com.email.model;

import java.io.Serializable;

import javax.persistence.Basic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table (name = "cuerpo")
public class EmailCuerpo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    private Integer idCuerpo;
	
	private String nombre;
	private String ip;
	private String telefono;
	private String email;
	private String texto;
	
	
	

	public EmailCuerpo() {
		super();
	}




	public Integer getIdCuerpo() {
		return idCuerpo;
	}




	public void setIdCuerpo(Integer idCuerpo) {
		this.idCuerpo = idCuerpo;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getIp() {
		return ip;
	}




	public void setIp(String ip) {
		this.ip = ip;
	}




	public String getTelefono() {
		return telefono;
	}




	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getTexto() {
		return texto;
	}




	public void setTexto(String texto) {
		this.texto = texto;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public String toString() {
		return "EmailCuerpo [idCuerpo=" + idCuerpo + ", nombre=" + nombre + ", ip=" + ip + ", telefono=" + telefono
				+ ", email=" + email + ", texto=" + texto + "]";
	}


	
}
