import javax.swing.*;// Imports necessary Java Swing packages for GUI components
import java.awt.event.*;// Imports necessary AWT event packages for event handling
import java.util.ArrayList;// Imports ArrayList for storing teachers


// Define TeacherGUI class
// Main method
public class TeacherGUI
 {

    private ArrayList<Teacher> teachers;// ArrayList to store teachers
    private JFrame frame;// Declare GUI components


                   //Add Lecturer Label
    private JLabel LecturerIDLbl,LecturerNameLbl,LecturerAddressLbl,LecturerWorkingTypeLbl,LecturerEmploymentStatusLbl,LecturerWorkingHourLbl,DepartmentLbl,YearsOfExperienceLbl,
                   //Lecturer Grade Assignment Label
                   GradedScoreLbl,NextLecturerIDLbl,NextDepartmentLbl,NextYearsOfExperienceLbl,
                   //Add Tutor Label
                   TutorIDLbl,TutorNameLbl,TutorAddressLbl,TutorWorkingTypeLbl,TutorEmploymentStatusLbl,SpecializationLbl,AcademicQualificationLbl,PerformanceIndexLbl,SalaryLbl,TutorWorkingHourLbl,
                   //Tutor Set Salary Label
                   NextTutorIDLbl,NextPerformanceIndexLbl,NextSalaryLbl,NextTutorWorkingHourLbl,
                   //Title
                   ForFullTimeEmployeeLbl;


                   //Add Lecturer TextField
    private JTextField LecturerIDTF,LecturerNameTF,LecturerAddressTF,LecturerWorkingTypeTF,LecturerEmploymentStatusTF,LecturerWorkingHourTF,DepartmentTF,YearsOfExperienceTF,
                    //Lecturer Grade Assignment TextField
                    GradedScoreTF,NextLecturerIDTF,NextDepartmentTF,NextYearsOfExperienceTF,
                    //Tutor Set Salary TextField
                    TutorIDTF,TutorNameTF,TutorAddressTF,TutorWorkingTypeTF,TutorEmploymentStatusTF,TutorWorkingHourTF,SpecializationTF,AcademicQualificationTF,PerformanceIndexTF,SalaryTF,
                    NextTutorIDTF,NextTutorWorkingHourTF,NextSalaryTF,NextPerformanceIndexTF;


                    //Lecturer and Clear Button
    private JButton btnAddLecturer,btnDisplayLecturer,btnGradeAssignment,btnClear,
                    //Tutor Buttons
                    btnAddTutor,btnDisplayTutor,btnSetSalary,btnRemoveTutor;

    // Constructor
    private TeacherGUI() {
      
     // Initialize frame
     frame = new JFrame();
     frame.setSize(1313, 900);
     frame.setLocationRelativeTo(null);
     frame.setTitle(" Record system");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLayout(null);

     teachers = new ArrayList<>();// Initialize ArrayList to store teachers

     // Title
     ForFullTimeEmployeeLbl = new JLabel();
     ForFullTimeEmployeeLbl.setText("For Full Time Employee");
     ForFullTimeEmployeeLbl.setBounds(10, 10, 200, 20);
     frame.add(ForFullTimeEmployeeLbl);
 
    
     //Lecturer 


     //Lecturer Section 1
     LecturerIDLbl = new JLabel();
     LecturerIDLbl.setText("Lecturer ID");
     LecturerIDLbl.setBounds(10, 70, 120, 20);
     frame.add(LecturerIDLbl);
     LecturerIDTF = new JTextField();
     LecturerIDTF.setText("");
     LecturerIDTF.setBounds(150, 70, 150, 20);
     frame.add(LecturerIDTF);

     LecturerNameLbl = new JLabel();
     LecturerNameLbl.setText("Lecturer Name");
     LecturerNameLbl.setBounds(10, 110, 120, 20);
     frame.add(LecturerNameLbl);
     LecturerNameTF = new JTextField();
     LecturerNameTF.setText("");
     LecturerNameTF.setBounds(150, 110, 150, 20);
     frame.add(LecturerNameTF);

     LecturerAddressLbl = new JLabel();
     LecturerAddressLbl.setText("Lecturer Address");
     LecturerAddressLbl.setBounds(10, 150, 120, 20);
     frame.add(LecturerAddressLbl);
     LecturerAddressTF = new JTextField();
     LecturerAddressTF.setText("");
     LecturerAddressTF.setBounds(150, 150, 150, 20);
     frame.add(LecturerAddressTF);

     LecturerWorkingTypeLbl = new JLabel();
     LecturerWorkingTypeLbl.setText("Working Type");
     LecturerWorkingTypeLbl.setBounds(10, 190, 120, 20);
     frame.add(LecturerWorkingTypeLbl);
     LecturerWorkingTypeTF = new JTextField();
     LecturerWorkingTypeTF.setText("");
     LecturerWorkingTypeTF.setBounds(150, 190, 150, 20);
     frame.add(LecturerWorkingTypeTF);

     LecturerEmploymentStatusLbl = new JLabel();
     LecturerEmploymentStatusLbl.setText("Employment Status");
     LecturerEmploymentStatusLbl.setBounds(10, 230, 120, 20);
     frame.add(LecturerEmploymentStatusLbl);
     LecturerEmploymentStatusTF = new JTextField();
     LecturerEmploymentStatusTF.setText("");
     LecturerEmploymentStatusTF.setBounds(150, 230, 150, 20);
     frame.add(LecturerEmploymentStatusTF);

     LecturerWorkingHourLbl = new JLabel();
     LecturerWorkingHourLbl.setText("Working Hour");
     LecturerWorkingHourLbl.setBounds(10, 270, 120, 20);
     frame.add(LecturerWorkingHourLbl);
     LecturerWorkingHourTF = new JTextField();
     LecturerWorkingHourTF.setText("");
     LecturerWorkingHourTF.setBounds(150, 270, 150, 20);
     frame.add(LecturerWorkingHourTF);

     DepartmentLbl = new JLabel();
     DepartmentLbl.setText("Department");
     DepartmentLbl.setBounds(10, 310, 120, 20);
     frame.add(DepartmentLbl);
     DepartmentTF = new JTextField();
     DepartmentTF.setText("");
     DepartmentTF.setBounds(150, 310, 150, 20);
     frame.add(DepartmentTF);

     YearsOfExperienceLbl = new JLabel();
     YearsOfExperienceLbl.setText("Years Of Experience");
     YearsOfExperienceLbl.setBounds(10, 350, 120, 20);
     frame.add(YearsOfExperienceLbl);
     YearsOfExperienceTF = new JTextField();
     YearsOfExperienceTF.setText("");
     YearsOfExperienceTF.setBounds(150, 350, 150, 20);
     frame.add(YearsOfExperienceTF);



     //Lecturer Section 2

     GradedScoreLbl = new JLabel();
     GradedScoreLbl.setText("Graded Score");
     GradedScoreLbl.setBounds(340, 230, 120, 20);
     frame.add(GradedScoreLbl);
     GradedScoreTF = new JTextField();
     GradedScoreTF.setText("");
     GradedScoreTF.setBounds(480, 230, 150, 20);
     frame.add(GradedScoreTF);

     NextLecturerIDLbl = new JLabel();
     NextLecturerIDLbl.setText("Lecturer ID");
     NextLecturerIDLbl.setBounds(340, 270, 120, 20);
     frame.add(NextLecturerIDLbl);
     NextLecturerIDTF = new JTextField();
     NextLecturerIDTF.setText("");
     NextLecturerIDTF.setBounds(480, 270, 150, 20);
     frame.add(NextLecturerIDTF);


     NextDepartmentLbl = new JLabel();
     NextDepartmentLbl.setText("Department");
     NextDepartmentLbl.setBounds(340, 310, 120, 20);
     frame.add(NextDepartmentLbl);
     NextDepartmentTF = new JTextField();
     NextDepartmentTF.setText("");
     NextDepartmentTF.setBounds(480, 310, 150, 20);
     frame.add(NextDepartmentTF);


     NextYearsOfExperienceLbl = new JLabel();
     NextYearsOfExperienceLbl.setText("Years Of Experience");
     NextYearsOfExperienceLbl.setBounds(340, 350, 120, 20);
     frame.add(NextYearsOfExperienceLbl);
     NextYearsOfExperienceTF = new JTextField();
     NextYearsOfExperienceTF.setText("");
     NextYearsOfExperienceTF.setBounds(480, 350, 150, 20);
     frame.add(NextYearsOfExperienceTF);
        


    // Tutor Section 1



    TutorIDLbl = new JLabel();
    TutorIDLbl.setText("Tutor ID");
    TutorIDLbl.setBounds(670, 70, 120, 20);
    frame.add(TutorIDLbl);
    TutorIDTF = new JTextField();
    TutorIDTF.setText("");
    TutorIDTF.setBounds(810, 70, 150, 20);
    frame.add(TutorIDTF);

    TutorNameLbl = new JLabel();
    TutorNameLbl.setText("Tutor Name");
    TutorNameLbl.setBounds(670, 110, 120, 20);
    frame.add(TutorNameLbl);
    TutorNameTF = new JTextField();
    TutorNameTF.setText("");
    TutorNameTF.setBounds(810, 110, 150, 20);
    frame.add(TutorNameTF);

    TutorAddressLbl = new JLabel();
    TutorAddressLbl.setText("Tutor Address");
    TutorAddressLbl.setBounds(670, 150, 120, 20);
    frame.add(TutorAddressLbl);
    TutorAddressTF = new JTextField();
    TutorAddressTF.setText("");
    TutorAddressTF.setBounds(810, 150, 150, 20);
    frame.add(TutorAddressTF);

    TutorWorkingTypeLbl = new JLabel();
    TutorWorkingTypeLbl.setText("Working Type");
    TutorWorkingTypeLbl.setBounds(670, 190, 120, 20);
    frame.add(TutorWorkingTypeLbl);
    TutorWorkingTypeTF = new JTextField();
    TutorWorkingTypeTF.setText("");
    TutorWorkingTypeTF.setBounds(810, 190, 150, 20);
    frame.add(TutorWorkingTypeTF);

    TutorEmploymentStatusLbl = new JLabel();
    TutorEmploymentStatusLbl.setText("Employment Status");
    TutorEmploymentStatusLbl.setBounds(670, 230, 120, 20);
    frame.add(TutorEmploymentStatusLbl);
    TutorEmploymentStatusTF = new JTextField();
    TutorEmploymentStatusTF.setText("");
    TutorEmploymentStatusTF.setBounds(810, 230, 150, 20);
    frame.add(TutorEmploymentStatusTF);

    SpecializationLbl = new JLabel();
    SpecializationLbl.setText("Specialization");
    SpecializationLbl.setBounds(670, 270, 120, 20);
    frame.add(SpecializationLbl);
    SpecializationTF = new JTextField();
    SpecializationTF.setText("");
    SpecializationTF.setBounds(810, 270, 150, 20);
    frame.add(SpecializationTF);

    AcademicQualificationLbl = new JLabel();
    AcademicQualificationLbl.setText("Academic Status");
    AcademicQualificationLbl.setBounds(670, 310, 120, 20);
    frame.add(AcademicQualificationLbl);
    AcademicQualificationTF = new JTextField();
    AcademicQualificationTF.setText("");
    AcademicQualificationTF.setBounds(810, 310, 150, 20);
    frame.add(AcademicQualificationTF);

    PerformanceIndexLbl = new JLabel();
    PerformanceIndexLbl.setText("Performance Index");
    PerformanceIndexLbl.setBounds(670, 350, 120, 20);
    frame.add(PerformanceIndexLbl);
    PerformanceIndexTF = new JTextField();
    PerformanceIndexTF.setText("");
    PerformanceIndexTF.setBounds(810, 350, 150, 20);
    frame.add(PerformanceIndexTF);

    SalaryLbl = new JLabel();
    SalaryLbl.setText("Salary");
    SalaryLbl.setBounds(670, 390, 120, 20);
    frame.add(SalaryLbl);
    SalaryTF = new JTextField();
    SalaryTF.setText("");
    SalaryTF.setBounds(810, 390, 150, 20);
    frame.add(SalaryTF);

    TutorWorkingHourLbl = new JLabel();
    TutorWorkingHourLbl.setText("Working Hour");
    TutorWorkingHourLbl.setBounds(670, 430, 120, 20);
    frame.add(TutorWorkingHourLbl);
    TutorWorkingHourTF = new JTextField();
    TutorWorkingHourTF.setText("");
    TutorWorkingHourTF.setBounds(810, 430, 150, 20);
    frame.add(TutorWorkingHourTF);




   //Tutor Section 2


    NextTutorIDLbl = new JLabel();
    NextTutorIDLbl.setText("Tutor ID");
    NextTutorIDLbl.setBounds(1000, 310, 120, 20);
    frame.add(NextTutorIDLbl);
    NextTutorIDTF = new JTextField();
    NextTutorIDTF.setText("");
    NextTutorIDTF.setBounds(1140, 310, 150, 20);
    frame.add(NextTutorIDTF);    

    NextPerformanceIndexLbl = new JLabel();
    NextPerformanceIndexLbl.setText("Performance Index");
    NextPerformanceIndexLbl.setBounds(1000, 350, 120, 20);
    frame.add(NextPerformanceIndexLbl);
    NextPerformanceIndexTF = new JTextField();
    NextPerformanceIndexTF.setText("");
    NextPerformanceIndexTF.setBounds(1140, 350, 150, 20);
    frame.add(NextPerformanceIndexTF);

    NextSalaryLbl = new JLabel();
    NextSalaryLbl.setText("Salary");
    NextSalaryLbl.setBounds(1000, 390, 120, 20);
    frame.add(NextSalaryLbl);
    NextSalaryTF = new JTextField();
    NextSalaryTF.setText("");
    NextSalaryTF.setBounds(1140, 390, 150, 20);
    frame.add(NextSalaryTF);

    NextTutorWorkingHourLbl = new JLabel();
    NextTutorWorkingHourLbl.setText("Working Hour");
    NextTutorWorkingHourLbl.setBounds(1000, 430, 120, 20);
    frame.add(NextTutorWorkingHourLbl);
    NextTutorWorkingHourTF = new JTextField();
    NextTutorWorkingHourTF.setText("");
    NextTutorWorkingHourTF.setBounds(1140, 430, 150, 20);
    frame.add(NextTutorWorkingHourTF);





    // Buttons



    // Lecturer Buttons



    // Add Lecturer button
    btnAddLecturer = new JButton("Add Lecturer");
    btnAddLecturer.setBounds(150, 390, 150, 20);
    frame.add(btnAddLecturer);


     // Add action listener to Add Lecturer button
     btnAddLecturer.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
        // Get input values from text fields
        String LecturerID = LecturerIDTF.getText().trim();
        String LecturerName = LecturerNameTF.getText().trim();
        String LecturerAddress = LecturerAddressTF.getText().trim();
        String LecturerWorkingType = LecturerWorkingTypeTF.getText().trim();
        String LecturerEmploymentStatus = LecturerEmploymentStatusTF.getText().trim();
        String LecturerWorkingHour = LecturerWorkingHourTF.getText().trim();
        String Department = DepartmentTF.getText().trim();
        String YearsOfExperience = YearsOfExperienceTF.getText().trim();

        
        // Validate input (e.g., check if any field is empty)
        if (LecturerID.isEmpty() || LecturerName.isEmpty() || LecturerAddress.isEmpty() || LecturerWorkingType.isEmpty() ||
            LecturerWorkingHour.isEmpty() || LecturerEmploymentStatus.isEmpty() || Department.isEmpty() || YearsOfExperience.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method if any field is empty
        }
        try {
            // Convert numerical inputs
            int LID = Integer.parseInt(LecturerID);
            int LYOE = Integer.parseInt(YearsOfExperience);
            int LWH = Integer.parseInt(LecturerWorkingHour);
            
            // Create a new Lecturer object
            Lecturer newLecturer = new Lecturer(LID, LecturerName, LecturerAddress, LecturerWorkingType, LecturerEmploymentStatus,
                    Department, LYOE, LWH);
                    teachers.add(newLecturer);

                    String LecturerDetail= "Teacher ID:" + LecturerID + "\n"+
                    "LecturerName:" + LecturerName + "\n"+
                    "Address:" + LecturerAddress + "\n"+
                    "Working Type:" + LecturerWorkingType + "\n"+
                    "EmploymentStatus:" + LecturerEmploymentStatus + "\n"+
                    "WorkingHour:" + LecturerWorkingHour+ "\n"+
                    "Department:" + Department + "\n"+
                    "YearsOfExperience:" + YearsOfExperience + "\n";
    
          

            // Add the new lecturer to the ArrayList
            

            //Displays a message Lecturer successfully added
            JOptionPane.showMessageDialog(frame,"Lecturer added successfully.\n\n" + LecturerDetail,"Lecture Detail",
            JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            // Handle number format exception
            JOptionPane.showMessageDialog(frame, "Invalid input for numerical fields.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            // Handle any unexpected errors
            JOptionPane.showMessageDialog(frame, "An error occurred: " + ex.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
});



       
       // Display Lecturer button

       btnDisplayLecturer = new JButton("Display Lecturer");
       btnDisplayLecturer.setBounds(150, 430, 150, 20);
       frame.add(btnDisplayLecturer);

       // Display Button Functionality
       btnDisplayLecturer.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

        String teacherDetails = "";

        // Appending details of all teachers
        for (Teacher teacher : teachers) {
            if (teacher instanceof Lecturer){
                Lecturer lecturer = (Lecturer) teacher;

                teacher.display();
                // Appending details for Lecturer
                System.out.println("Lecturer Details:\n");
                teacherDetails +="Teacher ID: " + teacher.getTeacherID() + "\n";
                teacherDetails += "Teacher Name: " + teacher.getTeacherName() + "\n";
                teacherDetails +="Address: " + teacher.getAddress() + "\n";
                teacherDetails +="Working Type: " + ((Lecturer) teacher).getWorkingType() + "\n";
                teacherDetails +="Employment Status: " + ((Lecturer) teacher).getEmploymentStatus() + "\n";
                teacherDetails +="WorkingHour: " + ((Lecturer) teacher).getWorkingHour() + "\n";
                teacherDetails +="Department: " + ((Lecturer) teacher).getDepartment() + "\n";
                teacherDetails +="Years of Experience: " + ((Lecturer) teacher).getYearsOfExperience() + "\n";
                if (lecturer.getHasGraded()){
                //for lecturer grade assignment display 
                teacherDetails +="Teacher ID: " + teacher.getTeacherID() + "\n";
                teacherDetails +="Graded Score: " + ((Lecturer) teacher).getGradedScore() + "\n";
                teacherDetails +="Department: " + ((Lecturer) teacher).getDepartment() + "\n";
                teacherDetails +="Years of Experience: " + ((Lecturer) teacher).getYearsOfExperience() + "\n";

                }
            } 

            
        }

        // Displays teacher details
        JOptionPane.showMessageDialog(frame, teacherDetails, "Teacher Details", JOptionPane.INFORMATION_MESSAGE);
      }
    });






        //Lecturer Grade Assignment Button
    

    
        // Grade The Assignment Button
        btnGradeAssignment = new JButton("Grade Assignment");
        btnGradeAssignment.setBounds(480, 390, 150, 20);
        frame.add(btnGradeAssignment);
          
         // Update Grade Assignment Button Functionality
         btnGradeAssignment.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
  
            String NextLecturerID = NextLecturerIDTF.getText().trim();
            String NextDepartment = NextDepartmentTF.getText().trim();
            String NextYearsOfExperience = NextYearsOfExperienceTF.getText().trim(); 
            String GradedScore = GradedScoreTF.getText().trim(); 

          
            // Validate input (e.g., check if any field is empty)
           if (NextLecturerID.isEmpty() || NextDepartment.isEmpty() || NextYearsOfExperience.isEmpty() || GradedScore.isEmpty()){
           JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
           return; // Exit method if any field is empty
    }
         
            try {
              int NLID = Integer.parseInt(NextLecturerIDTF.getText().trim());
              double GS = Double.parseDouble(GradedScoreTF.getText().trim());
              String ND = NextDepartmentTF.getText().trim();
              int NLYOE = Integer.parseInt(NextYearsOfExperienceTF.getText().trim());
  
              // Finding the lecturer with the given id
              Lecturer lecturer = null;
              for (Teacher teacher : teachers) {
                  if (teacher.getTeacherID() == NLID && teacher instanceof Lecturer) {
                      lecturer = (Lecturer) teacher;
                      break;
                  }
              }
              // If the lecturer is not found, show an error message
              if (lecturer == null) {
                  JOptionPane.showMessageDialog(frame, "Lecturer with id " + NLID + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
              }
  
              // Grade the assignment
              lecturer.gradeAssignment( GS, ND, NLYOE);
  
              // Show success message
              JOptionPane.showMessageDialog(frame, "Assignment graded successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
  
          } catch (NumberFormatException ex) {
              // Handle number format exception
              JOptionPane.showMessageDialog(frame, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
          }
        }
      });



       //Tutor Buttons 




      // Add Tutor Button

      btnAddTutor = new JButton("Add Tutor");
      btnAddTutor.setBounds(810, 470, 150, 20);
      frame.add(btnAddTutor);

      // Action listener to Add a Tutor button
      btnAddTutor.addActionListener(new ActionListener() 
      {
      public void actionPerformed(ActionEvent e) {

        // Get input values from text fields
        String TutorID = TutorIDTF.getText().trim();
        String TutorName = TutorNameTF.getText().trim();
        String Address = TutorAddressTF.getText().trim();
        String WorkingType = TutorWorkingTypeTF.getText().trim();
        String Employmentstatus = TutorEmploymentStatusTF.getText().trim();
        String Specialization = SpecializationTF.getText().trim();
        String acedemicQualifications = AcademicQualificationTF.getText().trim();
        String PerformanceIndex = PerformanceIndexTF.getText().trim();
        String Salary = SalaryTF.getText().trim();
        String Workinghour = (TutorWorkingHourTF.getText().trim());


        // Validating input (for example, checking if any field is empty)
          if (TutorID.isEmpty() || TutorName.isEmpty() || Address.isEmpty() || WorkingType.isEmpty()|| Employmentstatus.isEmpty()
                                || Workinghour.isEmpty() || Salary.isEmpty() || Specialization.isEmpty()
                                || acedemicQualifications.isEmpty() || PerformanceIndex.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return; // Exit method if any field is empty
                }
                
         try {
                    int TID = Integer.parseInt(TutorID);
                    int TWH = Integer.parseInt(Workinghour);
                    int TS = Integer.parseInt(Salary);
                    int TPI = Integer.parseInt(PerformanceIndex);

                       // Checks for duplicate teacher ID
                       for (Teacher teacher : teachers) {
                        if (teacher.getTeacherID() == TID) {
                        JOptionPane.showMessageDialog(frame, "Teacher ID already exists.", "Error",
                              JOptionPane.ERROR_MESSAGE);
                         return;
                    }
                }

                    // Create a new Lecturer object
                    Tutor newTutor = new Tutor(TID, TutorName, Address, WorkingType, Employmentstatus, TWH, TS,
                            Specialization, acedemicQualifications, TPI);

                    // Adding the new lecturer to the ArrayList
                    teachers.add(newTutor);

                    //Displays a message indicating Tutor added successfully
                    JOptionPane.showMessageDialog(null, "Tutor added successfully.", "Success",
                            JOptionPane.INFORMATION_MESSAGE);

                    

                 } catch (NumberFormatException ex) {
                    // Handles number format exception
                    JOptionPane.showMessageDialog(frame, "Invalid input for .", "Error", JOptionPane.ERROR_MESSAGE);
                 } catch (Exception ex) {
                    // Handles any unexpected errors
                    JOptionPane.showMessageDialog(frame, "An error occurred: " + ex.getMessage(), "Error",
                            JOptionPane.ERROR_MESSAGE);
                 }
             }

          });








      // DisplayTutor button

      btnDisplayTutor = new JButton("Display Tutor");
      btnDisplayTutor.setBounds(810, 510, 150, 20);
      frame.add(btnDisplayTutor);

      // DisplayTutor Button Functionality
      btnDisplayTutor.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

      String teacherDetails = "";

      // Appending details of all teachers
      for (Teacher teacher : teachers) {
         if (teacher instanceof Tutor) {
            teacher.display();

           // Appending details for Tutor
           System.out.println("Tutor Details:\n");
           teacherDetails +="Teacher ID: " + teacher.getTeacherID() + "\n";
           teacherDetails +="Teacher Name: " + teacher.getTeacherName() + "\n";
           teacherDetails +="Address: " + teacher.getAddress() + "\n";
           teacherDetails +="Working Type: " + ((Tutor) teacher).getWorkingType() + "\n";
           teacherDetails +="Employment Status: " + ((Tutor) teacher).getEmploymentStatus() + "\n";
           teacherDetails +="Specialization: " + ((Tutor) teacher).getSpecialization() + "\n";
           teacherDetails +="Academic Qualifications: " + ((Tutor) teacher).getAcedemicQualifications() + "\n";
           teacherDetails +="Performance Index: " + ((Tutor) teacher).getPerformanceIndex() + "\n";
           teacherDetails +="Salary: " + ((Tutor) teacher).getSalary() + "\n";
           teacherDetails +="Working Hour: " + ((Tutor) teacher).getWorkingHour() + "\n";

           teacherDetails +="Teacher ID: " + teacher.getTeacherID() + "\n";
           teacherDetails +="Performance Index: " + ((Tutor) teacher).getPerformanceIndex() + "\n";
           teacherDetails +="Salary: " + ((Tutor) teacher).getSalary() + "\n";
           teacherDetails +="Working Hour: " + ((Tutor) teacher).getWorkingHour() + "\n";

        //    System.out.println("Tutor Details:");
        //    System.out.println(teacherDetails);
        //    teacherDetails = "";
        }
   }

   if (teacherDetails.isEmpty()) {
       JOptionPane.showMessageDialog(frame, "No tutors found.", "Information", JOptionPane.INFORMATION_MESSAGE);
   } else {
       JOptionPane.showMessageDialog(frame, teacherDetails, "Tutor Details", JOptionPane.INFORMATION_MESSAGE);
   }
 }
});



   
      //Set Salary Button

         
      //Set Salary Tutor Button

      btnSetSalary = new JButton("Set Salary");
      btnSetSalary.setBounds(1140, 470, 150, 20);
      frame.add(btnSetSalary);

      btnSetSalary.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        int NextTutorID = Integer.parseInt(NextTutorIDTF.getText().trim());
        int NextPerformanceIndex = Integer.parseInt(NextPerformanceIndexTF.getText().trim());
        int NextSalary = Integer.parseInt(NextSalaryTF.getText().trim()); 
        int NextTutorWorkingHour = Integer.parseInt(NextTutorWorkingHourTF.getText().trim());

        
         try {
    
            Tutor tutor = null;
            // Finds the tutor with the given id
            for (Teacher teacher : teachers) {
                if (teacher.getTeacherID() == NextTutorID && teacher instanceof Tutor) {
                    tutor = (Tutor) teacher;
                    break;
                }
            }
            // If the tutor is not found,shows Error Message
            if (tutor == null) {
                JOptionPane.showMessageDialog(frame, "Tutor with id " +" not found.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Checks if performance index is less than 5 or working hours is less than or equal to 20
            if (NextPerformanceIndex >= 5 && tutor.getWorkingHour() > 20) {
                tutor.salary(NextSalary, NextPerformanceIndex);
                tutor.setWorkingHour(NextTutorWorkingHour);

                JOptionPane.showMessageDialog(frame, "Tutor with id " + NextTutorID+ " salary was set.", "Salary", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Tutor with id " + NextTutorID + " does not meet requirements for salary setting.", "Error", 
                JOptionPane.ERROR_MESSAGE);
            }
            
           } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(frame, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
          }
      
  }});



     // Remove Tutor Button

     btnRemoveTutor = new JButton("Remove Tutor");
     btnRemoveTutor.setBounds(1140, 510, 150, 20);
     frame.add(btnRemoveTutor);
     
     // remove tutor button functionality
     btnRemoveTutor.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

        // Gets the input from the text fields
        int id = Integer.parseInt(TutorIDTF.getText());

                for(Teacher teacher : teachers){
                    if(teacher.getTeacherID()==id && teacher instanceof Tutor){
                      Tutor tutor = (Tutor) teacher; // Casted to Tutor
                if (tutor.isCertified()) {
                    JOptionPane.showMessageDialog(frame, "Cannot remove a certified tutor.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    teachers.remove(teacher);
                    JOptionPane.showMessageDialog(frame, "Tutor with " + id + " removed successfully.", "Removed", JOptionPane.INFORMATION_MESSAGE);
                }
                break; // Stops iterating after finding the tutor
            }
        }
    }
});





    //  Clear Button

    btnClear = new JButton("Clear ALL");
    btnClear.setBounds(480, 430, 150, 40);
    frame.add(btnClear);
    btnClear.addActionListener(new ActionListener()
  {
    public void actionPerformed(ActionEvent e){
        clearFields();
            }
        });

  System.out.println("TeacherGUI");

  frame.setVisible(true);

        

  // main function

    }

   // Main method
    public static void main(String arg[]) {
        // Create an instance of TeacherGUI
        new TeacherGUI();
    }

    // Method to clear all text fields
    private void clearFields() {

         // Clears All Text fields

         // Clears Lecturer TextFields
        LecturerIDTF.setText("");
        LecturerNameTF.setText("");
        LecturerAddressTF.setText("");
        LecturerWorkingTypeTF.setText("");
        LecturerEmploymentStatusTF.setText("");
        LecturerWorkingHourTF.setText("");
        DepartmentTF.setText("");
        YearsOfExperienceTF.setText("");

        // Clears Lecturer Grade Assignment TextFields
        GradedScoreTF.setText("");
        NextLecturerIDTF.setText("");
        NextDepartmentTF.setText("");
        NextYearsOfExperienceTF.setText("");

        //Clears Tutor TextFields
        TutorIDTF.setText("");
        TutorNameTF.setText("");
        TutorAddressTF.setText("");
        TutorWorkingTypeTF.setText("");
        TutorEmploymentStatusTF.setText("");
        TutorWorkingHourTF.setText("");
        SpecializationTF.setText("");
        AcademicQualificationTF.setText("");
        PerformanceIndexTF.setText("");
        SalaryTF.setText("");

        //Clears Set Salary TextFields
        NextTutorIDTF.setText("");
        NextPerformanceIndexTF.setText("");
        NextSalaryTF.setText("");
        NextTutorWorkingHourTF.setText("");

    }
    
}
