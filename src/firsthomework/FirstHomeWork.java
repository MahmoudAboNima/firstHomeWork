/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsthomework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author pc
 */
public class FirstHomeWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        ITStudent s1 = new ITStudent("Mahmoud", 1, 30, 40, 30);
        ITStudent s2 = new ITStudent("Ahmed", 2, 20, 38, 28);
        ITStudent s3 = new ITStudent("Nizar", 3, 27, 33, 22);

        ArtStudent s4 = new ArtStudent("joe", 4, 40, 50, 10);
        ArtStudent s5 = new ArtStudent("Huda", 5, 33, 48, 7);
        ArtStudent s6 = new ArtStudent("Soha", 6, 36, 42, 9);

        Student[] std = {s1, s2, s3, s4, s5, s6};
        for (int j = 0; j < std.length; j++) {
              for (int i = 0; i < std.length - 1; i++) {
                if (std[i + 1].getGrade() > std[i].getGrade()) {
                    Student temp = std[i];
                    std[i] = std[i + 1];
                    std[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i].getGrade());
        }


        File file = new File("Student.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        for (Student student : std) {
            pw.println(student);
        }
        pw.close();
        fw.close();
    }

}
