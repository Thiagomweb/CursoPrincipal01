package CursoDev.javacore.Hheranca.test;

import CursoDev.javacore.Hheranca.domain.Endereco;
import CursoDev.javacore.Hheranca.domain.Funcionario;
import CursoDev.javacore.Hheranca.domain.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("rua 16");
        endereco.setCep("72115020");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Thiago moreira");
        pessoa.setCpf(121212121);
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("_________________________________________");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("marcos");
        funcionario.getSalario(2000);
        funcionario.setCpf(1212121);
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);
        funcionario.imprime();


    }
}
