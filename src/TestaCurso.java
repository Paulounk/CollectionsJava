import java.util.*;

public class TestaCurso {

    public static void main(String[] args) {

        Curso cursos = new Curso("Dominando as coleções do Java", "Paulo Lopes");

        cursos.adiciona(new Aula("Trabalhando com ArrayList", 21));
        cursos.adiciona(new Aula("Criando uma Aula", 20));
        cursos.adiciona(new Aula("Modelando com coleções", 22));

        List<Aula> aulasImutaveis = cursos.getAulas();

        // Impossivel ordenar pois o getAulas() retorna uma lista imutavel
        // Collections.sort(aulas);

        //Fazendo um "clone" dos valores da lista imutavel para uma nova lista mutavel
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
        aulasMutaveis.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(cursos.getAulas() + ". Tempo Total: " + cursos.getTempoTotal());

        System.out.println(aulasMutaveis);

    }

}