package workquest;

import java.util.Random;

public class Test_WorkQuest {
	public static void main(String[] args) {
		// Instanciando um objeto da classe Random para gerar números aleatórios
		Random random = new Random();

		// Definindo o número de atributos e os valores máximos de cada atributo
		int numeroAtributos = 6;
		int valorMaximoAtributo = 18;

		// Gerando os valores dos atributos usando rolagem de dados
		int[] atributos = new int[numeroAtributos];
		for (int i = 0; i < numeroAtributos; i++) {
			int[] dados = new int[4];
			for (int j = 0; j < 4; j++) {
				dados[j] = random.nextInt(6) + 1; // Simula a rolagem de um dado de 6 faces
			}
			// Ordena os dados em ordem decrescente
			for (int j = 0; j < 3; j++) {
				for (int k = j + 1; k < 4; k++) {
					if (dados[k] > dados[j]) {
						int temp = dados[j];
						dados[j] = dados[k];
						dados[k] = temp;
					}
				}
			}
			// Soma os três maiores valores e atribui ao atributo
			atributos[i] = dados[0] + dados[1] + dados[2];
		}

		// Exibindo os valores dos atributos gerados
		for (int i = 0; i < numeroAtributos; i++) {
			System.out.println("Atributo " + (i + 1) + ": " + atributos[i]);

		}
	}
}