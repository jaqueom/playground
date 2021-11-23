package exemplostream;

import java.util.Arrays;
import java.util.List;

public class ExemplosStream {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Pedro", "Fabio");
        nomes.stream()
                .filter(nome -> nome.contains("a")) // começou com todos, sobrou só Fabio
                .map(nome -> new Pessoa(nome)) // Começou com string e saiu pessoa
                .map(pessoa -> pessoa.getNome()) // Começou com pessoa e saiu o nome
                .map(nome -> nome.toUpperCase())// Começou com nome e saiu o nome upper
                .peek(nome -> System.out.println(nome)) // log
                .sorted()
                .count();
    }
}

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}


