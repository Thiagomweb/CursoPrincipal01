package CursoDev.javacore.Bintroducaometodos.test;

import CursoDev.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("dentro da calculadora Test");
        System.out.println("Num1 " + num1);
        System.out.println("Num1 " + num2);


    }
}
