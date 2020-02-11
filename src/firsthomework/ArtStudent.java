/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsthomework;

/**
 *
 * @author pc
 */
public class ArtStudent extends Student {

    private int mid;
    private int Final;
    private int report;

    public ArtStudent(String name, int id, int mid, int Final, int report) {
        super(name, id);
        this.mid = mid;
        this.Final = Final;
        this.report = report;
        this.setGrade(mid * 0.40 + report * 0.10 + Final * 0.50);

    }
}
