import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestaCursoComAluno {

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

        //cursoOne.getAlunos().forEach(a -> System.out.println(a.getNome() + " - " + a.getNumeroMatricula()));
        cursoOne.getAlunos().forEach(a -> System.out.println(a));

        System.out.println(aluno1.getNome() + " está matriculado: " + cursoOne.estaMatriculado(aluno1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);

        //Só retornarar true se haver a sobrescrição do metodo Hashcode (numero para tabela de espalhamento)
        System.out.println(turini.getNome() + " está matriculado: " + cursoOne.estaMatriculado(turini));

        //Os dois objetos são iguais devido a implementação do metodo Equals
        System.out.println(aluno1.equals(turini));

    }
}
