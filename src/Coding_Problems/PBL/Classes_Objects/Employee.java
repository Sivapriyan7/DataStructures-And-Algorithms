package Coding_Problems.PBL.Classes_Objects;
public class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    // Constructor to initialize all member variables
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getter for the annual salary
    public double getAnnualSalary() {
        return annualSalary;
    }

    // Setter for the annual salary
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    // Getter for the year started
    public int getYearStarted() {
        return yearStarted;
    }

    // Setter for the year started
    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    // Getter for the national insurance number
    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    // Setter for the national insurance number
    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}
