package SortingHatHogwarts.Criterions;


import SortingHatHogwarts.House;
import SortingHatHogwarts.Student;

public class CriterionNotAcceptedByEnemyHouse extends Criterion {
    private House enemyHouse;

    @Override
    public boolean meets(Student student) {
        return !enemyHouse.getRequirements().meets(student);
    }
}
