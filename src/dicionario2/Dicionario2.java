package dicionario2;

import java.util.ArrayList;
import java.util.List;

public class Dicionario2 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

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
