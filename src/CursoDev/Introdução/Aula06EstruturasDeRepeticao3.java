package CursoDev.Introdução;

public class Aula06EstruturasDeRepeticao3 {
    //Imprima os primeiros 25 numeros de um dado valor, por exempol 50.

    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}