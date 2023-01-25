package CursoDev.javacore.Aintroducaoclasses.test;

import CursoDev.javacore.Aintroducaoclasses.domain.Professor;

public class professorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Thiago Moreira";
        professor.sexo = 'M';
        professor.idade = 42;

        System.out.println(professor.nome + " sexo " + professor.sexo + " idade " + professor.idade);

    }
}
