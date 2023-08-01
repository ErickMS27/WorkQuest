package workquest.storage;

import java.util.LinkedList;
import java.util.Scanner;

public class Character_Sheet_WorkQuest {

	public static void main (String args[]) {
		
	}
	
	private static void menu_races() {

		// Método para Raças e Sub-raças	
			
		Scanner enter_races = new Scanner(System.in);
		String races_player = enter_races.nextLine();

		// Condição de Sub-raça

				switch(races_player) {
				
					case "Anão":
						
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
								
									switch(sub_dwarf_player) {
									
										case "Anão da Colina":
											System.out.println("\nCerto, seu personagem será um: "+sub_dwarf_player+". Agora vamos prosseguir para as ClassType.");
											return;
											
										case "Anão da Montanha":
											System.out.println("\nCerto, seu personagem será um: "+sub_dwarf_player+". Agora vamos prosseguir para as ClassType.");
											return;
											
										default:
											System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
											menu_races_dwarf();
											return;
									}
										
					case "Draconato":
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
											
											switch(sub_dragonborn_player) {
											
											case "Azul":
												System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
												return;
												
											case "Branco":
												System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
												return;
												
											case "Bronze":
												System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
												return;
												
											case "Cobre":
												System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
												return;
												
											case "Latão":
												System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
												return;
												
											case "Negro":
												System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
												return;
												
											case "Ouro":	
												System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
												return;
												
											case "Prata":
												System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
												return;
												
											case "Verde":
												System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
												
											case "Vermelho":	
												System.out.println("\nCerto, seu personagem será Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
												return;
												
											default:
												System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
												menu_races_dragonborn();
												return;
												
											}
										
					case "Elfo":
						LinkedList<String> sub_elf = new LinkedList<String>();
						
									System.out.println("\nCerto, temos três sub-raças dos Elfos, que são:");
					
						sub_elf.add("\n>> Alto Elfo");
						sub_elf.add(">> Elfo da Floresta");
						sub_elf.add(">> Elfo Negro\n ");

									for (String i : sub_elf) {
										System.out.println(i);
					}
					
									System.out.println("Informe com qual você sub-raça dos Elfos você deseja jogar:");
					
										Scanner enter_sub_elf = new Scanner(System.in);
										String sub_elf_player = enter_sub_elf.nextLine();
											
								switch(sub_elf_player) {
										
										case "Alto Elfo":
											System.out.println("\nCerto, seu personagem será um: "+sub_elf_player+". Agora vamos prosseguir para as ClassType.");
											return;
											
										case "Elfo da Floresta":
											System.out.println("\nCerto, seu personagem será um: "+sub_elf_player+". Agora vamos prosseguir para as ClassType.");
											return;
											
										case "Elfo Negro":
											System.out.println("\nCerto, seu personagem será um: "+sub_elf_player+". Agora vamos prosseguir para as ClassType.");
											return;
											
									default:
										System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
										menu_races_elf();
										return;
										
										}
										
					case "Gnomo":
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
											
										switch(sub_gnome_player) {
										
										case "Gnomo da Floresta":
											System.out.println("\nCerto, seu personagem será um: "+sub_gnome_player+". Agora vamos prosseguir para as ClassType.");
											return;
											
										case "Gnomo das Rochas":
											System.out.println("\nCerto, seu personagem será um: "+sub_gnome_player+". Agora vamos prosseguir para as ClassType.");
											return;
											
									default:
										System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
										menu_races_gnome();
										return;
										
										}
					case "Halfling":
						LinkedList<String> sub_halfling = new LinkedList<String>();
						
									System.out.println("\nCerto, temos duas sub-raças dos Halflings, que são:");
					
						sub_halfling.add("\n>> Robusto");
						sub_halfling.add(">> Pés Peludos\n ");

									for (String i : sub_halfling) {
										System.out.println(i);
					}
					
									System.out.println("Informe com qual você sub-raça dos Halflings você deseja jogar:");
					
										Scanner enter_sub_halfling = new Scanner(System.in);
										String sub_halfling_player = enter_sub_halfling.nextLine();
										
										switch(sub_halfling_player) {
										
										case "Robusto":
											System.out.println("\nCerto, seu personagem será um: "+sub_halfling_player+". Agora vamos prosseguir para as ClassType.");
											return;
											
										case "Pés Peludos":
											System.out.println("\nCerto, seu personagem será um: "+sub_halfling_player+". Agora vamos prosseguir para as ClassType.");
											return;
											
									default:
										System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
										menu_races_halfling();
										return;
										
										}
										
										case "Humano":
											System.out.println("\nCerto, seu personagem será um: "+races_player+". Agora vamos prosseguir para as ClassType.");
											break;
											
										case "Meio-elfo":
											System.out.println("\nCerto, seu personagem será um: "+races_player+". Agora vamos prosseguir para as ClassType.");
											break;
											
										case "Meio-orc":
											System.out.println("\nCerto, seu personagem será um: "+races_player+". Agora vamos prosseguir para as ClassType.");
											break;
											
										case "Tiferino":
											System.out.println("\nCerto, seu personagem será um: "+races_player+". Agora vamos prosseguir para as ClassType.");
											break;
											
											default:
											System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
											
											menu_races();
										}	
				

		}

	private static void menu_classes() {

		// Método para Classes	
			
			Scanner enter_classes = new Scanner(System.in);
			String classes_player = enter_classes.nextLine();
			
			switch(classes_player) {
			case "Artífice":
				break;
			case "Bárbaro":
				break;
			case "Bardo":
				break;
			case "Bruxo":
				break;
			case "Clérigo":
				break;
			case "Druida":
				break;
			case "Feiticeiro":
				break;
			case "Guerreiro":
				break;
			case "Ladino":
				break;
			case "Mago":
				break;
			case "Monge":
				break;
			case "Paladino":
				break;
			case "Patrulheiro":
				break;
					default:
						System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
											menu_classes();
			}
			
		}

	private static void menu_backgrounds() {

		// Método para Antecedentes	
			
			Scanner enter_backgrounds = new Scanner(System.in);
			String backgrounds_player = enter_backgrounds.nextLine();
			
			switch(backgrounds_player) {
			case "Acólito":
				break;
			case "Artesão de Guilda":
				break;
			case "Artista":
				break;
			case "Assombrado":
				break;
			case "Charlatão":
				break;
			case "Criminoso":
				break;
			case "Eremita":
				break;
			case "Forasteiro":
				break;
			case "Herói do Povo":
				break;
			case "Marinheiro":
				break;
			case "Nobre":
				break;
			case "Órfão":
				break;
			case "Sábio":
				break;
			case "Soldado":
				break;
					default:
						System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
											menu_backgrounds();
			}
			
		}
	
	private static void menu_alignments() {

		// Método para Tendências:	
			
			Scanner enter_alignment = new Scanner(System.in);
			String alignment_player = enter_alignment.nextLine();
			
			switch(alignment_player) {
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

	// Menu das Sub-Raças

	private static void menu_races_dwarf() {

		
		Scanner enter_sub_dwarf = new Scanner(System.in);
		String sub_dwarf_player = enter_sub_dwarf.nextLine();
		
		switch(sub_dwarf_player) {

	case "Anão da Colina":
		System.out.println("\nCerto, seu personagem será um: "+sub_dwarf_player+". Agora vamos prosseguir para as ClassType.");
		break;
		
	case "Anão da Montanha":
		System.out.println("\nCerto, seu personagem será um: "+sub_dwarf_player+". Agora vamos prosseguir para as ClassType.");
		break;
		
	default:
		System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
		menu_races_dwarf();
	}
	}
	
	private static void menu_races_dragonborn() {
		
		Scanner enter_sub_dragonborn = new Scanner(System.in);
		String sub_dragonborn_player = enter_sub_dragonborn.nextLine();
		
		switch(sub_dragonborn_player) {
			
		case "Azul":
			System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		case "Branco":
			System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		case "Bronze":
			System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		case "Cobre":
			System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		case "Latão":
			System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		case "Negro":
			System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		case "Ouro":	
			System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		case "Prata":
			System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		case "Verde":
			System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		case "Vermelho":	
			System.out.println("\nCerto, seu personagem será um Draconato "+sub_dragonborn_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			menu_races_dragonborn();
		}
		
	}
	
	private static void menu_races_elf() {
		
		Scanner enter_sub_elf = new Scanner(System.in);
		String sub_elf_player = enter_sub_elf.nextLine();
		
		switch(sub_elf_player) {
			
		case "Alto Elfo":
			System.out.println("\nCerto, seu personagem será um: "+sub_elf_player+". Agora vamos prosseguir para as ClassType.");
			break;
		
		case "Elfo da Floresta":
			System.out.println("\nCerto, seu personagem será um: "+sub_elf_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		case "Elfo Negro":
			System.out.println("\nCerto, seu personagem será um: "+sub_elf_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			menu_races_elf();
	}
	}
	
	private static void menu_races_gnome() {
		Scanner enter_sub_gnome = new Scanner(System.in);
		String sub_gnome_player = enter_sub_gnome.nextLine();
		
		switch(sub_gnome_player) {
			
		case "Gnomo da Floresta":
			System.out.println("\nCerto, seu personagem será um: "+sub_gnome_player+". Agora vamos prosseguir para as ClassType.");
			break;
		
		case "Gnomo das Rochas":
			System.out.println("\nCerto, seu personagem será um: "+sub_gnome_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			menu_races_gnome();
	}	
	}
	
	private static void menu_races_halfling() {
		Scanner enter_sub_halfling = new Scanner(System.in);
		String sub_halfling_player = enter_sub_halfling.nextLine();
		
		switch(sub_halfling_player) {
			
		case "Robustos":
			System.out.println("\nCerto, seu personagem será um: "+sub_halfling_player+". Agora vamos prosseguir para as ClassType.");
			break;
		
		case "Pés Peludos":
			System.out.println("\nCerto, seu personagem será um: "+sub_halfling_player+". Agora vamos prosseguir para as ClassType.");
			break;
			
		default:
			System.out.println("\nOpção inválida, por favor digite uma das opções acima:.");
			menu_races_halfling();
	}	
}

//Rolar os Dados

public static int roll_d04() {

		// D04 de RPG

				double d04 = (int)((Math.random()*4));
									
			// Parâmetros de Jogar o D04
									
									if(d04>0 && d04 <= 4/4*1) {
											return 1;
									
									}else if(d04> 4/4*1 && d04 <= 4/4*2) {
											return 2;
									
									}else if(d04> 4/4*2 && d04 <= 4/4*3) {
											return 3;
									}else {
											return 4;
									}
	}

public static int roll_d06() {


	// D06 de RPG

				double d06 = (int)((Math.random()*6));									
	
//Método de Jogar o D06
						
						if(d06>0 && d06 <= 6/6*1) {
								return 1;
						
						}else if(d06> 6/6*1 && d06 <= 6/6*2) {
								return 2;
						
						}else if(d06> 6/6*2 && d06 <= 6/6*3) {
								return 3;
								
						}else if(d06> 6/6*3 && d06 <= 6/6*4) {
								return 4;
								
						}else if(d06> 6/6*4 && d06 <= 6/6*5) {
								return 5;
							
						}else{
								return 6;


}
}
	
public static int roll_d08() {
	
	// D08 de RPG

		double d08 = (int)((Math.random()*8));									

	//Método de Jogar o D08
				
				if(d08>0 && d08 <= 8/8*1) {
						return 1;
				
				}else if(d08> 8/8*1 && d08 <= 8/8*2) {
						return 2;
				
				}else if(d08> 8/8*2 && d08 <= 8/8*3) {
						return 3;
						
				}else if(d08> 8/8*3 && d08 <= 8/8*4) {
						return 4;
						
				}else if(d08> 8/8*4 && d08 <= 8/8*5) {
						return 5;
						
				}else if(d08> 8/8*5 && d08 <= 8/8*6) {
						return 6;
				
				}else if(d08> 8/8*6 && d08 <= 8/8*7) {
						return 7;
					
				}else{
					return 8;

	}
}

public static int roll_d10() {
	
	// D10 de RPG

			double d10 = (int)((Math.random()*10));									

		//Método de Jogar o D10
					
					if(d10>0 && d10 <= 10/10*1) {
							return 1;
					
					}else if(d10> 10/10*1 && d10 <= 10/10*2) {
							return 2;
					
					}else if(d10> 10/10*1 && d10 <= 10/10*2) {
							return 2;
							
					}else if(d10> 10/10*1 && d10 <= 10/10*2) {
							return 2;
							
					}else if(d10> 10/10*1 && d10 <= 10/10*2) {
							return 2;
							
					}else if(d10> 10/10*1 && d10 <= 10/10*2) {
							return 2;
					
					}else if(d10> 10/10*1 && d10 <= 10/10*2) {
							return 2;
						
					}else{
						return 10;


		}
	
}

public static int roll_d12() {
	
	// D12 de RPG

	double d12 = (int)((Math.random()*12));									

//Método de Jogar o D12
			
			if(d12>0 && d12 <= 12/12*1) {
					return 1;
			
			}else if(d12> 12/12*1 && d12 <= 12/12*2) {
					return 2;
			
			}else if(d12> 12/12*2 && d12 <= 12/12*3) {
					return 3;
					
			}else if(d12> 12/12*3 && d12 <= 12/12*4) {
					return 4;
					
			}else if(d12> 12/12*4 && d12 <= 12/12*5) {
					return 5;
					
			}else if(d12> 12/12*5 && d12 <= 12/12*6) {
					return 6;
			
			}else if(d12> 12/12*6 && d12 <= 12/12*7) {
					return 7;
			
			}else if(d12> 12/12*7 && d12 <= 12/12*8) {
					return 8;
			
			}else if(d12> 12/12*8 && d12 <= 12/12*9) {
					return 9;
					
			}else if(d12> 12/12*9 && d12 <= 12/12*10) {
					return 10;
					
			}else if(d12> 12/12*10 && d12 <= 12/12*11) {
					return 11;
					
			}else {
					return 12;
}
	
}

public static int roll_d20() {

	
	// D20 de RPG

	double d20 = (int)((Math.random()*20));									

//Método de Jogar o D20
			
			if(d20>0 && d20 <= 20/20*1) {
					return 1;
			
			}else if(d20> 20/20*1 && d20 <= 20/20*2) {
					return 2;
			
			}else if(d20> 20/20*2 && d20 <= 20/20*3) {
					return 3;
					
			}else if(d20> 20/20*3 && d20 <= 20/20*4) {
					return 4;
					
			}else if(d20> 20/20*4 && d20 <= 20/20*5) {
					return 5;
					
			}else if(d20> 20/20*5 && d20 <= 20/20*6) {
					return 6;
			
			}else if(d20> 20/20*6 && d20 <= 20/20*7) {
					return 7;
			
			}else if(d20> 20/20*7 && d20 <= 20/20*8) {
					return 8;
			
			}else if(d20> 20/20*8 && d20 <= 20/20*9) {
					return 9;
					
			}else if(d20> 20/20*9 && d20 <= 20/20*10) {
					return 10;
					
			}else if(d20> 20/20*10 && d20 <= 20/20*11) {
					return 11;
					
			}else if(d20> 20/20*11 && d20 <= 20/20*12) {
					return 12;
			
			}else if(d20> 20/20*12 && d20 <= 20/20*13) {
					return 13;
					
			}else if(d20> 20/20*13 && d20 <= 20/20*14) {
					return 14;
			
			}else if(d20> 20/20*14 && d20 <= 20/20*15) {
					return 15;
					
			}else if(d20> 20/20*15 && d20 <= 20/20*16) {
					return 16;
				
			}else if(d20> 20/20*16 && d20 <= 20/20*17) {
					return 17;
				
			}else if(d20> 20/20*17 && d20 <= 20/20*18) {
					return 18;
					
			}else if(d20> 20/20*18 && d20 <= 20/20*19) {
					return 19;
				
			}else {	
					return 20;

}
	
}

//Sistema de Atributos

public static void system_add_atributes() {

	// Método de Sistema de Preenchimento de Atributos	
		
		Scanner system_atributes = new Scanner(System.in);
		String enter_system_atributes = system_atributes.nextLine();
		
		// Sistemas de Atributos
		
			switch(enter_system_atributes) {
			
			case "1":
				
				int atribute_points = 72;
				
				// Força
				
				System.out.println("\nCerto, como foi dito previamente, temos "+atribute_points+" pontos para distribuir para seus atributos.\n");
				System.out.println("Digite quantos pontos você deseja pôr em Força:");
				
				Scanner enter_strength_atribute = new Scanner(System.in);
				int strength_atribute = enter_strength_atribute.nextInt();

				
				// Destreza
				
				System.out.println("Digite quantos pontos você deseja pôr em Destreza:");
				
				Scanner enter_dexterity_atribute = new Scanner(System.in);
				int dexterity_atribute = enter_dexterity_atribute.nextInt();	
				minus_dex(atribute_points,dexterity_atribute);
				
				// Constituição
				
				System.out.println("Digite quantos pontos você deseja pôr em Constituição:");
				
				Scanner enter_constitution_atribute = new Scanner(System.in);
				int constitution_atribute = enter_constitution_atribute.nextInt();
				minus_con(atribute_points,constitution_atribute);
				
				// Inteligência
				
				System.out.println("Digite quantos pontos você deseja pôr em Inteligência:");
				
				Scanner enter_intelligence_atribute = new Scanner(System.in);
				int intelligence_atribute = enter_intelligence_atribute.nextInt();
				minus_int(atribute_points,intelligence_atribute);
				
				// Sabedoria
				
				System.out.println("Digite quantos pontos você deseja pôr em Sabedoria:");
				
				Scanner enter_wisdom_atribute = new Scanner(System.in);
				int wisdom_atribute = enter_wisdom_atribute.nextInt();
				minus_wis(atribute_points,wisdom_atribute);
				
				// Carisma
				
				System.out.println("Digite quantos pontos você deseja pôr em Carisma:");
				
				Scanner enter_charisma_atribute = new Scanner(System.in);
				int charisma_atribute = enter_charisma_atribute.nextInt();
				minus_cha(atribute_points,charisma_atribute);
				
			case "2":	
			}
			
			system_add_atributes();
		
		// Pontos de Habilidade
		
		Scanner value_ability_points = new Scanner(System.in);
		String enter_ability_points = value_ability_points.nextLine();
	}

	int atribute_points = 72;

	public int getMinus_str() { 
		
	int strength_atribute = 0;
	
	Scanner enter_str_atribute = new Scanner(System.in);
	
		int menos_str = atribute_points - strength_atribute;
			System.out.println("\nVocê ainda terá "+menos_str+" pontos para distribuir\n");
				int remaining_points_str = menos_str;
				return remaining_points_str;
	}

	public static void minus_dex(int remaining_points_str, int dexterity_atribute) {
		int menos_2 = remaining_points_str - dexterity_atribute;
			System.out.println("\nVocê ainda terá "+menos_2+" pontos para distribuir\n");
	}

	public static void minus_con(int atribute_points, int constitution_atribute) {
		int menos = atribute_points - constitution_atribute;
			System.out.println("\nVocê ainda terá "+menos+" pontos para distribuir\n");
	}

	public static void minus_int(int atribute_points, int intelligence_atribute) {
		int menos = atribute_points - intelligence_atribute;
			System.out.println("\nVocê ainda terá "+menos+" pontos para distribuir\n");
	}

	public static void minus_wis(int atribute_points, int wisdom_atribute) {
		int menos = atribute_points - wisdom_atribute;
			System.out.println("\nVocê ainda terá "+menos+" pontos para distribuir\n");
	}

	public static void minus_cha(int atribute_points, int charisma_atribute) {
		int menos = atribute_points - charisma_atribute;
			System.out.println("\nVocê ainda terá "+menos+" pontos para distribuir\n");
	}

//Sistema de Modificadores de Atributos

public static void list_mod_str() {
	
}

public static void list_mod_dex() {
	
}

public static void list_mod_con() {
	
}

public static void list_mod_int() {
	
}

public static void list_mod_wis() {
	
}

public static void list_mod_cha() {
	
}
}
