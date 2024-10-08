/**
 * Coursework of Java

 * @AnijGurung
 * @2024/5/1
 */

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class TeacherGUI {
    CustomJLabel newPerformanceIndexLabel;
    private ArrayList<Teacher> Teachers = new ArrayList<>();

    //Making a method to Add a Lecturer
    public void addLecturer(int teacherID, String teacherName, String address, String workingType,
                            String employmentStatus, int gradedScore, int yearsOfExperience) {
        Lecturer lecturer = new Lecturer(teacherID, teacherName, address, workingType, employmentStatus,
                yearsOfExperience, "Department");
        lecturer.setGradedScore(gradedScore);
        Teachers.add(lecturer);
    }

    //Making a method to Add a Tutor
    public void addTutor(int teacherID, String teacherName, String address, String workingType,
                         String employmentStatus, double salary, String specialization,
                         String academicQualifications, int performanceIndex, int workingHours) {
        Tutor tutor = new Tutor(teacherID, teacherName, address, workingType, employmentStatus, salary,
                specialization, academicQualifications, performanceIndex, workingHours);
        Teachers.add(tutor);
    }

    //Making a method to Grade the Assignments
    public void gradeAssignment(int teacherID, int gradedScore, String department, int yearsOfExperience) {
        for (Teacher teacher : Teachers) {
            if (teacher.getTeacherID() == teacherID && teacher instanceof Lecturer) {
                ((Lecturer) teacher).gradeAssignment(department, yearsOfExperience, gradedScore);
                break;
            }
        }
    }

    //Making a method to Set the salary of Tutor
    public void setTutorSalary(int teacherID, double newSalary, int newPerformanceIndex) {
        for (Teacher teacher : Teachers) {
            if (teacher.getTeacherID() == teacherID && teacher instanceof Tutor) {
                ((Tutor) teacher).setSalary(newSalary, newPerformanceIndex);
                break;
            }
        }
    }

    //Making a method to Remove the tutor
    public void removeTutor(int teacherID) {
        for (Teacher teacher : Teachers) {
            if (teacher.getTeacherID() == teacherID && teacher instanceof Tutor) {
                Teachers.remove(teacher);
                break;
            }
        }
    }

    //Making a Constructor
    public TeacherGUI(ArrayList<Teacher> Teachers){
        this.Teachers = Teachers;

        // Creating the main GUI frame
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        // Implementing GridBagLayout for organizing components
        CustomPanel panel = new CustomPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);

        // Creating a menu bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(BorderFactory.createEmptyBorder(6, 15, 6, 15));
        menuBar.setBackground(Color.LIGHT_GRAY);
        frame.setJMenuBar(menuBar);

        // Creating menu items for the menu bar
        JMenu teacherMenu =  new JMenu("Teacher");
        JMenu lecturerMenu =  new JMenu("Lecturer");
        JMenu tutorMenu = new JMenu("Tutor");
        JMenuItem showGradeAssignmentInfoItem = new JMenuItem("Grade Assignment");
        JMenuItem addLecturerInfoItem = new JMenuItem("Add Lecturer");
        JMenuItem addTutorInfoItem = new JMenuItem("Add Tutor");
        JMenuItem setSalaryInfoItem = new JMenuItem("Set Salary");
        JMenuItem removeTutorInfoItem = new JMenuItem("Remove Tutor");
        JMenuItem displayInfoItem =  new JMenuItem("Display");

        // Implementing the menu items to the menu bar
        menuBar.add(teacherMenu);
        menuBar.add(lecturerMenu);
        menuBar.add(tutorMenu);
        lecturerMenu.add(addLecturerInfoItem);
        lecturerMenu.add(showGradeAssignmentInfoItem);
        tutorMenu.add(addTutorInfoItem);
        tutorMenu.add(setSalaryInfoItem);
        tutorMenu.add(removeTutorInfoItem);
        teacherMenu.add(displayInfoItem);

        //Initializing the Required Message Labels
        CustomJLabel messageLabel = new CustomJLabel("Teachers:");
        CustomJLabel teacherIDLabel = new CustomJLabel("Teacher ID:");
        CustomJLabel teacherNameLabel = new CustomJLabel("Teacher Name:");
        CustomJLabel addressLabel = new CustomJLabel("Address:");
        CustomJLabel workingTypeLabel = new CustomJLabel("Working Type:");
        CustomJLabel employmentStatusLabel = new CustomJLabel("Employment Status:");
        CustomJLabel workingHoursLabel =  new CustomJLabel("Working Hours:");
        CustomJLabel departmentLabel = new CustomJLabel("Department:");
        CustomJLabel yearsOfExperienceLabel = new CustomJLabel("Years Of Experience:");
        CustomJLabel gradedScoreLabel = new CustomJLabel("Graded Score:");
        CustomJLabel salaryLabel = new CustomJLabel("Salary:");
        CustomJLabel specializationLabel =  new CustomJLabel("Specialization:");
        CustomJLabel academicQualificationsLabel =  new CustomJLabel("Academic Qualifications:");
        CustomJLabel performanceIndexLabel = new CustomJLabel("Performance Index:");
        CustomJLabel newSalaryLabel = new CustomJLabel("New Salary:");
        CustomJLabel newPerformanceIndexLabel = new CustomJLabel("New Performance Index:");

        //Initializing the required textFields
        JTextField teacherIDTf = new JTextField(15);
        JTextField teacherNameTf = new JTextField(15);
        JTextField addressTf = new JTextField(15);
        JTextField workingTypeTf = new JTextField(15);
        JTextField employmentStatusTf = new JTextField(15);
        JTextField workingHoursTf = new JTextField(15);
        JTextField departmentTf = new JTextField(10);
        JTextField yearsOfExperienceTf = new JTextField(10);
        JTextField gradedScoreTf = new JTextField(15);
        JTextField salaryTf = new JTextField(15);
        JTextField newSalaryTf = new JTextField(15);
        JTextField specializationTf = new JTextField(15);
        JTextField academicQualificationsTf = new JTextField(15);
        JTextField performanceIndexTf = new JTextField(15);
        JTextField newPerformanceIndexTf = new JTextField(15);

        //Initializing the required buttons
        CustomJButton addLecturerButton = new CustomJButton("Add Lecturer");
        CustomJButton addTutorButton = new CustomJButton("Add Tutor");
        CustomJButton gradeAssignmentsButton = new CustomJButton("Grade Assignments");
        CustomJButton setSalaryButton = new CustomJButton("Set Salary");
        CustomJButton removeTutorButton = new CustomJButton("Remove Tutor");
        CustomJButton clearButton = new CustomJButton("Clear");
        CustomJButton directToGradeAssignmentButton = new CustomJButton("Grade Assignment");
        CustomJButton directToSetSalaryButton = new CustomJButton("Set Salary");
        CustomJButton directToRemoveTutorButton = new CustomJButton("Remove Tutor");
        CustomJButton directToAddLecturerButton = new CustomJButton("Add Lecturer");
        CustomJButton directToAddTutorButton =  new CustomJButton("Add Tutor");
        CustomJButton directToDisplayButton = new CustomJButton("Display");
        JButton returnButton = new JButton("⇐");

        // Adding components to the panel using GridbagConstraints
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(directToAddLecturerButton, gbc);

        gbc.gridy = 1;
        panel.add(directToAddTutorButton, gbc);

        gbc.gridy = 2;
        panel.add(directToAddTutorButton, gbc);

        gbc.gridy = 3;
        panel.add(directToGradeAssignmentButton, gbc);

        gbc.gridy = 4;
        panel.add(directToSetSalaryButton, gbc);

        gbc.gridy = 5;
        panel.add(directToRemoveTutorButton, gbc);

        gbc.gridy = 6;
        panel.add(directToDisplayButton, gbc);

        //Adding the panel to the frame
        frame.add(panel);
        // Making the frame visible
        frame.setVisible(true);

        //Adding ActionListener to the Buttons and info Items
        addLecturerInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adding new components to the panel using GridbagConstraints
                gbc.gridx = 0;
                gbc.gridy = 0;
                panel.add(returnButton, gbc);

                gbc.gridx = 3;
                panel.add(messageLabel, gbc);

                gbc.gridx = 1;
                gbc.gridy = 1;
                panel.add(teacherIDLabel, gbc);

                gbc.gridx = 2;
                panel.add(teacherIDTf,gbc);

                gbc.gridx = 1;
                gbc.gridy = 2;
                panel.add(teacherNameLabel,gbc);

                gbc.gridx = 2;
                panel.add(teacherNameTf, gbc);

                gbc.gridx = 1;
                gbc.gridy = 3;
                panel.add(addressLabel, gbc);

                gbc.gridx = 2;
                panel.add(addressTf, gbc);

                gbc.gridx = 1;
                gbc.gridy = 4;
                panel.add(workingTypeLabel, gbc);

                gbc.gridx = 2;
                panel.add(workingTypeTf, gbc);

                gbc.gridx = 3;
                gbc.gridy = 5;
                panel.add(addLecturerButton, gbc);

                gbc.gridy = 6;
                panel.add(clearButton, gbc);

                gbc.gridx = 4;
                gbc.gridy = 1;
                panel.add(employmentStatusLabel, gbc);

                gbc.gridx = 5;
                panel.add(employmentStatusTf, gbc);

                gbc.gridx = 4;
                gbc.gridy = 2;
                panel.add(yearsOfExperienceLabel, gbc);

                gbc.gridx = 5;
                panel.add(yearsOfExperienceTf, gbc);

                gbc.gridx = 4;
                gbc.gridy = 3;
                panel.add(gradedScoreLabel, gbc);

                gbc.gridx = 5;
                panel.add(gradedScoreTf, gbc);

                //Setting the required Message labels as visible
                messageLabel.setText("Lecturer");
                messageLabel.setVisible(true);
                teacherIDLabel.setVisible(true);
                teacherNameLabel.setVisible(true);
                addressLabel.setVisible(true);
                workingTypeLabel.setVisible(true);
                employmentStatusLabel.setVisible(true);
                yearsOfExperienceLabel.setVisible(true);
                gradedScoreLabel.setVisible(true);

                //Setting the required text fields as visible
                teacherIDTf.setVisible(true);
                teacherNameTf.setVisible(true);
                addressTf.setVisible(true);
                workingTypeTf.setVisible(true);
                employmentStatusTf.setVisible(true);
                yearsOfExperienceTf.setVisible(true);
                gradedScoreTf.setVisible(true);

                //Setting the required buttons as visible
                addLecturerButton.setVisible(true);
                clearButton.setVisible(true);
                returnButton.setVisible(true);

                //setting the others as invisible
                addTutorButton.setVisible(false);
                workingHoursLabel.setVisible(false);
                departmentLabel.setVisible(false);
                salaryLabel.setVisible(false);
                specializationLabel.setVisible(false);
                academicQualificationsLabel.setVisible(false);
                performanceIndexLabel.setVisible(false);
                workingHoursTf.setVisible(false);
                departmentTf.setVisible(false);
                salaryTf.setVisible(false);
                specializationTf.setVisible(false);
                academicQualificationsTf.setVisible(false);
                performanceIndexTf.setVisible(false);
                gradeAssignmentsButton.setVisible(false);
                setSalaryButton.setVisible(false);
                newSalaryLabel.setVisible(false);
                newPerformanceIndexLabel.setVisible(false);
                newSalaryTf.setVisible(false);
                newPerformanceIndexTf.setVisible(false);
                removeTutorButton.setVisible(false);
                directToGradeAssignmentButton.setVisible(false);
                directToSetSalaryButton.setVisible(false);
                directToRemoveTutorButton.setVisible(false);
                directToAddLecturerButton.setVisible(false);
                directToAddTutorButton.setVisible(false);
                directToDisplayButton.setVisible(false);
            }
        });

        directToAddLecturerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    // // Adding new components to the panel using GridbagConstraints
                    gbc.gridx = 0;
                    gbc.gridy = 0;
                    panel.add(returnButton, gbc);

                    gbc.gridx = 3;
                    panel.add(messageLabel, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 1;
                    panel.add(teacherIDLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(teacherIDTf,gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 2;
                    panel.add(teacherNameLabel,gbc);

                    gbc.gridx = 2;
                    panel.add(teacherNameTf, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 3;
                    panel.add(addressLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(addressTf, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 4;
                    panel.add(workingTypeLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(workingTypeTf, gbc);

                    gbc.gridx = 3;
                    gbc.gridy = 5;
                    panel.add(addLecturerButton, gbc);

                    gbc.gridy = 6;
                    panel.add(clearButton, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 1;
                    panel.add(employmentStatusLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(employmentStatusTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 2;
                    panel.add(yearsOfExperienceLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(yearsOfExperienceTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 3;
                    panel.add(gradedScoreLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(gradedScoreTf, gbc);

                    //Setting the required Message labels as visible
                    messageLabel.setText("Lecturer");
                    messageLabel.setVisible(true);
                    teacherIDLabel.setVisible(true);
                    teacherNameLabel.setVisible(true);
                    addressLabel.setVisible(true);
                    workingTypeLabel.setVisible(true);
                    employmentStatusLabel.setVisible(true);
                    yearsOfExperienceLabel.setVisible(true);
                    gradedScoreLabel.setVisible(true);

                    //Setting the required text fields as visible
                    teacherIDTf.setVisible(true);
                    teacherNameTf.setVisible(true);
                    addressTf.setVisible(true);
                    workingTypeTf.setVisible(true);
                    employmentStatusTf.setVisible(true);
                    yearsOfExperienceTf.setVisible(true);
                    gradedScoreTf.setVisible(true);

                    //Setting the required buttons as visible
                    addLecturerButton.setVisible(true);
                    clearButton.setVisible(true);
                    returnButton.setVisible(true);

                    //setting the others as invisible
                    addTutorButton.setVisible(false);
                    workingHoursLabel.setVisible(false);
                    departmentLabel.setVisible(false);
                    salaryLabel.setVisible(false);
                    specializationLabel.setVisible(false);
                    academicQualificationsLabel.setVisible(false);
                    performanceIndexLabel.setVisible(false);
                    workingHoursTf.setVisible(false);
                    departmentTf.setVisible(false);
                    salaryTf.setVisible(false);
                    specializationTf.setVisible(false);
                    academicQualificationsTf.setVisible(false);
                    performanceIndexTf.setVisible(false);
                    gradeAssignmentsButton.setVisible(false);
                    setSalaryButton.setVisible(false);
                    newSalaryLabel.setVisible(false);
                    newPerformanceIndexLabel.setVisible(false);
                    newSalaryTf.setVisible(false);
                    newPerformanceIndexTf.setVisible(false);
                    removeTutorButton.setVisible(false);
                    directToGradeAssignmentButton.setVisible(false);
                    directToSetSalaryButton.setVisible(false);
                    directToRemoveTutorButton.setVisible(false);
                    directToAddLecturerButton.setVisible(false);
                    directToAddTutorButton.setVisible(false);
                    directToDisplayButton.setVisible(false);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        //Adding the functionality of return button
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Setting the required visibility of the various textfields, messagelabels and buttons
                try{
                    messageLabel.setVisible(false);
                    teacherIDLabel.setVisible(false);
                    teacherNameLabel.setVisible(false);
                    addressLabel.setVisible(false);
                    workingTypeLabel.setVisible(false);
                    employmentStatusLabel.setVisible(false);
                    yearsOfExperienceLabel.setVisible(false);
                    gradedScoreLabel.setVisible(false);

                    teacherIDTf.setVisible(false);
                    teacherNameTf.setVisible(false);
                    addressTf.setVisible(false);
                    workingTypeTf.setVisible(false);
                    employmentStatusTf.setVisible(false);
                    yearsOfExperienceTf.setVisible(false);
                    gradedScoreTf.setVisible(false);

                    addLecturerButton.setVisible(false);
                    clearButton.setVisible(false);
                    returnButton.setVisible(false);

                    addTutorButton.setVisible(false);
                    workingHoursLabel.setVisible(false);
                    departmentLabel.setVisible(false);
                    salaryLabel.setVisible(false);
                    specializationLabel.setVisible(false);
                    academicQualificationsLabel.setVisible(false);
                    performanceIndexLabel.setVisible(false);
                    workingHoursTf.setVisible(false);
                    departmentTf.setVisible(false);
                    salaryTf.setVisible(false);
                    specializationTf.setVisible(false);
                    academicQualificationsTf.setVisible(false);
                    performanceIndexTf.setVisible(false);
                    gradeAssignmentsButton.setVisible(false);
                    setSalaryButton.setVisible(false);
                    removeTutorButton.setVisible(false);
                    directToGradeAssignmentButton.setVisible(true);
                    directToSetSalaryButton.setVisible(true);
                    directToRemoveTutorButton.setVisible(true);
                    directToAddLecturerButton.setVisible(true);
                    directToAddTutorButton.setVisible(true);
                    directToDisplayButton.setVisible(true);
                    newSalaryLabel.setVisible(false);
                    newPerformanceIndexLabel.setVisible(false);
                    newSalaryTf.setVisible(false);
                    newPerformanceIndexTf.setVisible(false);

                    // Clearing the text fields
                    teacherIDTf.setText("");
                    teacherNameTf.setText("");
                    addressTf.setText("");
                    workingTypeTf.setText("");
                    employmentStatusTf.setText("");
                    workingHoursTf.setText("");
                    departmentTf.setText("");
                    yearsOfExperienceTf.setText("");
                    gradedScoreTf.setText("");
                    salaryTf.setText("");
                    specializationTf.setText("");
                    academicQualificationsTf.setText("");
                    performanceIndexTf.setText("");

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }

            }
        });

        addTutorInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    //Setting the required visibility of the various textfields, messagelabels and buttons
                    messageLabel.setText("Tutor");
                    messageLabel.setVisible(true);
                    teacherIDLabel.setVisible(true);
                    teacherNameLabel.setVisible(true);
                    addressLabel.setVisible(true);
                    workingTypeLabel.setVisible(true);
                    employmentStatusLabel.setVisible(true);
                    yearsOfExperienceLabel.setVisible(false);
                    gradedScoreLabel.setVisible(false);

                    newSalaryLabel.setVisible(false);
                    newPerformanceIndexLabel.setVisible(false);
                    newSalaryTf.setVisible(false);
                    newPerformanceIndexTf.setVisible(false);


                    teacherIDTf.setVisible(true);
                    teacherNameTf.setVisible(true);
                    addressTf.setVisible(true);
                    workingTypeTf.setVisible(true);
                    employmentStatusTf.setVisible(true);
                    yearsOfExperienceTf.setVisible(false);
                    gradedScoreTf.setVisible(false);

                    addLecturerButton.setVisible(false);
                    clearButton.setVisible(true);
                    returnButton.setVisible(true);

                    addTutorButton.setVisible(true);
                    workingHoursLabel.setVisible(true);
                    departmentLabel.setVisible(false);
                    salaryLabel.setVisible(true);
                    specializationLabel.setVisible(true);
                    academicQualificationsLabel.setVisible(true);
                    performanceIndexLabel.setVisible(true);
                    workingHoursTf.setVisible(true);
                    departmentTf.setVisible(false);
                    salaryTf.setVisible(true);
                    specializationTf.setVisible(true);
                    academicQualificationsTf.setVisible(true);
                    performanceIndexTf.setVisible(true);
                    gradeAssignmentsButton.setVisible(false);
                    setSalaryButton.setVisible(false);
                    removeTutorButton.setVisible(false);
                    directToGradeAssignmentButton.setVisible(false);
                    directToSetSalaryButton.setVisible(false);
                    directToRemoveTutorButton.setVisible(false);
                    directToAddLecturerButton.setVisible(false);
                    directToAddTutorButton.setVisible(false);
                    directToDisplayButton.setVisible(false);

                    // // Adding new components to the panel using GridbagConstraints
                    gbc.gridx = 0;
                    gbc.gridy = 0;
                    panel.add(returnButton, gbc);

                    gbc.gridx = 3;
                    panel.add(messageLabel, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 1;
                    panel.add(teacherIDLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(teacherIDTf,gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 2;
                    panel.add(teacherNameLabel,gbc);

                    gbc.gridx = 2;
                    panel.add(teacherNameTf, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 3;
                    panel.add(addressLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(addressTf, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 4;
                    panel.add(workingTypeLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(workingTypeTf, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 5;
                    panel.add(performanceIndexLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(performanceIndexTf, gbc);

                    gbc.gridx = 3;
                    gbc.gridy = 6;
                    panel.add(addTutorButton, gbc);

                    gbc.gridy = 7;
                    panel.add(clearButton, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 1;
                    panel.add(employmentStatusLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(employmentStatusTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 2;
                    panel.add(workingHoursLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(workingHoursTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 3;
                    panel.add(salaryLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(salaryTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 4;
                    panel.add(specializationLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(specializationTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 5;
                    panel.add(academicQualificationsLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(academicQualificationsTf, gbc);

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }

            }
        });

        directToAddTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    //Setting the required visibility of the various textfields, messagelabels and buttons
                    messageLabel.setText("Tutor");
                    messageLabel.setVisible(true);
                    teacherIDLabel.setVisible(true);
                    teacherNameLabel.setVisible(true);
                    addressLabel.setVisible(true);
                    workingTypeLabel.setVisible(true);
                    employmentStatusLabel.setVisible(true);
                    yearsOfExperienceLabel.setVisible(false);
                    gradedScoreLabel.setVisible(false);

                    newSalaryLabel.setVisible(false);
                    newPerformanceIndexLabel.setVisible(false);
                    newSalaryTf.setVisible(false);
                    newPerformanceIndexTf.setVisible(false);


                    teacherIDTf.setVisible(true);
                    teacherNameTf.setVisible(true);
                    addressTf.setVisible(true);
                    workingTypeTf.setVisible(true);
                    employmentStatusTf.setVisible(true);
                    yearsOfExperienceTf.setVisible(false);
                    gradedScoreTf.setVisible(false);

                    addLecturerButton.setVisible(false);
                    clearButton.setVisible(true);
                    returnButton.setVisible(true);

                    addTutorButton.setVisible(true);
                    workingHoursLabel.setVisible(true);
                    departmentLabel.setVisible(false);
                    salaryLabel.setVisible(true);
                    specializationLabel.setVisible(true);
                    academicQualificationsLabel.setVisible(true);
                    performanceIndexLabel.setVisible(true);
                    workingHoursTf.setVisible(true);
                    departmentTf.setVisible(false);
                    salaryTf.setVisible(true);
                    specializationTf.setVisible(true);
                    academicQualificationsTf.setVisible(true);
                    performanceIndexTf.setVisible(true);
                    gradeAssignmentsButton.setVisible(false);
                    setSalaryButton.setVisible(false);
                    removeTutorButton.setVisible(false);
                    directToGradeAssignmentButton.setVisible(false);
                    directToSetSalaryButton.setVisible(false);
                    directToRemoveTutorButton.setVisible(false);
                    directToAddLecturerButton.setVisible(false);
                    directToAddTutorButton.setVisible(false);
                    directToDisplayButton.setVisible(false);

                    // // Adding new components to the panel using GridbagConstraints
                    gbc.gridx = 0;
                    gbc.gridy = 0;
                    panel.add(returnButton, gbc);

                    gbc.gridx = 3;
                    panel.add(messageLabel, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 1;
                    panel.add(teacherIDLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(teacherIDTf,gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 2;
                    panel.add(teacherNameLabel,gbc);

                    gbc.gridx = 2;
                    panel.add(teacherNameTf, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 3;
                    panel.add(addressLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(addressTf, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 4;
                    panel.add(workingTypeLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(workingTypeTf, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 5;
                    panel.add(performanceIndexLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(performanceIndexTf, gbc);

                    gbc.gridx = 3;
                    gbc.gridy = 6;
                    panel.add(addTutorButton, gbc);

                    gbc.gridy = 7;
                    panel.add(clearButton, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 1;
                    panel.add(employmentStatusLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(employmentStatusTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 2;
                    panel.add(workingHoursLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(workingHoursTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 3;
                    panel.add(salaryLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(salaryTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 4;
                    panel.add(specializationLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(specializationTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 5;
                    panel.add(academicQualificationsLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(academicQualificationsTf, gbc);

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        showGradeAssignmentInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    //Setting the required visibility of the various textfields, messagelabels and buttons
                    messageLabel.setText("Grade Assigment");
                    messageLabel.setVisible(true);
                    teacherIDLabel.setVisible(true);
                    teacherNameLabel.setVisible(false);
                    addressLabel.setVisible(false);
                    workingTypeLabel.setVisible(false);
                    employmentStatusLabel.setVisible(false);
                    yearsOfExperienceLabel.setVisible(true);
                    gradedScoreLabel.setVisible(true);


                    teacherIDTf.setVisible(true);
                    teacherNameTf.setVisible(false);
                    addressTf.setVisible(false);
                    workingTypeTf.setVisible(false);
                    employmentStatusTf.setVisible(false);
                    yearsOfExperienceTf.setVisible(true);
                    gradedScoreTf.setVisible(true);

                    addLecturerButton.setVisible(false);
                    clearButton.setVisible(true);
                    returnButton.setVisible(true);
                    newSalaryLabel.setVisible(false);
                    newPerformanceIndexLabel.setVisible(false);
                    newSalaryTf.setVisible(false);
                    newPerformanceIndexTf.setVisible(false);


                    addTutorButton.setVisible(false);
                    workingHoursLabel.setVisible(false);
                    departmentLabel.setVisible(true);
                    salaryLabel.setVisible(false);
                    specializationLabel.setVisible(false);
                    academicQualificationsLabel.setVisible(false);
                    performanceIndexLabel.setVisible(false);
                    workingHoursTf.setVisible(false);
                    departmentTf.setVisible(true);
                    salaryTf.setVisible(false);
                    specializationTf.setVisible(false);
                    academicQualificationsTf.setVisible(false);
                    performanceIndexTf.setVisible(false);
                    gradeAssignmentsButton.setVisible(true);
                    setSalaryButton.setVisible(false);
                    removeTutorButton.setVisible(false);
                    directToGradeAssignmentButton.setVisible(false);
                    directToSetSalaryButton.setVisible(false);
                    directToRemoveTutorButton.setVisible(false);
                    directToAddLecturerButton.setVisible(false);
                    directToAddTutorButton.setVisible(false);
                    directToDisplayButton.setVisible(false);

                    // // Adding new components to the panel using GridbagConstraints
                    gbc.gridx = 0;
                    gbc.gridy = 0;
                    panel.add(returnButton, gbc);

                    gbc.gridx = 3;
                    panel.add(messageLabel, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 1;
                    panel.add(teacherIDLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(teacherIDTf,gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 2;
                    panel.add(gradedScoreLabel,gbc);

                    gbc.gridx = 2;
                    panel.add(gradedScoreTf, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 3;
                    panel.add(addressLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(addressTf, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 4;
                    panel.add(workingTypeLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(workingTypeTf, gbc);

                    gbc.gridx = 3;
                    gbc.gridy = 3;
                    panel.add(gradeAssignmentsButton, gbc);

                    gbc.gridy = 4;
                    panel.add(clearButton, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 1;
                    panel.add(departmentLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(departmentTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 2;
                    panel.add(yearsOfExperienceLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(yearsOfExperienceTf, gbc);

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        directToGradeAssignmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    //Setting the required visibility of the various textfields, messagelabels and buttons
                    messageLabel.setText("Grade Assigment");
                    messageLabel.setVisible(true);
                    teacherIDLabel.setVisible(true);
                    teacherNameLabel.setVisible(false);
                    addressLabel.setVisible(false);
                    workingTypeLabel.setVisible(false);
                    employmentStatusLabel.setVisible(false);
                    yearsOfExperienceLabel.setVisible(true);
                    gradedScoreLabel.setVisible(true);


                    teacherIDTf.setVisible(true);
                    teacherNameTf.setVisible(false);
                    addressTf.setVisible(false);
                    workingTypeTf.setVisible(false);
                    employmentStatusTf.setVisible(false);
                    yearsOfExperienceTf.setVisible(true);
                    gradedScoreTf.setVisible(true);

                    addLecturerButton.setVisible(false);
                    clearButton.setVisible(true);
                    returnButton.setVisible(true);
                    newSalaryLabel.setVisible(false);
                    newPerformanceIndexLabel.setVisible(false);
                    newSalaryTf.setVisible(false);
                    newPerformanceIndexTf.setVisible(false);


                    addTutorButton.setVisible(false);
                    workingHoursLabel.setVisible(false);
                    departmentLabel.setVisible(true);
                    salaryLabel.setVisible(false);
                    specializationLabel.setVisible(false);
                    academicQualificationsLabel.setVisible(false);
                    performanceIndexLabel.setVisible(false);
                    workingHoursTf.setVisible(false);
                    departmentTf.setVisible(true);
                    salaryTf.setVisible(false);
                    specializationTf.setVisible(false);
                    academicQualificationsTf.setVisible(false);
                    performanceIndexTf.setVisible(false);
                    gradeAssignmentsButton.setVisible(true);
                    setSalaryButton.setVisible(false);
                    removeTutorButton.setVisible(false);
                    directToGradeAssignmentButton.setVisible(false);
                    directToSetSalaryButton.setVisible(false);
                    directToRemoveTutorButton.setVisible(false);
                    directToAddLecturerButton.setVisible(false);
                    directToAddTutorButton.setVisible(false);
                    directToDisplayButton.setVisible(false);

                    //Setting the required visibility of the various textfields, messagelabels and buttons
                    gbc.gridx = 0;
                    gbc.gridy = 0;
                    panel.add(returnButton, gbc);

                    gbc.gridx = 3;
                    panel.add(messageLabel, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 1;
                    panel.add(teacherIDLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(teacherIDTf,gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 2;
                    panel.add(gradedScoreLabel,gbc);

                    gbc.gridx = 2;
                    panel.add(gradedScoreTf, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 3;
                    panel.add(addressLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(addressTf, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 4;
                    panel.add(workingTypeLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(workingTypeTf, gbc);

                    gbc.gridx = 3;
                    gbc.gridy = 3;
                    panel.add(gradeAssignmentsButton, gbc);

                    gbc.gridy = 4;
                    panel.add(clearButton, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 1;
                    panel.add(departmentLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(departmentTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 2;
                    panel.add(yearsOfExperienceLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(yearsOfExperienceTf, gbc);

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        setSalaryInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    //Setting the required visibility of the various textfields, messagelabels and buttons
                    addLecturerButton.setVisible(false);
                    clearButton.setVisible(true);
                    returnButton.setVisible(true);

                    addTutorButton.setVisible(false);
                    workingHoursLabel.setVisible(false);
                    departmentLabel.setVisible(false);
                    salaryLabel.setVisible(false);
                    specializationLabel.setVisible(false);
                    academicQualificationsLabel.setVisible(false);
                    performanceIndexLabel.setVisible(false);
                    workingHoursTf.setVisible(false);
                    departmentTf.setVisible(false);
                    salaryTf.setVisible(false);
                    specializationTf.setVisible(false);
                    academicQualificationsTf.setVisible(false);
                    performanceIndexTf.setVisible(false);
                    gradeAssignmentsButton.setVisible(false);
                    setSalaryButton.setVisible(true);
                    removeTutorButton.setVisible(false);
                    directToGradeAssignmentButton.setVisible(false);
                    directToSetSalaryButton.setVisible(false);
                    directToRemoveTutorButton.setVisible(false);
                    directToAddLecturerButton.setVisible(false);
                    directToAddTutorButton.setVisible(false);
                    directToDisplayButton.setVisible(false);

                    // // Adding new components to the panel using GridbagConstraints
                    gbc.gridx = 0;
                    gbc.gridy = 0;
                    panel.add(returnButton, gbc);

                    gbc.gridx = 3;
                    panel.add(messageLabel, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 1;
                    panel.add(teacherIDLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(teacherIDTf,gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 2;
                    panel.add(newSalaryLabel,gbc);

                    gbc.gridx = 2;
                    panel.add(newSalaryTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 1;
                    panel.add(newPerformanceIndexLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(newPerformanceIndexTf, gbc);

                    gbc.gridx = 3;
                    gbc.gridy = 3;
                    panel.add(gradeAssignmentsButton, gbc);

                    gbc.gridy = 4;
                    panel.add(clearButton, gbc);

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        directToSetSalaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    //Setting the required visibility of the various textfields, messagelabels and buttons
                    messageLabel.setText("Set Salary");
                    messageLabel.setVisible(true);
                    teacherIDLabel.setVisible(true);
                    teacherNameLabel.setVisible(false);
                    addressLabel.setVisible(false);
                    workingTypeLabel.setVisible(false);
                    employmentStatusLabel.setVisible(false);
                    yearsOfExperienceLabel.setVisible(false);
                    gradedScoreLabel.setVisible(false);


                    teacherIDTf.setVisible(true);
                    teacherNameTf.setVisible(false);
                    addressTf.setVisible(false);
                    workingTypeTf.setVisible(false);
                    employmentStatusTf.setVisible(false);
                    yearsOfExperienceTf.setVisible(false);
                    gradedScoreTf.setVisible(false);

                    newSalaryLabel.setVisible(true);
                    newPerformanceIndexLabel.setVisible(true);
                    newSalaryTf.setVisible(true);
                    newPerformanceIndexTf.setVisible(true);

                    addLecturerButton.setVisible(false);
                    clearButton.setVisible(true);
                    returnButton.setVisible(true);

                    addTutorButton.setVisible(false);
                    workingHoursLabel.setVisible(false);
                    departmentLabel.setVisible(false);
                    salaryLabel.setVisible(false);
                    specializationLabel.setVisible(false);
                    academicQualificationsLabel.setVisible(false);
                    performanceIndexLabel.setVisible(false);
                    workingHoursTf.setVisible(false);
                    departmentTf.setVisible(false);
                    salaryTf.setVisible(false);
                    specializationTf.setVisible(false);
                    academicQualificationsTf.setVisible(false);
                    performanceIndexTf.setVisible(false);
                    gradeAssignmentsButton.setVisible(false);
                    setSalaryButton.setVisible(true);
                    removeTutorButton.setVisible(false);
                    directToGradeAssignmentButton.setVisible(false);
                    directToSetSalaryButton.setVisible(false);
                    directToRemoveTutorButton.setVisible(false);
                    directToAddLecturerButton.setVisible(false);
                    directToAddTutorButton.setVisible(false);
                    directToDisplayButton.setVisible(false);

                    // // Adding new components to the panel using GridbagConstraints
                    gbc.gridx = 0;
                    gbc.gridy = 0;
                    panel.add(returnButton, gbc);

                    gbc.gridx = 3;
                    panel.add(messageLabel, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 1;
                    panel.add(teacherIDLabel, gbc);

                    gbc.gridx = 2;
                    panel.add(teacherIDTf,gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 2;
                    panel.add(newSalaryLabel,gbc);

                    gbc.gridx = 2;
                    panel.add(newSalaryTf, gbc);

                    gbc.gridx = 4;
                    gbc.gridy = 1;
                    panel.add(newPerformanceIndexLabel, gbc);

                    gbc.gridx = 5;
                    panel.add(newPerformanceIndexTf, gbc);

                    gbc.gridx = 3;
                    gbc.gridy = 3;
                    panel.add(gradeAssignmentsButton, gbc);

                    gbc.gridy = 4;
                    panel.add(setSalaryButton, gbc);

                    gbc.gridy = 5;
                    panel.add(clearButton, gbc);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        removeTutorInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try{
                   //Setting the required visibility of the various textfields, messagelabels and buttons
                   messageLabel.setText("Remove Tutor");
                   messageLabel.setVisible(true);
                   teacherIDLabel.setVisible(true);
                   teacherNameLabel.setVisible(false);
                   addressLabel.setVisible(false);
                   workingTypeLabel.setVisible(false);
                   employmentStatusLabel.setVisible(false);
                   yearsOfExperienceLabel.setVisible(false);
                   gradedScoreLabel.setVisible(false);


                   teacherIDTf.setVisible(true);
                   teacherNameTf.setVisible(false);
                   addressTf.setVisible(false);
                   workingTypeTf.setVisible(false);
                   employmentStatusTf.setVisible(false);
                   yearsOfExperienceTf.setVisible(false);
                   gradedScoreTf.setVisible(false);

                   newSalaryLabel.setVisible(false);
                   newPerformanceIndexLabel.setVisible(false);
                   newSalaryTf.setVisible(false);
                   newPerformanceIndexTf.setVisible(false);

                   addLecturerButton.setVisible(false);
                   clearButton.setVisible(true);
                   returnButton.setVisible(true);

                   addTutorButton.setVisible(false);
                   workingHoursLabel.setVisible(false);
                   departmentLabel.setVisible(false);
                   salaryLabel.setVisible(false);
                   specializationLabel.setVisible(false);
                   academicQualificationsLabel.setVisible(false);
                   performanceIndexLabel.setVisible(false);
                   workingHoursTf.setVisible(false);
                   departmentTf.setVisible(false);
                   salaryTf.setVisible(false);
                   specializationTf.setVisible(false);
                   academicQualificationsTf.setVisible(false);
                   performanceIndexTf.setVisible(false);
                   gradeAssignmentsButton.setVisible(false);
                   setSalaryButton.setVisible(false);
                   removeTutorButton.setVisible(true);
                   directToGradeAssignmentButton.setVisible(false);
                   directToSetSalaryButton.setVisible(false);
                   directToRemoveTutorButton.setVisible(false);
                   directToAddLecturerButton.setVisible(false);
                   directToAddTutorButton.setVisible(false);
                   directToDisplayButton.setVisible(false);

                   // // Adding new components to the panel using GridbagConstraints
                   gbc.gridx = 0;
                   gbc.gridy = 0;
                   panel.add(returnButton, gbc);

                   gbc.gridx = 2;
                   panel.add(messageLabel, gbc);

                   gbc.gridx = 1;
                   gbc.gridy = 1;
                   panel.add(teacherIDLabel, gbc);

                   gbc.gridx = 3;
                   panel.add(teacherIDTf, gbc);

                   gbc.gridx = 2;
                   gbc.gridy = 3;
                   panel.add(removeTutorButton, gbc);

                   gbc.gridy = 4;
                   panel.add(clearButton, gbc);

               }catch(Exception ex){
                   JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                   ex.printStackTrace();
               }
            }
        });

        directToRemoveTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    //Setting the required visibility of the various textfields, messagelabels and buttons
                    messageLabel.setText("Remove Tutor");
                    messageLabel.setVisible(true);
                    teacherIDLabel.setVisible(true);
                    teacherNameLabel.setVisible(false);
                    addressLabel.setVisible(false);
                    workingTypeLabel.setVisible(false);
                    employmentStatusLabel.setVisible(false);
                    yearsOfExperienceLabel.setVisible(false);
                    gradedScoreLabel.setVisible(false);


                    teacherIDTf.setVisible(true);
                    teacherNameTf.setVisible(false);
                    addressTf.setVisible(false);
                    workingTypeTf.setVisible(false);
                    employmentStatusTf.setVisible(false);
                    yearsOfExperienceTf.setVisible(false);
                    gradedScoreTf.setVisible(false);

                    newSalaryLabel.setVisible(false);
                    newPerformanceIndexLabel.setVisible(false);
                    newSalaryTf.setVisible(false);
                    newPerformanceIndexTf.setVisible(false);

                    addLecturerButton.setVisible(false);
                    clearButton.setVisible(true);
                    returnButton.setVisible(true);

                    addTutorButton.setVisible(false);
                    workingHoursLabel.setVisible(false);
                    departmentLabel.setVisible(false);
                    salaryLabel.setVisible(false);
                    specializationLabel.setVisible(false);
                    academicQualificationsLabel.setVisible(false);
                    performanceIndexLabel.setVisible(false);
                    workingHoursTf.setVisible(false);
                    departmentTf.setVisible(false);
                    salaryTf.setVisible(false);
                    specializationTf.setVisible(false);
                    academicQualificationsTf.setVisible(false);
                    performanceIndexTf.setVisible(false);
                    gradeAssignmentsButton.setVisible(false);
                    setSalaryButton.setVisible(false);
                    removeTutorButton.setVisible(true);
                    directToGradeAssignmentButton.setVisible(false);
                    directToSetSalaryButton.setVisible(false);
                    directToRemoveTutorButton.setVisible(false);
                    directToAddLecturerButton.setVisible(false);
                    directToAddTutorButton.setVisible(false);
                    directToDisplayButton.setVisible(false);

                    // // Adding new components to the panel using GridbagConstraints
                    gbc.gridx = 0;
                    gbc.gridy = 0;
                    panel.add(returnButton, gbc);

                    gbc.gridx = 2;
                    panel.add(messageLabel, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 1;
                    panel.add(teacherIDLabel, gbc);

                    gbc.gridx = 3;
                    panel.add(teacherIDTf, gbc);

                    gbc.gridx = 2;
                    gbc.gridy = 3;
                    panel.add(removeTutorButton, gbc);

                    gbc.gridy = 4;
                    panel.add(clearButton, gbc);

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    //Clearing the textfield after the button is pressed
                    teacherIDTf.setText("");
                    teacherNameTf.setText("");
                    addressTf.setText("");
                    workingTypeTf.setText("");
                    employmentStatusTf.setText("");
                    workingHoursTf.setText("");
                    departmentTf.setText("");
                    yearsOfExperienceTf.setText("");
                    gradedScoreTf.setText("");
                    salaryTf.setText("");
                    specializationTf.setText("");
                    academicQualificationsTf.setText("");
                    performanceIndexTf.setText("");
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        // For adding a new lecturer
        addLecturerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int teacherID = Integer.parseInt(teacherIDTf.getText());
                    if (teacherID <= 0) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid positive integer for Teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Stop further execution
                    }
                    for (Teacher teacher : Teachers) {
                        if (teacher.getTeacherID() == teacherID) {
                            JOptionPane.showMessageDialog(null, "Teacher ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                            return; // Stop further execution
                        }
                    }
                    String teacherName = teacherNameTf.getText();
                    String address = addressTf.getText();
                    String workingType = workingTypeTf.getText();
                    String employmentStatus = employmentStatusTf.getText();
                    int yearsOfExperience = Integer.parseInt(yearsOfExperienceTf.getText());
                    int gradedScore = Integer.parseInt(gradedScoreTf.getText());

                    // Check if any text field is empty
                    if (teacherIDTf.getText().isEmpty() || teacherNameTf.getText().isEmpty() ||
                            addressTf.getText().isEmpty() || workingTypeTf.getText().isEmpty() ||
                            employmentStatusTf.getText().isEmpty() || yearsOfExperienceTf.getText().isEmpty() ||
                            gradedScoreTf.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Stop further execution
                    } else {
                        addLecturer(teacherID, teacherName, address, workingType, employmentStatus, gradedScore, yearsOfExperience);
                        JOptionPane.showMessageDialog(null, "Lecturer Added");
                    }
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid integer for Teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        // To add a new Tutor
        addTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int teacherID = Integer.parseInt(teacherIDTf.getText());
                    for (Teacher teacher : Teachers) {
                        if (teacher.getTeacherID() == teacherID) {
                            JOptionPane.showMessageDialog(null, "Teacher ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                            return; // Stop further execution
                        }
                    }
                    String teacherName =  teacherNameTf.getText();
                    String address = addressTf.getText();
                    String workingType = workingTypeTf.getText();
                    String employmentStatus = employmentStatusTf.getText();
                    int performanceIndex = Integer.parseInt(performanceIndexTf.getText());
                    int workingHours = Integer.parseInt(workingHoursTf.getText());
                    double salary =  Double.parseDouble(salaryTf.getText());
                    String specialization = specializationTf.getText();
                    String academicQualifications = academicQualificationsTf.getText();

                    if (teacherIDTf.getText().isEmpty() || teacherNameTf.getText().isEmpty() ||
                            addressTf.getText().isEmpty() || workingTypeTf.getText().isEmpty() ||
                            employmentStatusTf.getText().isEmpty() || performanceIndexTf.getText().isEmpty() ||
                            workingHoursTf.getText().isEmpty() || salaryTf.getText().isEmpty() ||
                            specializationTf.getText().isEmpty() || academicQualificationsTf.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Stop further execution
                    } else {
                        addTutor(teacherID, teacherName, address, workingType, employmentStatus, salary, specialization, academicQualifications, performanceIndex, workingHours);
                        JOptionPane.showMessageDialog(null, "Tutor Added");
                    }
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid integer for Teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        //To assign the grades
        gradeAssignmentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int teacherID = Integer.parseInt(teacherIDTf.getText());
                    String department = departmentTf.getText();
                    int gradedScore = Integer.parseInt(gradedScoreTf.getText());
                    int yearsOfExperience = Integer.parseInt(yearsOfExperienceTf.getText());

                    for(Teacher teacher : Teachers ){
                        if(teacher.getTeacherID() == teacherID){
                            if (teacherIDTf.getText().isEmpty() || departmentTf.getText().isEmpty() || gradedScoreTf.getText().isEmpty()|| yearsOfExperienceTf.getText().isEmpty()){
                                JOptionPane.showMessageDialog(null,"Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }else{
                                gradeAssignment(teacherID, gradedScore, department, yearsOfExperience);
                                JOptionPane.showMessageDialog(null,"Grades has been assigned");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Teacher ID doesn't exists", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid integer for Teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        //to set salary
        setSalaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int teacherID = Integer.parseInt(teacherIDTf.getText());
                    int newSalary = Integer.parseInt(newSalaryTf.getText());
                    int newPerformanceIndex = Integer.parseInt(newPerformanceIndexTf.getText());

                    for( Teacher teacher: Teachers){
                        if (teacher.getTeacherID()== teacherID){
                            if (teacherIDTf.getText().isEmpty() || newSalaryTf.getText().isEmpty() || newPerformanceIndexTf.getText().isEmpty()){
                                JOptionPane.showMessageDialog(null,"Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                setTutorSalary(teacherID, newSalary, newPerformanceIndex);
                                JOptionPane.showMessageDialog(null,"New Salary has been assigned");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Teacher ID doesn't exists", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid integer for Teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });


        // To remove tutor
        removeTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int teacherID = Integer.parseInt(teacherIDTf.getText());
                    for( Teacher teacher: Teachers){
                        if(teacher.getTeacherID()== teacherID){
                            if (teacherIDTf.getText().isEmpty()){
                                JOptionPane.showMessageDialog(null,"Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                            }else{
                                removeTutor(teacherID);
                                JOptionPane.showMessageDialog(null,"Tutor has been removed");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Teacher ID doesn't exists", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid integer for Teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        //to display the instances of teacher
        directToDisplayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    // Creating a new JFrame to hold the table
                    JFrame frame = new JFrame("Teacher Information");

                    // Creating a JTable to display the teacher information
                    String[] columnNames = {"Teacher ID", "Teacher Name", "Address", "Working Type", "Employment Status",
                            "Years of Experience", "Graded Score", "Department", "Salary", "Specialization",
                            "Academic Qualifications", "Performance Index", "Teacher Type"};
                    Object[][] data = new Object[Teachers.size()][13];

                    int i = 0;
                    for (Teacher teacher : Teachers) {
                        String teacherType = "";
                        if (teacher instanceof Lecturer) {
                            teacherType = "Lecturer";
                            data[i] = new Object[]{teacher.getTeacherID(), teacher.getTeacherName(), teacher.getAddress(),
                                    teacher.getWorkingType(), teacher.getEmploymentStatus(),
                                    ((Lecturer) teacher).getYearsOfExperience(), ((Lecturer) teacher).getGradedScore(),
                                    ((Lecturer) teacher).getDepartment(), "", "", "", "", teacherType}; // Fill empty fields with ""
                        } else if (teacher instanceof Tutor) {
                            teacherType = "Tutor";
                            data[i] = new Object[]{teacher.getTeacherID(), teacher.getTeacherName(), teacher.getAddress(),
                                    teacher.getWorkingType(), teacher.getEmploymentStatus(),
                                    "", "", "", ((Tutor) teacher).getSalary(), ((Tutor) teacher).getSpecialization(),
                                    ((Tutor) teacher).getAcademicQualifications(), ((Tutor) teacher).getPerformanceIndex(),
                                    teacherType};
                        }
                        i++;
                    }
                    JTable table = new JTable(data, columnNames);

                    // Adding the table to a JScrollPane
                    JScrollPane scrollPane = new JScrollPane(table);
                    frame.add(scrollPane);

                    // Setting JFrame properties
                    frame.pack();
                    frame.setLocationRelativeTo(null); // Center the frame
                    frame.setVisible(true);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        //to display the instances of teacher
        displayInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    JFrame frame = new JFrame();

                    String[] columnNames ={"Teacher ID", "Teacher Name", "Address", "Working Type", "Employment Status",
                            "Years of Experience", "Graded Score", "Department", "Salary", "Specialization",
                            "Academic Qualifications", "Performance Index", "Teacher Type"};
                    Object[][] data = new Object[Teachers.size()][13];

                    int i = 0;
                    for (Teacher teacher : Teachers){
                        String teacherType = "";
                        if (teacher instanceof Lecturer ){
                            teacherType = "Lecturer";
                            data[i] = new Object[]{teacher.getTeacherID(), teacher.getTeacherName(), teacher.getAddress(),
                                    teacher.getWorkingType(), teacher.getEmploymentStatus(),
                                    ((Lecturer) teacher).getYearsOfExperience(), ((Lecturer) teacher).getGradedScore(),
                                    ((Lecturer) teacher).getDepartment(), "", "", "", "", teacherType};
                        }else if (teacher instanceof Tutor){
                            teacherType = "Tutor";
                            data[i] = new Object[]{teacher.getTeacherID(), teacher.getTeacherName(), teacher.getAddress(),
                                    teacher.getWorkingType(), teacher.getEmploymentStatus(),
                                    "", "", "", ((Tutor) teacher).getSalary(), ((Tutor) teacher).getSpecialization(),
                                    ((Tutor) teacher).getAcademicQualifications(), ((Tutor) teacher).getPerformanceIndex(),
                                    teacherType};
                        }
                        i++;
                    }
                    JTable table = new JTable(data, columnNames);

                    // Adding the table to a JScrollPane
                    JScrollPane scrollPane = new JScrollPane(table);
                    frame.add(scrollPane);

                    // Setting JFrame properties
                    frame.pack();
                    frame.setLocationRelativeTo(null); // Center the frame
                    frame.setVisible(true);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });
    }

    //Creating the main method
    public static void main(String[] args) {
        ArrayList<Teacher> Teachers = new ArrayList<>();
        new TeacherGUI(Teachers);
    }
}
