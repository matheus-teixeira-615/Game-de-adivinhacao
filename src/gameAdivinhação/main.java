package gameAdivinhação;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int numeroRandom = random.nextInt(100);
		System.out.print("chute um numero de 0 a 99: ");
		int escolha;
		int tentativa = 0;
		
		while(true) {
			escolha = scanner.nextInt();
			tentativa++;
			
			if(escolha == numeroRandom) {
				System.out.println("Você acertou em cheio!, o numero certo era: " + numeroRandom );	
				System.out.println("Você tentou: " + tentativa + " vezes.");	
				break;
			}
			if (escolha < numeroRandom) {
				System.out.println("Quase, chute mais alto");
			}
			if (escolha > numeroRandom) {
				System.out.println("Quase, chute mais baixo");
			}
		}

		scanner.close();

	}

}
