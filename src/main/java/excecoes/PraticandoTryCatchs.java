package m14heranca.excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLDataException;

//1 - Trate as exceções a seguir:
public class PraticandoTryCatchs {

    //Não altere esse método, somente dentro dos métodos internos
    public static void main(String args[]) {
        excecoesNumericas();
        nullPointerException();
        indexOfBounds();
        arquivoInexistente();
        erroDeConversao();
        argumentoObrigatorio();
        multiplasExcecoes();
    }

    private static void erroDeConversao() {
        int num = 0;
        num = Integer.parseInt("zero");
    }

    private static void arquivoInexistente() {

        //Estou apenas "definindo" qual arquivo vou abrir
        File file = new File("E://arquivo.txt");

        //Try-with-resources que chama o .close() que pode disparar o IOException!
        // ... e o new FileReader(file) pode disparar FileNotFoundException

        try {
            FileReader fr = new FileReader(file);
            fr.close();
        } catch (Exception e) {
            System.out.println("Erro em: arquivoInexistente");
            //e.printStackTrace();
        }
    }

    private static void indexOfBounds() {
        String e = "Imersao Java";
        if (e.length() > 29) {
            char f = e.charAt(29);
            System.out.println(e);
        }else {
            System.out.println("Erro em: indexOfBounds");
        }
    }

    private static void nullPointerException() {
        try{
            String d = null;
            System.out.println(d.charAt(0));
        }catch (NullPointerException e){
            System.out.println("Erro em: nullPointerException");
        }

    }

    private static void excecoesNumericas() {
        try {
            int a = 30, b = 0, c = 0;
            c = a / b;
            System.out.println("Resultado = " + c);
        } catch (ArithmeticException arithmeticException){
            System.out.println("Erro em: excecoesNumericas");
        }
    }

    private static void argumentoObrigatorio(){
        metodoDisparaIllegal();
    }

    private static void multiplasExcecoes() {
        //trate com vários catchs separados
        try {
            metodoDisparaSql();
        } catch (SQLDataException e) {
            System.out.println("Erro em: multiplasExcecoes - SQLDataException");
            //e.printStackTrace();
        }
        try {
            metodoDisparaIOException();
        } catch (IOException e) {
            System.out.println("Erro em: multiplasExcecoes - IOException");
            //e.printStackTrace();
        }
    }

    private static void multiplasExcecoesMultiCatch()  {
        //trate com apenas um multi-catch
        try {
            metodoDisparaSql();
            metodoDisparaIOException();
        } catch (SQLDataException | IOException e) {
            System.out.println("Erro em: multiplasExcecoesMultiCatch - SQLDataException ou IOException");
            //e.printStackTrace();
        }

    }

    //Não altere esse método, somente quem o chama
    private static void metodoDisparaIllegal() {
        throw new IllegalArgumentException();
    }

    //Não altere esse método, somente quem o chama
    private static void metodoDisparaIOException() throws IOException {
        throw new IOException();
    }

    //Não altere esse método, somente quem o chama
    private static void metodoDisparaSql() throws SQLDataException {
        throw new SQLDataException();
    }
}