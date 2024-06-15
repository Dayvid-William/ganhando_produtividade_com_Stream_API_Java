package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio03 {

    public static void main(String[] args) {

        /*
        boolean todosPositivos = numeros
            .stream()
            .reduce(true, (acc, n) -> acc && n > 0, (a, b) -> a && b);
         */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosPositivos = numeros
                .stream() //chama o stream API
                .allMatch(n -> n > 0); //Verifica se todos os números são maiores que 0

        System.out.println("Todos os números são positivos? " + todosPositivos);

    }
}
