package calculator;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Try my calculator! ");
		
		while(true) { //While loop to run the body infinite times

			Scanner uin=new Scanner(System.in); //uin is user input variable
			System.out.println("Enter your name: ");
			String name = uin.next().toUpperCase();
			System.out.println("Enter your first number: ");
			Double fnum = uin.nextDouble();
			System.out.println("Enter your second number: ");
			Double snum = uin.nextDouble();
			System.out.println("Enter your operator (+, -, *, /, %): ");
			String operator = uin.next();
			
			
			Calc_backend calc = new Calc_backend();
			
			if (operator.equals ("+"))
				System.out.println(name + " your answers is: " +calc.add(fnum,  snum));
			else if (operator.equals ("-"))
				System.out.println(name + " your answers is: " +calc.subtract(fnum,  snum));
			else if (operator.equals ("*"))
				System.out.println(name + " your answers is: " +calc.multiply(fnum,  snum));
			else if (operator.equals ("/"))
				System.out.println(name + " your answers is: " +calc.divide(fnum,  snum));
			else if (operator.equals ("%"))
				System.out.println(name + " your answers is: " +calc.modulus(fnum,  snum));
			System.out.println("------Next Person------");
	
		}
	}

}
