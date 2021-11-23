package exerciciosEnumComplexos;

import java.util.Scanner;

/*
Exercício:

1 - Crie um novo enum ImpostoMedioProduto com as modalidades e atributos:

Pão Francês    16,86% - PAO_FRANCES, 16.86F
Arroz        17,24%
Feijão        17,24%
Fermento    38,48%
Pizza        36,54%
Manteiga    33,77%
Cerveja     42,69%
Vinho         69,73%

- Peça para o usuário informar o produto e devolva a taxa do mesmo.
* */
public class ExercicioEnumComplexo {
    public static void main(String[] args) {
        System.out.println("Informe um produto:");
        String produto = new Scanner(System.in).nextLine();
        ImpostoMedioProduto[] impostoProduto = ImpostoMedioProduto.values();

        for (int i = 0; i < impostoProduto.length; i++)
            if (impostoProduto[i].getProduto().equalsIgnoreCase(produto)) {
                ImpostoMedioProduto imposto = impostoProduto[i];
                System.out.println("Imposto para o produto " + imposto.getProduto() + " é " + imposto.getImpostoMedioProduto());
                break;
            }

    }
}
