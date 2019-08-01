package br.com.egerton.controller;

import br.com.egerton.service.StudentEnrollmentService;

/**
 *
 * @author egerton.12871
 */
public class StudentEnrollmentController {

    public static void gerar(String dirArquivo) {
        StudentEnrollmentService.gerar(dirArquivo);
    }
}
