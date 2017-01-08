import java.util.ArrayList;

/**
 * Created by false on 2016. 11. 15..
 */
public class Student extends Person {
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, int age) {
        super();


    }

    public void addGrade(Integer grade) {

        this.grades.add(grade);
    }

    public double getAverage() {
        int counter = 0;
        for (Integer i : this.grades) {
            counter += i;
        }
        return counter / this.grades.size();
    }

    public String toString() {
        System.out.println(super.name + super.age + getAverage());
        return null;
    }
}
