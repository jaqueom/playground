package exerciciosEnumComplexos;
/*
1. Crie um enum que represente o Tipo de Operacao e o IOF Mínimo e IOF Máximo:

 - empréstimo e financiamento:  de 0,38% a 3,38% (EMPRESTIMOS_FINANCIAMENTO)
 - cartão de crédito:           fixa em 6,38%
 - seguro:                        20% até 25%
 - câmbio de moedas:            fixa em 1,1%

 2 - Solicitar ao usuário uma taxa de IOF.
 Percorrer os tipos de operações e listar todas que estiverem dentro da taxa proposta.
* */

import java.util.Scanner;

public class ExercicioIOFComArgumentos {
    public static void main(String[] args) {
        System.out.println("Informe uma taxa de IOF:");
        float taxaIOF = new Scanner(System.in).nextFloat();

        IOFsTipoOperacao[] iofsTipoOperacao = IOFsTipoOperacao.values();
        for (int i = 0; i < iofsTipoOperacao.length; i++) {
            if ((taxaIOF <= iofsTipoOperacao[i].getTaxaMinimaArmazenada()) // TODO corrigir: não está funcionando muito bem :(
                    && (taxaIOF >= iofsTipoOperacao[i].getTaxaMaximaArmazenada())) {
                IOFsTipoOperacao operacao = iofsTipoOperacao[i];
                System.out.println("Operação indicada: " + operacao.name()
                        + "\n Taxa mínima: " + operacao.getTaxaMinimaArmazenada()
                        + "\n Taxa máxima: " + operacao.getTaxaMaximaArmazenada());
                break;
            }
        }

    }
}

