package com.service.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.service.util.DbUtil;
import com.service.ws.Libro;

public class LibroRepository {

	private Connection dbConnection;

	public LibroRepository() {
		dbConnection = DbUtil.getConnection();
	}

	public String save(String isbn, String titulo, String editorial) throws Exception {
		try {
			PreparedStatement prepStatement = dbConnection
					.prepareStatement("insert into libro(isbn, titulo, editorial) values (?, ?, ?)");
			prepStatement.setString(1, isbn);
			prepStatement.setString(2, titulo);
			prepStatement.setString(3, editorial);

			int count = prepStatement.executeUpdate();
			String responseMessage = (count == 1) ? "User Added Successfully" : "Error Inserting Database";
			return responseMessage;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("LibroRepository.save: Error Inserting Database");
		}
	}

	public boolean findByUserName(String titulo) throws Exception {
		try {
			PreparedStatement prepStatement = dbConnection
					.prepareStatement("select count(*) from libro where titulo = ?");
			prepStatement.setString(1, titulo);

			ResultSet result = prepStatement.executeQuery();
			if (result != null) {
				while (result.next()) {
					if (result.getInt(1) == 1) {
						return true;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("LibroRepository.findByUserName: Error querying Database");
			
		}
		return false;
	}

	public Libro findByISBN(String isbn) throws Exception {
		Libro libro = new Libro();
		try {
			PreparedStatement prepStatement = dbConnection.prepareStatement("select * from libro where isbn = ?");
			prepStatement.setString(1, isbn);

			ResultSet result = prepStatement.executeQuery();
			if (result != null) {
				while (result.next()) {
					libro.setSerie(result.getString(1));
					libro.setNombre(result.getString(2));
					libro.setEditorial(result.getString(3));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("LibroRepository.findByISBN: Error querying Database");
		}
		return libro;
	}

	public List<Libro> findAll() throws Exception {
		List<Libro> listaLibro = new ArrayList<>();
		try {
			PreparedStatement prepStatement = dbConnection.prepareStatement("select * from libro");
			ResultSet result = prepStatement.executeQuery();
			if (result != null) {
				while (result.next()) {
					listaLibro.add(new Libro(result.getString(3), result.getString(2), result.getString(1)));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("LibroRepository.findAll: Error querying Database");
		}
		return listaLibro;
	}

}
