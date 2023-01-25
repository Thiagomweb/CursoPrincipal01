package CursoDev.javacore.Aintroducaoclasses.test;

import CursoDev.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest02 {

    public class estudanteTest02 {
        public static void main(String[] args) {
            Estudante estudante = new Estudante();
            Estudante estudante2 = new Estudante();

            estudante2.nome = "marcos";

            System.out.println(estudante.idade);
            System.out.println(estudante.nome);
            System.out.println(estudante.sexo);

            System.out.println("______________________________________________");

            System.out.println(estudante2.idade);
            System.out.println(estudante2.nome);
            System.out.println(estudante2.sexo);

        }
    }
}