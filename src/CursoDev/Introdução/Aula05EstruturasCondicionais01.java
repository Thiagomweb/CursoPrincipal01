package CursoDev.Introdução;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 16;
        if (idade >= 18) {
            System.out.println("autorizado a comprar bebida alcólica");
        }
        System.out.println("Não e permitido a venda de brbida alcólica");


        int idade2 = 20;
        if (idade2 >= 18) ;
        boolean isAutorizadoAComprarbebidaAlcólica = idade2 >= 18;
        if (isAutorizadoAComprarbebidaAlcólica)
            System.out.println("autorizado a comprar bebida alcólica");

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        int idade3 = 17;
        boolean isAutorizadoAComprarbebida = idade3 >= 18;
        if (isAutorizadoAComprarbebida) {
            System.out.println("autorizado a comprar bebida alcólica");
        } else {
            System.out.println("nao autorizado a comprar bebida alcólica");

        }
    }
}
