package exerciciosEnum;

/*
1. Crie um enum modulo03.enums.exerciciosimples.TipoCartao com as modalidades:
- STANDARD
- GOLD
- PREMIUM
- BLACK

1. Crie um método que Listar os tipos de cartões disponíveis e
    solicitar ao usuário para informar um tipo de cartão
    e a partir do informado,
    identificar se é um tipo de cartão válido.

2. Crie um novo método que solicita a rendaMensal
e devolve o tipo de cartão de uma financeira
de acordo com a rendaMensal:

STANDARD:   rendaMensal < 1000
GOLD:       rendaMensal >= 1000 e < 3000
PREMIUM:    rendaMensal >= 3000 e < 10000
BLACK:      rendaMensal >= 10000
* */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEnumTipoCartao {
/*
    public static void main(String[] args) {
        TipoCartao[] tiposCartao = TipoCartao.values();

        escreveListaDeTipoCartao(tiposCartao);
        perguntaTipoCartaoUsuarioEVerificaSeExisteNaListaDeTipos();
        verificaTipoDeCartaoAtravesDaRendaMensal();
    }

    private static void perguntaTipoCartaoUsuarioEVerificaSeExisteNaListaDeTipos() {
        System.out.println("Informe o seu tipo de cartão:");
        TipoCartao tipoCartaoUsuario = TipoCartao.valueOf(new Scanner(System.in).nextLine().toUpperCase()); //VERIFICA SE VALOR INFORMADO ESTÁ NO ENUM
    }

 */

    private static void verificaTipoDeCartaoAtravesDaRendaMensal() {
        /*
            STANDARD:   rendaMensal < 1000
            GOLD:       rendaMensal >= 1000 e < 3000
            PREMIUM:    rendaMensal >= 3000 e < 10000
            BLACK:      rendaMensal >= 10000
        */
        System.out.println("Informe sua renda mensal:");
        int rendaMensal = new Scanner(System.in).nextInt();
        if (rendaMensal < 1000) {
            System.out.println("Seu tipo de cartão é:" + TipoCartao.STANDARD.name());
        } else if (rendaMensal < 3000) {
            System.out.println("Seu tipo de cartão é:" + TipoCartao.GOLD.name());
        } else if (rendaMensal < 10000) {
            System.out.println("Seu tipo de cartão é:" + TipoCartao.PREMIUM.name());
        } else {
            System.out.println("Seu tipo de cartão é:" + TipoCartao.BLACK.name());
        }
    }

    private static void escreveListaDeTipoCartao(TipoCartao[] tiposCartao) {
        System.out.println("Tipos de cartão:");
        for (int i = 0; i < tiposCartao.length; i++) {
            TipoCartao tipo = tiposCartao[i];
            System.out.println(tiposCartao[i].name());
        }
    }

}
