package CursoDev.javacore.Bintroducaometodos.test;

import CursoDev.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "thiago moreira";
        estudante01.idade = 42;
        estudante01.sexo = 'M';

        estudante02.nome = "thiago ";
        estudante02.idade = 40;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();


    }
}