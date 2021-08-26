package SortingHatHogwarts.Criterions;


import SortingHatHogwarts.Student;

import java.util.ArrayList;

public class CriterionFamily extends Criterion {

    private ArrayList<Student> houseStudents;

    public CriterionFamily(ArrayList<Student> houseStudents) {
        this.houseStudents = houseStudents;
    }
    @Override
    public boolean meets(Student student) {
        for (Student houseStudent: houseStudents)
                if(student.getFamily().contains(houseStudent))
                    return true;
        return false;
    }
}
