public abstract class Job {
    public String companyName;
    public String position;
    public int startDate;
    public int endDate;
    
    public Job(String companyName, String position, int startDate, int endDate) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    // Methods that subclasses are required to implement.
    public abstract void displayJobDetails();
    public abstract String calculateJobDuration();
    public abstract String assessJobSatisfaction();
}

