import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		// -=-=-=-=-=-= [Exercise 1] =-=-=-=-=-=-
		System.out.println("Ex1");
		
		int x = read.nextInt();
		
		while(x < 1 && x > 1000) {
			x = read.nextInt();
		}
		
		// impar x
		// x % 2 = par
		// x % 2 != 0 impar 
		
		for(int i = 1; i <= x; i++) {
			int modulo = i % 2; // impar
			if(modulo != 0) {
				System.out.println(i);
			}
		}
		// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		
		// -=-=-=-=-=-= [Exercise 2] =-=-=-=-=-=-
		System.out.println("Ex2");
		int qtd_num = read.nextInt();
		int numero, in = 0, out = 0;
		
		for(int i = 0; i < qtd_num; i++) {
			numero = read.nextInt();
			// invalo [10,20] = in
			// fora = out 
			if(numero >= 10 && numero <= 20) {
				in +=1;
			}
			else {
				out +=1;
			}
		}
		
		System.out.println(in+" in\n"+out+" out");
		// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		
		// -=-=-=-=-=-= [Exercise 3] =-=-=-=-=-=-
		System.out.println("Ex3");
		int n_3 = read.nextInt();

		double n13, n23, n33, medio_3;

		for (int i = 0; i < n_3; i++) {
		    n13 = read.nextDouble();
		    n23 = read.nextDouble();
		    n33 = read.nextDouble();
		    medio_3 = (n13 * 2.0 + n23 * 3.0 + n33 * 5.0) / 10.0;
		    System.out.printf("%.1f%n", medio_3);
		}
		// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		read.close();
	}

}
