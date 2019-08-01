package br.com.egerton.controller;

import br.com.egerton.service.SchoolService;

/**
 *
 * @author egerton.12871
 */
public class SchoolController {

    public static void gerar(String dirArquivo) {
        SchoolService.gerar(dirArquivo);
    }
}
