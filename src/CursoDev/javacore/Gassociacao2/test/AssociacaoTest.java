package CursoDev.javacore.Gassociacao2.test;

import CursoDev.javacore.Gassociacao2.domain.Aluno;
import CursoDev.javacore.Gassociacao2.domain.Local;
import CursoDev.javacore.Gassociacao2.domain.Professor;
import CursoDev.javacore.Gassociacao2.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Taguatinga/Brasilia");
        Aluno aluno = new Aluno("Thiago moreira", 42);
        Professor professor = new Professor("Willian Suane", "Programação");
        Aluno[] AlunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Curso se Preogramação ", AlunosParaSeminario, local);

        Seminario[] SeminariosDisponiveis = {seminario};

        professor.setSeminario(SeminariosDisponiveis);

        professor.imprime();

    }
}
