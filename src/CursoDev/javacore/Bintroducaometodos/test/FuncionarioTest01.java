package CursoDev.javacore.Bintroducaometodos.test;

import CursoDev.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Thiago moreira");
        funcionario.setIdade(42);
        funcionario.setSalarios(new double[]{2500, 4500, 2000});
        funcionario.imprime();
        System.out.println("media " + funcionario.getMedia());

    }
}
