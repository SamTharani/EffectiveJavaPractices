package Item2;

/**
 * Created by samantha on 7/16/15.
 */

//Builder class for constructors with many constructor parameters



public class University {

    //Method 1:Used the telescoping constructor pattern

    private final int universityId; //required
    private final String universityName; //required
    private final String universityAddress; //required
    private final String contactNo; //optional
    private final String websiteLink;//optional
    private final int noOfBuildings;//optional

    public University(UniversityBuilder universityBuilder) {

        universityId=universityBuilder.universityId;
        universityName=universityBuilder.universityName;
        universityAddress=universityBuilder.universityAddress;
        contactNo=universityBuilder.contactNo;
        websiteLink=universityBuilder.websiteLink;
        noOfBuildings=universityBuilder.noOfBuildings;

    }


    //Constructor with required parameter
    /*public University(int universityId, String universityName, String universityAddress) {
        this.universityId = universityId;
        this.universityName = universityName;
        this.universityAddress = universityAddress;
    }*/


    //Constructor with one optional parameter
    /*public University(String contactNo) {
        this.contactNo = contactNo;
    }*/

    //Constructor with two optional parameter
    /*public University(int noOfBuildings, String websiteLink) {
        this.noOfBuildings = noOfBuildings;
        this.websiteLink = websiteLink;
    }*/

    //but it is hard to write client code when there are many parameters and harder still to read it.

    //Method2:call a parameterless constructor to create the object and then call setter methods to set each required parameter and each optional parameter of interest.
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /*public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getWebsiteLink() {
        return websiteLink;
    }

    public void setWebsiteLink(String websiteLink) {
        this.websiteLink = websiteLink;
    }

    public int getNoOfBuildings() {
        return noOfBuildings;
    }

    public void setNoOfBuildings(int noOfBuildings) {
        this.noOfBuildings = noOfBuildings;
    }

    public University() {

    }*/

    /*public static void main(String args[])
    {
        University uni=new University(1,"University of Jaffna","University of Jaffna SriLanka" ); //Method1

        //Method2:call a parameterless constructor to create the object and then call setter methods to set each required parameter and each optional parameter of interest.

        University university=new University();
        university.setUniversityId(1);
        university.setUniversityName("University of Jaffna");
        university.setUniversityAddress("University of Jaffna SriLanka");
        university.setWebsiteLink("www.jfn.ac.lk");
        university.setContactNo("021 2226214");
        university.setNoOfBuildings(100);
    }*/
    //------------------------------------------------------------------------------------------------------------------------------

    //Method3:
    //Instead of making the desired object directly,
    //The client calls a constructor (or static factory) with all of the required parameters and gets a builder object.
    //Then the client calls setter-like methods on the builder object to set each optional parameter of interest.
    // Finally, the client calls a parameterless  build method to generate the object,

    public static class UniversityBuilder{

        private final int universityId; //required
        private final String universityName; //required
        private final String universityAddress; //required

        private String contactNo; //optional
        private String websiteLink;//optional
        private int noOfBuildings;//optional

        public UniversityBuilder(int universityId, String universityName, String universityAddress)
        {
            this.universityId = universityId;
            this.universityName = universityName;
            this.universityAddress = universityAddress;
        }

        public UniversityBuilder contactNo(String contactNo)
        {
            this.contactNo=contactNo;
            return this;
        }
        public UniversityBuilder universityName(String websiteLink)
        {
            this.websiteLink=websiteLink;
            return this;
        }
        public UniversityBuilder universityAddress(int noOfBuildings)
        {
            this.noOfBuildings=noOfBuildings;
            return this;
        }

        public University builder()
        {
            return new University(this);

        }



    }
}



