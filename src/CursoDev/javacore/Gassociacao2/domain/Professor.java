package CursoDev.javacore.Gassociacao2.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(Seminario[] seminario) {
        this.seminario = seminario;
    }
    public void imprime() {
        System.out.println("________________________________________________");
        System.out.println("Prodessor: " + this.nome);
        if (this.seminario == null) return;
        System.out.println("*** Seminários Cadastrados *** ");
        for(Seminario seminario : this.seminario) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereço());
            if (seminario.getAlunos() == null ) continue;
            System.out.println("Alunos ");
            for (Aluno aluno : seminario.getAlunos()){
                System.out.println("Aluno: " + aluno.getNome() + " idade: " + aluno.getIdade());
            }
        }





    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}

