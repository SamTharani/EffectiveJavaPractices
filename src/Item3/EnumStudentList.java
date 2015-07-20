package Item3;

import Item1.Student;

/**
 * Created by samantha on 7/20/15.
 */
public enum  EnumStudentList {

    STUDENT_LIST;

    private EnumStudentList(){}
    public Student[] studentList()
    {

        final Student[] students=new Student[5];

        students[0]=new Student(1,"Student","1",2,"XLane","d1","ACountry");
        students[0]=new Student(2,"Student","2",3,"YLane","d2","BCountry");
        students[0]=new Student(3,"Student","3",4,"ZLane","d3","CCountry");
        students[0]=new Student(4,"Student","4",5,"PLane","d4","DCountry");
        students[0]=new Student(5,"Student","5",6,"QLane","d5","ECountry");

        return students;

    }
}
