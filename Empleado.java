package aseguradora;

public class Empleado {
	private int id;
	private String nombre;
	private int salario;

	public Empleado(String nombre, int salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	

}
