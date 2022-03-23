package class1vector;

public class Aluno {
    public String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getName() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return outro.getName().equals(this.nome);
    }

    @Override
    public String toString() {
        return nome;
    }

}
