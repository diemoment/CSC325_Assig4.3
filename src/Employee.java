public class Employee {
    public Job[] JobHistory = new Job[20];

    public void addToJobHistory(Job currentJob) {
        for(int i = 0; i < JobHistory.length; i++) {
            if (JobHistory[i] == null) {
                JobHistory[i] = currentJob;
                return;
            }
        }
    } 

    public void printJobHistory() {
        for (int i = 0; JobHistory[i] != null; i++) { 
            System.out.println(JobHistory[i].companyName);
        }
    }
}
