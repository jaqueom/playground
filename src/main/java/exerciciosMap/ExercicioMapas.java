package exerciciosMap;

import java.util.*;

/*
- A partir da lista campeoesPorAno:
- Crie um mapa chamado `quantidadeTitulos` onde a chave é o país e o valor é a quantidade de vezes que foi campeão.
- Percorra a lista criada, adicionando ao Map conforme achar necessário.
- Imprima o país e a quantidade de copas. O ano pode ser ignorado.

Campeoes:
List<String> campeoesPorAno = new ArrayList<String>();
campeoesPorAno.add("1930 - Uruguai"); // Adicionar todos assim
1934 - Itália
1938 - Itália
1950 - Uruguai
1954 - Alemanha
1958 - Brasil
1962 - Brasil
1966 - Inglaterra
1970 - Brasil
1974 - Alemanha
1978 - Argentina
1982 - Itália
1986 - Argentina
1990 - Alemanha
1994 - Brasil
1998 - França
2002 - Brasil
2006 - Itália
2010 - Espanha
2014 - Alemanha
2018 - França
 */
public class ExercicioMapas {
    public static void main(String[] args) {
        Set<String> campeosPorAno = new LinkedHashSet<>();
        campeosPorAno.add("1934 - Itália");
        campeosPorAno.add("1938 - Itália");
        campeosPorAno.add("1950 - Uruguai");
        campeosPorAno.add("1954 - Alemanha");
        campeosPorAno.add("1958 - Brasil");
        campeosPorAno.add("1962 - Brasil");
        campeosPorAno.add("1966 - Inglaterra");
        campeosPorAno.add("1970 - Brasil");
        campeosPorAno.add("1974 - Alemanha");
        campeosPorAno.add("1978 - Argentina");
        campeosPorAno.add("1982 - Itália");
        campeosPorAno.add("1986 - Argentina");
        campeosPorAno.add("1990 - Alemanha");
        campeosPorAno.add("1994 - Brasil");
        campeosPorAno.add("1998 - França");
        campeosPorAno.add("2002 - Brasil");
        campeosPorAno.add("2006 - Itália");
        campeosPorAno.add("2010 - Espanha");
        campeosPorAno.add("2014 - Alemanha");
        campeosPorAno.add("2018 - França");

        Map<Integer, String> mapaDosCampeoesPorAno = new HashMap<>();
        //String[] campeoes = new String[2];
        for (String campeaoPorAno : campeosPorAno) {
            String[] campeoes = campeaoPorAno.split(" - ");
            mapaDosCampeoesPorAno.put(Integer.valueOf(campeoes[0]), campeoes[1]);
        }

        Map<String, Integer> quantidadeTitulosPorPais = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> mapaCampeaoAno : mapaDosCampeoesPorAno.entrySet()) {
            if (quantidadeTitulosPorPais.containsKey(mapaCampeaoAno.getValue())) {
                quantidadeTitulosPorPais.put(mapaCampeaoAno.getValue(), quantidadeTitulosPorPais.get(mapaCampeaoAno.getValue()) + 1);
            } else {
                quantidadeTitulosPorPais.put(mapaCampeaoAno.getValue(), 1);
            }
        }

        //TreeMap<String, Integer> quantidadeTitulosPorPaisOrdenado = new TreeMap<String, Integer>(quantidadeTitulosPorPais);

        quantidadeTitulosPorPais
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        /*
        for (Map.Entry<String, Integer> qntTitulosPorPais : quantidadeTitulosPorPaisOrdenado.entrySet()){
            System.out.printf("Pais: %s - Quantidade de títulos: %d \n", qntTitulosPorPais.getKey(), qntTitulosPorPais.getValue());
        }
         */
    }
}
