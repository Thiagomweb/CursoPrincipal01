package CursoDev.Introdução;

public class Aula04Operadores {

    //operadores   + - * /
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 + numero2;
        System.out.println(resultado);


        // % imprimindo o resto

        int resto = 21 % 7;
        System.out.println(resto);

        // < >  <=  >=   ==  !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIguaVinte = 10 == 20;
        boolean isDezIguaDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte" + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte" + isDezMenorQueVinte);
        System.out.println("isDezIguaVinte" + isDezIguaVinte);
        System.out.println("isDezIguaDez" + isDezIguaDez);
        System.out.println("isDezDiferenteVinte" + isDezDiferenteVinte);


        // Operadore lógicos   && (and)       || (or/ ou)      ! (not  negação)

        int idade = 35;
        float salario = 3500f;
        boolean isdentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        // Duas maneiras de imprimir no console

        // 1º maneira
        String resultado1 = isdentroDaLeiMaiorQueTrinta + " " + isDentroDaLeiMenorQueTrinta;
        System.out.println(resultado1);

        // 2º maneira
        System.out.println("isdentroDaLeiMaiorQueTrinta " + isdentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        System.out.println("");

        double valorTotalDaContaPoupanca = 300;
        double valorTotalDaContaCorrente = 10000;
        double valorPlayStation = 5000;
        boolean isplayStationCompravel = valorTotalDaContaCorrente > valorPlayStation
                || valorTotalDaContaPoupanca > valorPlayStation;

        System.out.println("playStationCompravel" + isplayStationCompravel);


        // =   +=   -=   /=   %=
        double bonus = 2000;
        bonus += 1800;
        bonus -= 1800;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //

        int contador =0;
        contador +=1;
        contador++;
        contador--;
        System.out.println(contador);
        ++contador;
        --contador;
        System.out.println(contador);



    }


}
