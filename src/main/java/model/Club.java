package model;

import java.io.Serializable;

import javax.persistence.*;


@Entity

public class Club implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable= false, updatable= false)
	
	private Integer id;
	private String nombre;
	private String division;
	private Integer cantSocios;
	private String direccion;
	
	public Club() {
		
	}
	public Club(Integer id, String nombre,String division, Integer cantSocios, String direccion) {
		
		this.id = id;
		this.nombre = nombre;
		this.division = division;
		this.cantSocios = cantSocios;
		this.direccion = direccion;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantSocios() {
		return cantSocios;
	}
	public void setCantSocios(Integer cantSocios) {
		this.cantSocios = cantSocios;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	

}
