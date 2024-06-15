package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio01 {
    public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    /*
    * List<Integer> sortedList = numeros.stream()
                                          .sorted()
                                          .collect(Collectors.toList());
    */

    numeros.stream() //chama o stream API
            .sorted() //Ordena os intens em ordem natural
            .forEach(System.out::println); // imprime a lista ordenada
    }
}
