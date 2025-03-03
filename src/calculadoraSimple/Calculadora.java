package calculadoraSimple;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String args[]) {
		
		 Scanner scanner = new Scanner(System.in);
	       Operacion operacion = new Operacion();
	        boolean continuar = true;

	        while (continuar) {
	            System.out.println("Ingrese el primer número:");
	            double num1 = scanner.nextDouble();

	            System.out.println("Ingrese el segundo número:");
	            double num2 = scanner.nextDouble();

	            System.out.println("Seleccione una operación (+, -, *, /) o 'salir' para terminar:");
	            String opcion = scanner.next();

	            double resultado;
	            switch (opcion) {
	                case "+":
	                    resultado = operacion.sumar(num1, num2);
	                    System.out.println("Resultado: " + resultado);
	                    break;
	                case "-":
	                    resultado = operacion.restar(num1, num2);
	                    System.out.println("Resultado: " + resultado);
	                    break;
	                case "*":
	                    resultado = operacion.multiplicar(num1, num2);
	                    System.out.println("Resultado: " + resultado);
	                    break;
	                case "/":
	                    resultado = operacion.dividir(num1, num2);
	                    if (!Double.isNaN(resultado)) {
	                        System.out.println("Resultado: " + resultado);
	                    }
	                    break;
	                case "salir":
	                    continuar = false;
	                    System.out.println("Saliendo de la calculadora...");
	                    break;
	                default:
	                    System.out.println("Operación no válida. Intente de nuevo.");
	            }
	            System.out.println(); // Salto de línea para mejor presentación
	        }
	        scanner.close();
		
	}

}
