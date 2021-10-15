package br.unitins.ds.a1;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Baralho baralho= new Baralho();
		baralho.getNewCard();
		Player bot = new Player("BOT");
		
		Player jogador1 = new Player();
		int op = 0;
		
		System.out.println("Insira seu nome");
		try {
			jogador1.setNome(entrada.nextLine());
		}catch(Exception e) {
			System.out.println("Ocorreu algum erro");
			System.exit(-42);
		}
		System.out.println("=============");
		System.out.println("| Blackjack |");
		System.out.println("=============");
		
		do {
			//Se o jogador não tiver parado, ele pode escolher puxar a carta ou parar
			if(!jogador1.isParou() && jogador1.getPontuacao()<21) {
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Puxar carta");
				System.out.println("2 - Parar");
				try {
					op = Integer.parseInt(entrada.nextLine());
				}catch(Exception e){
					System.out.println("Ocorreu algum problema...");
					System.exit(-42);
				}
				if(op!=1 && op!=2) {
					System.out.println("Opção inválida, finalizando");
					System.exit(-42);			
					}
				if(op==1) {
					Card carta1 = baralho.puxarCarta();
					
					System.out.println("\n=========\n");
					System.out.println(jogador1.getNome() + " tirou: " + carta1);
					jogador1.setPontuacao(jogador1.getPontuacao() + carta1.getNumber());
					
					
				}
			}
			
			//Se a pontuação do bot for maior ou igual a 21 ou ele estiver a menos de 4 pontos de diferença 
			//de 21, ele para
			if((bot.getPontuacao()>=21 || Math.abs(bot.getPontuacao()-21) <= 4) && !bot.isParou()) {
				System.out.println("O bot parou");
				bot.setParou(true);
			}
			
			//Se o bot não tiver parado, ele joga
			if(!bot.isParou()) {
				Card carta2 = baralho.puxarCarta();
				System.out.println("BOT tirou: " + carta2);
				bot.setPontuacao(bot.getPontuacao() + carta2.getNumber());
			}
			
			System.out.println("\n=========\n");
			System.out.println("Pontuação");
			System.out.println(jogador1);
			System.out.println(bot);
			
			if(op==2 || jogador1.getPontuacao()>=21) {
				jogador1.setParou(true);
			}
			
			
			
			//Se o jogador e o bot tiverem parado, calcula quem venceu e checa se há desejo de jogar novamente
			if(jogador1.isParou() && bot.isParou()) {
				
				System.out.println("O ganhador foi....");
				if(Math.abs(jogador1.getPontuacao()-21)>Math.abs(bot.getPontuacao()-21)) {
					System.out.println("O bot");
				}else if(Math.abs(jogador1.getPontuacao()-21)<Math.abs(bot.getPontuacao()-21)) {
					System.out.println(jogador1.getNome());
				}else {
					System.out.println("Empate");
				}
				
				
				System.out.println("Deseja jogar novamente? 1-Sim | 2-Não");
				try {
					op = Integer.parseInt(entrada.nextLine());
				}catch(Exception e){
					System.out.println("Ocorreu algum problema...");
					System.exit(-42);
				}
				if(op==1) {
					jogador1.setParou(false);
					jogador1.setPontuacao(0);
					
					bot.setParou(false);
					bot.setPontuacao(0);
					
					
				}else {
					System.out.println("Entendido, finalizando...");
				}
			}
			
			
			
		}while(!jogador1.isParou() || !bot.isParou());
		entrada.close();
	}
}
