package exerciciosEnumComplexos;

/*
 - empréstimo e financiamento:  de 0,38% a 3,38% (EMPRESTIMOS_FINANCIAMENTO)
 - cartão de crédito:           fixa em 6,38%
 - seguro:                        20% até 25%
 - câmbio de moedas:            fixa em 1,1%
* */
public enum IOFsTipoOperacao {
    EMPRESTIMOS_FINANCIAMENTO(0.38F, 3.38F),
    CARTAO_CREDITO(6.38F, 6.38F),
    SEGURO(20F, 25F),
    CAMBIO_MOEDAS(1.1F, 1.1F);

    private float taxaMinimaArmazenada;
    private float taxaMaximaArmazenada;

    IOFsTipoOperacao(float taxaMinima, float taxaMaxima) {
        taxaMinimaArmazenada = taxaMinima;
        taxaMaximaArmazenada = taxaMaxima;
    }

    public float getTaxaMinimaArmazenada() {
        return taxaMinimaArmazenada;
    }

    public float getTaxaMaximaArmazenada() {
        return taxaMaximaArmazenada;
    }
}
