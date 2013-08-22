package com.enscala.tutorials.jaxrs.calc;

import java.io.IOException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

public class CalcRESTStartup {
	
	static final String BASE_URI = "http://localhost:9999/calcrest/";
	
	public static void main(String[] args) {
		try {
			HttpServer server = HttpServerFactory.create(BASE_URI);
			server.start();
			System.out.println("Press Enter to stop the server. ");
			System.in.read();
			server.stop(0);
			
		} catch (IllegalArgumentException _ex) {
			_ex.printStackTrace();
		} catch (IOException _ex) {
			_ex.printStackTrace();
		}
	}

}
