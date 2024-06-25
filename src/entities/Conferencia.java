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

		StringBuilder sb = new StringBuilder();
		sb.append("Nome da Conferência:" + getName() + "\n");
		sb.append("Data (dd/MM/yyyy): " + sdf.format(getData()) + "\n");
		sb.append("Palestrante: " + palestrante);
		return sb.toString();     
	}

	

}
