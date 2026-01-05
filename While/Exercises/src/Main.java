import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); // Read input
		// -=-=-=-=-=-= [Exercise 1] =-=-=-=-=-=-
		System.out.println("Ex1");
		int origin_psw = 8922;
		
		int attempt = read.nextInt();
		
		int count = 0;
		
		while(attempt != origin_psw) {
			System.out.println("Passworld Invalid!");
			count += 1;
			System.out.println(3 - count+" Attempts remaining");
			if(count == 3) {
				break;
			}
			attempt = read.nextInt();
		}
		
		// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		
		// -=-=-=-=-=-= [Exercise 2] =-=-=-=-=-=-
		System.out.println("Ex2");
		int cord_x = read.nextInt(); 
		int cord_y = read.nextInt();
		
		while(cord_x != 0 && cord_y != 0) {
			if(cord_x > 0 && cord_y > 0) {
				System.out.println("primeiro");
			}
			else if(cord_x < 0 && cord_y > 0) {
				System.out.println("segundo");
			}
			else if(cord_x > 0 && cord_y < 0) {
				System.out.println("quarto");
			}
			else {
				System.out.println("terceiro");
			}
			cord_x = read.nextInt(); 
			cord_y = read.nextInt();
		}
		// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		
		// -=-=-=-=-=-= [Exercise 3] =-=-=-=-=-=-
		System.out.println("Ex3");
		// Alcool = 1
		// Gasolina = 2
		// Diesel = 3
		// Fim = 4
		
		System.out.println("-=-=-=-=-=-= [POSTO] =-=-=-=-=-=-");
		System.out.println("∟ 1. Alcool");
		System.out.println("∟ 2. Gasolina");
		System.out.println("∟ 3. Diesel");
		System.out.println("∟ 4. Fim");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		int option_gas_station = read.nextInt();
		int count_Alcool = 0;
		int count_Gas = 0;
		int count_Diesel = 0;
		
		while(option_gas_station != 4) {
			switch(option_gas_station) {
				case 1:
					count_Alcool += 1;
					break;
				
				case 2:
					count_Gas += 1;
					break;
				
				case 3:
					count_Diesel += 1;
					break;
			}
			option_gas_station = read.nextInt();
			
		}
		System.out.println("Alcool: "+count_Alcool);
		System.out.println("Gasolina: "+count_Gas);
		System.out.println("Diesel: "+count_Diesel);
		
		read.close(); // Close, reading input
	}

}
