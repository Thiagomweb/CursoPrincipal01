package CursoDev.javacore.Eblocosinicialização.domain;

public class Anime {
   private String nome;
    private int[] episodios = {1, 2, 3, 4, 5, 6};

    // 1 - Alocado espaço em memoria para objrto
    // 2 = Cada atributo de classe e criado e inicializado  com valores default ou que for passada
    // 3 - Bloco de inicialização e executado
    // 4 - Construtor é executado


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < 100 ; i++) {
            episodios[i] = i+1;

        }
        for (int episodio : this.episodios) {
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
