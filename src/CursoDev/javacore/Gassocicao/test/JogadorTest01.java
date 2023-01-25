package CursoDev.javacore.Gassocicao.test;

import CursoDev.javacore.Gassocicao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Romário");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Messi");
        Jogador jogador4 = new Jogador("Zico");
        Jogador [] jogadores =  { jogador1, jogador2,jogador3,jogador4};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
