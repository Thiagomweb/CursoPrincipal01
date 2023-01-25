package CursoDev.javacore.DConstrutores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String studio;

    public Anime(String nome, String tipo, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;

    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.studio = estudio;
        System.out.println("dentro do consultor sem argumentos");

    }
    public Anime(){
        System.out.println("Fora do consultor");
    }

    public void init(String nome, String tipo, int episodios ) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.studio = studio;


    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;


    }
}
