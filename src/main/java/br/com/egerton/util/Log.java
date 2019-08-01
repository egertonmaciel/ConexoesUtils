package br.com.egerton.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Egerton Maciel
 */
public class Log {

    private static final String ARQUIVO_LOG = PropSqlUtils.get("dirArquivo.log");

    private static final Date DATE = new Date();
    private static final SimpleDateFormat DIA = new SimpleDateFormat("yyyy_MM_dd");
    private static final SimpleDateFormat DATETIME = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static void info(String texto) {
        escrever("[INFO] " + texto);
    }

    public static void erro(String texto) {
        escrever("[ERRO] " + texto);
    }

    public static void alerta(String texto) {
        escrever("[ALERTA] " + texto);
    }

    private static void escrever(String texto) {
        String arquivo = ARQUIVO_LOG + DIA.format(DATE) + ".log";
        String hora = DATETIME.format(DATE);
        String textoFinal = hora + " " + texto + "\n";
        System.out.println("LOG: " + hora + " " + texto);
        ArquivoUtils log = ArquivoUtils.escrever(arquivo, textoFinal, true);
        if (!log.isSucesso()) {
            System.out.println("FALHA PARA ESCREVER LOG: " + log.getMensagem());
        }
    }

}
