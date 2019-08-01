package br.com.egerton.controller;

import br.com.egerton.service.TeacherRosterService;

/**
 *
 * @author egerton.12871
 */
public class TeacherRosterController {

    public static void gerar(String dirArquivo) {
        TeacherRosterService.gerar(dirArquivo);
    }
}
