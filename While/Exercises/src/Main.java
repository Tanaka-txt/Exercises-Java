import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); // Read input
		// -=-=-=-=-=-= [Exercise 1] =-=-=-=-=-=-
		
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
		
		
		read.close(); // Close, reading input
	}

}
