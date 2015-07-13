/**
 * Created by samantha on 7/13/15.
 */
/*Item 1:
/*Static factory method instead of constructors*/
/*The way for a class to allow client to obtain an instance of itself is to provide a public static factory method*/

/*Let's see advantages of static factory method*/

/*Unlike constructors, they have names*/

public final class Student {

        private  int studentId;
        private String firstName;
        private String lastName;
        private int streetNo;
        private String roadName;
        private String districtCode;
        private String country;


    public Student(int studentId, String firstName, String lastName, int streetNo, String roadName, String districtCode, String country) {
            this.studentId = studentId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.streetNo = streetNo;
            this.roadName = roadName;
            this.districtCode = districtCode;
            this.country = country;
        }

        public static String returnAddress(int streetNo,String roadName,String districtCode, String country)
        {
            String address= streetNo+" "+roadName+" "+districtCode+" "+country;
            return address;
        }

        public static  String returnFullName(String firstName,String lastName)
        {
            String fullName=firstName+" "+lastName;
            return fullName;
        }

        /*public static void main(String[] args) {

            System.out.println("Student Full Name is= " + student.returnFullName("Samantha", "Jeyakumar"));
            System.out.println("Address of the student is= " + student.returnAddress(2, "GreenlandRoad", "Jaffna", "SriLanka"));

        }*/


}
