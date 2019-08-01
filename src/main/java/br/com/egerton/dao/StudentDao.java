package br.com.egerton.dao;

import br.com.egerton.connection.Conexao;
import br.com.egerton.connection.ConexaoSophia;
import br.com.egerton.model.RetornoSQL;
import br.com.egerton.util.PropSqlUtils;

/**
 *
 * @author egerton.12871
 */
public class StudentDao {

    private static final String SELECT = PropSqlUtils.get("student.select");

    public static RetornoSQL consulta() {

        Conexao conexao = new ConexaoSophia();
        RetornoSQL retorno = conexao.select(SELECT);

        return retorno;
    }
}
