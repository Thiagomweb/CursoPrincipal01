package CursoDev.javacore.Gassocicao.test;

import CursoDev.javacore.Gassocicao.domain.Jogador;
import CursoDev.javacore.Gassocicao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Time time = new Time("Brasil");
        jogador1.imprime();
        jogador1.setTime(time);
    }
}
