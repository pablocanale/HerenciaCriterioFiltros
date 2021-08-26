package SortingHatHogwarts;



import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Student> family;
    private ArrayList<Quality> qualities;
    private House house;

    public Student(String name, ArrayList<Quality> qualities) {
        this.name = name;
        this.qualities = qualities;
    }
    public ArrayList<Student> getFamily() {
        return family;
    }
    public House getHouse() {
        return house;
    }
    public ArrayList<Quality> getQualities() {
        return qualities;
    }

}
