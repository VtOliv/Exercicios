package dicionario2;

import java.util.HashSet;
import java.util.Set;

public class Exemplo2 {
    public static void main(String[] args) {

        Set<Integer> lista = new HashSet<>();

        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);

        for (Integer integer : lista) {
            System.out.println(integer);

        }
    }
}
