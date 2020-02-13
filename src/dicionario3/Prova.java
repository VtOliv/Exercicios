package dicionario3;

import java.util.HashSet;
import java.util.Set;

public class Prova {
    public Prova() {

    }
    int resultado = 0;

    public void somaTotal(){
        Set<Integer> conjuntoDeInteiros = new HashSet<>();
        conjuntoDeInteiros.add(2);
        conjuntoDeInteiros.add(4);
        conjuntoDeInteiros.add(6);
        conjuntoDeInteiros.add(8);
        conjuntoDeInteiros.add(10);

        for (Integer valor :conjuntoDeInteiros) {
            this.resultado = resultado + valor;
        }
            System.out.println("A Soma dos Valores é "+ this.resultado);
    }
}
