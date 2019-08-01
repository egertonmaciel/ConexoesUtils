package br.com.egerton.connection;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author egerton.maciel
 */
public class ConexaoSophia extends Conexao {

    public ConexaoSophia() {
        USUARIO = "sa";
        SENHA = "";
        URL = "jdbc:sqlserver://130.10.0.109;databaseName=SophiA";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoSophia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
