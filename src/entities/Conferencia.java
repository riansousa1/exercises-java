package entities;

import java.util.Date;

public class Conferencia extends Evento{
	
	private String palestrante;

	public Conferencia(String name, Date data, String palestrante) {
		super(name, data);
		this.palestrante = palestrante;
	}

	@Override
	public String toString() {
		return "Conferência: " + getName()
		+ "\n" 
		+ "Data: "
		+ sdf.format(getData())
		+ "\n"
		+ "Palestrante: "
		+ palestrante;
	}

}
