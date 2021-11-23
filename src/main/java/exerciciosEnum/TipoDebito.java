package exerciciosEnum;

enum TipoDeDebito {
    SAQUE('S', 1, 0F),
    CREDITO('C', 2, 8.5F),
    DEBITO('D', 3, 1F);

    //Deixo os atributos privados
    // e exponho através de métodos
    private char siglaArmazenada;
    private int ordemArmazenada;
    private float taxaArmazenada;

    TipoDeDebito(char sigla, int ordem, float taxa){
        siglaArmazenada = sigla;
        ordemArmazenada = ordem;
        taxaArmazenada = taxa;
    }

    public char getSigla(){
        return siglaArmazenada;
    }

    public int getOrdem(){
        return ordemArmazenada;
    }

    public float getTaxa(){
        return taxaArmazenada;
    }
}
