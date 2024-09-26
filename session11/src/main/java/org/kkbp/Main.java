package org.kkbp;

import org.kkbp.dao.StudentDAO;
import org.kkbp.models.Student;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Session 24/9/24");
        Student student1 = new Student("18020069", "Kendrick Kaleh", "Barrios Padilla", "kkbp@uamv.edu.ni", "88888888");
        Student student2 = new Student("23021200", "Diego Andres", "Martinez Castillo", "dmartinezc@uamv.edu.ni", "77777777");
        Student student3 = new Student("23010000", "Johan", "Reyes", "jreyes@uamv.edu.ni", "55555555");

        StudentDAO listEst = new StudentDAO();
        System.out.println("Adding students");
        listEst.create(student1);
        listEst.create(student2);
        listEst.create(student3);

        System.out.println("\nShowing students list");
        for (Student student: listEst.showList()) {
            System.out.println(student);
        }

        System.out.println("\nAdd another student");
        Student oscar = new Student("23000100", "Oscar Gabriel", "Calero Vega", "ogcalero@uamv.edu.ni", "44444444");
        listEst.create(oscar);
        
        System.out.println("\nShowing updated list");
        for (Student student: listEst.showList()) {
            System.out.println(student);
        }

        System.out.println("\nDeleting first student from the list");
        listEst.delete("18020069");
        for (Student student: listEst.showList()) {
            System.out.println(student);
        }
    }
}