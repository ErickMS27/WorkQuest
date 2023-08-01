package workquest.storage;

import java.util.Scanner;

public class RPG_test_0_2 {

	public class FichaPersonagem {
	    // Atributos da ficha de personagem
	    private String nome;
	    private String classe;
	    private String raca;
	    private int nivel;
	    private int pontosVida;
	    
	    // Construtor da ficha de personagem
	    public FichaPersonagem() {
	        this.nome = "";
	        this.classe = "";
	        this.raca = "";
	        this.nivel = 0;
	        this.pontosVida = 0;
	    }
	    
	    // Métodos para preencher os atributos da ficha de personagem
	    public void preencherNome() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o nome do personagem: ");
	        this.nome = scanner.nextLine();
	    }
	    
	    public void preencherClasse() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite a classe do personagem: ");
	        this.classe = scanner.nextLine();
	    }
	    
	    public void preencherRaca() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite a raça do personagem: ");
	        this.raca = scanner.nextLine();
	    }
	    
	    public void preencherNivel() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o nível do personagem: ");
	        this.nivel = scanner.nextInt();
	    }
	    
	    public void preencherPontosVida() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite os pontos de vida do personagem: ");
	        this.pontosVida = scanner.nextInt();
	    }
	    
	    // Método para imprimir a ficha de personagem
	    public void imprimirFicha() {
	        System.out.println("Nome: " + this.nome);
	        System.out.println("Classe: " + this.classe);
	        System.out.println("Raça: " + this.raca);
	        System.out.println("Nível: " + this.nivel);
	        System.out.println("Pontos de vida: " + this.pontosVida);
	    }
	    
	}
	
}
