/**
 * Created by false on 2016. 11. 15..
 */
public class Mentor extends Person {
    String seniorityLevel;
    String subject;

    public Mentor(String name, int age, String seniorityLevel, String subject) {
        this.seniorityLevel = seniorityLevel;
        this.subject = subject;
    }
    public String toString() {
        System.out.println(subject + seniorityLevel+ super.name + super.age);
        return null;
    }
}
