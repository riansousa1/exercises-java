package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Evento;
import entities.Show;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String data = "24/06/2024";
		
		Evento evento = new Show("Rock Night", sdf.parse(data), "The Rockers");
	
		System.out.println(evento);

	}

}
