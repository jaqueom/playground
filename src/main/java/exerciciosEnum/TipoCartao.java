package exerciciosEnum;

public enum TipoCartao {
    STANDARD('S',1000F),
    GOLD( 'G',  3000F),
    PREMIUM( 'P',  10000F),
    BLACK( 'B',  0F);

    private char siglaArmazenada;
    private float valorLimiteArmazenado;

    TipoCartao(char sigla, float valorLimite){
        siglaArmazenada = sigla;
        valorLimiteArmazenado = valorLimite;
    }

    public char getSigla(){
        return siglaArmazenada;
    }
    public float getValorLimite(){
        return valorLimiteArmazenado;
    }
}
