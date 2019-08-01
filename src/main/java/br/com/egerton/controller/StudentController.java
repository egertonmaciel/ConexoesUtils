package br.com.egerton.controller;

import br.com.egerton.service.StudentService;

/**
 *
 * @author egerton.12871
 */
public class StudentController {

    public static void gerar(String dirArquivo) {
        StudentService.gerar(dirArquivo);
    }
}
