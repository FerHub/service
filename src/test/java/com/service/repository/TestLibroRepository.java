/**
 * 
 */
package com.service.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.service.ws.Libro;

/**
 * @author ferna
 *
 */
class TestLibroRepository extends TestRepository {

	
	@Test
	void testSave() {
		LibroRepository libroReposistory = new LibroRepository();
		try {
			libroReposistory.save("434567", "la cosa", "lugubre");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void testGet() {
		LibroRepository libroReposistory = new LibroRepository();
		Libro libro = null;
		try {
			libro = libroReposistory.findByISBN("1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assertions.assertNotNull(libro);
		
	}
}
