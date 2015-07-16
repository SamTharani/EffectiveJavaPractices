/**
 * Created by samantha on 7/13/15.
 */

public class Main{

    public static Student student;
    public static Numbers numbers;


    public static void main(String[] args) {


        System.out.println("Student Full Name is= " + student.returnFullName("Samantha", "Jeyakumar"));
        System.out.println("Address of the student is= " + student.returnAddress(2, "GreenlandRoad", "Jaffna", "SriLanka"));

        numbers.arithmeticOperations();

    }
}
