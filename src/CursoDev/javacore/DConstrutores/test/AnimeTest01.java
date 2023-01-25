package CursoDev.javacore.DConstrutores.test;

import CursoDev.javacore.DConstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Thiago moreira", "TV ", 12,  "ação", "marvel" );
        //anime.init("thiago", "TV", 12, "ação");
        anime.imprime();
    }
}

