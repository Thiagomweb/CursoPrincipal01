package CursoDev.javacore.Gassocicao.test;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Softwere de perguntas");
        System.out.println("Digite sua pergunta, respostas sim ou não");
        String pergunta = entrada.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println(" SIM ");
        }else {
            System.out.println("NÃO");
        }
    }
}
