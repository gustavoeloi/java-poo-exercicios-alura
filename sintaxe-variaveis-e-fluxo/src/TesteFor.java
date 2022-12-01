import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {
		/*for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}*/

		// Teste do for
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número inicial -> ");
		int numeroInicial = sc.nextInt();
		System.out.print("Digite o número final -> ");
		int numeroFinal = sc.nextInt();
		
		for(int i = numeroInicial; i <= numeroFinal; i++) {
			System.out.printf("%d ", i);
		}
		
		sc.close();
	}
}
