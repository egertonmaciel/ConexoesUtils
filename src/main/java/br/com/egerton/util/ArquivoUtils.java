package br.com.egerton.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.ArrayList;

/**
 *
 * @author Egerton Maciel
 */
public class ArquivoUtils {

    
    private boolean sucesso;
    private String mensagem;
    private ArrayList<String> linhas;
    private final static String ENCODING_PADRAO = "UTF-8";

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public ArrayList<String> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<String> linhas) {
        this.linhas = linhas;
    }

    public static ArquivoUtils escrever(String caminhoArquivo, String texto, boolean incrementar) {
        return escrever(caminhoArquivo, texto, incrementar, ENCODING_PADRAO);
    }

    public static ArquivoUtils escrever(String caminhoArquivo, String texto, boolean incrementar, String encoding) {
        ArquivoUtils arquivo = new ArquivoUtils();
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(caminhoArquivo), incrementar), encoding));
            writer.write(texto);
            writer.flush();
            writer.close();
            arquivo.setSucesso(true);
            arquivo.setMensagem("Sucesso");
        } catch (IOException ex) {
            arquivo.setSucesso(false);
            arquivo.setMensagem("Erro escrever arquivo " + caminhoArquivo + "\n" + ex);
        }
        return arquivo;
    }

    public static ArquivoUtils ler(String caminhoArquivo, boolean ignorarPrimeiraLinha) {
        return ler(caminhoArquivo, ignorarPrimeiraLinha, ENCODING_PADRAO);
    }

    public static ArquivoUtils ler(String caminhoArquivo, boolean ignorarPrimeiraLinha, String encoding) {
        ArquivoUtils arquivo = new ArquivoUtils();
        String linhaArquivo;
        InputStream fileStream;
        BufferedReader bufferedReader;
        ArrayList<String> listaLinhaArquivo;
        linhaArquivo = "";
        listaLinhaArquivo = new ArrayList();

        try {

            fileStream = new FileInputStream(caminhoArquivo);
            Reader fileReader = new InputStreamReader(fileStream, encoding);
            bufferedReader = new BufferedReader(fileReader);
            boolean cabecalho = ignorarPrimeiraLinha;
            while ((linhaArquivo = bufferedReader.readLine()) != null) {
                if (!cabecalho) {
                    listaLinhaArquivo.add(linhaArquivo);
                }
                cabecalho = false;
            }
            fileReader.close();
            bufferedReader.close();

            arquivo.setLinhas(listaLinhaArquivo);
            arquivo.setSucesso(true);
            arquivo.setMensagem("Sucesso");

        } catch (IOException e) {
            arquivo.setLinhas(null);
            arquivo.setSucesso(false);
            arquivo.setMensagem("Erro ler arquivo " + caminhoArquivo + "\n" + e);
        }
        return arquivo;
    }

}
