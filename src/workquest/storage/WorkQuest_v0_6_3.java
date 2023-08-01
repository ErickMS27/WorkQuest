package workquest.storage;

// imports

import java.util.LinkedList;
import java.util.Scanner;

public class WorkQuest_v0_6_3 {

	static int atribute_points = 72;

	// Atributos de Char

	static int strength = 0;
	static int dexterity = 0;
	static int constitution = 0;
	static int intelligence = 0;
	static int wisdom = 0;
	static int charisma = 0;

	// Modificadores de Atributos de Char

	static int mod_str = 0;
	static int mod_dex = 0;
	static int mod_con = 0;
	static int mod_int = 0;
	static int mod_wis = 0;
	static int mod_cha = 0;

	// Testes de Resistências de Char

	static int save_throw_str = mod_str;
	static int save_throw_dex = mod_dex;
	static int save_throw_con = mod_con;
	static int save_throw_int = mod_int;
	static int save_throw_wis = mod_wis;
	static int save_throw_cha = mod_cha;

	// Informações de Char

	static int level = 1;
	static int proficiency_bonus = +2;
	static int initiative = mod_dex;
	static int armor_class = 10 + mod_dex;
	static int passive_perception = 10 + mod_wis;
	static int passive_intuition = passive_perception;
	static int inspiration_points = 0;
	static int exp_points = 0;

	// Perícias de Char

	static int acrobatics = mod_dex;
	static int animal_handling = mod_wis;
	static int arcana = mod_int;
	static int atletics = mod_str;
	static int deception = mod_wis;
	static int history = mod_wis;
	static int intimidation = mod_cha;
	static int investigation = mod_int;
	static int medicine = mod_wis;
	static int nature = mod_int;
	static int perception = mod_wis;
	static int performance = mod_cha;
	static int persuasion = mod_cha;
	static int religion = mod_int;
	static int sleight_of_hand = mod_dex;
	static int stealth = mod_dex;
	static int survival = mod_wis;

	public static void main(String[] args) {

	// Mensagem de Início

		System.out.println(
				"Olá! Bem-vindo ao WorkQuest! Um sistema de gamificação baseada no sistema de RPG: Dungeons and Dragons 5º Edição.\n");

	// Variáveis de preenchimento

		String name_play = "";
		String name_char = "";

	//	Cadastro do player + Reiniciar para preencher a ficha novamente

		while (name_play.isEmpty()) {
			Scanner enter_name_player = new Scanner(System.in);
			System.out.println("Digite o seu nome de jogador:");
			String name_player = enter_name_player.nextLine();
			name_play = name_player;
			if (name_play.isEmpty()) {
				System.out.println("\nPor favor, digite seu nome:\n");
			} else
				System.out.println("\nCerto " + name_player + ", agora iremos criar sua ficha.");
		}

// Raça do Char

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

		menu_races();

// Classe do Char

		LinkedList<String> classes = new LinkedList<String>();
		
		System.out.println("\nUtilizando como base o Livro do Jogador, temos as seguintes ClassType com suas informações, do mundo de D&D:");

		classes.add(
				"\n1) Artífice: é uma classe que combina habilidades mágicas com proficiência em ferramentas e habilidades tecnológicas.");
		classes.add( 
				"2) Bárbaro: é uma classe que possui um estilo de combate feroz e uma resistência incrível.");
		classes.add(
				"3) Bardo: é uma classe que combina magia com habilidades de performance para inspirar aliados e derrotar inimigos");
		classes.add(
				"4) Bruxo: é uma classe que faz pactos com seres poderosos para obter habilidades mágicas e invocações sombrias.");
		classes.add(
				"5) Clérigo: é uma classe que canaliza a energia divina para lançar magias e curar aliados em nome de sua divindade.");
		classes.add(
				"6) Druida: é uma classe que possui um forte vínculo com a natureza, podendo se transformar em animais e lançar magias baseadas no ambiente natural.");
		classes.add(
				"7) Feiticeiro: é uma classe que possui um talento inato para a magia, sendo capaz de lançar magias poderosas de forma espontânea.");
		classes.add(
				"8) Guerreiro: é uma classe de combatente versátil, capaz de utilizar diversas armas e armaduras, e se especializar em diferentes estilos de luta");
		classes.add(
				"9) Ladino: é uma classe é um especialista em furtividade e habilidades sociais, capaz de realizar ataques furtivos e desarmar armadilhas.");
		classes.add(
				"10) Mago: é uma classe usuária da magia poderoso e versátil, capaz de lançar uma grande variedade de magias de ataque, defesa e utilidade.");
		classes.add(
				"11) Monge: é uma classe especialista em artes marciais e disciplina física, capaz de realizar ataques desarmados e canalizar sua energia interna para realizar feitos extraordinários.");
		classes.add(
				"12) Paladino: é uma classe capaz de utilizar magias sagradas e defender a justiça e o bem em nome de sua divindade");
		classes.add(
				"13) Patrulheiro: é uma classe especialista em sobrevivência e caça, capaz de rastrear inimigos e se adaptar a diferentes ambientes.\n");

		for (String i : classes) {
			System.out.println(i);
		}

		System.out.println("Possuimos um total de" + " " + classes.size() + " "
				+ "ClassType no sistema D&D. Digite com qual classe, você deseja jogar:");

		menu_classes();

// Background do Char

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

		menu_backgrounds();

// Alinhamento do Char

		LinkedList<String> alignment = new LinkedList<String>();
		System.out.println(
				"\nUtilizando como base o Livro do Jogador, temos os seguintes antecedentes com suas informações, do mundo de D&D:");

		alignment.add("\n1) Bom e Leal");
		alignment.add("2) Bom e Neutro");
		alignment.add("3) Bom e Caótico");
		alignment.add("4) Neutro e Leal");
		alignment.add("5) Neutro");
		alignment.add("6) Neutro e Caótico");
		alignment.add("7) Mal e Leal");
		alignment.add("8) Mal e Neutro");
		alignment.add("9) Mal e Caótico\n");

		for (String i : alignment) {
			System.out.println(i);
		}

		System.out.println("Possuimos um total de" + " " + alignment.size() + " "
				+ "alinhamentos no sistema D&D. Digite com qual se encaixa mais ao seu personagem:");

		menu_alignments();

// Nome do Char

		System.out.println("\nCerto, agora digite o nome do seu personagem:");

		while (name_char.isEmpty()) {
			Scanner enter_name_character = new Scanner(System.in);
			System.out.println("\nDigite o nome do seu personagem:");
			String name_character = enter_name_character.nextLine();
			name_char = name_character;
			if (name_char.isEmpty()) {
				System.out.println("\nPor favor, digite o nome do seu personagem:\n");
			} else
				System.out.println("\nTudo ok! Seu personagem: " + name_character
						+ " foi criado! Agora devemos distribuir os pontos aos seus Valores de Habilidade.");
		}

		// Sistema de Preenchimento de Atributos usando os Dados de RPG

		System.out.println("\nPrimeiramente, possuimos 2 sistemas de preenchimentos de atributos que são:\n");
		System.out.println(
				"1) Distribuição de 72 pontos entre os seis atributos: Força, Destreza, Constituição, Inteligência, Sabedoria e Carisma\n");
		System.out.println(
				"2) Gerar e jogar 4 dados de 6 lados (ou 4D6), o sistema anotará a soma dos três maiores resultados. Esse processo será repetido 6 vezes");
		System.out.println("\nDigite abaixo 1 ou 2 para definir com qual sistema deseja:");

		system_add_atributes();

	}

//	Ficha do Player

// Menu Sistema

	private static void menu_races() {

// Método para Raças e Sub-raças	

		Scanner enter_races = new Scanner(System.in);
		String races_player = enter_races.nextLine();
		String race_human_player;
		String race_half_elf_player;
		String race_half_orc_player;
		String race_tiefling_player;

// Condição de Sub-raça

		switch (races_player) {

		case "1", "Anão", "anão", "Anao", "anao":

			LinkedList<String> sub_dwarf = new LinkedList<String>();

			System.out.println("\nCerto, temos duas sub-raças dos Anões, que são:");

			sub_dwarf.add("\n1) Anão da Colina");
			sub_dwarf.add("2) Anão da Montanha\n ");

			for (String i : sub_dwarf) {
				System.out.println(i);
			}

			System.out.println("Informe com qual você sub-raça dos Anões você deseja jogar:");

			Scanner enter_sub_dwarf = new Scanner(System.in);
			String input_dwarf_player = enter_sub_dwarf.nextLine();
			String sub_dwarf_player;

			switch (input_dwarf_player) {

			case "1", "Anão da Colina", "Anão da colina", "anão da colina", "Anao da Colina", "Anao da colina",
					"anao da colina":
				sub_dwarf_player = "Anão da Colina";
				System.out.println("\nCerto, seu personagem será um: " + sub_dwarf_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "2", "Anão da Montanha", "Anão da montanha", "anão da montanha", "Anao da Montanha",
					"Anao da montanha", "anao da montanha":
				sub_dwarf_player = "Anão da Montanha";
				System.out.println("\nCerto, seu personagem será um: " + sub_dwarf_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
				menu_races_dwarf();
				return;
			}

		case "2", "Draconato", "draconato":
			LinkedList<String> sub_dragonborn = new LinkedList<String>();

			System.out.println("\nCerto, temos dez opções de Ancestralidades Dracônicas, que são:");

			sub_dragonborn.add("\n1) Azul");
			sub_dragonborn.add("2) Branco");
			sub_dragonborn.add("3) Bronze");
			sub_dragonborn.add("4) Cobre");
			sub_dragonborn.add("5) Latão");
			sub_dragonborn.add("6) Negro");
			sub_dragonborn.add("7) Ouro");
			sub_dragonborn.add("8) Prata");
			sub_dragonborn.add("9) Verde");
			sub_dragonborn.add("10) Vermelho\n ");

			for (String i : sub_dragonborn) {
				System.out.println(i);
			}

			System.out.println("Informe com qual você Ancestralidade Dracônica você deseja jogar:");

			Scanner enter_sub_dragonborn = new Scanner(System.in);
			String input_dragonborn_player = enter_sub_dragonborn.nextLine();
			String sub_dragonborn_player;

			switch (input_dragonborn_player) {

			case "1", "Azul", "azul":
				sub_dragonborn_player = "Azul";
				System.out.println("\nCerto, seu personagem será Draconato " + sub_dragonborn_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "2", "Branco", "branco":
				sub_dragonborn_player = "Branco";
				System.out.println("\nCerto, seu personagem será Draconato " + sub_dragonborn_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "3", "Bronze", "bronze":
				sub_dragonborn_player = "Bronze";
				System.out.println("\nCerto, seu personagem será Draconato de " + sub_dragonborn_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "4", "Cobre", "cobre":
				sub_dragonborn_player = "Cobre";
				System.out.println("\nCerto, seu personagem será Draconato de " + sub_dragonborn_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "5", "Latão", "latão", "Latao", "latao":
				sub_dragonborn_player = "Latão";
				System.out.println("\nCerto, seu personagem será Draconato de " + sub_dragonborn_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "6", "Negro", "negro":
				sub_dragonborn_player = "Negro";
				System.out.println("\nCerto, seu personagem será Draconato " + sub_dragonborn_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "7", "Ouro", "ouro":
				sub_dragonborn_player = "Ouro";
				System.out.println("\nCerto, seu personagem será Draconato de " + sub_dragonborn_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "8", "Prata", "prata":
				sub_dragonborn_player = "Prata";
				System.out.println("\nCerto, seu personagem será Draconato de " + sub_dragonborn_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "9", "Verde", "verde":
				sub_dragonborn_player = "Verde";
				System.out.println("\nCerto, seu personagem será Draconato " + sub_dragonborn_player
						+ ". Agora vamos prosseguir para as ClassType.");

			case "10", "Vermelho", "vermelho":
				sub_dragonborn_player = "Vermelho";
				System.out.println("\nCerto, seu personagem será Draconato " + sub_dragonborn_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
				menu_races_dragonborn();
				return;

			}

		case "3", "Elfo", "elfo":
			LinkedList<String> sub_elf = new LinkedList<String>();

			System.out.println("\nCerto, temos três sub-raças dos Elfos, que são:");

			sub_elf.add("\n1) Alto Elfo");
			sub_elf.add("2) Elfo da Floresta");
			sub_elf.add("3) Elfo Negro\n ");

			for (String i : sub_elf) {
				System.out.println(i);
			}

			System.out.println("Informe com qual você sub-raça dos Elfos você deseja jogar:");

			Scanner enter_sub_elf = new Scanner(System.in);
			String input_elf_player = enter_sub_elf.nextLine();
			String sub_elf_player;

			switch (input_elf_player) {

			case "1", "Alto Elfo", "Alto elfo", "alto elfo":
				sub_elf_player = "Alto Elfo";
				System.out.println("\nCerto, seu personagem será um: " + sub_elf_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "2", "Elfo da Floresta", "Elfo da floresta", "elfo da Floresta", "elfo da floresta", "Bosmer",
					"bosmer":
				sub_elf_player = "Elfo da Floresta";
				System.out.println("\nCerto, seu personagem será um: " + sub_elf_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "3", "Elfo Negro", "Elfo negro", "elfo negro", "Drow", "drow":
				sub_elf_player = "Elfo Negro";
				System.out.println("\nCerto, seu personagem será um: " + sub_elf_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
				menu_races_elf();
				return;

			}

		case "4", "Gnomo", "gnomo":
			LinkedList<String> sub_gnome = new LinkedList<String>();

			System.out.println("\nCerto, temos duas sub-raças dos Gnomos, que são:");

			sub_gnome.add("\n1) Gnomo da Floresta");
			sub_gnome.add("2) Gnomo das Rochas\n ");

			for (String i : sub_gnome) {
				System.out.println(i);
			}

			System.out.println("Informe com qual você sub-raça dos Gnomos você deseja jogar:");

			Scanner enter_sub_gnome = new Scanner(System.in);
			String input_gnome_player = enter_sub_gnome.nextLine();
			String sub_gnome_player;

			switch (input_gnome_player) {

			case "1", "Gnomo da Floresta", "Gnomo da floresta", "gnomo da floresta":
				sub_gnome_player = "Gnomo da Floresta";
				System.out.println("\nCerto, seu personagem será um: " + sub_gnome_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "2", "Gnomo das Rochas", "Gnomo das rochas", "gnomo das rochas":
				sub_gnome_player = "Gnomo das Rochas";
				System.out.println("\nCerto, seu personagem será um: " + sub_gnome_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
				menu_races_gnome();
				return;

			}
		case "5", "Halfling", "halfing", "Hobbit", "hobbit":
			LinkedList<String> sub_halfling = new LinkedList<String>();

			System.out.println("\nCerto, temos duas sub-raças dos Halflings, que são:");

			sub_halfling.add("\n1) Robusto");
			sub_halfling.add("2) Pés Peludos\n ");

			for (String i : sub_halfling) {
				System.out.println(i);
			}

			System.out.println("Informe com qual você sub-raça dos Halflings você deseja jogar:");

			Scanner enter_sub_halfling = new Scanner(System.in);
			String input_halfling_player = enter_sub_halfling.nextLine();
			String sub_halfling_player;

			switch (input_halfling_player) {

			case "1", "Robusto", "robusto":
				sub_halfling_player = "Halfling Robusto";
				System.out.println("\nCerto, seu personagem será um: " + sub_halfling_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			case "2", "Pés Peludos", "Pés peludos", "pés peludos", "Pes Peludos", "Pes peludos", "pes peludos":
				sub_halfling_player = "Halfling dos Pés Peludos";
				System.out.println("\nCerto, seu personagem será um: " + sub_halfling_player
						+ ". Agora vamos prosseguir para as ClassType.");
				return;

			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
				menu_races_halfling();
				return;

			}

		case "6", "Humano", "humano":
			race_human_player = "Humano";
			System.out.println("\nCerto, seu personagem será um: " + race_human_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "7", "Meio-Elfo", "Meio-elfo", "meio-elfo", "Meio Elfo", "Meio elfo", "meio elfo":
			race_half_elf_player = "Meio-Elfo";
			System.out.println("\nCerto, seu personagem será um: " + race_half_elf_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "8", "Meio-Orc", "Meio-orc", "meio-orc", "Meio Orc", "Meio orc", "meio orc":
			race_half_orc_player = "Meio-Orc";
			System.out.println("\nCerto, seu personagem será um: " + race_half_orc_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "9", "Tiferino", "tiferino", "Tiefling", "tiefling", "Homem-Diabo", "Homem-diabo", "homem-diabo",
				"Homem Diabo", "Homem diabo", "homem diabo":
			race_tiefling_player = "Tiferino";
			System.out.println("\nCerto, seu personagem será um: " + race_tiefling_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:");

			menu_races();
		}
	}

// Método Menu de Classes

	private static void menu_classes() {

// Método para Classes	

		Scanner enter_classes = new Scanner(System.in);
		String classes_player = enter_classes.nextLine();
		String class_artificer;
		String class_barbarian;
		String class_bard;
		String class_cleric;
		String class_druid;
		String class_fighter;
		String class_monk;
		String class_paladin;
		String class_ranger;
		String class_rogue;
		String class_sorcerer;
		String class_warlock;
		String class_wizard;

		switch (classes_player) {
		case "1", "Artífice", "artífice", "Artifice", "artifice":
			class_artificer = "Artífice";
			System.out.println("\nCerto, seu personagem será um " + class_artificer
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		case "2", "Bárbaro", "bárbaro", "Barbaro", "barbaro":
			class_barbarian = "Bárbaro";
			System.out.println("\nCerto, seu personagem será um " + class_barbarian
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		case "3", "Bardo", "bardo":
			class_bard = "Bardo";
			System.out.println("\nCerto, seu personagem será um " + class_bard
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		case "4", "Bruxo", "bruxo":
			class_warlock = "Bruxo";
			System.out.println("\nCerto, seu personagem será um " + class_warlock
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		case "5", "Clérigo", "clérigo", "Clerigo", "clerigo":
			class_cleric = "Clérigo";
			System.out.println("\nCerto, seu personagem será um " + class_cleric
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		case "6", "Druida", "druida", "Druída", "druída":
			class_druid = "Druida";
			System.out.println("\nCerto, seu personagem será um " + class_druid
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		case "7", "Feiticeiro", "feiticeiro":
			class_sorcerer = "Feiticeiro";
			System.out.println("\nCerto, seu personagem será um " + class_sorcerer
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		case "8", "Guerreiro", "guerreiro":
			class_fighter = "Guerreiro";
			System.out.println("\nCerto, seu personagem será um " + class_fighter
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		case "9", "Ladino", "ladino":
			class_rogue = "Ladino";
			System.out.println("\nCerto, seu personagem será um " + class_rogue
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		case "10", "Mago", "mago":
			class_wizard = "Mago";
			System.out.println("\nCerto, seu personagem será um " + class_wizard
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		case "11", "Monge", "monge":
			class_monk = "Monge";
			System.out.println("\nCerto, seu personagem será um " + class_monk
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		case "12", "Paladino", "paladino":
			class_paladin = "Paladino";
			System.out.println("\nCerto, seu personagem será um " + class_paladin
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		case "13", "Patrulheiro", "patrulheiro", "Guardião", "guardião", "Guardiao", "guardiao":
			class_ranger = "Patrulheiro";
			System.out.println("\nCerto, seu personagem será um " + class_ranger
					+ ". Agora vamos prosseguir para o seu antecedente.");
			break;
		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
			menu_classes();
		}

	}

// Método Menu de Antecedentes

	private static void menu_backgrounds() {

// Método para Antecedentes	

		Scanner enter_backgrounds = new Scanner(System.in);
		String backgrounds_player = enter_backgrounds.nextLine();
		String background_acolyte;
		String background_charlatan;
		String background_criminal;
		String background_folk_hero;
		String background_entertainer;
		String background_guild_artisan;
		String background_haunted_one;
		String background_hermit;
		String background_outlander;
		String background_noble;
		String background_sage;
		String background_sailor;
		String background_soldier;
		String background_urchin;

		switch (backgrounds_player) {

		case "1", "Acólito", "acólito", "Acolito", "acolito":		
			
			background_acolyte = "Acólito";
			System.out.println("\nCerto, seu personagem será um " + background_acolyte
				+ ". Agora vamos prosseguir para as tendências.");	
			return;

		case "2", "Artesão de Guilda", "Artesão de guilda", "Artesao de Guilda", "Artesao de guilda":
			
			LinkedList<String> var_guild_artisan = new LinkedList<String>();

			System.out.println("\nCerto, temos diversas variações de Artesões de Guildas, que são:");

			var_guild_artisan.add("\n1) Alquimistas ou boticários");
			var_guild_artisan.add("2) Armeiros, chaveiros, ferreiros finos");
			var_guild_artisan.add("3) Cervejeiros, destiladores e viticultores");
			var_guild_artisan.add("4) Calígrafos, escribas ou escrivães");
			var_guild_artisan.add("5) Carpinteiros, construtores de telhado e estucadores");
			var_guild_artisan.add("6) Cartógrafos, agrimensores ou desenhistas");
			var_guild_artisan.add("7) Remendeiros e sapateiros");
			var_guild_artisan.add("8) Cozinheiros ou padeiros");
			var_guild_artisan.add("9) Vidraceiros ou escultores");
			var_guild_artisan.add("10) Joalheiros ou lapidários");
			var_guild_artisan.add("11) Coureiros, peleiros ou curtidores");
			var_guild_artisan.add("12) Pedreiros ou marceneiros");
			var_guild_artisan.add("13) Pintores, iluminadores ou construtores de placas");
			var_guild_artisan.add("14) Oleiros ou telheiros");
			var_guild_artisan.add("15) Amadores ou veleiros");
			var_guild_artisan.add("16) Ferreiros ou forjadores");
			var_guild_artisan.add("17) Funileiros, latoeiros ou galheteiros");
			var_guild_artisan.add("18) Fabricantes de carroças ou fabricantes de rodas");
			var_guild_artisan.add("19) Tecelões ou tintureiros");
			var_guild_artisan.add("20) Entalhadores, tanoeiros ou construtores de arcos\n");

			for (String i : var_guild_artisan) {
				System.out.println(i);
			}
			System.out.println("Informe com qual variação de Artesão de Guilda você deseja jogar:");

			Scanner enter_var_guild_artisan = new Scanner(System.in);
			String input_guild_artisan_player = enter_var_guild_artisan.nextLine();
			String var_guild_artisan_player;
			
			switch (input_guild_artisan_player) {

			case "1", "Alquimista","alquimista","Boticário","boticário","Boticario","boticario":
				var_guild_artisan_player = "Alquimista";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");
				return;

			case "2", "Armeiro","armeiro","Chaveiro","chaveiro","Ferreiro fino","ferreiro fino","Ferreiro Feino":
				var_guild_artisan_player = "Armeiro";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");
				return;
			
			case "3", "Cervejeiro","cervejeiro","Destilador","destilador","Viticultor","viticultor":
				var_guild_artisan_player = "Cervejeiro";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");
				return;
			
			case "4", "Calígrafo","calígrafo","Caligrafo","caligrafo","Escriba","escriba","Escrivão","escrivão","Escrivao","escrivao":
				var_guild_artisan_player = "Calígrafo";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");
				return;
				
			case "5", "Carpinteiro","carpinteiro","Construtor de telhado","Construtor de Telhado","construtor de telhado","Estucador","estucador":
				var_guild_artisan_player = "Carpinteiro";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");
				return;
				
			case "6", "Cartógrafo","cartógrafo","Cartografo","cartografo","Agrimensore","agrimensore","Desenhista","desenhista":
				var_guild_artisan_player = "Cartógrafo";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");	
				return;
				
			case "7", "Remendeiro","remendeiro, Sapateiro, sapateiro":
				var_guild_artisan_player = "Remendeiro";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");	
				return;	
				
			case "8", "Cozinheiro","cozinheiro","Padeiro","padeiro":
				var_guild_artisan_player = "Cozinheiro";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");	
				return;	
			
			case "9", "Vidraceiro","vidraceiro","Escultor","escultor":
				var_guild_artisan_player = "Escultor";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");	
				return;	
			
			case "10", "Joalheiro","joalheiro","Lapidário","lapidário","Lapidario","lapidario":
				var_guild_artisan_player = "Joalheiro";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");	
				return;	
			
			case "11", "Coureiro","coureiro","Peleiro","peleiro","Curtidor","curtidor":
				var_guild_artisan_player = "Coureiro";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");	
				return;	
				
			case "12", "Pedreiro","pedreiro","Marceneiro","marceneiro":
				var_guild_artisan_player = "Pedreiro";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");		
				return;	
				
			case "13", "Pintor","pintor","Iluminador","iluminador","Construtor de Placa","Construtor de placa","construtor de placa":
				var_guild_artisan_player = "Pintor";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");			
				return;	
				
			case "14", "Oleiro","oleiro","Telheiro","telheiro":
				var_guild_artisan_player = "Oleiro";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");	
				return;	
				
			case "15", "Armador","armador","Veleiro","veleiro":
				var_guild_artisan_player = "Armador";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");		
				return;	
			
			case "16", "Ferreiro","ferreiro","Forjador","forjador":
				var_guild_artisan_player = "Ferreiro";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");		
				return;		
			
			case "17", "Funileiro","funileiro","Latoeiro","latoeiro","Galheteiro","galheteiro":
				var_guild_artisan_player = "Funileiro";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");		
				return;		

			case "18", "Fabricante de Carroças","Fabricante de carroças","fabricante de carroças","Fabricante de Rodas","Fabricante de rodas","fabricante de rodas":
				var_guild_artisan_player = "Fabricante de Carroça";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");		
				return;		
				
			case "19", "Tecelão","tecelão","Tecelao","tecelao","Tintureiro","tintureiro":
				var_guild_artisan_player = "Tecelão";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");		
				return;				
				
			case "20", "Entalhador","entalhador","Tanoeiro","tanoeiro","Construtor de Arco","Construtor de arco","construtor de arco":
				var_guild_artisan_player = "Fabricante de Carroça";
				System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
						+ ". Agora vamos prosseguir para as tendências.");		
				return;	
				
			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
				menu_backgrounds_guild_artisan();
				return;
			}

		case "3","Artista","artista":
			
			LinkedList<String> var_entertainer = new LinkedList<String>();

			System.out.println("\nCerto, temos diversas variações de Artistas, que são:");

			var_entertainer.add("\n1) Acrobata");
			var_entertainer.add("2) Ator");
			var_entertainer.add("3) Bufão");
			var_entertainer.add("4) Cantor");
			var_entertainer.add("5) Dançarino");
			var_entertainer.add("6) Engolidor de fogo");
			var_entertainer.add("7) Gladiador");
			var_entertainer.add("8) Instrumentalista");
			var_entertainer.add("9) Malabarista");
			var_entertainer.add("10) Narrador");
			var_entertainer.add("11) Poeta\n");

			for (String i : var_entertainer) {
				System.out.println(i);
			}
			System.out.println("Informe com qual variação de Artista você deseja jogar:");

			Scanner enter_var_entertainer = new Scanner(System.in);
			String input_entertainer_player = enter_var_entertainer.nextLine();
			String var_entertainer_player;
			
			switch (input_entertainer_player) {

			case "1", "Acrobata","acrobata":
				var_entertainer_player = "Acrobata";
				System.out.println("\nCerto, seu personagem será um: " + var_entertainer_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "2", "Ator","ator":
				var_entertainer_player = "Ator";
				System.out.println("\nCerto, seu personagem será um: " + var_entertainer_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "3", "Bufão","bufão","Bufao","bufao":
				var_entertainer_player = "Bufão";
				System.out.println("\nCerto, seu personagem será um: " + var_entertainer_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "4", "Cantor","cantor":
				var_entertainer_player = "Cantor";
				System.out.println("\nCerto, seu personagem será um: " + var_entertainer_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "5", "Dançarino","dançarino","Dancarino","dancarino":
				var_entertainer_player = "Acrobata";
				System.out.println("\nCerto, seu personagem será um: " + var_entertainer_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "6", "Engolidor de Fogo","Engolidor de fogo","engolidor de fogo":
				var_entertainer_player = "Engolidor de Fogo";
				System.out.println("\nCerto, seu personagem será um: " + var_entertainer_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "7", "Gladiador","gladiador":
				var_entertainer_player = "Gladiador";
				System.out.println("\nCerto, seu personagem será um: " + var_entertainer_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "8", "Instrumentalista","instrumentalista":
				var_entertainer_player = "Instrumentalista";
				System.out.println("\nCerto, seu personagem será um: " + var_entertainer_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "9", "Malabarista","malabarista":
				var_entertainer_player = "Malabarista";
				System.out.println("\nCerto, seu personagem será um: " + var_entertainer_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "10", "Narrador","narrador":
				var_entertainer_player = "Narrador";
				System.out.println("\nCerto, seu personagem será um: " + var_entertainer_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "11", "Poeta","poeta":
				var_entertainer_player = "Poeta";
				System.out.println("\nCerto, seu personagem será um: " + var_entertainer_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			}
			
		case "4","Assombrado","assombrado":
			background_haunted_one = "Assombrado";
			System.out.println("\nCerto, seu personagem será um " + background_haunted_one
				+ ". Agora vamos prosseguir para as tendências.");	
			return;
			
		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
			menu_backgrounds_guild_artisan();
			return;
			
		case "5","Charlatão","charlatão","Charlatao","charlatao":
			background_charlatan = "Charlatão";
			System.out.println("\nCerto, seu personagem será um " + background_charlatan
				+ ". Agora vamos prosseguir para as tendências.");	
			return;
			
		case "6","Criminoso","criminoso":

			LinkedList<String> var_criminal = new LinkedList<String>();

			System.out.println("\nCerto, temos diversas variações de Criminosos, que são:");

			var_criminal.add("\n1) Assaltante");
			var_criminal.add("2) Assassino de aluguel");
			var_criminal.add("3) Batedor de carteira");
			var_criminal.add("4) Chantagista");
			var_criminal.add("5) Contrabandista");
			var_criminal.add("6) Espião");
			var_criminal.add("7) Executor");
			var_criminal.add("8) Ladrão de estrada");
			var_criminal.add("9) Receptador\n");

			for (String i : var_criminal) {
				System.out.println(i);
			}
			System.out.println("Informe com qual variação de Artista você deseja jogar:");

			Scanner enter_var_criminal = new Scanner(System.in);
			String input_criminal_player = enter_var_criminal.nextLine();
			String var_criminal_player;
			
			switch (input_criminal_player) {

			case "1", "Assaltante","assaltante":
				var_criminal_player = "Assaltante";
				System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "2", "Assaassino de Aluguel","Assassino de aluguel","assassino de aluguel":
				var_criminal_player = "Assassino de aluguel";
				System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "3", "Batedor de Carteira","Batedor de carteira","batedor de carteira":
				var_criminal_player = "Batedor de carteira";
				System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "4", "Chantagista","chantagista":
				var_criminal_player = "Chantagista";
				System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "5", "Contrabandista","contrabandista":
				var_criminal_player = "Contrabandista";
				System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "6", "Espião","espião","Espiao","espiao":
				var_criminal_player = "Espião";
				System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "7", "Executor","executor":
				var_criminal_player = "Executor";
				System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "8", "Ladrão de Estrada","Ladrão de estrada","ladrão de estrada","Ladrao de Estrada","Ladrao de estrada","ladrao de estrada":
				var_criminal_player = "Ladrão de estrada";
				System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
						+ ". Agora vamos prosseguir para as tendências.");
			return;
			
			case "9", "Receptador","receptador":
				var_criminal_player = "Receptador";
				System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
						+ ". Agora vamos prosseguir para as tendências.");
			
			default:
				System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
				menu_backgrounds_criminal();
				return;
				
			}
			
		case "7","Eremita","eremita":
			background_hermit = "Eremita";
		System.out.println("\nCerto, seu personagem será um " + background_hermit
			+ ". Agora vamos prosseguir para as tendências.");
			return;
			
		case "8","Forasteiro","forasteiro":
			return;
		case "Herói do Povo":
			return;
		case "Marinheiro":
			return;
		case "Nobre":
			return;
		case "Órfão":
			return;
		case "Sábio":
			return;
		case "Soldado":
			return;		
	}
}			
		
	

// Método Menu de Alinhamentos

	private static void menu_alignments() {

// Método para Tendências:	

		Scanner enter_alignment = new Scanner(System.in);
		String alignment_player = enter_alignment.nextLine();

		switch (alignment_player) {
		case "Bom e Leal":
			break;
		case "Bom e Neutro":
			break;
		case "Bom e Caótico":
			break;
		case "Neutro e Leal":
			break;
		case "Neutro":
			break;
		case "Neutro e Caótico":
			break;
		case "Mal e Leal":
			break;
		case "Mal e Neutro":
			break;
		case "Mal e Caótico":
			break;
		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
			menu_alignments();
		}
	}

// Métodos de Preenchimento de Informações da Ficha do Player

	
	
// Menu das Sub-Raças

	private static void menu_races_dwarf() {

		Scanner enter_sub_dwarf = new Scanner(System.in);
		String sub_dwarf_player = enter_sub_dwarf.nextLine();

		switch (sub_dwarf_player) {

		case "1", "Anão da Colina", "Anão da colina", "anão da colina", "Anao da Colina", "Anao da colina",
				"anao da colina":
			System.out.println("\nCerto, seu personagem será um: " + sub_dwarf_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "2", "Anão da Montanha", "Anão da montanha", "anão da montanha", "Anao da Montanha", "Anao da montanha",
				"anao da montanha":
			System.out.println("\nCerto, seu personagem será um: " + sub_dwarf_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			menu_races_dwarf();
		}
	}

	private static void menu_races_dragonborn() {

		Scanner enter_sub_dragonborn = new Scanner(System.in);
		String sub_dragonborn_player = enter_sub_dragonborn.nextLine();

		switch (sub_dragonborn_player) {

		case "1", "Azul", "azul":
			System.out.println("\nCerto, seu personagem será um Draconato " + sub_dragonborn_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "2", "Branco", "branco":
			System.out.println("\nCerto, seu personagem será um Draconato " + sub_dragonborn_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "3", "Bronze", "bronze":
			System.out.println("\nCerto, seu personagem será um Draconato de" + sub_dragonborn_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "4", "Cobre", "cobre":
			System.out.println("\nCerto, seu personagem será um Draconato de" + sub_dragonborn_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "5", "Latão", "latão", "Latao", "latao":
			System.out.println("\nCerto, seu personagem será um Draconato de" + sub_dragonborn_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "6", "Negro", "negro":
			System.out.println("\nCerto, seu personagem será um Draconato " + sub_dragonborn_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "7", "Ouro", "ouro":
			System.out.println("\nCerto, seu personagem será um Draconato de" + sub_dragonborn_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "8", "Prata", "prata":
			System.out.println("\nCerto, seu personagem será um Draconato de" + sub_dragonborn_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "9", "Verde", "verde":
			System.out.println("\nCerto, seu personagem será um Draconato " + sub_dragonborn_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "10", "Vermelho", "vermelho":
			System.out.println("\nCerto, seu personagem será um Draconato " + sub_dragonborn_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			menu_races_dragonborn();
		}

	}
	
	private static void menu_races_elf() {

		Scanner enter_sub_elf = new Scanner(System.in);
		String sub_elf_player = enter_sub_elf.nextLine();

		switch (sub_elf_player) {

		case "1", "Alto Elfo", "alto elfo":
			System.out.println(
					"\nCerto, seu personagem será um: " + sub_elf_player + ". Agora vamos prosseguir para as ClassType.");
			break;

		case "2", "Elfo da Floresta", "Elfo da floresta", "elfo da Floresta", "elfo da floresta", "Bosmer", "bosmer":
			System.out.println(
					"\nCerto, seu personagem será um: " + sub_elf_player + ". Agora vamos prosseguir para as ClassType.");
			break;

		case "3", "Elfo Negro", "Elfo negro", "elfo negro", "Drow", "drow":
			System.out.println(
					"\nCerto, seu personagem será um: " + sub_elf_player + ". Agora vamos prosseguir para as ClassType.");
			break;

		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			menu_races_elf();
		}
	}
	
	private static void menu_races_gnome() {
		Scanner enter_sub_gnome = new Scanner(System.in);
		String sub_gnome_player = enter_sub_gnome.nextLine();

		switch (sub_gnome_player) {

		case "1", "Gnomo da Floresta", "Gnomo da floresta", "gnomo da floresta":
			System.out.println("\nCerto, seu personagem será um: " + sub_gnome_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "2", "Gnomo das Rochas", "Gnomo das rochas", "gnomo das rochas":
			System.out.println("\nCerto, seu personagem será um: " + sub_gnome_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			menu_races_gnome();
		}
	}
	
	private static void menu_races_halfling() {

		Scanner enter_sub_halfling = new Scanner(System.in);
		String sub_halfling_player = enter_sub_halfling.nextLine();

		switch (sub_halfling_player) {

		case "1", "Robusto", "robusto":
			System.out.println("\nCerto, seu personagem será um: " + sub_halfling_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		case "2", "Pés Peludos", "Pés peludos", "pés peludos", "Pes Peludos", "Pes peludos", "pes peludos":
			System.out.println("\nCerto, seu personagem será um: " + sub_halfling_player
					+ ". Agora vamos prosseguir para as ClassType.");
			break;

		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			menu_races_halfling();
		}
	}

// Menu dos Antecedentes
	
	public static void menu_backgrounds_guild_artisan() {

		Scanner enter_var_guild_artisan = new Scanner(System.in);
		String var_guild_artisan_player = enter_var_guild_artisan.nextLine();

		switch (var_guild_artisan_player) {

		case "1", "Alquimista","alquimista","Boticário","boticário","Boticario","boticario":
			var_guild_artisan_player = "Alquimista";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");
			break;

		case "2", "Armeiro","armeiro","Chaveiro","chaveiro","Ferreiro fino","ferreiro fino","Ferreiro Feino":
			var_guild_artisan_player = "Armeiro";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");
			break;
		
		case "3", "Cervejeiro","cervejeiro","Destilador","destilador","Viticultor","viticultor":
			var_guild_artisan_player = "Cervejeiro";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");
			break;
		
		case "4", "Calígrafo","calígrafo","Caligrafo","caligrafo","Escriba","escriba","Escrivão","escrivão","Escrivao","escrivao":
			var_guild_artisan_player = "Calígrafo";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");
			break;
			
		case "5", "Carpinteiro","carpinteiro","Construtor de telhado","Construtor de Telhado","construtor de telhado","Estucador","estucador":
			var_guild_artisan_player = "Carpinteiro";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");
			break;
			
		case "6", "Cartógrafo","cartógrafo","Cartografo","cartografo","Agrimensore","agrimensore","Desenhista","desenhista":
			var_guild_artisan_player = "Cartógrafo";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");	
			break;
			
		case "7", "Remendeiro","remendeiro, Sapateiro, sapateiro":
			var_guild_artisan_player = "Remendeiro";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");	
			break;	
			
		case "8", "Cozinheiro","cozinheiro","Padeiro","padeiro":
			var_guild_artisan_player = "Cozinheiro";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");	
			break;	
		
		case "9", "Vidraceiro","vidraceiro","Escultor","escultor":
			var_guild_artisan_player = "Escultor";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");	
			break;	
		
		case "10", "Joalheiro","joalheiro","Lapidário","lapidário","Lapidario","lapidario":
			var_guild_artisan_player = "Joalheiro";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");	
			break;
			
		case "11", "Coureiro","coureiro","Peleiro","peleiro","Curtidor","curtidor":
			var_guild_artisan_player = "Coureiro";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");	
			break;	
			
		case "12", "Pedreiro","pedreiro","Marceneiro","marceneiro":
			var_guild_artisan_player = "Pedreiro";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");		
			break;	
			
		case "13", "Pintor","pintor","Iluminador","iluminador","Construtor de Placa","Construtor de placa","construtor de placa":
			var_guild_artisan_player = "Pintor";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");			
			break;	
			
		case "14", "Oleiro","oleiro","Telheiro","telheiro":
			var_guild_artisan_player = "Oleiro";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");	
			break;	
			
		case "15", "Armador","armador","Veleiro","veleiro":
			var_guild_artisan_player = "Armador";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");		
			break;	
		
		case "16", "Ferreiro","ferreiro","Forjador","forjador":
			var_guild_artisan_player = "Ferreiro";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");		
			break;		
		
		case "17", "Funileiro","funileiro","Latoeiro","latoeiro","Galheteiro","galheteiro":
			var_guild_artisan_player = "Funileiro";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");		
			break;		

		case "18", "Fabricante de Carroças","Fabricante de carroças","fabricante de carroças","Fabricante de Rodas","Fabricante de rodas","fabricante de rodas":
			var_guild_artisan_player = "Fabricante de Carroça";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");		
			break;		
			
		case "19", "Tecelão","tecelão","Tecelao","tecelao","Tintureiro","tintureiro":
			var_guild_artisan_player = "Tecelão";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");		
			break;				
			
		case "20", "Entalhador","entalhador","Tanoeiro","tanoeiro","Construtor de Arco","Construtor de arco","construtor de arco":
			var_guild_artisan_player = "Fabricante de Carroça";
			System.out.println("\nCerto, seu personagem será um: " + var_guild_artisan_player
					+ ". Agora vamos prosseguir para as tendências.");			
			break;	
			
		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			menu_backgrounds_guild_artisan();
			
		}
	}

	public static void menu_backgrounds_criminal() {
	
		Scanner enter_var_criminal = new Scanner(System.in);
		String var_criminal_player = enter_var_criminal.nextLine();

		switch (var_criminal_player) {

		case "1", "Assaltante","assaltante":
			var_criminal_player = "Assaltante";
			System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
					+ ". Agora vamos prosseguir para as tendências.");
		break;
		
		case "2", "Assaassino de Aluguel","Assassino de aluguel","assassino de aluguel":
			var_criminal_player = "Assassino de aluguel";
			System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
					+ ". Agora vamos prosseguir para as tendências.");
		break;
		
		case "3", "Batedor de Carteira","Batedor de carteira","batedor de carteira":
			var_criminal_player = "Batedor de carteira";
			System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
					+ ". Agora vamos prosseguir para as tendências.");
		break;
		
		case "4", "Chantagista","chantagista":
			var_criminal_player = "Chantagista";
			System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
					+ ". Agora vamos prosseguir para as tendências.");
			break;
		
		case "5", "Contrabandista","contrabandista":
			var_criminal_player = "Contrabandista";
			System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
					+ ". Agora vamos prosseguir para as tendências.");
			break;
		
		case "6", "Espião","espião","Espiao","espiao":
			var_criminal_player = "Espião";
			System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
					+ ". Agora vamos prosseguir para as tendências.");
			break;
		
		case "7", "Executor","executor":
			var_criminal_player = "Executor";
			System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
					+ ". Agora vamos prosseguir para as tendências.");
			break;
		
		case "8", "Ladrão de Estrada","Ladrão de estrada","ladrão de estrada","Ladrao de Estrada","Ladrao de estrada","ladrao de estrada":
			var_criminal_player = "Ladrão de estrada";
			System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
					+ ". Agora vamos prosseguir para as tendências.");
			break;
		
		case "9", "Receptador","receptador":
			var_criminal_player = "Receptador";
			System.out.println("\nCerto, seu personagem será um: " + var_criminal_player
					+ ". Agora vamos prosseguir para as tendências.");
			break;
			
		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			menu_backgrounds_criminal();
			
		}
	}
	
	public static void menu_backgrounds_outlander() {
		
	}
	
	public static void menu_backgrounds_sailor() {
		
	}
	
// Sistema de Atributos

	
	public static void system_add_atributes() {

// Método de Sistema de Preenchimento de Atributos	

		Scanner system_atributes = new Scanner(System.in);
		int enter_system_atributes = system_atributes.nextInt();

		// Sistemas de Atributos

		if (enter_system_atributes == 1) {

			// Força

			System.out.println("\nCerto, como foi dito previamente, temos " + atribute_points
					+ " pontos para distribuir para seus atributos.\n");
			System.out.println("Digite quantos pontos você deseja pôr em Força:");

			Scanner enter_strength_atribute = new Scanner(System.in);
			int strength_atribute = enter_strength_atribute.nextInt();
			atribute_points = atribute_points - strength_atribute;
			System.out.println("\nVocê ainda terá " + atribute_points + " pontos para distribuir\n");

			// Destreza

			System.out.println("Digite quantos pontos você deseja pôr em Destreza:");

			Scanner enter_dexterity_atribute = new Scanner(System.in);
			int dexterity_atribute = enter_dexterity_atribute.nextInt();
			atribute_points = atribute_points - dexterity_atribute;
			System.out.println("\nVocê ainda terá " + atribute_points + " pontos para distribuir\n");

			// Constituição

			System.out.println("Digite quantos pontos você deseja pôr em Constituição:");

			Scanner enter_constitution_atribute = new Scanner(System.in);
			int constitution_atribute = enter_constitution_atribute.nextInt();
			atribute_points = atribute_points - constitution_atribute;
			System.out.println("\nVocê ainda terá " + atribute_points + " pontos para distribuir\n");

			// Inteligência

			System.out.println("Digite quantos pontos você deseja pôr em Inteligência:");

			Scanner enter_intelligence_atribute = new Scanner(System.in);
			int intelligence_atribute = enter_intelligence_atribute.nextInt();
			atribute_points = atribute_points - intelligence_atribute;
			System.out.println("\nVocê ainda terá " + atribute_points + " pontos para distribuir\n");

			// Sabedoria

			System.out.println("Digite quantos pontos você deseja pôr em Sabedoria:");

			Scanner enter_wisdom_atribute = new Scanner(System.in);
			int wisdom_atribute = enter_wisdom_atribute.nextInt();
			atribute_points = atribute_points - wisdom_atribute;
			System.out.println("\nVocê ainda terá " + atribute_points + " pontos para distribuir\n");

			// Carisma

			System.out.println("Digite quantos pontos você deseja pôr em Carisma:");

			Scanner enter_charisma_atribute = new Scanner(System.in);
			int charisma_atribute = enter_charisma_atribute.nextInt();
			atribute_points = atribute_points - charisma_atribute;
			System.out.println("\nVocê ainda terá " + atribute_points + " pontos para distribuir\n");

			calc_mod_str(+strength_atribute);
			System.out.println("");
			calc_mod_dex(dexterity_atribute);
			System.out.println("");
			calc_mod_con(constitution_atribute);
			System.out.println("");
			calc_mod_int(intelligence_atribute);
			System.out.println("");
			calc_mod_wis(wisdom_atribute);
			System.out.println("");
			calc_mod_cha(charisma_atribute);

			System.out.println(mod_dex);

		} else if (enter_system_atributes == 2) {

			roll_d06();

		}
		if ((enter_system_atributes > 2) || (enter_system_atributes < 1)) {

			System.out.println(
					"\nOpção inválida, por favor digite qual sistema de preenchimento de atributos você deseja utilizar:");

			system_add_atributes();

		}
	}

	// Modificador de Força
	
	public static void calc_mod_str(int strength_atribute) {

		// Modificador de Constituição

		switch (strength_atribute) {

		case 1:

			mod_str = -5;
			System.out.println("Seu modificador de Força é: " + mod_str);
			return;

		case 2, 3:

			mod_str = -4;
			System.out.println("Seu modificador de Força é: " + mod_str);
			return;

		case 4, 5:

			mod_str = -3;
			System.out.println("Seu modificador de Força é: " + mod_str);
			return;

		case 6, 7:

			mod_str = -2;
			System.out.println("Seu modificador de Força é: " + mod_str);
			return;

		case 8, 9:

			mod_str = -1;
			System.out.println("Seu modificador de Força é: " + mod_str);
			return;

		case 10, 11:

			mod_str = 0;
			System.out.println("Seu modificador de Força é: " + "+" + mod_str);
			return;

		case 12, 13:

			mod_str = +1;
			System.out.println("Seu modificador de Força é: " + "+" + mod_str);
			return;

		case 14, 15:

			mod_str = +2;
			System.out.println("Seu modificador de Força é: " + "+" + mod_str);
			return;

		case 16, 17:

			mod_str = +3;
			System.out.println("Seu modificador de Força é: " + "+" + mod_str);
			return;

		case 18, 19:

			mod_str = +4;
			System.out.println("Seu modificador de Força é: " + "+" + mod_str);
			return;

		case 20, 21:

			mod_str = +5;
			System.out.println("Seu modificador de Força é: " + "+" + mod_str);
			return;

		case 22, 23:

			mod_str = +6;
			System.out.println("Seu modificador de Força é: " + "+" + mod_str);
			return;

		case 24, 25:

			mod_str = +7;
			System.out.println("Seu modificador de Força é: " + "+" + mod_str);
			return;

		case 26, 27:

			mod_str = +8;
			System.out.println("Seu modificador de Força é: " + "+" + mod_str);
			return;

		case 29, 28:

			mod_str = +9;
			System.out.println("Seu modificador de Força é: " + "+" + mod_str);
			return;

		case 30:

			mod_str = +10;
			System.out.println("Seu modificador de Força é: " + "+" + mod_str);
			return;
		}
	}

	// Modificador de Destreza
	
	public static void calc_mod_dex(int dexterity_atribute) {
		switch (dexterity_atribute) {

		case 1:

			mod_dex = -5;
			System.out.println("Seu modificador de Destreza é: " + mod_dex);
			return;

		case 2, 3:

			mod_dex = -4;
			System.out.println("Seu modificador de Destreza é: " + mod_dex);
			return;

		case 4, 5:

			mod_dex = -3;
			System.out.println("Seu modificador de Destreza é: " + mod_dex);
			return;

		case 6, 7:

			mod_dex = -2;
			System.out.println("Seu modificador de Destreza é: " + mod_dex);
			return;

		case 8, 9:

			mod_dex = -1;
			System.out.println("Seu modificador de Destreza é: " + mod_dex);
			return;

		case 10, 11:

			mod_dex = 0;
			System.out.println("Seu modificador de Destreza é: " + mod_dex);
			return;

		case 12, 13:

			mod_dex = +1;
			System.out.println("Seu modificador de Destreza é: " + "+" + mod_dex);
			return;

		case 14, 15:

			mod_dex = +2;
			System.out.println("Seu modificador de Destreza é: " + "+" + mod_dex);
			return;

		case 16, 17:

			mod_dex = +3;
			System.out.println("Seu modificador de Destreza é: " + "+" + mod_dex);
			return;

		case 18, 19:

			mod_dex = +4;
			System.out.println("Seu modificador de Destreza é: " + "+" + mod_dex);
			return;

		case 20, 21:

			mod_dex = +5;
			System.out.println("Seu modificador de Destreza é: " + "+" + mod_dex);
			return;

		case 22, 23:

			mod_dex = +6;
			System.out.println("Seu modificador de Destreza é: " + "+" + mod_dex);
			return;

		case 24, 25:

			mod_dex = +7;
			System.out.println("Seu modificador de Destreza é: " + "+" + mod_dex);
			return;

		case 26, 27:

			mod_dex = +8;
			System.out.println("Seu modificador de Destreza é: " + "+" + mod_dex);
			return;

		case 29, 28:

			mod_dex = +9;
			System.out.println("Seu modificador de Destreza é: " + "+" + mod_dex);
			return;

		case 30:

			mod_dex = +10;
			System.out.println("Seu modificador de Destreza é: " + "+" + mod_dex);
			return;

		}
	}

	// Modificador de Constituição
	
	public static void calc_mod_con(int constitution_atribute) {
		switch (constitution_atribute) {

		case 1:

			mod_con = -5;
			System.out.println("Seu modificador de Constituição é: " + mod_con);
			return;

		case 2, 3:

			mod_con = -4;
			System.out.println("Seu modificador de Constituição é: " + mod_con);
			return;

		case 4, 5:

			mod_con = -3;
			System.out.println("Seu modificador de Constituição é: " + mod_con);
			return;

		case 6, 7:

			mod_con = -2;
			System.out.println("Seu modificador de Constituição é: " + mod_con);
			return;

		case 8, 9:

			mod_con = -1;
			System.out.println("Seu modificador de Constituição é: " + mod_con);
			return;

		case 10, 11:

			mod_con = 0;
			System.out.println("Seu modificador de Constituição é: " + mod_con);
			return;

		case 12, 13:

			mod_con = +1;
			System.out.println("Seu modificador de Constituição é: " + "+" + mod_con);
			return;

		case 14, 15:

			mod_con = +2;
			System.out.println("Seu modificador de Constituição é: " + "+" + mod_con);
			return;

		case 16, 17:

			mod_con = +3;
			System.out.println("Seu modificador de Constituição é: " + "+" + mod_con);
			return;

		case 18, 19:

			mod_con = +4;
			System.out.println("Seu modificador de Constituição é: " + "+" + mod_con);
			return;

		case 20, 21:

			mod_con = +5;
			System.out.println("Seu modificador de Constituição é: " + "+" + mod_con);
			return;

		case 22, 23:

			mod_con = +6;
			System.out.println("Seu modificador de Constituição é: " + "+" + mod_con);
			return;

		case 24, 25:

			mod_con = +7;
			System.out.println("Seu modificador de Constituição é: " + "+" + mod_con);
			return;

		case 26, 27:

			mod_con = +8;
			System.out.println("Seu modificador de Constituição é: " + "+" + mod_con);
			return;

		case 29, 28:

			mod_con = +9;
			System.out.println("Seu modificador de Constituição é: " + "+" + mod_con);
			return;

		case 30:

			mod_con = +10;
			System.out.println("Seu modificador de Constituição é: " + "+" + mod_con);
			return;
		}
	}

	// Modificador de Inteligência
	
	public static void calc_mod_int(int intelligence_atribute) {
		switch (intelligence_atribute) {

		case 1:

			mod_int = -5;
			System.out.println("Seu modificador de Inteligência é: " + mod_int);
			return;

		case 2, 3:

			mod_int = -4;
			System.out.println("Seu modificador de Inteligência é: " + mod_int);
			return;

		case 4, 5:

			mod_int = -3;
			System.out.println("Seu modificador de Inteligência é: " + mod_int);
			return;

		case 6, 7:

			mod_int = -2;
			System.out.println("Seu modificador de Inteligência é: " + mod_int);
			return;

		case 8, 9:

			mod_int = -1;
			System.out.println("Seu modificador de Inteligência é: " + mod_int);
			return;

		case 10, 11:

			mod_int = 0;
			System.out.println("Seu modificador de Inteligência é: " + mod_int);
			return;

		case 12, 13:

			mod_int = +1;
			System.out.println("Seu modificador de Inteligência é: " + "+" + mod_int);
			return;

		case 14, 15:

			mod_int = +2;
			System.out.println("Seu modificador de Inteligência é: " + "+" + mod_int);
			return;

		case 16, 17:

			mod_int = +3;
			System.out.println("Seu modificador de Inteligência é: " + "+" + mod_int);
			return;

		case 18, 19:

			mod_int = +4;
			System.out.println("Seu modificador de Inteligência é: " + "+" + mod_int);
			return;

		case 20, 21:

			mod_int = +5;
			System.out.println("Seu modificador de Inteligência é: " + "+" + mod_int);
			return;

		case 22, 23:

			mod_int = +6;
			System.out.println("Seu modificador de Inteligência é: " + "+" + mod_int);
			return;

		case 24, 25:

			mod_int = +7;
			System.out.println("Seu modificador de Inteligência é: " + "+" + mod_int);
			return;

		case 26, 27:

			mod_int = +8;
			System.out.println("Seu modificador de Inteligência é: " + "+" + mod_int);
			return;

		case 28, 29:

			mod_int = +9;
			System.out.println("Seu modificador de Inteligência é: " + "+" + mod_int);
			return;

		case 30:

			mod_int = +10;
			System.out.println("Seu modificador de Inteligência é: " + "+" + mod_int);
			return;
		}
	}

	// Modificador de Sabedoria
	
	public static void calc_mod_wis(int wisdom_atribute) {
		switch (wisdom_atribute) {

		case 1:

			mod_wis = -5;
			System.out.println("Seu modificador de Sabedoria é: " + mod_wis);
			return;

		case 2, 3:

			mod_wis = -4;
			System.out.println("Seu modificador de Sabedoria é: " + mod_wis);
			return;

		case 4, 5:

			mod_wis = -3;
			System.out.println("Seu modificador de Sabedoria é: " + mod_wis);
			return;

		case 6, 7:

			mod_wis = -2;
			System.out.println("Seu modificador de Sabedoria é: " + mod_wis);
			return;

		case 8, 9:

			mod_wis = -1;
			System.out.println("Seu modificador de Sabedoria é: " + mod_wis);
			return;

		case 10, 11:

			mod_wis = 0;
			System.out.println("Seu modificador de Sabedoria é: " + mod_wis);
			return;

		case 12, 13:

			mod_wis = +1;
			System.out.println("Seu modificador de Sabedoria é: " + "+" + mod_wis);
			return;

		case 14, 15:

			mod_wis = +2;
			System.out.println("Seu modificador de Sabedoria é: " + "+" + mod_wis);
			return;

		case 16, 17:

			mod_wis = +3;
			System.out.println("Seu modificador de Sabedoria é: " + "+" + mod_wis);
			return;

		case 18, 19:

			mod_wis = +4;
			System.out.println("Seu modificador de Sabedoria é: " + "+" + mod_wis);
			return;

		case 20, 21:

			mod_wis = +5;
			System.out.println("Seu modificador de Sabedoria é: " + "+" + mod_wis);
			return;

		case 22, 23:

			mod_wis = +6;
			System.out.println("Seu modificador de Sabedoria é: " + "+" + mod_wis);
			return;

		case 24, 25:

			mod_wis = +7;
			System.out.println("Seu modificador de Sabedoria é: " + "+" + mod_wis);
			return;

		case 26, 27:

			mod_wis = +8;
			System.out.println("Seu modificador de Sabedoria é: " + "+" + mod_wis);
			return;

		case 28, 29:

			mod_wis = +9;
			System.out.println("Seu modificador de Sabedoria é: " + "+" + mod_wis);
			return;

		case 30:

			mod_wis = +10;
			System.out.println("Seu modificador de Sabedoria é: " + "+" + mod_wis);
			return;
		}
	}

	// Modificador de Carisma
	
	public static void calc_mod_cha(int charisma_atribute) {
		switch (charisma_atribute) {

		case 1:

			mod_cha = -5;
			System.out.println("Seu modificador de Carisma é: " + mod_cha);
			return;

		case 2, 3:

			mod_cha = -4;
			System.out.println("Seu modificador de Carisma é: " + mod_cha);
			return;

		case 4, 5:

			mod_cha = -3;
			System.out.println("Seu modificador de Carisma é: " + mod_cha);
			return;

		case 6, 7:

			mod_cha = -2;
			System.out.println("Seu modificador de Carisma é: " + mod_cha);
			return;

		case 8, 9:

			mod_cha = -1;
			System.out.println("Seu modificador de Carisma é: " + mod_cha);
			return;

		case 10, 11:

			mod_cha = 0;
			System.out.println("Seu modificador de Carisma é: " + mod_cha);
			return;

		case 12, 13:

			mod_cha = +1;
			System.out.println("Seu modificador de Carisma é: " + "+" + mod_cha);
			return;

		case 14, 15:

			mod_cha = +2;
			System.out.println("Seu modificador de Carisma é: " + "+" + mod_cha);
			return;

		case 16, 17:

			mod_cha = +3;
			System.out.println("Seu modificador de Carisma é: " + "+" + mod_cha);
			return;

		case 18, 19:

			mod_cha = +4;
			System.out.println("Seu modificador de Carisma é: " + "+" + mod_cha);
			return;

		case 20, 21:

			mod_cha = +5;
			System.out.println("Seu modificador de Carisma é: " + "+" + mod_cha);
			return;

		case 22, 23:

			mod_cha = +6;
			System.out.println("Seu modificador de Carisma é: " + "+" + mod_cha);
			return;

		case 24, 25:

			mod_cha = +7;
			System.out.println("Seu modificador de Carisma é: " + "+" + mod_cha);
			return;

		case 26, 27:

			mod_cha = +8;
			System.out.println("Seu modificador de Carisma é: " + "+" + mod_cha);
			return;

		case 28, 29:

			mod_cha = +9;
			System.out.println("Seu modificador de Carisma é: " + "+" + mod_cha);
			return;

		case 30:

			mod_cha = +10;
			System.out.println("Seu modificador de Carisma é: " + "+" + mod_cha);
			return;
		}
	}

//Rolar os Dados
	
	public static int roll_d04() {

		// D04 de RPG

		double d04 = (int) ((Math.random() * 4));

		// Parâmetros de Jogar o D04

		if (d04 > 0 && d04 <= 4 / 4 * 1) {
			return 1;

		} else if (d04 > 4 / 4 * 1 && d04 <= 4 / 4 * 2) {
			return 2;

		} else if (d04 > 4 / 4 * 2 && d04 <= 4 / 4 * 3) {
			return 3;
		} else {
			return 4;
		}
	}
	
	public static int roll_d06() {

		// D06 de RPG

		double d06 = (int) ((Math.random() * 6));

//Método de Jogar o D06

		if (d06 > 0 && d06 <= 6 / 6 * 1) {
			return 1;

		} else if (d06 > 6 / 6 * 1 && d06 <= 6 / 6 * 2) {
			return 2;

		} else if (d06 > 6 / 6 * 2 && d06 <= 6 / 6 * 3) {
			return 3;

		} else if (d06 > 6 / 6 * 3 && d06 <= 6 / 6 * 4) {
			return 4;

		} else if (d06 > 6 / 6 * 4 && d06 <= 6 / 6 * 5) {
			return 5;

		} else {
			return 6;

		}
	}
	
	public static int roll_d08() {

		// D08 de RPG

		double d08 = (int) ((Math.random() * 8));

		// Método de Jogar o D08

		if (d08 > 0 && d08 <= 8 / 8 * 1) {
			return 1;

		} else if (d08 > 8 / 8 * 1 && d08 <= 8 / 8 * 2) {
			return 2;

		} else if (d08 > 8 / 8 * 2 && d08 <= 8 / 8 * 3) {
			return 3;

		} else if (d08 > 8 / 8 * 3 && d08 <= 8 / 8 * 4) {
			return 4;

		} else if (d08 > 8 / 8 * 4 && d08 <= 8 / 8 * 5) {
			return 5;

		} else if (d08 > 8 / 8 * 5 && d08 <= 8 / 8 * 6) {
			return 6;

		} else if (d08 > 8 / 8 * 6 && d08 <= 8 / 8 * 7) {
			return 7;

		} else {
			return 8;

		}
	}
	
	public static int roll_d10() {

		// D10 de RPG

		double d10 = (int) ((Math.random() * 10));

		// Método de Jogar o D10

		if (d10 > 0 && d10 <= 10 / 10 * 1) {
			return 1;

		} else if (d10 > 10 / 10 * 1 && d10 <= 10 / 10 * 2) {
			return 2;

		} else if (d10 > 10 / 10 * 1 && d10 <= 10 / 10 * 2) {
			return 2;

		} else if (d10 > 10 / 10 * 1 && d10 <= 10 / 10 * 2) {
			return 2;

		} else if (d10 > 10 / 10 * 1 && d10 <= 10 / 10 * 2) {
			return 2;

		} else if (d10 > 10 / 10 * 1 && d10 <= 10 / 10 * 2) {
			return 2;

		} else if (d10 > 10 / 10 * 1 && d10 <= 10 / 10 * 2) {
			return 2;

		} else {
			return 10;

		}

	}
	
	public static int roll_d12() {

		// D12 de RPG

		double d12 = (int) ((Math.random() * 12));

//Método de Jogar o D12

		if (d12 > 0 && d12 <= 12 / 12 * 1) {
			return 1;

		} else if (d12 > 12 / 12 * 1 && d12 <= 12 / 12 * 2) {
			return 2;

		} else if (d12 > 12 / 12 * 2 && d12 <= 12 / 12 * 3) {
			return 3;

		} else if (d12 > 12 / 12 * 3 && d12 <= 12 / 12 * 4) {
			return 4;

		} else if (d12 > 12 / 12 * 4 && d12 <= 12 / 12 * 5) {
			return 5;

		} else if (d12 > 12 / 12 * 5 && d12 <= 12 / 12 * 6) {
			return 6;

		} else if (d12 > 12 / 12 * 6 && d12 <= 12 / 12 * 7) {
			return 7;

		} else if (d12 > 12 / 12 * 7 && d12 <= 12 / 12 * 8) {
			return 8;

		} else if (d12 > 12 / 12 * 8 && d12 <= 12 / 12 * 9) {
			return 9;

		} else if (d12 > 12 / 12 * 9 && d12 <= 12 / 12 * 10) {
			return 10;

		} else if (d12 > 12 / 12 * 10 && d12 <= 12 / 12 * 11) {
			return 11;

		} else {
			return 12;
		}

	}
	
	public static int roll_d20() {

		// D20 de RPG

		double d20 = (int) ((Math.random() * 20));

//Método de Jogar o D20

		if (d20 > 0 && d20 <= 20 / 20 * 1) {
			return 1;

		} else if (d20 > 20 / 20 * 1 && d20 <= 20 / 20 * 2) {
			return 2;

		} else if (d20 > 20 / 20 * 2 && d20 <= 20 / 20 * 3) {
			return 3;

		} else if (d20 > 20 / 20 * 3 && d20 <= 20 / 20 * 4) {
			return 4;

		} else if (d20 > 20 / 20 * 4 && d20 <= 20 / 20 * 5) {
			return 5;

		} else if (d20 > 20 / 20 * 5 && d20 <= 20 / 20 * 6) {
			return 6;

		} else if (d20 > 20 / 20 * 6 && d20 <= 20 / 20 * 7) {
			return 7;

		} else if (d20 > 20 / 20 * 7 && d20 <= 20 / 20 * 8) {
			return 8;

		} else if (d20 > 20 / 20 * 8 && d20 <= 20 / 20 * 9) {
			return 9;

		} else if (d20 > 20 / 20 * 9 && d20 <= 20 / 20 * 10) {
			return 10;

		} else if (d20 > 20 / 20 * 10 && d20 <= 20 / 20 * 11) {
			return 11;

		} else if (d20 > 20 / 20 * 11 && d20 <= 20 / 20 * 12) {
			return 12;

		} else if (d20 > 20 / 20 * 12 && d20 <= 20 / 20 * 13) {
			return 13;

		} else if (d20 > 20 / 20 * 13 && d20 <= 20 / 20 * 14) {
			return 14;

		} else if (d20 > 20 / 20 * 14 && d20 <= 20 / 20 * 15) {
			return 15;

		} else if (d20 > 20 / 20 * 15 && d20 <= 20 / 20 * 16) {
			return 16;

		} else if (d20 > 20 / 20 * 16 && d20 <= 20 / 20 * 17) {
			return 17;

		} else if (d20 > 20 / 20 * 17 && d20 <= 20 / 20 * 18) {
			return 18;

		} else if (d20 > 20 / 20 * 18 && d20 <= 20 / 20 * 19) {
			return 19;

		} else {
			return 20;

		}

	}

// Método de Sistema de Preenchimento de Perícias

	public static void system_add_skill() {

	}

}