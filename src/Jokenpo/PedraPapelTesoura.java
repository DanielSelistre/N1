package Jokenpo;

import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		int player, computador;
		int pontosPlayer = 0;
		int pontosComputador = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("_____Pedra, Papel e Tesoura_____");
		System.out.println("");
		System.out.println("Regras:");
		System.out.println("Serão 5 partidas, ganha quem fizer mais pontos.");
		System.out.println("- Pedra ganha da Tesoura");
		System.out.println("- Papel ganha da Pedra");
		System.out.println("- Tesoura ganha do Pedra");
		System.out.println("- Se as escolhas forem iguais, será empate.");
		System.out.println("");
		System.out.println("Vamos jogar!");
		System.out.println("");
		System.out.println("Escolha o numero da opção desejada:");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");

		for(int i = 0; i < 5; i++) {
			System.out.print("Qual sua escolha: ");
			player = teclado.nextInt();
			switch (player) {
			case 1:
				System.out.println("Você escolheu PEDRA.");
				break;
			case 2:
				System.out.println("Você escolheu PAPEL.");
				break;
			case 3:
				System.out.println("Você escolheu TESOURA.");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			
			computador = (int)(Math.random()*3+1);
			switch (computador) {
			case 1:
				System.out.println("Computador escolheu PEDRA.");
				break;
			case 2:
				System.out.println("Computador escolheu PAPEL.");
				break;
			case 3:
				System.out.println("Computador escolheu TESOURA.");
				break;
			}
			if (player == computador) {
				System.out.println("*** EMPATE, ninguem pontua. ***");
			} else {
				if ((player == 1 && computador == 3) || (player == 2 && computador == 1) || (player == 3 && computador == 2)) {
					System.out.println("*** VENCEU, 1 ponto para você. ***");
					pontosPlayer++;
				} else {
					System.out.println("*** PERDEU, 1 ponto para o Computador. ***");
					pontosComputador++;
				}
			}
			System.out.println("");
		}
		teclado.close();
		System.out.printf("- Você: %d \n", pontosPlayer);
		System.out.printf("- Computador: %d \n", pontosComputador);
		System.out.println("");
		if (pontosPlayer > pontosComputador) {
			System.out.println("VOCÊ VENCEU O JOGO!");
		} else {
			if (pontosPlayer == pontosComputador) {
				System.out.println("JOGO TERMINOU EMPATADO!");
			} else {
				System.out.println("O COMPUTADOR VENCEU O JOGO!");
			}
		}
	}
}
