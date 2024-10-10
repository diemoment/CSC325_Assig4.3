public class FullTimeJob extends Job {
    public String companyName;
    public String position;
    public int startDate;
    public int endDate;
    public int satisfactionRating;
    public double hourlyWage;
    public int hoursWorkedPerWeek;
    public int fullYearsWorked = super.endDate - super.startDate;
    double wlb = hourlyWage / hoursWorkedPerWeek;
    // CONSTRUCTOR
    public FullTimeJob(String companyName, String position, int startDate, int endDate, int satisfactionRating, double hourlyWage, int hoursWorkedPerWeek) {
        super(companyName, position, startDate, endDate);
        this.satisfactionRating = satisfactionRating;
        this.hourlyWage = hourlyWage;
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }
    // METHODS 
    public void displayJobDetails() {
        // Shows the user the Name of the company the employee worked at, the position achieved, and the years worked at the establishment.
        System.out.println("This employee worked at " + super.companyName + " as a(n) " + super.position + ". They worked at this establishment from " + super.startDate + " to " + super.endDate + ".");
    }

    public String calculateJobDuration() {
        // Tells the user the amount of years the employee has worked at the establishment.
        String jobDuration = "This employee has worked at this establishment for ";
        if (fullYearsWorked == 0) {
            jobDuration = "This employee has worked at this establishmant for less than a year.";
            return jobDuration;
        } else {
            return jobDuration + fullYearsWorked + " years.";
        }
    }
    public String assessJobSatisfaction() {
        // Allows the user to assign a generalized satisfaction rating on a scale of 1-5 1 being very disatisfied, and 5 being very satisfied.
        return "This employee gave this job a " + satisfactionRating + " out of 5 satisfaction rating";
    }

    public double calculateSalary() {
        // Calculates the employee's weekly revenue based off of their hourly wage and the number of hours they work a week.
        return hourlyWage * (double)hoursWorkedPerWeek;
    }

    public String evaluateWorkLifeBalance() {
        // Establish a work life balance (wlb) variable used to calculate the worl life balance rating.
        if (wlb <= 0.3) {
            return "Poor";
        } else if (wlb <= 0.5) {
            return "Moderate";
        } else {
            return "Excellent";
        }
    }
}
