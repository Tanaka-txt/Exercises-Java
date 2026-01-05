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
		
		
		read.close(); // Close, reading input
	}

}
