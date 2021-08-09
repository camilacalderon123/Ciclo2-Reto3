package aseguradora;

public class Main {
	public static void main(String[] args) {
		int diasTrabajados = 152;
		Empleado e = new Empleado("Sara", 1810050);
		Aseguradora.liquidarPrestaciones(e, diasTrabajados);
		Aseguradora.liquidarSegSocial(e, diasTrabajados);
		Aseguradora.liquidarNomina(e, diasTrabajados);
		Aseguradora.liquidarParafiscales(e, diasTrabajados);
	}
}
