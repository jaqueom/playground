package exercicioList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("PHP");
        linguagens.add("C#");
        linguagens.add("JS");
        linguagens.add("Scala");

        for (String ling : linguagens) {
            System.out.println(ling);
        }
        System.out.println("Tem PHP? " + linguagens.contains("PHP"));
        System.out.println("Primeiro elemento? " + linguagens.get(0));
        System.out.println("Posição Scala? " + linguagens.indexOf("Scala"));
        System.out.println("Lista ordenada: ");

        Collections.sort(linguagens);
        for (String ling : linguagens) {
            System.out.println(ling);
        }



    }
}
