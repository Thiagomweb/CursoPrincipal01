package CursoDev.javacore.Gassocicao.test;

import CursoDev.javacore.Gassocicao.domain.Escola;
import CursoDev.javacore.Gassocicao.domain.Professor;
public class EscolaTest01 {
    public static void main(String[] args) {
       Professor professor = new Professor("Escola: Dev Dojo");
              Professor [] professores = {professor};
       Escola escola = new Escola ("Professor: Willian Suane" , professores);
       escola.imprime();

    }
}
