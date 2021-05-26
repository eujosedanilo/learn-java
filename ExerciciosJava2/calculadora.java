package calculadora;

import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args){		
		Scanner in = new Scanner (System.in);
		
		int num1;
		int num2;
		System.out.println("Digite o primeiro numero:");
		num1 = in.nextInt();
		System.out.println("Digite o segundo numero:");
		num2 = in.nextInt();
		if (num1 > num2) {
			System.out.println(num1 + num2);
			
		}else {
			System.out.println(num2 + num1);
		}


		
	}

}
