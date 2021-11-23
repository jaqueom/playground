package excecoes;

public class ProgramaExcecoes extends RuntimeException{
    //this é da própria classe
    //super é da classe pai
    public ProgramaExcecoes(String mensagem){
        super(mensagem);
    }

}
