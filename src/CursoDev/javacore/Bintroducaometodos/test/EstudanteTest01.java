package CursoDev.javacore.Bintroducaometodos.test;

import CursoDev.javacore.Bintroducaometodos.domain.Estudante;
import CursoDev.javacore.Bintroducaometodos.domain.ImpressoraEsudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEsudante impressora  = new ImpressoraEsudante();

        estudante01.nome = "thiago moreira";
        estudante01.idade = 42;
        estudante01.sexo = 'M';

        estudante02.nome = "thiago ";
        estudante02.idade = 40;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);



    }
}
