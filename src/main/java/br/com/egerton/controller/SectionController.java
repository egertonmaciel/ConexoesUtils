package br.com.egerton.controller;

import br.com.egerton.service.SectionService;

/**
 *
 * @author egerton.12871
 */
public class SectionController {

    public static void gerar(String dirArquivo) {
        SectionService.gerar(dirArquivo);
    }
}
