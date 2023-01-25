package CursoDev.javacore.Aintroducaoclasses.test;

import CursoDev.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.nome = "Civic";
        carro1.modelo = "Honda";
        carro1.ano = 2010;

        carro1 = carro2;

        carro2.nome = "Pegeout";
        carro2.modelo = "Panoramico";
        carro2.ano = 2015;

        System.out.println(carro1.nome + "    modelo " + carro1.modelo + "    ano " + carro1.ano );
        System.out.println("\n____________________________________________________________________");
        System.out.println("\n" + carro2.nome + "    modelo " + carro2.modelo + "    ano " + carro2.ano);

    }
}
