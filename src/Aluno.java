import java.util.Objects;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo.");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "Aluno {" +
                "nome='" + nome + '\'' +
                ", Numero Matricula = " + numeroMatricula +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Aluno a = (Aluno) obj;
        return this.nome.equals(((Aluno) obj).getNome());
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

}
