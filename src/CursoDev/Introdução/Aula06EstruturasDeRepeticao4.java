package CursoDev.Introdução;

public class Aula06EstruturasDeRepeticao4 {
    // Dado um valor de carro, descubra quantas vezes ele pode ser parcelado;
    // Condição, e que o valor da párcela tem que ser maior ou igual 1000.

    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
