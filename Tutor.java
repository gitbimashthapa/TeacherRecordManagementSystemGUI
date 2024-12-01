public class Tutor extends Teacher {
    
    // Creating attributes for the Tutor class.
    private double  salary;
    private String  specialization;
    private String  acedemicQualifications;
    private int     performanceIndex;
    private boolean isCertified;
    
    //Constructor for the Tutor class with required parameter.
    Tutor(int teacherID, String teacherName, String address, String workingType, String employmentStatus,
            int workingHour, double salary, String specialization, String acedemicQualifications,
            int performanceIndex) {
                
        // Call the constructor of superclass 'Teacher' with specified parameters.
        super( teacherID, teacherName, address, workingType, employmentStatus);
        
        // Initialize attributes of the Tutor class with given values.
        this.salary = salary;
        this.specialization = specialization;
        this.acedemicQualifications = acedemicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
        
        // Use the setWorkingHours method from the superclass to assign working hours.
        setWorkingHour(workingHour);
    }
    
    //Methods to get the values of attributes.
    public String getSpecialization() {
        return specialization;
    }

    public String getAcedemicQualifications() {
        return acedemicQualifications;
    }

    public int getPerformanceIndex() {
        return performanceIndex;
    }

    public boolean isCertified() {
        return isCertified;
    }
    
    // Method to set the salary based on performanceIndex and workingHours.
    public void salary(double salary, int performanceIndex) {
        double workingHour = getWorkingHour();
        // Verify if Tutor is uncertified.
        if (!isCertified) {
            // Evaluate the criteria for modifying salary considering the performanceIndex and workingHours.
            if (performanceIndex > 5 && workingHour > 20) {
                
                if (performanceIndex >= 5 && performanceIndex <= 7) {
                    this.salary = salary + (5f / 100) * salary;
                }
                 else if (performanceIndex >= 8 && performanceIndex <= 9) {
                    this.salary = salary + (10f / 100) * salary;
                }
                else if (performanceIndex ==10) {
                    this.salary = salary + (20f / 100) * salary;
                }
            }
            
            isCertified=true;
            System.out.println("Salary set Sucessfull");
            
        }
         else {
             System.out.println("Tutor is not certified");
             removeTutor();
             isCertified=true;

        }

    }
    
    // Method to remove a tutor by resetting attributes to default values.
    public void removeTutor() {
        this.salary=0;
        this.specialization=null;
        this.acedemicQualifications=null;
        this.performanceIndex=0;

    }
    
    // Display method for showing tutor information.
    public void display(){
        if(isCertified=false){
            super.display();
        }
        else{
          super.display(); 
         }
        {
          
          System.out.println("Your salary is: "+salary);
          System.out.println("Your specialization is: "+specialization);
          System.out.println("Your acedemic Qualifications is: "+ acedemicQualifications);
          System.out.println("Your performance Index is:"+performanceIndex);
        }
    }

    public double getSalary() {
        return salary;
    }
}