package exxxx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws Exception{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		
		int num1;
		System.out.println("Enter number:");
		num1=Integer.parseInt(br.readLine());
	}
}
