import java.util.*;

public class Curso implements Comparable<Curso> {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>(); //LinkedHashSet (mantem a ordem de adição)
    private Map<Integer,Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public Map<Integer, Aluno> getMatriculaParaAluno() {
        return matriculaParaAluno;
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno1) {
        return this.alunos.contains(aluno1);
    }

    public Aluno buscaMatriculado(int numero) {

        if(!matriculaParaAluno.containsKey(numero)){
            throw new NoSuchElementException("Matricula " + numero + " não encontrada.");
        }
        return matriculaParaAluno.get(numero);

        /*for (Aluno aluno : alunos){
            if(aluno.getNumeroMatricula() == numero){
                return aluno;
            }
        }
        throw new NoSuchElementException("Matricula não encontrada " + numero);*/
    }

    @Override
    public String toString() {
        return "Curso {" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                '}';
    }

    @Override
    public int compareTo(Curso outroCurso) {
        return this.nome.compareTo(outroCurso.getNome());
    }


}