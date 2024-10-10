public class PartTimeJob extends Job {
    public String companyName;
    public String position;
    public int startDate;
    public int endDate;
    public int satisfactionRating;
    public double hourlyWage;
    public int hoursWorkedPerWeek;
    public int ageDuringJob;
    public int fullYearsWorked = super.endDate - super.startDate;
    // CONSTRUCTOR
    public PartTimeJob(String companyName, String position, int startDate, int endDate, int satisfactionRating, double hourlyWage, int hoursWorkedPerWeek, int ageDuringJob) {
        super(companyName, position, startDate, endDate);
        this.satisfactionRating = satisfactionRating;
        this.hourlyWage = hourlyWage;
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
        this.ageDuringJob = ageDuringJob;
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

    public double calculateRevenue() {
        return hourlyWage * hoursWorkedPerWeek;
    }

    public String jobLevel() {
        // Calculates whether the employee was a minor or not when they worked this job.
        if (ageDuringJob <= 17) {
            return "This employee worked this part-time job as a minor";
        } else {
            return "This employee worked this part-time job as an adult";
        }
    }
}
