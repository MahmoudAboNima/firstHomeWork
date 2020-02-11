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
public class ITStudent extends Student {

    private int mid;
    private int Final;
    private int project;

    public ITStudent(String name, int id, int mid, int Final, int project) {
        super(name, id);
        this.mid = mid;
        this.Final = Final;
        this.project = project;
        this.setGrade(mid * 0.30 + project * 0.30 + Final * 0.40);
    }
}
