package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio05 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Double media = numeros
                .stream()
                .filter(n -> n > 5)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);

        System.out.println("A média é de: " + media);
        }
    }

