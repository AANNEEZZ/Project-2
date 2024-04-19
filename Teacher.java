/**
 * Coursework of Java 
 
 * @AnijGurung
 * @2023/12/26
 */

public class Teacher {
    //Attributes
    private String teacherName, address, workingType, employmentStatus;
    private int teacherID, workingHours;

     /*
     * Constructor for the Teacher class.
     * Initializes a new Teacher object with the provided information.
     *
     * @param teacherID        The ID of the teacher.
     * @param address          The address of the teacher.
     * @param workingType      The working type of teacher (e.g., full-time, part-time).
     * @param employmentStatus The employment status of the teacher (eg., working, retired).
     * @param teacherName      The name of the teacher.
     */

    public Teacher(int teacherID, String address, String workingType, String employmentStatus, String teacherName) 
    {
        this.teacherID = teacherID; // assinging teacher ID
        this.address = address; // assinging address
        this.workingType = workingType; // assinging working type
        this.employmentStatus = employmentStatus; // assinging employment status
        this.teacherName = teacherName; // assinging teacher name
    }

    // Accessor methods
    public int getTeacherID(){
        return teacherID; // Retrieve teacher ID
    }
        
    public String getTeacherName(){
        return teacherName; // Retrieve teacher name
    }

    public String getAddress() {
        return address; // Retrieve address
    }

    public String getWorkingType() {
        return workingType; // Retrieve working type
    }

    public String getEmploymentStatus() {
        return employmentStatus; // Retrieve employment status
    }

    public int getWorkingHours() {
        return workingHours; // Retrieve working hours
    }

    // Method to set working hours
    public void setWorkingHours(int newWorkingHours) {
        workingHours = newWorkingHours; // assinging new working hours
    }

    // Method to display the information
    public void display() {
        System.out.println("The Teacher ID is " + teacherID + ".");
        System.out.println("Their Name is " + teacherName + ".");
        System.out.println("They reside at " + address + ".");
        System.out.println("They are " + workingType + " teacher.");
        System.out.println("They are currently " + employmentStatus + ".");
        
        //Logic to print the working hours if the working hours is 0 or not.
        if (workingHours == 0) {
            System.out.println("The Working hours is currently being set.");// Message when working hours is set
        } else {
            System.out.println("They work for " + workingHours + " hours in a day.");// Message when working hours is not set
        }
    }
}

