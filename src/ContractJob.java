public class ContractJob extends Job {
    public String companyName;
    public String position;
    public int startDate;
    public int endDate;
    public int satisfactionRating;
    public int contractDurationHours;
    public double hourlyWage;
    public boolean contractCompanyStability;
    public int fullYearsWorked = super.endDate - super.startDate;
    // CONSTRUCTOR
    public ContractJob(String companyName, String position, int startDate, int endDate, int satisfactionRating, int contractDurationHours, double hourlyWage, boolean contractCompanyStability) {
        super(companyName, position, startDate, endDate);
        this.satisfactionRating = satisfactionRating;
        this.contractDurationHours = contractDurationHours;
        this.hourlyWage = hourlyWage;
        this.contractCompanyStability = contractCompanyStability;
    }
    // METHODS 
    public void displayJobDetails() {
        // Shows the user the Name of the company the employee worked at, the position achieved, and the years worked at the establishment.
        System.out.println("This employee worked at " + super.companyName + " as a(n) " + super.position + ". They worked to complete this contract from " + super.startDate + " to " + super.endDate + ".");
    }

    public String calculateJobDuration() {
        // Tells the user the amount of years the employee has worked at the establishment.
        String jobDuration = "This employee completed this contract in ";
        if (fullYearsWorked == 0) {
            jobDuration = "This employee completed this contract in less than a year.";
            return jobDuration;
        } else {
            return jobDuration + fullYearsWorked + " years.";
        }
    }
    public String assessJobSatisfaction() {
        // Allows the user to assign a generalized satisfaction rating on a scale of 1-5 1 being very disatisfied, and 5 being very satisfied.
        return "This employee gave this job a " + satisfactionRating + " out of 5 satisfaction rating";
    }

    public double calculatePayment() {
        return hourlyWage * (double)contractDurationHours;
    }

    public String evaluateJobSecurity() {
        // Evaluates the job's security based off of the stability of the contract company, and the druation of the contract.
        if (!contractCompanyStability){
            if (contractDurationHours <= 20) {
                return "Medium";
            } else {
                return "Low";
            }
        } else {
            if (contractDurationHours <= 20) {
                return "High";
            } else {
                return "Medium";
            }
        }
    }
}
