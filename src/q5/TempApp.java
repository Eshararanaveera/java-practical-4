package q5;

import java.util.Scanner;

public class TempApp {

	public static void main(String[] args) {
		temp t1= new temp();
		temp t2 =new temp();
		

		Scanner input=new Scanner(System.in);
		
		System.out.print("enter the celci:");
		String celci=input.next();
		
		System.out.print("enter the faran:");
		double fran=input.nextDouble();

		System.out.println(celci+ "celcitofrana=" +t1.celsiusToFahrenheit(celci));
		
		System.out.println(fran+ "frarntocelci=" +t1.faranheitTocelsius(fran));
	}
}



