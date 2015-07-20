package Item3;

/**
 * Created by samantha on 7/20/15.
 */

//Can be instantiated exactly once
//There are three methods to implement singleton classes
//1. Member as a public final field
//2. Singleton with static factory
//3. Enum Singleton
public class SingletonStudent {

    private String firstName="Singleton";
    private String lastName="Student";
    private String university="Effective Java";

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUniversity() {
        return university;
    }

    private SingletonStudent(){}
    private static final SingletonStudent STUDENT=new SingletonStudent();

    public static SingletonStudent getStudent(){return STUDENT;}



}
