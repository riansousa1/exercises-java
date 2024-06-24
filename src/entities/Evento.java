package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Evento {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private Date data;
	
	public Evento(String name, Date data) {
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public abstract String toString();
	
	
}
