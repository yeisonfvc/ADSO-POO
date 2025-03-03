package calculadoraSimple;

public class Operacion {
	
	  public double sumar(double a, double b) {
	        return a + b;
	    }

	    public double restar(double a, double b) {
	        return a - b;
	    }

	    public double multiplicar(double a, double b) {
	        return a * b;
	    }

	    public double dividir(double a, double b) {
	        if (b == 0) {
	            System.out.println("Error: No se puede dividir por cero.");
	            return Double.NaN; // Retorna NaN si la división no es válida
	        }
	        return a / b;
	    }

}
