public class Assig4_3Test {
    public static void main(String[] args) {
        Employee johnWhite = new Employee();

        PartTimeJob snowconeStand = new PartTimeJob("Sam's Snowcones", "Employee", 2016, 2016, 5, 12.0, 15, 16);
        ContractJob houseBuilding = new ContractJob("Bill's Housing", "Crewman", 2020, 2021, 4, 500, 20.0, true);
        FullTimeJob cateringRestaurant = new FullTimeJob("Cranky Catering", "Sous Chef", 2022, 2024, 4, 20, 40);

        johnWhite.addToJobHistory(snowconeStand);
        johnWhite.addToJobHistory(houseBuilding);
        johnWhite.addToJobHistory(cateringRestaurant);

        // Testing methods for each type of job.
        System.out.println("");
        snowconeStand.displayJobDetails();
        snowconeStand.calculateJobDuration();
        snowconeStand.assessJobSatisfaction();
        System.out.println("");
        houseBuilding.displayJobDetails();
        houseBuilding.calculateJobDuration();
        houseBuilding.assessJobSatisfaction();
        System.out.println("");
        cateringRestaurant.displayJobDetails();
        cateringRestaurant.calculateJobDuration();
        cateringRestaurant.assessJobSatisfaction();
        System.out.println("");

        System.out.println("John White has taken jobs from these establishments:");
        johnWhite.printJobHistory();
        System.out.println("");
    }
}
