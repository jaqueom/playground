package exerciciosEnumComplexos;

/*
Pão Francês    16,86% - PAO_FRANCES, 16.86F
Arroz          17,24%
Feijão         17,24%
Fermento       38,48%
Pizza          36,54%
Manteiga       33,77%
Cerveja        42,69%
Vinho          69,73%
*/
public enum ImpostoMedioProduto {
    PAO_FRANCES("PÃO FRANCÊS", 16.86F),
    ARROZ("ARROZ", 17.24F),
    FEIJAO("FEIJÃO",17.24F),
    FERMENTO("FERMENTO",38.48F),
    PIZZA("PIZZA",36.54F),
    MANTEIGA("MANTEIGA",33.77F),
    CERVEJA("CERVEJA",42.69F),
    VINHO("VINHO",69.73F);

    private float imposto;
    private String produto;

    ImpostoMedioProduto(String descricao, float imposto) {
        this.imposto = imposto;
        produto = descricao;
    }

    public float getImpostoMedioProduto() {
        return imposto;
    }

    public String getProduto(){
        return produto;
    }
}
