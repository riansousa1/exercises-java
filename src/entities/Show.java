package entities;

import java.util.Date;

public class Show extends Evento {
	
	private String banda;

	public Show(String name, Date data, String banda) {
		super(name, data);
		this.banda = banda;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Show:" + getName() + "\n");

		return sb.toString();
	}
}
