import java.util.ArrayList;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeMap;
import java.awt.Color;

public class TeacherGUI extends JFrame {

    public TeacherGUI(){
        JFrame frame = new JFrame("TeacherGUI");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(BorderFactory.createEmptyBorder(6, 15, 6, 15));
        menuBar.setBackground(Color.LIGHT_GRAY);
        frame.setJMenuBar(menuBar);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);

        JMenu teacherMenu =  new JMenu("Teacher");
        JMenu lecturerMenu =  new JMenu("Lecturer");
        JMenu tutorMenu = new JMenu("Tutor");

        JMenuItem showGradeAssignmentInfoItem = new JMenuItem("Grade Assigment");
        JMenuItem setSalaryInfoItem = new JMenuItem("Set Salary");
        JMenuItem removeTutorInfoItem = new JMenuItem("Remove Tutor");
        JMenuItem displayInfoItem =  new JMenuItem("Display");

        menuBar.add(teacherMenu);
        menuBar.add(lecturerMenu);
        menuBar.add(tutorMenu);
        lecturerMenu.add(showGradeAssignmentInfoItem);
        tutorMenu.add(setSalaryInfoItem);
        tutorMenu.add(removeTutorInfoItem);
        teacherMenu.add(displayInfoItem);

        JLabel messageLabel = new JLabel("Teachers: ");
        JLabel teacherIDLabel = new JLabel("Teacher ID:");
        JLabel teacherNameLabel = new JLabel("Teacher Name:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel workingTypeLabel = new JLabel("Working Type:");
        JLabel employmentStatusLabel = new JLabel("Employment Status:");
        JLabel workingHoursLabel =  new JLabel("Working Hours:");
        JLabel departmentLabel = new JLabel("Department:");
        JLabel yearsOfExperienceLabel = new JLabel("Years Of Experience:");
        JLabel gradedScoreLabel = new JLabel("Graded Score");
        JLabel salaryLabel = new JLabel("Salary:");
        JLabel specializationLabel =  new JLabel("Specialization:");
        JLabel academicQualificationsLabel =  new JLabel("Academic Qualifications:");
        JLabel performanceIndexLabel = new JLabel("Performance Index:");

        JTextField teacherIDTf = new JTextField(15);
        JTextField teacherNameTf = new JTextField(15);
        JTextField addressTf = new JTextField(15);
        JTextField workingTypeTf = new JTextField(15);
        JTextField employmentStatusTf = new JTextField(15);
        JTextField workingHoursTf = new JTextField(15);
        JTextField departmentTf = new JTextField(10);
        JTextField yearsOfExperienceTf = new JTextField(10);
        JTextField gradedScoreTf = new JTextField(10);
        JTextField salaryTf = new JTextField(10);
        JTextField specializationTf = new JTextField(10);
        JTextField academicQualificationsTf = new JTextField(10);
        JTextField performanceIndexTf = new JTextField(10);

        JButton addLecturerButton = new JButton("Add Lecturer");
        JButton addTutorButton = new JButton("Add Tutor");
        JButton gradeAssignmentsButton = new JButton("Grade Assignments");
        JButton setSalaryButton = new JButton("Set Salary");
        JButton removeTutorButton = new JButton("Remove Tutor");
        JButton displayButton = new JButton("Display");
        JButton clearButton = new JButton("Clear");


        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(messageLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(teacherIDLabel, gbc);

        gbc.gridx = 1;
        panel.add(teacherIDTf, gbc);

        gbc.gridx = 3;
        panel.add(addressLabel, gbc);

        gbc.gridx = 4;
        panel.add(addressTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(teacherNameLabel, gbc);

        gbc.gridx = 1;
        panel.add(teacherNameTf, gbc);

        gbc.gridx = 3;
        panel.add(salaryLabel, gbc);

        gbc.gridx = 4;
        panel.add(salaryTf, gbc);

        gbc.gridx = 0;
        gbc.gridy =3;
        panel.add(workingTypeLabel, gbc);

        gbc.gridx = 1;
        panel.add(workingTypeTf, gbc);

        gbc.gridx = 3;
        panel.add(specializationLabel, gbc);

        gbc.gridx = 4;
        panel.add(specializationTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(employmentStatusLabel, gbc);

        gbc.gridx = 1;
        panel.add(employmentStatusTf, gbc);

        gbc.gridx = 3;
        panel.add(academicQualificationsLabel, gbc);

        gbc.gridx = 4;
        panel.add(academicQualificationsTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(workingHoursLabel, gbc);

        gbc.gridx = 1;
        panel.add(workingHoursTf, gbc);

        gbc.gridx = 3;
        panel.add(performanceIndexLabel, gbc);

        gbc.gridx = 4;
        panel.add(performanceIndexTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(departmentLabel, gbc);

        gbc.gridx = 1;
        panel.add(departmentTf, gbc);

        gbc.gridx = 3;
        panel.add(gradedScoreLabel, gbc);

        gbc.gridx = 4;
        panel.add(gradedScoreTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(yearsOfExperienceLabel, gbc);

        gbc.gridx = 1;
        panel.add(yearsOfExperienceTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        panel.add(addLecturerButton, gbc);

        gbc.gridx = 1;
        panel.add(addTutorButton, gbc);

        gbc.gridx = 2;
        panel.add(gradeAssignmentsButton, gbc);

        gbc.gridx = 3;
        panel.add(setSalaryButton, gbc);

        gbc.gridx = 2;
        panel.add(removeTutorButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 10;
        panel.add(displayButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 11;
        panel.add(clearButton, gbc);

        frame.add(panel);
        frame.setVisible(true);

        showGradeAssignmentInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Grade Assignment");
                teacherNameTf.setVisible(false);
                teacherNameLabel.setVisible(false);
                addressLabel.setVisible(false);
                addressTf.setVisible(false);
                workingTypeTf.setVisible(false);
                employmentStatusTf.setVisible(false);
                workingHoursTf.setVisible(false);
                salaryTf.setVisible(false);
                specializationTf.setVisible(false);
                academicQualificationsTf.setVisible(false);
                performanceIndexTf.setVisible(false);
                addLecturerButton.setVisible(false);
                addTutorButton.setVisible(false);
                displayButton.setVisible(false);
                clearButton.setVisible(false);
                workingHoursTf.setVisible(false);
                workingHoursLabel.setVisible(false);
                workingHoursLabel.setVisible(false);
                employmentStatusLabel.setVisible(false);
                salaryLabel.setVisible(false);
                specializationLabel.setVisible(false);
                academicQualificationsLabel.setVisible(false);
                performanceIndexLabel.setVisible( false);
                workingTypeLabel.setVisible(false);
                setSalaryButton.setVisible(false);
                removeTutorButton.setVisible(false);
            }
        });

        setSalaryInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                gbc.gridx = 1;
                gbc.gridy = 1;
                panel.add(teacherIDLabel, gbc);

                gbc.gridx = 2;
                panel.add(teacherIDTf, gbc);

                gbc.gridx = 1;
                gbc.gridy = 2;
                panel.add(salaryLabel,gbc);

                gbc.gridx = 2;
                panel.add(salaryTf, gbc);

                gbc.gridx = 1;
                gbc.gridy = 3;
                panel.add(performanceIndexLabel,gbc);

                gbc.gridx = 2;
                panel.add (performanceIndexTf,gbc);

                gbc.gridx = 1;
                gbc.gridy = 5;
                panel.add(setSalaryButton, gbc);



                // Hide text fields and labels except the ones related to Set Salary
                teacherNameTf.setVisible(false);
                teacherNameLabel.setVisible(false);
                addressTf.setVisible(false);
                addressLabel.setVisible(false);
                workingTypeTf.setVisible(false);
                employmentStatusTf.setVisible(false);
                workingHoursTf.setVisible(false);
                workingHoursLabel.setVisible(false);
                specializationTf.setVisible(false);
                academicQualificationsTf.setVisible(false);
                messageLabel.setText("Set Salary");
                workingTypeLabel.setVisible(false);
                employmentStatusLabel.setVisible(false);
                departmentLabel.setVisible(false);
                departmentTf.setVisible(false);
                yearsOfExperienceLabel.setVisible(false);
                yearsOfExperienceTf.setVisible(false);
                specializationLabel.setVisible(false);
                specializationTf.setVisible(false);
                academicQualificationsLabel.setVisible(false);
                academicQualificationsTf.setVisible(false);
                gradedScoreLabel.setVisible(false);
                gradedScoreTf.setVisible(false);

                // Hide buttons except the ones related to Set Salary
                addLecturerButton.setVisible(false);
                addTutorButton.setVisible(false);
                gradeAssignmentsButton.setVisible(false);
                removeTutorButton.setVisible(false);
                displayButton.setVisible(false);
                clearButton.setVisible(false);
            }
        });

        removeTutorInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hide text fields and labels except the ones related to Remove Tutor
                teacherNameTf.setVisible(false);
                teacherNameLabel.setVisible(false);
                addressTf.setVisible(false);
                addressLabel.setVisible(false);
                workingTypeTf.setVisible(false);
                employmentStatusTf.setVisible(false);
                workingHoursTf.setVisible(false);
                salaryTf.setVisible(false);
                specializationTf.setVisible(false);
                academicQualificationsTf.setVisible(false);
                performanceIndexTf.setVisible(false);
                messageLabel.setText("Remove Tutor");
                // Hide buttons except the ones related to Remove Tutor
                addLecturerButton.setVisible(false);
                addTutorButton.setVisible(false);
                gradeAssignmentsButton.setVisible(false);
                setSalaryButton.setVisible(false);
                displayButton.setVisible(false);
                clearButton.setVisible(false);
                removeTutorButton.setVisible(true);
                salaryLabel.setVisible(false);
                performanceIndexLabel.setVisible(false);
            }
        });





    }

    public static void main(String[] args) {
        new TeacherGUI();
    }
}
