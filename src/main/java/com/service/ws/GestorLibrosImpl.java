package com.service.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;


@WebService(serviceName="GestorLibros", endpointInterface = "com.service.ws.GestorLibros")
public class GestorLibrosImpl implements GestorLibros {

	public List<Libro> listarLibros() {
		List<Libro> listaLibros = new ArrayList<Libro>();
		listaLibros.add(new Libro("planeta", "la sombra del viento", "isb123"));
		listaLibros.add(new Libro("planeta", "puertas de piedra", "isbn231"));
		return listaLibros;
	}

	public Libro getLibroById(String numSerie) throws NotFoundException {
		List<Libro> listaLibros = listarLibros();
		int i = 0;
		while (i < listaLibros.size() && !numSerie.equals(listaLibros.get(i).getSerie())) {
			i++;
		}
		
		if(i == listaLibros.size()) {
			throw new NotFoundException();
		}
		return listaLibros.get(i);
	}

}
