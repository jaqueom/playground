package exemplosMap;

import java.util.HashMap;
import java.util.Map;

/*
Dadas as capitais:
    "RS", "Porto Alegre"
    "SC", "Florianópolis"
    "PR", "Curitiba"

- Criar map, sendo a chave o estado e o valor a capital.
- Obter a capital do "RS".
- Imprimir a lista de Capitais.
- Imprimir a lista de Estados.
- Imprimir a lista no formato: "Estado -> Capital"

- Explorar chave vazia, nula e duplicada.
 */
public class Exemplo1Map {

    public static void main(String[] args) {

        Map<String, String> capitais1 = Map.of(
                "RS", "Porto Alegre",
                "SC", "Florianópolis",
                "PR", "Curitiba");

        Map<Long, String> capitais = new HashMap<>();
        //capitais.put("RS", "Bagé"); // PUT substitui, enquanto o ADD sempre colocava no final da lista.
        capitais.put(1L, "Porto Alegre");
        capitais.put(2L, "Florianópolis");
        capitais.put(3L, "Curitiba");

        System.out.println("Percorrendo chaves:");
        for (Long sigla : capitais.keySet()){
            System.out.println(sigla);
        }

        System.out.println("Percorrendo valores:");
        for (String cidade : capitais.values()){
            System.out.println(cidade);
        }

        System.out.println("Percorrendo entries:");
        for (Map.Entry<Long, String> entry : capitais.entrySet()){
            System.out.printf("Sigla: %s - Cidade: %s \n", entry.getKey(), entry.getValue());
        }

        System.out.println("Capital do RS" +capitais.get(1L));

    }

}