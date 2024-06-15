package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio07 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer segundoMaior = numeros.stream()
                .distinct()  // Remove duplicatas para garantir que não haja empates
                .sorted((a, b) -> b - a)  // Ordena em ordem decrescente
                .skip(1)  // Pula o primeiro elemento (maior número)
                .findFirst()  // Encontra o primeiro elemento restante (segundo maior)
                .orElse(null);  // Se não houver segundo maior, retorna null

        System.out.println(segundoMaior);
    }
}
