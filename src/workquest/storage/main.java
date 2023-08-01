package workquest.storage;

import java.util.LinkedList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Race raca = new Race();

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

		Race.mostrarMenuRaces();

		ClassType.menuClasses();







	}

}
