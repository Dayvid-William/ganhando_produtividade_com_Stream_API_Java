package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio09 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean VerificarDuplicata = numeros
                .stream()
                .collect(Collectors.toSet()) // Coleta os elementos da stream em um Set, garantindo que todos os elementos sejam únicos.
                .size() < numeros.size(); //Obtém o tamanho do conjunto criado.

        System.out.println("Existem números repetidos na lista? " + VerificarDuplicata);
    }
}
