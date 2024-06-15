package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio08 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer somarCaracteres = numeros
                .stream()
                .flatMapToInt(n -> Integer.toString(n).chars())//Transforma cada elemento da Stream<Integer> em uma IntStream uma stream de inteiros representando os caracteres dessa string.
                .map(Character::getNumericValue)//  Transforma cada elemento da IntStream anterior (chars()) em outro valor aplicando uma função.
                .sum(); //Terminal operation que calcula a soma de todos os elementos


        System.out.println(somarCaracteres);
    }
}