package CursoDev.javacore.CSobrecargaMetodos.test;

import CursoDev.javacore.CSobrecargaMetodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("thiago", "TV", 12, "ação");
        anime.imprime();
    }
}

