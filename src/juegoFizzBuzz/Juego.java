package juegoFizzBuzz;


/*
 * Juego FizzBuzz: Se desarrolla un programa que recorre los números del 1 al
 * 100. Para cada número, si es divisible por 3, imprime "Fizz"; si es divisible por
 * 5, imprime "Buzz"; y si es divisible por ambos, imprime "FizzBuzz". Si no cumple
 * ninguna condición, simplemente imprime el número.
 * */

public class Juego {
	
	public static void main(String args[]) {
		
		FizzBuzz fizzBuzz = new FizzBuzz(); 

        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.evaluarNumero(i)); 
        }
		
	}

}
