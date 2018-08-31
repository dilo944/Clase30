//libreria para hacer uso del Scanner
import java.util.Scanner;

/*
 * Esta aplicación permite ingresar las notas de los parciales y calcular 
 * la nota definitiva
 * Autor: Diego Lozano
 * Versión: 1.0
 * Fecha: 30-08-2018 
 */
public class CalcularDefinitiva {
	
	//declaración de variables
	double nota1, nota2, notaFinal;
	double acum1, acum2, acumf, def;
	//estamos declarando mecanismo de entrada;definir metodo para pedir datos
	Scanner sc = new Scanner(System.in);
	
	public void leerNotas() {
		System.out.print("Ingrese la nota del parcial 1: ");
		nota1 = sc.nextDouble();
		System.out.print("Ingrese la nota del parcial 2: ");
		nota2 = sc.nextDouble();
		System.out.print("Ingrese la nota del parcial final: ");
		notaFinal = sc.nextDouble();
	}
	//no puedo usar el simbolo de porcentaje, hay que multiplicar por su valor decimal
	public void calcular() {
		acum1 = nota1*0.25;
		acum2 = nota2*0.25;
		acumf = notaFinal*0.5;		
		def = acum1 + acum2 + acumf;
	}
	
	public void mostrar() {
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Nota final: " + notaFinal);
		System.out.println("Acumulado de la nota 1: " + acum1);
		System.out.println("Acumulado de la nota 2: " + acum2);
		System.out.println("Acumulado de la nota final: " + acumf);
		System.out.println("Definitiva : " + def);
		
	}
	
	public static void main(String[] args) {
		CalcularDefinitiva cf = new CalcularDefinitiva();   //mecanismo de puente entre el main y el metodo
		cf.leerNotas();
		cf.calcular();
		cf.mostrar();
	}

}
