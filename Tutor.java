     
/**
 * Coursework of Java 
 
 * @AnijGurung
 * @2023/12/26
 */
class Tutor extends Teacher //uses extends to call the super/parent class
{    
    // Attributes
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private Boolean isCertified;
    
     /*
     * Constructs a new Tutor object with the provided information.
     * 
     * @param teacherID              The ID of the tutor.
     * @param teacherName            The name of the tutor.
     * @param address                The address of the tutor.
     * @param workingType            The type of working arrangement (e.g., full-time, part-time).
     * @param employmentStatus       The employment status of the tutor. (e.g., working, retired).
     * @param salary                 The salary of the tutor.
     * @param specialization        The field of specialization for the tutor (e.g., Programming).
     * @param academicQualifications The academic qualifications of the tutor.
     * @param performanceIndex       The performance index of the tutor.
     * @param workingHours           The hours a tutor works in a week.
     */
    public Tutor(int teacherID, String teacherName, String address, String workingType,
                    String employmentStatus, double salary, String specialization,
                    String academicQualifications, int performanceIndex, int workingHours) 
    {
        super(teacherID, address, workingType, employmentStatus, teacherName); // Calls superclass constructor
        super.setWorkingHours(workingHours); // Assigning working hours using superclass method
        this.salary = salary; // Assigning salary
        this.specialization = specialization; // Assigning specialization
        this.academicQualifications = academicQualifications; // Assigning academic qualifications
        this.performanceIndex = performanceIndex; // Assigning performance index
        this.isCertified = false; // Assigning isCertified attribute
    }
                    
    // Accessor methods
    public double getSalary()
    {
        return salary; // Retrieves the salary of the tutor
    }
    
    public String getSpecialization() 
    {
        return specialization; // Retrieves the specialization of the tutor
    }
    
    public String getAcademicQualifications()
    {
        return academicQualifications; // Retrieves the academic qualifications of the tutor
    }
    
    public int getPerformanceIndex()
    {
        return performanceIndex; // Retrieves the performance index of the tutor
    }
    
    public Boolean getIsCertified()
    {
        return isCertified; // Retrieves the certification status of the tutor
    }

    // Method to set salary based on performance index and working hours
    public void setSalary(double newSalary, int newPerformanceIndex)
    {
        this.performanceIndex = newPerformanceIndex;
        // Checking if conditions for appraisal are met or not
        if (newPerformanceIndex > 5 && super.getWorkingHours() > 20)
        {
                isCertified = true;
                // Determine salary based on performance index
                if(newPerformanceIndex >= 5 && newPerformanceIndex < 8)
                {
                    this.salary = newSalary + 0.05 * newSalary;
                }else if(newPerformanceIndex >= 8 && newPerformanceIndex < 10)
                {
                    this.salary = newSalary + 0.1 * newSalary;
                }else if (newPerformanceIndex == 10)
                {
                    this.salary = newSalary + 0.2 * newSalary;
                }   
        }else // If conditions are not met,
        {
            System.out.println("The tutor is not elligible for appraisal.");
        }
    }
    
    // Method to remove tutor details if not certified
    public void removeTutor(double salary,String specialization,String academicQualifications,Boolean isCertified,int performanceIndex)
    {
        if(isCertified){
            System.out.println("Tutor is Certified");
        }else{
            // Removing details if not certified
            this.specialization="";
            this.salary = 0;
            this.academicQualifications="";
            this.performanceIndex=0;
            this.isCertified = false;
        }
    }
    
    // Method to display tutor details
    public void display()
    {
        if(isCertified)
        {
            super.display();//Calls superclass display method 
            
            // Displaying tutor's details
            System.out.println("The tutor's Salary is "+salary+".");
            System.out.println("The tutor specializes in "+specialization+".");
            System.out.println("The tutor's qualification is "+academicQualifications+".");
            System.out.println("The tutor's performance index is "+performanceIndex+".");
        }else
        {
            super.display();//Calls superclass display method
        }
    }
}

    
    