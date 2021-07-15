package start;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa el fin del loop: ");
		int endLoop = input.nextInt();
		input.close();
		int odd = 0;
		int even = 0; 
		for(int i = 1; i < endLoop + 1; i++) {
			if(i % 2 == 0) {
				even += i;
			}else {
				odd += i;
			}
		}
		System.out.println("Pares: "+even);
		System.out.println("No pares: "+odd);
		
	}

}
