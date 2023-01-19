package CursoDev.Introdução;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte,  short,   int,   long,   float,  double  0
        // char '\u0000' ' '
        // boolean false
        //String  null

       // String[] nomes = new String[3];
       // System.out.println(nomes[0]);
       // System.out.println(nomes[1]);
       // System.out.println(nomes[2]);



        // codido abaixo feito só como exempolo didático.

        String[] nomes2 = new String[4]; // .length na discrição abaixo, posso mudar o valor da String e não precisa ser mudado no for
        nomes2[0] = "thiago";
        nomes2[1] = "fábio";
        nomes2[2] = "Carla";
        nomes2[3] = "Carlos";
        for (int i = 0; i < nomes2.length; i++) {
            System.out.println(nomes2[i]);

        }
    }
}
