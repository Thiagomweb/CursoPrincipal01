package CursoDev.Introdução;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //  idade < 15 imprima, categoria infantil
        //  idade >= 15 && < 18 imprima, categoria juvenil
        //  idade >= 18 imprima, categoria adulto

        int idade = 16;
        if (idade < 17) {
            System.out.println("categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("categoria juvenil");
        } else {
            System.out.println("categoria adulto");
            System.out.println("");

            // codigo com exemplo de String (mais limpo) 'so como exemplo sem funçao de copilação'


            String categoria;
            if (idade < 15) {
                categoria = "categoria infantil";
            } else if (idade >= 15 && idade < 18) {
                categoria = "categoria juvenil";
            } else {
                categoria = "categoria adulto";
            }
            System.out.println(categoria);

        }

    }

}

