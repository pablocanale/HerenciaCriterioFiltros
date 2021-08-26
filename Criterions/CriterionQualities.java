package SortingHatHogwarts.Criterions;


import SortingHatHogwarts.Quality;
import SortingHatHogwarts.Student;

import java.util.ArrayList;

public class CriterionQualities  extends Criterion {

    private ArrayList<Quality> qualitiesTheyNeed;

    public CriterionQualities(ArrayList<Quality> qualitiesTheyNeed) {
        this.qualitiesTheyNeed = qualitiesTheyNeed;
    }

    @Override
    public boolean meets(Student student) {
        return qualitiesTheyNeed.containsAll(student.getQualities());
    }

}
