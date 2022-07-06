package com.service.ws;

import javax.xml.ws.Endpoint;

public class Publicador {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1515/WS/GestorLibros", new GestorLibrosImpl());

	}

}
