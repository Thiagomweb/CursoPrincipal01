package CursoDev.Introdução;

public class Aula05EstruturasCondicionais06 {
    // Utilizando o switch, Dados o valores de 01 a 07 imprima se o dia é útil ou final de semana.
    // considerando 01 como domingo

    public static void main(String[] args) {
        byte dia = 5;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção invalida");
                break;

        }
    }

}
