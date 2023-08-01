package workquest.storage;

import java.util.LinkedList;
import java.util.Scanner;

public class RacaRPG extends FichaRPG {

	// Variável principal Raça do Usuário
	
	static String racesPlayer;
	
	// Aprimoramento de Valores de Raças

	static int upDragonbornStrRace = strength + 2;
	static int upDragonbornChaRace = charisma + 1;
	static int upDwarfRace = constitution + 2;
	static int upElfRace = dexterity + 2;
	static int upGnomeRace = intelligence + 2;
	static int upHalfElfRace = charisma + 2;
	static int upHalflingRace = dexterity + 2;
	static int upHalfOrcConRace = constitution + 1;
	static int upHalfOrcStrRace = strength + 2;
	static int upHumanStrRace = strength + 1;
	static int upHumanDexRace = dexterity + 1;
	static int upHumanConRace = constitution + 1;
	static int upHumanIntRace = intelligence + 1;
	static int upHumanWisRace = wisdom + 1;
	static int upHumanChaRace = charisma + 1;
	static int upTieflingChaRace = charisma + 2;
	static int upTieflingIntRace = intelligence + 1;

	// Aprimoramento de Valores de Sub-Raças

	static int upMountainDwarfRace = strength + 2;
	static int upHillDwarfRace = wisdom + 1;
	static int upDarkElfRace = charisma + 1;
	static int upHighElfRace = intelligence + 1;
	static int upWoodElfRace = wisdom + 1;
	static int upRockGnomeRace = constitution + 1;
	static int upForestGnomeRace = dexterity + 1;
	static int upLightFootHalflingRace = charisma + 1;
	static int upStoutHalflingRace = constitution + 1;

	LinkedList<String> races = new LinkedList<String>();

	protected static void mostrarMenuRaces() {

		// Método para Raças e Sub-raças

		Scanner enterRaces = new Scanner(System.in);
		racesPlayer = enterRaces.nextLine();
		String raceHumanPlayer;
		String raceHalfElfPlayer;
		String raceHalfOrcPlayer;
		String raceTieflingPlayer;

		// Condição de Sub-raça

		switch (racesPlayer) {

		case "1", "Anão", "anão", "Anao", "anao":

			LinkedList<String> subDwarf = new LinkedList<String>();

			System.out.println("\nCerto, temos duas sub-raças dos Anões, que são:");

			subDwarf.add("\n1) Anão da Colina");
			subDwarf.add("2) Anão da Montanha\n ");

			for (String i : subDwarf) {
				System.out.println(i);
			}

			int upDwarfConstitution = upDwarfRace;
			constitution = upDwarfConstitution;

			System.out.println("Informe com qual você sub-raça dos Anões você deseja jogar:");

			Scanner enterSubDwarf = new Scanner(System.in);
			String inputDwarfPlayer = enterSubDwarf.nextLine();
			String subDwarfPlayer;

			switch (inputDwarfPlayer) {

			case "1", "Anão da Colina", "Anão da colina", "anão da colina", "Anao da Colina", "Anao da colina",
					"anao da colina":

				subDwarfPlayer = "Anão da Colina";
				int upDwarfWisdom = upHillDwarfRace;
				wisdom = upDwarfWisdom;

				System.out.println("\nCerto, seu personagem será um: " + subDwarfPlayer
						+ ". Agora vamos prosseguir para as classes.");
				return;

			case "2", "Anão da Montanha", "Anão da montanha", "anão da montanha", "Anao da Montanha",
					"Anao da montanha", "anao da montanha":

				subDwarfPlayer = "Anão da Montanha";
				int upDwarfStrength = upMountainDwarfRace;
				strength = upDwarfStrength;

				System.out.println("\nCerto, seu personagem será um: " + subDwarfPlayer
						+ ". Agora vamos prosseguir para as classes.");
				return;

			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
				mostrarMenuRacesDwarf();
				return;
			}

		case "2", "Draconato", "draconato":
			LinkedList<String> subDragonborn = new LinkedList<String>();

			int upStrength = upDragonbornStrRace;
			strength = upStrength;
			int upCharisma = upDragonbornChaRace;
			charisma = upCharisma;

			System.out.println("\nCerto, temos dez opções de Ancestralidades Dracônicas, que são:");

			subDragonborn.add("\n1) Azul");
			subDragonborn.add("2) Branco");
			subDragonborn.add("3) Bronze");
			subDragonborn.add("4) Cobre");
			subDragonborn.add("5) Latão");
			subDragonborn.add("6) Negro");
			subDragonborn.add("7) Ouro");
			subDragonborn.add("8) Prata");
			subDragonborn.add("9) Verde");
			subDragonborn.add("10) Vermelho\n ");

			for (String i : subDragonborn) {
				System.out.println(i);
			}

			System.out.println("Informe com qual você Ancestralidade Dracônica você deseja jogar:");

			Scanner enterSubDragonborn = new Scanner(System.in);
			String inputDragonbornPlayer = enterSubDragonborn.nextLine();
			String subDragonbornPlayer;

			int upDragonbornCharisma = upDragonbornChaRace;
			charisma = upDragonbornCharisma;

			int upDragonbornStrength = upDragonbornStrRace;
			strength = upDragonbornStrength;

			switch (inputDragonbornPlayer) {

			case "1", "Azul", "azul":
				subDragonbornPlayer = "Azul";
				System.out.println("\nCerto, seu personagem será Draconato " + subDragonbornPlayer
						+ ". Agora vamos prosseguir para as classes.");
				return;

			case "2", "Branco", "branco":
				subDragonbornPlayer = "Branco";
				System.out.println("\nCerto, seu personagem será Draconato " + subDragonbornPlayer
						+ ". Agora vamos prosseguir para as classes.");
				return;

			case "3", "Bronze", "bronze":
				subDragonbornPlayer = "Bronze";
				System.out.println("\nCerto, seu personagem será Draconato de " + subDragonbornPlayer
						+ ". Agora vamos prosseguir para as classes.");
				return;

			case "4", "Cobre", "cobre":
				subDragonbornPlayer = "Cobre";
				System.out.println("\nCerto, seu personagem será Draconato de " + subDragonbornPlayer
						+ ". Agora vamos prosseguir para as classes.");
				return;

			case "5", "Latão", "latão", "Latao", "latao":
				subDragonbornPlayer = "Latão";
				System.out.println("\nCerto, seu personagem será Draconato de " + subDragonbornPlayer
						+ ". Agora vamos prosseguir para as classes.");
				return;

			case "6", "Negro", "negro":
				subDragonbornPlayer = "Negro";
				System.out.println("\nCerto, seu personagem será Draconato " + subDragonbornPlayer
						+ ". Agora vamos prosseguir para as classes.");
				return;

			case "7", "Ouro", "ouro":
				subDragonbornPlayer = "Ouro";
				System.out.println("\nCerto, seu personagem será Draconato de " + subDragonbornPlayer
						+ ". Agora vamos prosseguir para as classes.");
				return;

			case "8", "Prata", "prata":
				subDragonbornPlayer = "Prata";
				System.out.println("\nCerto, seu personagem será Draconato de " + subDragonbornPlayer
						+ ". Agora vamos prosseguir para as classes.");
				return;

			case "9", "Verde", "verde":
				subDragonbornPlayer = "Verde";
				System.out.println("\nCerto, seu personagem será Draconato " + subDragonbornPlayer
						+ ". Agora vamos prosseguir para as classes.");

			case "10", "Vermelho", "vermelho":
				subDragonbornPlayer = "Vermelho";
				System.out.println("\nCerto, seu personagem será Draconato " + subDragonbornPlayer
						+ ". Agora vamos prosseguir para as classes.");
				return;

			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
				mostrarMenuRacesDragonborn();
				return;

			}

		case "3", "Elfo", "elfo":

			LinkedList<String> subElf = new LinkedList<String>();

			int upElfDex = upElfRace;
			dexterity = upElfDex;

			System.out.println("\nCerto, temos três sub-raças dos Elfos, que são:");

			subElf.add("\n1) Alto Elfo");
			subElf.add("2) Elfo da Floresta");
			subElf.add("3) Elfo Negro\n ");

			for (String i : subElf) {
				System.out.println(i);
			}

			int upDexterity = upElfRace;
			dexterity = upDexterity;

			System.out.println("Informe com qual você sub-raça dos Elfos você deseja jogar:");

			Scanner enterSubElf = new Scanner(System.in);
			String inputElfPlayer = enterSubElf.nextLine();
			String subElfPlayer;

			switch (inputElfPlayer) {

			case "1", "Alto Elfo", "Alto elfo", "alto elfo":

				subElfPlayer = "Alto Elfo";

				System.out.println("\nCerto, seu personagem será um: " + subElfPlayer
						+ ". Agora vamos prosseguir para as classes.");

				int upElfIntelligence = upHighElfRace;
				intelligence = upElfIntelligence;

				return;

			case "2", "Elfo da Floresta", "Elfo da floresta", "elfo da Floresta", "elfo da floresta", "Bosmer",
					"bosmer":

				subElfPlayer = "Elfo da Floresta";

				System.out.println("\nCerto, seu personagem será um: " + subElfPlayer
						+ ". Agora vamos prosseguir para as classes.");

				int upElfWisdom = upWoodElfRace;
				wisdom = upElfWisdom;

				return;

			case "3", "Elfo Negro", "Elfo negro", "elfo negro", "Drow", "drow":

				subElfPlayer = "Elfo Negro";

				System.out.println("\nCerto, seu personagem será um: " + subElfPlayer
						+ ". Agora vamos prosseguir para as classes.");

				int upElfCharisma = upDarkElfRace;
				charisma = upDarkElfRace;

				return;

			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
				mostrarMenuRacesElf();
				return;

			}

		case "4", "Gnomo", "gnomo":

			LinkedList<String> subGnome = new LinkedList<String>();

			int upGnomeInt = upGnomeRace;
			intelligence = upGnomeInt;

			System.out.println("\nCerto, temos duas sub-raças dos Gnomos, que são:");

			subGnome.add("\n1) Gnomo da Floresta");
			subGnome.add("2) Gnomo das Rochas\n ");

			for (String i : subGnome) {
				System.out.println(i);
			}

			System.out.println("Informe com qual você sub-raça dos Gnomos você deseja jogar:");

			Scanner enterSubGnome = new Scanner(System.in);
			String inputGnomePlayer = enterSubGnome.nextLine();
			String subGnomePlayer;

			switch (inputGnomePlayer) {

			case "1", "Gnomo da Floresta", "Gnomo da floresta", "gnomo da floresta":

				subGnomePlayer = "Gnomo da Floresta";

				System.out.println("\nCerto, seu personagem será um: " + subGnomePlayer
						+ ". Agora vamos prosseguir para as classes.");

				int upGnomeDexterity = upForestGnomeRace;
				dexterity = upGnomeDexterity;

				return;

			case "2", "Gnomo das Rochas", "Gnomo das rochas", "gnomo das rochas":

				subGnomePlayer = "Gnomo das Rochas";

				System.out.println("\nCerto, seu personagem será um: " + subGnomePlayer
						+ ". Agora vamos prosseguir para as classes.");

				int upGnomeConstitution = upRockGnomeRace;
				constitution = upGnomeConstitution;

				return;

			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
				mostrarMenuRacesGnome();
				return;

			}
		case "5", "Halfling", "halfing", "Hobbit", "hobbit":

			LinkedList<String> subHalfling = new LinkedList<String>();

			int upHalflingDex = upHalflingRace;
			dexterity = upHalflingDex;

			System.out.println("\nCerto, temos duas sub-raças dos Halflings, que são:");

			subHalfling.add("\n1) Robusto");
			subHalfling.add("2) Pés Peludos\n ");

			for (String i : subHalfling) {
				System.out.println(i);
			}

			System.out.println("Informe com qual você sub-raça dos Halflings você deseja jogar:");

			Scanner enterSubHalfling = new Scanner(System.in);
			String input_halfling_player = enterSubHalfling.nextLine();
			String subHalflingPlayer;

			switch (input_halfling_player) {

			case "1", "Robusto", "robusto":

				subHalflingPlayer = "Halfling Robusto";

				System.out.println("\nCerto, seu personagem será um: " + subHalflingPlayer
						+ ". Agora vamos prosseguir para as classes.");

				int upHalflingConstitution = upStoutHalflingRace;
				constitution = upHalflingConstitution;

				return;

			case "2", "Pés Peludos", "Pés peludos", "pés peludos", "Pes Peludos", "Pes peludos", "pes peludos":

				subHalflingPlayer = "Halfling dos Pés Peludos";
				System.out.println("\nCerto, seu personagem será um: " + subHalflingPlayer
						+ ". Agora vamos prosseguir para as classes.");

				int upHalflingCharisma = upLightFootHalflingRace;
				charisma = upHalflingCharisma;

				return;

			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
				mostrarMenuRacesHalfling();
				return;

			}

		case "6", "Humano", "humano":

			raceHumanPlayer = "Humano";
			int upHumanStr = upHumanStrRace;
			strength = upHumanStr;
			int upHumanDex = upHumanDexRace;
			dexterity = upHumanDex;
			int upHumanCon = upHumanConRace;
			constitution = upHumanCon;
			int upHumanInt = upHumanIntRace;
			intelligence = upHumanInt;
			int upHumanWis = upHumanWisRace;
			wisdom = upHumanWis;
			int upHumanCha = upHumanChaRace;
			charisma = upHumanCha;

			System.out.println("\nCerto, seu personagem será um: " + raceHumanPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "7", "Meio-Elfo", "Meio-elfo", "meio-elfo", "Meio Elfo", "Meio elfo", "meio elfo":

			raceHalfElfPlayer = "Meio-Elfo";
			int upHalfElfCha = upHalfElfRace;
			charisma = upHalfElfCha;

			System.out.println("\nCerto, seu personagem será um: " + raceHalfElfPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "8", "Meio-Orc", "Meio-orc", "meio-orc", "Meio Orc", "Meio orc", "meio orc":

			raceHalfOrcPlayer = "Meio-Orc";
			int upHalfOrcStr = upHalfOrcStrRace;
			strength = upHalfOrcStr;
			int upHalfOrcCon = upHalfOrcConRace;
			constitution = upHalfOrcCon;
			
			System.out.println("\nCerto, seu personagem será um: " + raceHalfOrcPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "9", "Tiferino", "tiferino", "Tiefling", "tiefling", "Homem-Diabo", "Homem-diabo", "homem-diabo",
				"Homem Diabo", "Homem diabo", "homem diabo":

			raceTieflingPlayer = "Tiferino";
			int upTieflingInt = upTieflingIntRace;
			intelligence = upTieflingInt;
			int upTieflingCha = upTieflingChaRace;
			charisma = upTieflingCha;

			System.out.println("\nCerto, seu personagem será um: " + raceTieflingPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:");

			mostrarMenuRaces();
		}
	}

	private static void mostrarMenuRacesDwarf() {

		Scanner enterSubDwarf = new Scanner(System.in);
		String subDwarfPlayer = enterSubDwarf.nextLine();

		switch (subDwarfPlayer) {

		case "1", "Anão da Colina", "Anão da colina", "anão da colina", "Anao da Colina", "Anao da colina",
				"anao da colina":
			System.out.println(
					"\nCerto, seu personagem será um: " + subDwarfPlayer + ". Agora vamos prosseguir para as classes.");
			break;

		case "2", "Anão da Montanha", "Anão da montanha", "anão da montanha", "Anao da Montanha", "Anao da montanha",
				"anao da montanha":
			System.out.println(
					"\nCerto, seu personagem será um: " + subDwarfPlayer + ". Agora vamos prosseguir para as classes.");
			break;

		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			mostrarMenuRacesDwarf();
		}
	}

	private static void mostrarMenuRacesDragonborn() {

		Scanner enterSubDragonborn = new Scanner(System.in);
		String subDragonbornPlayer = enterSubDragonborn.nextLine();

		switch (subDragonbornPlayer) {

		case "1", "Azul", "azul":
			System.out.println("\nCerto, seu personagem será um Draconato " + subDragonbornPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "2", "Branco", "branco":
			System.out.println("\nCerto, seu personagem será um Draconato " + subDragonbornPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "3", "Bronze", "bronze":
			System.out.println("\nCerto, seu personagem será um Draconato de" + subDragonbornPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "4", "Cobre", "cobre":
			System.out.println("\nCerto, seu personagem será um Draconato de" + subDragonbornPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "5", "Latão", "latão", "Latao", "latao":
			System.out.println("\nCerto, seu personagem será um Draconato de" + subDragonbornPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "6", "Negro", "negro":
			System.out.println("\nCerto, seu personagem será um Draconato " + subDragonbornPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "7", "Ouro", "ouro":
			System.out.println("\nCerto, seu personagem será um Draconato de" + subDragonbornPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "8", "Prata", "prata":
			System.out.println("\nCerto, seu personagem será um Draconato de" + subDragonbornPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "9", "Verde", "verde":
			System.out.println("\nCerto, seu personagem será um Draconato " + subDragonbornPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "10", "Vermelho", "vermelho":
			System.out.println("\nCerto, seu personagem será um Draconato " + subDragonbornPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			mostrarMenuRacesDragonborn();
		}

	}

	private static void mostrarMenuRacesElf() {

		Scanner enterSubElf = new Scanner(System.in);
		String subElfPlayer = enterSubElf.nextLine();

		switch (subElfPlayer) {

		case "1", "Alto Elfo", "alto elfo":
			System.out.println(
					"\nCerto, seu personagem será um: " + subElfPlayer + ". Agora vamos prosseguir para as classes.");
			break;

		case "2", "Elfo da Floresta", "Elfo da floresta", "elfo da Floresta", "elfo da floresta", "Bosmer", "bosmer":
			System.out.println(
					"\nCerto, seu personagem será um: " + subElfPlayer + ". Agora vamos prosseguir para as classes.");
			break;

		case "3", "Elfo Negro", "Elfo negro", "elfo negro", "Drow", "drow":
			System.out.println(
					"\nCerto, seu personagem será um: " + subElfPlayer + ". Agora vamos prosseguir para as classes.");
			break;

		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			mostrarMenuRacesElf();
		}
	}

	private static void mostrarMenuRacesGnome() {

		Scanner enterSubGnome = new Scanner(System.in);
		String subGnomePlayer = enterSubGnome.nextLine();

		switch (subGnomePlayer) {

		case "1", "Gnomo da Floresta", "Gnomo da floresta", "gnomo da floresta":
			System.out.println(
					"\nCerto, seu personagem será um: " + subGnomePlayer + ". Agora vamos prosseguir para as classes.");
			break;

		case "2", "Gnomo das Rochas", "Gnomo das rochas", "gnomo das rochas":
			System.out.println(
					"\nCerto, seu personagem será um: " + subGnomePlayer + ". Agora vamos prosseguir para as classes.");
			break;

		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			mostrarMenuRacesGnome();
		}
	}

	private static void mostrarMenuRacesHalfling() {

		Scanner enterSubHalfling = new Scanner(System.in);
		String subHalflingPlayer = enterSubHalfling.nextLine();

		switch (subHalflingPlayer) {

		case "1", "Robusto", "robusto":
			System.out.println("\nCerto, seu personagem será um: " + subHalflingPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		case "2", "Pés Peludos", "Pés peludos", "pés peludos", "Pes Peludos", "Pes peludos", "pes peludos":
			System.out.println("\nCerto, seu personagem será um: " + subHalflingPlayer
					+ ". Agora vamos prosseguir para as classes.");
			break;

		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			mostrarMenuRacesHalfling();
		}

	}

	// Encapsulamento
	
	public static int getUpDragonbornStrRace() {
		return upDragonbornStrRace;
	}

	public static void setUpDragonbornStrRace(int upDragonbornStrRace) {
		RacaRPG.upDragonbornStrRace = upDragonbornStrRace;
	}

	public static int getUpDragonbornChaRace() {
		return upDragonbornChaRace;
	}

	public static void setUpDragonbornChaRace(int upDragonbornChaRace) {
		RacaRPG.upDragonbornChaRace = upDragonbornChaRace;
	}

	public static int getUpDwarfRace() {
		return upDwarfRace;
	}

	public static void setUpDwarfRace(int upDwarfRace) {
		RacaRPG.upDwarfRace = upDwarfRace;
	}

	public static int getUpElfRace() {
		return upElfRace;
	}

	public static void setUpElfRace(int upElfRace) {
		RacaRPG.upElfRace = upElfRace;
	}

	public static int getUpGnomeRace() {
		return upGnomeRace;
	}

	public static void setUpGnomeRace(int upGnomeRace) {
		RacaRPG.upGnomeRace = upGnomeRace;
	}

	public static int getUpHalfElfRace() {
		return upHalfElfRace;
	}

	public static void setUpHalfElfRace(int upHalfElfRace) {
		RacaRPG.upHalfElfRace = upHalfElfRace;
	}

	public static int getUpHalflingRace() {
		return upHalflingRace;
	}

	public static void setUpHalflingRace(int upHalflingRace) {
		RacaRPG.upHalflingRace = upHalflingRace;
	}

	public static int getUpHalfOrcConRace() {
		return upHalfOrcConRace;
	}

	public static void setUpHalfOrcConRace(int upHalfOrcConRace) {
		RacaRPG.upHalfOrcConRace = upHalfOrcConRace;
	}

	public static int getUpHalfOrcStrRace() {
		return upHalfOrcStrRace;
	}

	public static void setUpHalfOrcStrRace(int upHalfOrcStrRace) {
		RacaRPG.upHalfOrcStrRace = upHalfOrcStrRace;
	}

	public static int getUpHumanStrRace() {
		return upHumanStrRace;
	}

	public static void setUpHumanStrRace(int upHumanStrRace) {
		RacaRPG.upHumanStrRace = upHumanStrRace;
	}

	public static int getUpHumanDexRace() {
		return upHumanDexRace;
	}

	public static void setUpHumanDexRace(int upHumanDexRace) {
		RacaRPG.upHumanDexRace = upHumanDexRace;
	}

	public static int getUpHumanConRace() {
		return upHumanConRace;
	}

	public static void setUpHumanConRace(int upHumanConRace) {
		RacaRPG.upHumanConRace = upHumanConRace;
	}

	public static int getUpHumanIntRace() {
		return upHumanIntRace;
	}

	public static void setUpHumanIntRace(int upHumanIntRace) {
		RacaRPG.upHumanIntRace = upHumanIntRace;
	}

	public static int getUpHumanWisRace() {
		return upHumanWisRace;
	}

	public static void setUpHumanWisRace(int upHumanWisRace) {
		RacaRPG.upHumanWisRace = upHumanWisRace;
	}

	public static int getUpHumanChaRace() {
		return upHumanChaRace;
	}

	public static void setUpHumanChaRace(int upHumanChaRace) {
		RacaRPG.upHumanChaRace = upHumanChaRace;
	}

	public static int getUpTieflingChaRace() {
		return upTieflingChaRace;
	}

	public static void setUpTieflingChaRace(int upTieflingChaRace) {
		RacaRPG.upTieflingChaRace = upTieflingChaRace;
	}

	public static int getUpTieflingIntRace() {
		return upTieflingIntRace;
	}

	public static void setUpTieflingIntRace(int upTieflingIntRace) {
		RacaRPG.upTieflingIntRace = upTieflingIntRace;
	}

	public static int getUpMountainDwarfRace() {
		return upMountainDwarfRace;
	}

	public static void setUpMountainDwarfRace(int upMountainDwarfRace) {
		RacaRPG.upMountainDwarfRace = upMountainDwarfRace;
	}

	public static int getUpHillDwarfRace() {
		return upHillDwarfRace;
	}

	public static void setUpHillDwarfRace(int upHillDwarfRace) {
		RacaRPG.upHillDwarfRace = upHillDwarfRace;
	}

	public static int getUpDarkElfRace() {
		return upDarkElfRace;
	}

	public static void setUpDarkElfRace(int upDarkElfRace) {
		RacaRPG.upDarkElfRace = upDarkElfRace;
	}

	public static int getUpHighElfRace() {
		return upHighElfRace;
	}

	public static void setUpHighElfRace(int upHighElfRace) {
		RacaRPG.upHighElfRace = upHighElfRace;
	}

	public static int getUpWoodElfRace() {
		return upWoodElfRace;
	}

	public static void setUpWoodElfRace(int upWoodElfRace) {
		RacaRPG.upWoodElfRace = upWoodElfRace;
	}

	public static int getUpRockGnomeRace() {
		return upRockGnomeRace;
	}

	public static void setUpRockGnomeRace(int upRockGnomeRace) {
		RacaRPG.upRockGnomeRace = upRockGnomeRace;
	}

	public static int getUpForestGnomeRace() {
		return upForestGnomeRace;
	}

	public static void setUpForestGnomeRace(int upForestGnomeRace) {
		RacaRPG.upForestGnomeRace = upForestGnomeRace;
	}

	public static int getUpLightFootHalflingRace() {
		return upLightFootHalflingRace;
	}

	public static void setUpLightFootHalflingRace(int upLightFootHalflingRace) {
		RacaRPG.upLightFootHalflingRace = upLightFootHalflingRace;
	}

	public static int getUpStoutHalflingRace() {
		return upStoutHalflingRace;
	}

	public static void setUpStoutHalflingRace(int upStoutHalflingRace) {
		RacaRPG.upStoutHalflingRace = upStoutHalflingRace;
	}

	public LinkedList<String> getRaces() {
		return races;
	}

	public void setRaces(LinkedList<String> races) {
		this.races = races;
	}
	
	@Override
	public String toString() {
        return "Raça: " + this.getRaces();
	}
}