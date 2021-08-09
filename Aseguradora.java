package aseguradora;

import java.util.ArrayList;

public class Aseguradora {
	private ArrayList<Empleado> empleados = new ArrayList<>();
	private static double pension = 12;
	private static double salud = 8.5;
	private static double riesgosLab = 0.522;
	private static double minimo = 908526;
	private static double auxTransporte = 106454;

	public static double liquidarPrestaciones(Empleado empleado, int diasTrabajados) {
		double devengado = minimo * 2; // devegando es el salario minimo x 2
		double primaServicios;

		if (empleado.getSalario() <= devengado) {
			primaServicios = ((empleado.getSalario() + auxTransporte) * diasTrabajados) / 360;
		} else {
			primaServicios = (empleado.getSalario() * diasTrabajados / 360);
		}
		double cesantias = primaServicios;
		double intereses = cesantias * (pension / 100);
		double vacaciones = (empleado.getSalario()  * diasTrabajados / 720);
		double prestaciones = primaServicios + cesantias + intereses + vacaciones;

		System.out.println("prestaciones: " + prestaciones);
		return prestaciones;
	}

	public static double liquidarSegSocial(Empleado empleado, int diasTrabajados) {
		double valorDia = empleado.getSalario() / 30;
		double baseSS = valorDia * diasTrabajados;

		double saludTotal = baseSS * (salud / 100);
		double pensionTotal = baseSS * (pension / 100);
		double riesgosTotal = baseSS * (riesgosLab / 100);
		double segSocial = saludTotal + pensionTotal + riesgosTotal;

		System.out.println("Seguridad social: " + segSocial);
		return segSocial;

	}
	
	public static double liquidarNomina(Empleado empleado, int diasTrabajados) {
		double devengado = minimo * 2; 
		double totalDevengado;
		if (empleado.getSalario() <= devengado) {
			totalDevengado = empleado.getSalario() + auxTransporte;
		} else {
			totalDevengado = empleado.getSalario();
		}
		double aporteSalud = ((empleado.getSalario()*0.04)/30)*diasTrabajados;
		double aportePension = 	aporteSalud;
		
		double nomina = totalDevengado+aporteSalud+aportePension;
		System.out.println("Nomina: " + nomina);
		return nomina;
	}
	
	public static double liquidarParafiscales(Empleado empleado, int diasTrabajados) {
		double aporteCaja = ((empleado.getSalario()*0.04)/30)*diasTrabajados;
		double ICBF = ((empleado.getSalario()*0.03)/30)*diasTrabajados;
		double SENA = ((empleado.getSalario()*0.02)/30)*diasTrabajados;
		
		double parafiscales = aporteCaja + ICBF + SENA;
		System.out.println("Parafiscales: " + parafiscales);
		return parafiscales;
	}
	

}
