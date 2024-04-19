
/**
 * Coursework of Java 
 
 * @AnijGurung
 * @2023/12/26
 */
class Lecturer extends Teacher //uses extends to call the super/parent class
{ 
    // Attributes
    private String department; // Represents the department of the lecturer
    private int yearsOfExperience; // Holds the years of experience of the lecturer
    private int gradedScore; // Stores the graded score of the lecturer
    private Boolean hasGraded; // Indicates whether the lecturer has graded assignments

    /*
    * Constructs a new Lecturer object with the provided information.
    * 
    * @param teacherID        The ID of the lecturer.
    * @param teacherName      The name of the lecturer.
    * @param address          The address of the lecturer.
    * @param workingType      The working type of the lecturer (e.g., full-time, part-time).
    * @param employmentStatus The employment status of the lecturer (e.g., working, retired).
    * @param yearsOfExperience The number of years taught by the lecturer.
    * @param department       The department where the lecturer belongs to (e.g. IT, BBA).
    */
    public Lecturer(int teacherID, String teacherName, String address, String workingType,
                    String employmentStatus, int yearsOfExperience, String department) 
    {   
        super(teacherID, address, workingType, employmentStatus, teacherName); // Calls superclass constructor
        this.yearsOfExperience = yearsOfExperience; // Assigning years of experience
        this.gradedScore = 0; // Assigning graded score
        this.hasGraded = false; // Assigning boolean
        this.department = department; // Assigning department
    }

    // Accessor methods
    public String getDepartment()
    {
        return department; // Retrieves department
    }

    public int getYearsOfExperience()
    {
        return yearsOfExperience; // Retrieves years of experience
    }

    public Boolean getHasGraded() 
    {
        return hasGraded; // Retrieves hasGraded attribute
    }
    
    public int getGradedScore()
    {
        return gradedScore; // Retrieves graded score
    }
    
    // Mutator method for gradedScore attribute
    public void setGradedScore(int newGradedScore) {
        gradedScore = newGradedScore; // Assigning new graded score
    }
    
    // Method to grade assignments
    public void gradeAssignment(String department,int yearsOfExperience,int gradedScore)
    {
        //Grading score on the basis of the following condition
        if( yearsOfExperience >= 5 && department == this.department)
        {
            this.hasGraded = true;
            this.gradedScore = gradedScore;
            if(gradedScore >=70 && gradedScore <=100)
            {
                System.out.println("A");
            }else if(gradedScore >= 60)
            {
                System.out.println("B");
            }else if(gradedScore >=50)
            {
                System.out.println("C");
            }else if(gradedScore >=40)
            {
                System.out.println("D");
            }else
            {
                System.out.println("E");
            }
        }else
        {
            System.out.println("The lecturer doesn't meet the requirement.");
        }
        
        // Checks if the lecturer has graded assignments and displays a message accordingly
        if(hasGraded)
        {
            System.out.println("This lecturer has graded the papers.");
        }else
        {
            System.out.println("This lecturer hasn't graded the papers as he is busy with other work.");
        }
    }
    
    // Method to display lecturer details
    public void display()
    {
        super.display();// Calls superclass display method to show basic details
        System.out.println("This lecturer Belongs to "+department+".");
        System.out.println("This lecturer has graded "+gradedScore+" marks.");
        System.out.println("This lecturer has "+yearsOfExperience+" of experience.");
        
        // Displays a message if graded score has not been assigned yet
        if(gradedScore == 0)
        {
            System.out.println("This lecturer has yet to grade the assignments.");
        }else
        {
            System.out.println("This lecturer has graded the assignments.");
        }
    }
}
