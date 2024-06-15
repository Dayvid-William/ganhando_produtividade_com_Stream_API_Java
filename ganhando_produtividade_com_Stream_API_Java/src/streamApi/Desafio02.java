package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somarPares = numeros.stream()// chama o stream API
                .filter(n -> n % 2 == 0) // Filtra os numeros pares
                .mapToInt(Integer::intValue) // Converte de Integer para int para poder somar
                .sum(); // soma

        System.out.println(somarPares); // imprime o resultado
    }
}
