package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Conferencia;
import entities.Evento;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String data = "24/06/2024";
		
		Evento evento = new Conferencia("Java Conference", sdf.parse(data), "John Doe");
	
		System.out.println(evento);

	}

}
