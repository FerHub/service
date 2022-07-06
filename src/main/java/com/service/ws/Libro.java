
package com.service.ws;

public class Libro {

    private  String editorial;
    private String nombre;
    private String serie;
    
    
    
	/**
	 * 
	 */
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param editorial
	 * @param nombre
	 * @param serie
	 */
	public Libro(String editorial, String nombre, String serie) {
		super();
		this.editorial = editorial;
		this.nombre = nombre;
		this.serie = serie;
	}
	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}
	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the serie
	 */
	public String getSerie() {
		return serie;
	}
	/**
	 * @param serie the serie to set
	 */
	public void setSerie(String serie) {
		this.serie = serie;
	}

    

}
