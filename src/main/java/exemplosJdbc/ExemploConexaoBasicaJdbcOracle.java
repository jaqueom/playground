package exemplosJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExemploConexaoBasicaJdbcOracle {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Verifica se a classe Driver do Oracle está disponível no classpath
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //Obtem a conexão
        String urlConexao = "jdbc:oracle://dtb1admindb024d.des.sicredi.net:1521/enquadradorpdb";
        Connection connection = DriverManager.getConnection(urlConexao, "enquadrador_run", "enquadrador_run");

        System.out.println("ok!");
        connection.close();

    }
}
