package br.com.egerton.service;

import br.com.egerton.dao.TeacherDao;
import br.com.egerton.model.RetornoSQL;
import br.com.egerton.util.ArquivoUtils;
import br.com.egerton.util.CSVUtils;
import br.com.egerton.util.Log;

/**
 *
 * @author egerton.12871
 */
public class TeacherService {

    public static void gerar(String dirArquivo) {

        RetornoSQL retorno = TeacherDao.consulta();

        if (retorno.isSucesso()) {
            String textoArquivo = CSVUtils.gerar(retorno);
            ArquivoUtils arquivo = ArquivoUtils.escrever(dirArquivo, textoArquivo, false);
            if (arquivo.isSucesso()) {
                Log.info("SUCESSO AO ESCREVER ARQUIVO " + dirArquivo);
            } else {
                Log.erro("FALHA AO ESCREVER ARQUIVO " + dirArquivo + "\n" + arquivo.getMensagem());
            }
        } else {
            Log.erro("ERRO PARA CONSULTAR: " + dirArquivo + "\n" + retorno.getMensagem());
        }
    }
}
