import java.util.ArrayList;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeMap;
import java.awt.Color;

public class GUI {
    public GUI(){
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(BorderFactory.createEmptyBorder(6, 15, 6, 15));
        menuBar.setBackground(Color.LIGHT_GRAY);
        frame.setJMenuBar(menuBar);

        JMenu teacherMenu =  new JMenu("Teacher");
        JMenu lecturerMenu =  new JMenu("Lecturer");
        JMenu tutorMenu = new JMenu("Tutor");

        JMenuItem showGradeAssignmentInfoItem = new JMenuItem("Grade Assignment");
        JMenuItem addLecturerInfoItem = new JMenuItem("Add Lecturer");
        JMenuItem addTutorInfoItem = new JMenuItem("Add Tutor");
        JMenuItem setSalaryInfoItem = new JMenuItem("Set Salary");
        JMenuItem removeTutorInfoItem = new JMenuItem("Remove Tutor");
        JMenuItem displayInfoItem =  new JMenuItem("Display");

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

        JLabel messageLabel = new JLabel("Teachers:");
        JLabel teacherIDLabel = new JLabel("Teacher ID:");
        JLabel teacherNameLabel = new JLabel("Teacher Name:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel workingTypeLabel = new JLabel("Working Type:");
        JLabel employmentStatusLabel = new JLabel("Employment Status:");
        JLabel workingHoursLabel =  new JLabel("Working Hours:");
        JLabel departmentLabel = new JLabel("Department:");
        JLabel yearsOfExperienceLabel = new JLabel("Years Of Experience:");
        JLabel gradedScoreLabel = new JLabel("Graded Score:");
        JLabel salaryLabel = new JLabel("Salary:");
        JLabel specializationLabel =  new JLabel("Specialization:");
        JLabel academicQualificationsLabel =  new JLabel("Academic Qualifications:");
        JLabel performanceIndexLabel = new JLabel("Performance Index:");
        JLabel newSalaryLabel = new JLabel("New Salary:");
        JLabel newPerformanceIndexLabel = new JLabel("New Performance Index:");

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

        JButton addLecturerButton = new JButton("Add Lecturer");
        JButton addTutorButton = new JButton("Add Tutor");
        JButton gradeAssignmentsButton = new JButton("Grade Assignments");
        JButton setSalaryButton = new JButton("Set Salary");
        JButton removeTutorButton = new JButton("Remove Tutor");
        JButton displayButton = new JButton("Display");
        JButton clearButton = new JButton("Clear");
        JButton directToGradeAssignmentButton = new JButton("Grade Assignment");
        JButton directToSetSalaryButton = new JButton("Set Salary");
        JButton directToRemoveTutorButton = new JButton("Remove Tutor");
        JButton directToAddLecturerButton = new JButton("Add Lecturer");
        JButton directToAddTutorButton =  new JButton("Add Tutor");
        JButton directToDisplayButton = new JButton("Display");
        JButton returnButton = new JButton("⇐");


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

        frame.add(panel);
        frame.setVisible(true);

        addLecturerInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                displayButton.setVisible(false);
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
                displayButton.setVisible(false);
                directToGradeAssignmentButton.setVisible(false);
                directToSetSalaryButton.setVisible(false);
                directToRemoveTutorButton.setVisible(false);
                directToAddLecturerButton.setVisible(false);
                directToAddTutorButton.setVisible(false);
                directToDisplayButton.setVisible(false);
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                displayButton.setVisible(true);
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

            }
        });

        addTutorInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                displayButton.setVisible(false);
                directToGradeAssignmentButton.setVisible(false);
                directToSetSalaryButton.setVisible(false);
                directToRemoveTutorButton.setVisible(false);
                directToAddLecturerButton.setVisible(false);
                directToAddTutorButton.setVisible(false);
                directToDisplayButton.setVisible(false);

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

            }
        });

        directToAddTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                displayButton.setVisible(false);
                directToGradeAssignmentButton.setVisible(false);
                directToSetSalaryButton.setVisible(false);
                directToRemoveTutorButton.setVisible(false);
                directToAddLecturerButton.setVisible(false);
                directToAddTutorButton.setVisible(false);
                directToDisplayButton.setVisible(false);

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

            }
        });

        showGradeAssignmentInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                displayButton.setVisible(false);
                directToGradeAssignmentButton.setVisible(false);
                directToSetSalaryButton.setVisible(false);
                directToRemoveTutorButton.setVisible(false);
                directToAddLecturerButton.setVisible(false);
                directToAddTutorButton.setVisible(false);
                directToDisplayButton.setVisible(false);

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
            }
        });

        directToGradeAssignmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                displayButton.setVisible(false);
                directToGradeAssignmentButton.setVisible(false);
                directToSetSalaryButton.setVisible(false);
                directToRemoveTutorButton.setVisible(false);
                directToAddLecturerButton.setVisible(false);
                directToAddTutorButton.setVisible(false);
                directToDisplayButton.setVisible(false);

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
            }
        });

        setSalaryInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                displayButton.setVisible(false);
                directToGradeAssignmentButton.setVisible(false);
                directToSetSalaryButton.setVisible(false);
                directToRemoveTutorButton.setVisible(false);
                directToAddLecturerButton.setVisible(false);
                directToAddTutorButton.setVisible(false);
                directToDisplayButton.setVisible(false);

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
            }
        });

        directToSetSalaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                displayButton.setVisible(false);
                directToGradeAssignmentButton.setVisible(false);
                directToSetSalaryButton.setVisible(false);
                directToRemoveTutorButton.setVisible(false);
                directToAddLecturerButton.setVisible(false);
                directToAddTutorButton.setVisible(false);
                directToDisplayButton.setVisible(false);

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
            }
        });

        removeTutorInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                displayButton.setVisible(false);
                directToGradeAssignmentButton.setVisible(false);
                directToSetSalaryButton.setVisible(false);
                directToRemoveTutorButton.setVisible(false);
                directToAddLecturerButton.setVisible(false);
                directToAddTutorButton.setVisible(false);
                directToDisplayButton.setVisible(false);

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
            }
        });

        directToRemoveTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                displayButton.setVisible(false);
                directToGradeAssignmentButton.setVisible(false);
                directToSetSalaryButton.setVisible(false);
                directToRemoveTutorButton.setVisible(false);
                directToAddLecturerButton.setVisible(false);
                directToAddTutorButton.setVisible(false);
                directToDisplayButton.setVisible(false);

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
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }

    public static void main(String[] args) {
        new GUI();
    }
}
