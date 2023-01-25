package CursoDev.javacore.Fmodificadorestatico.teste;

import CursoDev.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("bmw ", 280 );
        Carro carro2 = new Carro(" mercedez ", 320);
        Carro carro3 = new Carro("posche ", 290);

        Carro.velocidadeLimite = 190;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
