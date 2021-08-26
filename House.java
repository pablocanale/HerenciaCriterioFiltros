package SortingHatHogwarts;


import SortingHatHogwarts.Criterions.CriterionAnd;


import java.util.ArrayList;

public class House {
    private String name;
    private House enemyHouse;
    private CriterionAnd requirements;
    private ArrayList<Student> Students;
    private int maxAmountOfStudents;

    public House(String name, House enemyHouse, CriterionAnd criterion, ArrayList<Student> students, int maxAmountOfStudents) {
        this.requirements = criterion;
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
