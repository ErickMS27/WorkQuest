package workquest.storage;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashMap;


public class WorkQuest_v0_3_2{

public static void main (String[] args) {

// Mensagem de Início

		System.out.println("Olá! Bem-vindo ao WorkQuest! Um sistema de gamificação baseada no sistema de RPG: Dungeons and Dragons 5º Edição.\n");

// Nome do Player

	Scanner enter_name_player = new Scanner(System.in);
		System.out.println("Digite o seu nome de jogador:");
	String name_player = enter_name_player.nextLine();

// Raça do Char

	LinkedList<String> races = new LinkedList<String>();

		System.out.println("\nUtilizando como base o Livro do Jogador, temos as seguintes raças no mundo de D&D:");

		races.add(" \n >> Anão");
		races.add(" >> Draconato");
		races.add(" >> Elfo");
		races.add(" >> Gnomo");
		races.add(" >> Halfling");
		races.add(" >> Humano");
		races.add(" >> Meio-elfo");
		races.add(" >> Meio-orc");
		races.add(" >> Tiferino\n");

for (String i : races) {
		System.out.println(i);
	}

		System.out.println("Possuimos um total de"+" "+races.size()+" "+"raças no sistema D&D. Digite com qual raça, você deseja jogar:");
	
	Scanner enter_races = new Scanner(System.in);
	String races_player = enter_races.nextLine();

// Classe do Char

	LinkedList<String> classes = new LinkedList<String>();
		System.out.println("\nUtilizando como base o Livro do Jogador, temos as seguintes ClassType com suas informações, do mundo de D&D:");

		classes.add("\n >> Artífice: é uma classe que combina habilidades mágicas com proficiência em ferramentas e habilidades tecnológicas.");
		classes.add(" >> Bárbaro: é uma classe que possui um estilo de combate feroz e uma resistência incrível.");
		classes.add(" >> Bardo: é uma classe que combina magia com habilidades de performance para inspirar aliados e derrotar inimigos");
		classes.add(" >> Bruxo: é uma classe que faz pactos com seres poderosos para obter habilidades mágicas e invocações sombrias.");
		classes.add(" >> Clérigo: é uma classe que canaliza a energia divina para lançar magias e curar aliados em nome de sua divindade.");
		classes.add(" >> Druida: é uma classe que possui um forte vínculo com a natureza, podendo se transformar em animais e lançar magias baseadas no ambiente natural.");
		classes.add(" >> Feiticeiro: é uma classe que possui um talento inato para a magia, sendo capaz de lançar magias poderosas de forma espontânea.");
		classes.add(" >> Guerreiro: é uma classe de combatente versátil, capaz de utilizar diversas armas e armaduras, e se especializar em diferentes estilos de luta");
		classes.add(" >> Ladino: é uma classe é um especialista em furtividade e habilidades sociais, capaz de realizar ataques furtivos e desarmar armadilhas.");
		classes.add(" >> Mago: é uma classe usuária da magia poderoso e versátil, capaz de lançar uma grande variedade de magias de ataque, defesa e utilidade.");
		classes.add(" >> Monge: é uma classe especialista em artes marciais e disciplina física, capaz de realizar ataques desarmados e canalizar sua energia interna para realizar feitos extraordinários.");
		classes.add(" >> Paladino: é uma classe capaz de utilizar magias sagradas e defender a justiça e o bem em nome de sua divindade");
		classes.add(" >> Patrulheiro: é uma classe especialista em sobrevivência e caça, capaz de rastrear inimigos e se adaptar a diferentes ambientes.\n");

for (String i : classes) {
	System.out.println(i);
}

		System.out.println("Possuimos um total de"+" "+classes.size()+" "+"ClassType no sistema D&D. Digite com qual classe, você deseja jogar:");

	Scanner enter_classes = new Scanner(System.in);
	String classes_player = enter_classes.nextLine();
	
// Background do Char
	
	LinkedList<String> backgrounds = new LinkedList<String>();
		System.out.println("\nUtilizando como base o Livro do Jogador, temos os seguintes antecedentes com suas informações, do mundo de D&D:");

		backgrounds.add("\n >> Acólito");
		backgrounds.add(" >> Assombrado");
		backgrounds.add(" >> Artesão de Guilda");
		backgrounds.add(" >> Artista");
		backgrounds.add(" >> Charlatão");
		backgrounds.add(" >> Criminoso");
		backgrounds.add(" >> Eremita");
		backgrounds.add(" >> Forasteiro");
		backgrounds.add(" >> Herói do Povo");
		backgrounds.add(" >> Marinheiro");
		backgrounds.add(" >> Nobre");
		backgrounds.add(" >> Órfão");
		backgrounds.add(" >> Sábio");
		backgrounds.add(" >> Soldado\n");

for (String i : backgrounds) {
		System.out.println(i);
}

		System.out.println("Possuimos um total de"+" "+backgrounds.size()+" "+"antecedentes no sistema D&D. Digite com qual antecedente, você deseja aderir ao seu personagem:");

	Scanner enter_backgrounds = new Scanner(System.in);
	String backgrounds_player = enter_backgrounds.nextLine();

// Alinhamento do Char
	
	LinkedList<String> alignment = new LinkedList<String>();
		System.out.println("\nUtilizando como base o Livro do Jogador, temos os seguintes antecedentes com suas informações, do mundo de D&D:");

	alignment.add("\n >> Bom e Leal");
	alignment.add(" >> Bom e Neutro");
	alignment.add(" >> Bom e Caótico");
	alignment.add(" >> Neutro e Leal");
	alignment.add(" >> Neutro");
	alignment.add(" >> Neutro e Caótico");
	alignment.add(" >> Mal e Leal");
	alignment.add(" >> Mal e Neutro");
	alignment.add(" >> Mal e Caótico\n");

	for (String i : alignment) {
		System.out.println(i);
	}

		System.out.println("Possuimos um total de"+" "+alignment.size()+" "+"alinhamentos no sistema D&D. Digite com qual se encaixa mais ao seu personagem:");

		Scanner enter_alignment = new Scanner(System.in);
		String alignment_player = enter_alignment.nextLine();

// Nome do Char
		System.out.println("\nCerto, agora digite o nome do seu personagem:");
		
		Scanner enter_name_character = new Scanner(System.in);
		String name_character = enter_name_character.nextLine();

// Condição de Sub-raça - Anão
if (races_player.contentEquals("Anão")) {
	
	LinkedList<String> sub_dwarf = new LinkedList<String>();
	
		System.out.println("\nCerto, temos duas sub-raças dos Anões, que são:");
	
	sub_dwarf.add("\n>> Anão da Colina");
	sub_dwarf.add(">> Anão da Montanha\n ");

	for (String i : sub_dwarf) {
		System.out.println(i);
	}
	
		System.out.println("Informe com qual você sub-raça dos Anões você deseja jogar:");
	
		Scanner enter_sub_dwarf = new Scanner(System.in);
		String sub_dwarf_player = enter_sub_dwarf.nextLine();
	
} else if (races_player.contentEquals("Draconato")) {
	
	LinkedList<String> sub_dragonborn = new LinkedList<String>();
	
		System.out.println("\nCerto, temos dez opções de Ancestralidades Dracônicas, que são:");
		
	sub_dragonborn.add("\n>> Azul");
	sub_dragonborn.add(">> Branco");
	sub_dragonborn.add(">> Bronze");
	sub_dragonborn.add(">> Cobre");
	sub_dragonborn.add(">> Latão");
	sub_dragonborn.add(">> Negro");
	sub_dragonborn.add(">> Ouro");
	sub_dragonborn.add(">> Prata");
	sub_dragonborn.add(">> Verde");
	sub_dragonborn.add(">> Vermelho\n ");

		for (String i : sub_dragonborn) {
			System.out.println(i);
		}
		
		System.out.println("Informe com qual você Ancestralidade Dracônica você deseja jogar:");
		
			Scanner enter_sub_dragonborn = new Scanner(System.in);
			String sub_dragonborn_player = enter_sub_dragonborn.nextLine();
		
} else if (races_player.contentEquals("Elfo")) {
	
	LinkedList<String> sub_elf = new LinkedList<String>();
	
		System.out.println("\nCerto, temos duas sub-raças dos Elfos, que são:");
		
		sub_elf.add("\n>> Alto Elfo");
		sub_elf.add(">> Elfo da Floresta");
		sub_elf.add(">> Elfo Negro (Drow)\n ");

		for (String i : sub_elf) {
			System.out.println(i);
		}
		
		System.out.println("Informe com qual você sub-raça dos Elfos você deseja jogar:");
		
			Scanner enter_sub_elf = new Scanner(System.in);
			String sub_elf_player = enter_sub_elf.nextLine();
	
} else if (races_player.contentEquals("Gnomo")) {
	
	LinkedList<String> sub_gnome = new LinkedList<String>();
	
		System.out.println("\nCerto, temos duas sub-raças dos Gnomos, que são:");
		
		sub_gnome.add("\n>> Gnomo da Floresta");
		sub_gnome.add(">> Gnomo das Rochas\n ");

		for (String i : sub_gnome) {
			System.out.println(i);
		}
		
		System.out.println("Informe com qual você sub-raça dos Gnomos você deseja jogar:");
		
			Scanner enter_sub_gnome = new Scanner(System.in);
			String sub_gnome_player = enter_sub_gnome.nextLine();
			
} else if (races_player.contentEquals("Halfling")) {
	
	LinkedList<String> sub_halfing = new LinkedList<String>();
	
		System.out.println("\nCerto, temos duas sub-raças dos Halflings, que são:");
		
		sub_halfing.add("\n>> Pés Leves");
		sub_halfing.add(">> Robusto\n ");

		for (String i : sub_halfing) {
			System.out.println(i);
		}
		
		System.out.println("Informe com qual você sub-raça dos Halflings você deseja jogar:");
		
			Scanner enter_sub_halfing = new Scanner(System.in);
			String sub_halfing_player = enter_sub_halfing.nextLine();
			
}

	
		System.out.println("\nTudo ok! Seu personagem foi criado! Agora devemos distribuir os pontos aos seus Valores de Habilidade.");

// Ficha do Player



// Dados de RPG

int d04 = (int)((Math.random()*4)+1);
int d06 = (int)((Math.random()*6)+1);
int d08 = (int)((Math.random()*8)+1);
int d10 = (int)((Math.random()*10)+1);
int d12 = (int)((Math.random()*12)+1);
int d20 = (int)((Math.random()*20)+1);

}

}