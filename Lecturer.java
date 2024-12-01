public class Lecturer extends Teacher {
    
    // Creating attribute with accessor method
    private String  department;
    private int     yearsOfExperience;
    private double  gradedScore;
    private boolean hasGraded;

    // Construtors with the required parameters.
    Lecturer(int lecturerID, String teacherName, String address, String workingType, String employmentStatus,
            String department, int yearsOfExperience,int workingHour) {
        /* the 'super' keyword is used to make clear distinctions between the main class and its 
         * specialized subclasses. */
        super(lecturerID, teacherName, address, workingType, employmentStatus);
        super.setWorkingHour(workingHour);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false; 

    }

    // Accessor methods for additional attributes.
    public String getDepartment() {
        return department;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public double getGradedScore() {
        return gradedScore;
    }

    public boolean getHasGraded() {
        return hasGraded;
    }

    // Mutator method for gradedScore
    public void setGradedScore(int gradedScore) {
        this.gradedScore = gradedScore;
    }

    // Method to grade assignments.
    public void gradeAssignment(double gradedScore, String department, int yearsOfExperience) {
        
        // IF 'hasGraded' is true then the statements inside the if statement wiil be executed.
        if (!hasGraded) {
            
            // We are checking if the assignment has been reviewed by the correct lecturer.
            
            if (yearsOfExperience >= 5 && this.department.equals(department)) {
                this.gradedScore = gradedScore;
                // we use if, else if and else to give appropriate grade.
                
                if (gradedScore >= 70) {
                    System.out.println("Your Grade is A");
                    
                } else if (gradedScore >= 60) {
                    System.out.println("Your Grade is B");
                    
                } else if (gradedScore >= 50) {
                    System.out.println("Your Grade is C");
                    
                } else if (gradedScore >= 40) {
                    System.out.println("Your Grade is D");
                    
                } else if (gradedScore > 40) {
                    System.out.println("Your Grade is E");
                    
                }
                
            }
            this.hasGraded=true;
        }
        // If assignment is not graded, we print a certain message.
        else {
            System.out.println("Please grade the assignment");
        }

    }
    
    // Override display method to include additional attributes.
    public void display() {
        super.display();
        System.out.println("Your department is: "+department);
        System.out.println("Your years of experience is: "+yearsOfExperience);
        System.out.println("Your score is: "+gradedScore);
    }
}