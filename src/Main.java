import Item1.Numbers;
import Item1.Student;
import Item3.EnumStudentList;
import Item3.SingletonStudent;

/**
 * Created by samantha on 7/13/15.
 */

public class Main{

    public static Student student;
    public static Numbers numbers;


    public static void main(String[] args) {


        System.out.println("Item1.Student Full Name is= " + student.returnFullName("Samantha", "Jeyakumar"));
        System.out.println("Address of the student is= " + student.returnAddress(2, "GreenlandRoad", "Jaffna", "SriLanka"));

        numbers.arithmeticOperations();


        //For Item 3 implement singleton classes
        SingletonStudent singletonStudent=SingletonStudent.getStudent();
        System.out.println(singletonStudent.getFirstName()+" "+singletonStudent.getLastName()+
                " is an example for "+singletonStudent.getUniversity()+"item 3");

        Student[] enumStudentList=EnumStudentList.STUDENT_LIST.studentList();

    }
}
