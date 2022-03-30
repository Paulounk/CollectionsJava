package Listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestePerfomance {
    public static void main(String[] args) {

        Collection<Integer> numeros = new HashSet<>();

        long inicio = System.currentTimeMillis();

        long inicioAdd = System.currentTimeMillis();
        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        long fimAdd = System.currentTimeMillis();

        long inicioCont = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        long fimCont = System.currentTimeMillis();

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;
        long tempoAdd = fimCont - inicioCont;
        long tempoCont = fimAdd - inicioAdd;

        System.out.println("Tempo de inserção: " + tempoAdd);
        System.out.println("Tempo de busca: " + tempoCont);
        System.out.println("Tempo total processamento: " + tempoDeExecucao);

    }
}
