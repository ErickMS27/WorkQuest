package workquest.storage;

import java.util.LinkedList;
import java.util.Scanner;


public class MainRPG {

	public static void main(String[] args) {

		String nameChar;

		System.out.println(
				"Olá! Bem-vindo ao WorkQuest! Um sistema de gamificação baseada no sistema de RPG: Dungeons and Dragons 5º Edição.\n");

		Scanner enterNamePlayer = new Scanner(System.in);
		System.out.println("Digite o seu nome de jogador:");
		String namePlayer = enterNamePlayer.nextLine();
		nameChar = namePlayer;
		if (nameChar.isEmpty()) {
			System.out.println("\nPor favor, digite seu nome:\n");
		} else
			System.out.println("\nCerto " + namePlayer + ", agora iremos criar sua ficha.");

		// Raça
		
		RacaRPG raca = new RacaRPG();
		
		LinkedList<String> races = new LinkedList<String>();

		System.out.println("\nUtilizando como base o Livro do Jogador, temos as seguintes raças no mundo de D&D:");

		races.add("\n1) Anão");
		races.add("2) Draconato");
		races.add("3) Elfo");
		races.add("4) Gnomo");
		races.add("5) Halfling");
		races.add("6) Humano");
		races.add("7) Meio-elfo");
		races.add("8) Meio-orc");
		races.add("9) Tiferino\n");

		for (String i : races) {
			System.out.println(i);
		}

		System.out.println("Possuimos um total de" + " " + races.size() + " "
				+ "raças no sistema D&D. Digite com qual raça, você deseja jogar:");

		RacaRPG.mostrarMenuRaces();
		
		// Classe
		
		/*.mostrarMenuClasse();*/
		
		// Background
		
		workquest.storage.AntescedenteRPG background = new workquest.storage.AntescedenteRPG();
		
		LinkedList<String> backgrounds = new LinkedList<String>();
		System.out.println(
				"\nUtilizando como base o Livro do Jogador, temos os seguintes antecedentes com suas informações, do mundo de D&D:");

		backgrounds.add("\n1) Acólito");
		backgrounds.add("2) Artesão de Guilda");
		backgrounds.add("3) Artista");
		backgrounds.add("4) Assombrado");
		backgrounds.add("5) Charlatão");
		backgrounds.add("6) Criminoso");
		backgrounds.add("7) Eremita");
		backgrounds.add("8) Forasteiro");
		backgrounds.add("9) Herói do Povo");
		backgrounds.add("10) Marinheiro");
		backgrounds.add("11) Nobre");
		backgrounds.add("12) Órfão");
		backgrounds.add("13) Sábio");
		backgrounds.add("14) Soldado\n");

		for (String i : backgrounds) {
			System.out.println(i);
		}

		System.out.println("Possuimos um total de" + " " + backgrounds.size() + " "
				+ "antecedentes no sistema D&D. Digite com qual antecedente, você deseja aderir ao seu personagem:");

		
		AntescedenteRPG.mostrarMenuBackground();
		/*AlinhamentoRPG.mostrarMenuAlinhamento();*/
	}

}