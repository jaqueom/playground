package exerciciosEnum;

public class ListarEnums {

    public static void main(String[] args) {
        TipoPessoa[] tiposPessoa = TipoPessoa.values();
        for (int i = 0; i < tiposPessoa.length; i++) {
            TipoPessoa tipo = tiposPessoa[i];
            System.out.println("Tipos de pessoa: " + tipo.name());
        }

    }

}
