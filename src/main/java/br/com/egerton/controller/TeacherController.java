package br.com.egerton.controller;

import br.com.egerton.service.TeacherService;

/**
 *
 * @author egerton.12871
 */
public class TeacherController {

    public static void gerar(String dirArquivo) {
        TeacherService.gerar(dirArquivo);
    }
}
