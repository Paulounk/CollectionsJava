public class TestaBuscaAlunoNoCurso {
    public static void main(String[] args) {

        Curso cursoOne = new Curso("Dominando as coleções do Java", "Paulo Lopes");

        cursoOne.adiciona(new Aula("Trabalhando com ArrayList", 21));
        cursoOne.adiciona(new Aula("Criando uma Aula", 20));
        cursoOne.adiciona(new Aula("Modelando com coleções", 22));

        Aluno aluno1 = new Aluno("Rodrigo Turini", 34672);
        Aluno aluno2 = new Aluno("Guilherme Silveira", 5617);
        Aluno aluno3 = new Aluno("Mauricio Aniche", 17645);

        cursoOne.matricula(aluno1);
        cursoOne.matricula(aluno2);
        cursoOne.matricula(aluno3);

        Aluno aluno = cursoOne.buscaMatriculado(5617);
        System.out.println(aluno);

        cursoOne.getMatriculaParaAluno().keySet().forEach(e -> System.out.println(e));

    }
}
