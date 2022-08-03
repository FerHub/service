package com.service.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.service.repository.LibroRepository;


@WebService(serviceName="GestorLibros", endpointInterface = "com.service.ws.GestorLibros")
public class GestorLibrosImpl implements GestorLibros {

	public List<Libro> listarLibros() throws Exception {
		LibroRepository libroRepo = new LibroRepository();
		List<Libro> listaLibros = null;
		try {
			//listaLibros = libroRepo.findAll();
			listaLibros = new ArrayList<Libro>();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("GestorLibrosImpl.listarLibros: Error no controlado");
		}
		
		if(listaLibros.size() == 0) {
			throw new EmptyException();
		}
		return listaLibros;
	}

	public Libro getLibroById(String numSerie) throws Exception {
		LibroRepository libroRepo = new LibroRepository();
		Libro libro = libroRepo.findByISBN(numSerie);
		
		if(libro == null) {
			throw new NotFoundException();
		}
		return libro;
	}

	public String addLibro(Libro libro) throws Exception {
		LibroRepository libroRepo = new LibroRepository();
		return libroRepo.save(libro.getSerie(), libro.getNombre(), libro.getEditorial());
		
	}

}
