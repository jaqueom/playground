package exercicioList;

import java.util.*;

/*
List:
- Crie uma coleção de Strings vazia chamada `pessoas`.
- Adicione os nomes: Bryana, Kiersten, Zaneta, Frank, Bryana, Tedi, Marigold, Devan, Jerrilyn, Isac, Kathrine.
- Imprima a lista completa.

Set:
- Crie uma nova coleção de Strings chamada `primeiros`.
    - Nesta nova lista, não pode haver repetição.
    - Deve estar ordenada.
    - Deve ter somente os primeiros 5 nomes.
- Imprima a lista de `primeiros`.
 */
public class ExercicioColecoes {
    public static void main(String[] args) {
        //Crie uma coleção de Strings vazia chamada 'pessoas'.
        List<String> pessoas = new ArrayList<>();
        adicionaNomesEimprime(pessoas);
        selecionaOs5PrimeirosEimprime(pessoas);
    }

    private static void selecionaOs5PrimeirosEimprime(List<String> pessoas) {
        //Crie uma nova coleção de Strings chamada 'primeiros'
        //Deve estar ordenada
        //Nesta nova lista, não pode haver repetição
        //Deve ter somente os primeiros 5 nomes
        Set<String> primeiros = new TreeSet<>(pessoas.subList(0,6));

        System.out.println("\nLista com Set:");
        for( String primeiro : primeiros){
            System.out.println(primeiro);
        }
    }

    private static void adicionaNomesEimprime(List<String> pessoas) {
        //Adicione os nomes: Bryana, Kiersten, Zaneta, Frank, Bryana, Tedi, Marigold, Devan, Jerrilyn, Isac, Kathrine.
        pessoas.add("Bryana");
        pessoas.add("Kiersten");
        pessoas.add("Zaneta");
        pessoas.add("Frank");
        pessoas.add("Bryana");
        pessoas.add("Tedi");
        pessoas.add("Marigold");
        pessoas.add("Devan");
        pessoas.add("Jerrilyn");
        pessoas.add("Isac");
        pessoas.add("Kathrine");
        //Imprima a lista completa
        System.out.println("Lista com ArrayList:");
        for( String pessoa : pessoas){
            System.out.println(pessoa);
        }
    }


}