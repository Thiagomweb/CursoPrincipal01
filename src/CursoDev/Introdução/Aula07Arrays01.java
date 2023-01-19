package CursoDev.Introdução;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 10;
        idades[1] = 20;
        idades[2] = 30;
    //  idades[3] = 40;  Não existe espaço alocado, vai da erro.
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
