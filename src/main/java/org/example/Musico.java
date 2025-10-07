package org.example;


import java.util.Arrays;

public class Musico {

	private String nombre;
	private int formacion;
	private String genero;

	private String frontman;


	private String discografica;
	private String pais_de_origen;

	private String[] discos;


	
	public Musico(String nombre, int formacion, String genero, String frontman, String discografica, String pais_de_origen, String[] discos) {
		super();
		this.nombre = nombre;
		this.formacion = formacion;
		this.genero = genero;

		this.frontman = frontman;

		this.discografica = discografica;
		this.pais_de_origen = pais_de_origen;

		this.discos = discos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFormacion() {
		return formacion;
	}
	public void setFormacion(int formacion) {
		this.formacion = formacion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFrontman(){return frontman;}
	public void setFrontman(String frontman) {this.frontman = frontman;}

	public String getDiscografica() {
		return discografica;
	}
	public void setDiscografica(String discografica) {
		this.discografica = discografica;
	}
	public String getPais_de_origen() {
		return pais_de_origen;
	}
	public void setPais_de_origen(String pais_de_origen) {
		this.pais_de_origen = pais_de_origen;
	}

	public String[] getDiscos() {
		return discos;
	}

	public void setDiscos(String[] discos) {
		this.discos = discos;
	}

	@Override
	public String toString() {
		return "Musico{" +
				"nombre='" + nombre + '\'' +
				", formacion=" + formacion +
				", genero='" + genero + '\'' +
				", frontman='" + frontman + '\'' +
				", discografica='" + discografica + '\'' +
				", pais_de_origen='" + pais_de_origen + '\'' +
				", discos=" + Arrays.toString(discos) +
				'}';
	}
}