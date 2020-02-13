package dicionario1;

import java.util.HashMap;
import java.util.Map;

public class Dicionário1 {
    public static void main(String[] args) {

        Map<Integer,String> mapa = new HashMap<>();

        mapa.put(0,"Ovos");
        mapa.put(1,"Água");
        mapa.put(2,"Escopeta");
        mapa.put(3,"Cavalo");
        mapa.put(4,"Dentista");
        mapa.put(5,"Fogo");

        for (Integer chave :mapa.keySet()) {
            String valor = mapa.get(chave);
            System.out.println(valor);

        }
    }
}
