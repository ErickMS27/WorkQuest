package workquest.storage;

public class RPG_test_0_1 {

// Atributos

private String nome;

private int nivel;

private int pontosDeVida;

private int pontosDeMagia;

private int forca;

private int defesa;

// Construtor

public RPG_test_0_1(String nome, int nivel, int pontosDeVida, int pontosDeMagia, int forca, int defesa, int deslocamento) {

this.nome = nome;

this.nivel = nivel;

this.pontosDeVida = pontosDeVida;

this.pontosDeMagia = pontosDeMagia;

this.forca = forca;

this.defesa = defesa;

}

// Métodos

public void atacar(RPG_test_0_1 outroPersonagem) {

int dano = this.forca - outroPersonagem.defesa;

if (dano > 0) {

outroPersonagem.pontosDeVida -= dano;

System.out.println(this.nome + " atacou " + outroPersonagem.nome + " causando " + dano + " pontos de dano.");

} else {

System.out.println(this.nome + " atacou " + outroPersonagem.nome + " mas não causou nenhum dano.");

}

}

public void curar(int quantidadeDeCura) {

this.pontosDeVida += quantidadeDeCura;

System.out.println(this.nome + " foi curado em " + quantidadeDeCura + " pontos de vida.");

}

public void conjurarMagia(RPG_test_0_1 outroPersonagem, int custoDeMagia, int danoDaMagia) {

if (this.pontosDeMagia < custoDeMagia) {

System.out.println(this.nome + " não tem pontos de magia suficientes para conjurar essa magia.");

return;

}

int danoFinal = danoDaMagia - outroPersonagem.defesa;

if (danoFinal > 0) {

outroPersonagem.pontosDeVida -= danoFinal;

System.out.println(this.nome + " conjurou uma magia em " + outroPersonagem.nome + " causando " + danoFinal + " pontos de dano.");

} else {

System.out.println(this.nome + " conjurou uma magia em " + outroPersonagem.nome + " mas não causou nenhum dano.");

}

this.pontosDeMagia -= custoDeMagia;

}

// Getters e Setters

public String getNome() {

return nome;

}

public void setNome(String nome) {

this.nome = nome;

}

public int getNivel() {

return nivel;

}

public void setNivel(int nivel) {

this.nivel = nivel;

}

public int getPontosDeVida() {

return pontosDeVida;

}

public void setPontosDeVida(int pontosDeVida) {

this.pontosDeVida = pontosDeVida;

}

public int getPontosDeMagia() {

return pontosDeMagia;

}

public void setPontosDeMagia(int pontosDeMagia) {

this.pontosDeMagia = pontosDeMagia;

}

public static void main (String[] args) {

}

}