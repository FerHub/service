package com.service.ws;

public class NotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 */
	public NotFoundException() {
		super("Libro no encontrado");
	}
	

}
