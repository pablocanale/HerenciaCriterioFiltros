package SortingHatHogwarts;

import EJercicio2P5.Criterions.CriterionAnd;
import EJercicio2P5.Student;

import java.util.ArrayList;

public class House {
    private String name;
    private House enemyHouse;

    private ArrayList<Student> Students;
    private int maxAmountOfStudents;

    public House(String name, House enemyHouse, ArrayList<Student> students, int maxAmountOfStudents) {
        this.name = name;
        this.enemyHouse = enemyHouse;
        Students = students;
        this.maxAmountOfStudents = maxAmountOfStudents;
    }

    public int getMaxAmountOfStudents() {
        return maxAmountOfStudents;
    }
    public ArrayList<Student> getStudents() {
        return Students;
    }


    public CriterionAnd getRequirements() {
        return requirements;
    }

}
