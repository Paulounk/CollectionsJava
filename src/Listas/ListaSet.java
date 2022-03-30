package Listas;

import java.util.HashSet;
import java.util.Set;

public class ListaSet {
    public static void main(String[] args) {

        //Set não garante a ordem dos elementos, diferente do Listas.List
        //Set não permite elementos duplicados
        Set<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Turini");
        alunos.add("Albert Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Renan Saggio"); //Não é considerado pois é repetido
        alunos.add("Mauricio Aniche");

        System.out.println(alunos.size());

        boolean nicoEstaMatriculado = alunos.contains("Nico Steppat");
        System.out.println(nicoEstaMatriculado);

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunos);
    }
}
