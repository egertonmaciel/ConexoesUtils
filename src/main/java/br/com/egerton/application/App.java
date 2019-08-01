package br.com.egerton.application;

import br.com.egerton.controller.SchoolController;
import br.com.egerton.controller.SectionController;
import br.com.egerton.controller.StudentController;
import br.com.egerton.controller.StudentEnrollmentController;
import br.com.egerton.controller.TeacherController;
import br.com.egerton.controller.TeacherRosterController;
import br.com.egerton.util.Log;

/**
 *
 * @author Egerton Maciel
 */
public class App {

    String dirRaiz = "C:\\Users\\egerton.12871\\Desktop\\SOPHIA\\ARQUIVOS\\";

    public App() {
        StudentController.gerar(dirRaiz + "Student.csv");
        TeacherController.gerar(dirRaiz + "Teacher.csv");
        SchoolController.gerar(dirRaiz + "School.csv");
        SectionController.gerar(dirRaiz + "Section.csv");
        StudentEnrollmentController.gerar(dirRaiz + "StudentEnrollment.csv");
        TeacherRosterController.gerar(dirRaiz + "TeacherRoster.csv");
    }

    public static void main(String[] args) {
        Log.info("APLICAÇÃO INICIADA");
        new App();
        Log.info("APLICAÇÃO FINALIZADA");
    }
}
