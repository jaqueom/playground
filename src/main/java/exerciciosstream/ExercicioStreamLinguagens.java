package exerciciosstream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
- Crie um array com as seguintes linguagens:  Java, PHP, C#, JS, Scala, Java.
- Filtre somente as que contém "J"
- Imprima cada elemento (peek)
- Remova elementos duplicados
- Gere uma nova lista
 */
public class ExercicioStreamLinguagens {

    public static void main(String[] args) {

        List<String> linguagens = Stream.of("Java", "PHP", "C#", "JS", "Scala", "Java")
                .filter(l -> l.contains("J"))
                .peek(System.out::println)
                .distinct()
                .collect(Collectors.toList());

        linguagens.forEach(System.out::println);
    }
}