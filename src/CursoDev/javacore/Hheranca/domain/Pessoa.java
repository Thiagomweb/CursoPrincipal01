package CursoDev.javacore.Hheranca.domain;

public class Pessoa {
    private String nome;
    private int cpf;
    private Endereco endereco;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }
        public Endereco getEndereco () {
            return endereco;
        }

        public void setEndereco (Endereco endereco){
            this.endereco = endereco;
        }

        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public int getCpf () {
            return cpf;
        }

        public void setCpf ( int cpf){
            this.cpf = cpf;
        }
    }
