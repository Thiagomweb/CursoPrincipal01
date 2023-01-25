package CursoDev.javacore.Fmodificadorestatico.domain;

import org.w3c.dom.ls.LSOutput;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memoria para objrto
    // 2 = Cada atributo de classe e criado e inicializado  com valores default ou que for passada
    // 3 - Bloco de inicialização e executado
    // 4 - Construtor é executado

    static {
        System.out.println("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < 100; i++) {
            episodios[i] = i + 1;

        }
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
