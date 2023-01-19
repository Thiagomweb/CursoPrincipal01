package CursoDev.javacore.introducaoclasses.test;

import CursoDev.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante  = new Estudante();
        estudante.nome = "thiago";
        estudante.idade = 42;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
